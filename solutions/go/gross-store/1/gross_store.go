package gross

// Units stores the Gross Store unit measurements.
func Units() map[string]int {
	return map[string]int{
        "quarter_of_a_dozen":	3,
        "half_of_a_dozen":	6,
        "dozen":	12,
        "small_gross":	120,
        "gross":	144,
        "great_gross":	1728,
    }
}

// NewBill creates a new bill.
func NewBill() map[string]int {
	return make(map[string]int)
}

// AddItem adds an item to customer bill.
func AddItem(bill, units map[string]int, item, unit string) bool {
    u := units[unit]
    if u == 0 {
        return false
    }
    
	bill[item] = bill[item] + u
    return true
}

// RemoveItem removes an item from customer bill.
func RemoveItem(bill, units map[string]int, item, unit string) bool {
    if bill[item] == 0 || units[unit] == 0 {
        return false
    }

    newQuantity := bill[item] - units[unit]
    
	if newQuantity < 0 {
        return false
    }else if newQuantity == 0 {
        delete(bill, item)

        return true
    }else {
        bill[item] = newQuantity
        return true
    }

    return false
}

// GetItem returns the quantity of an item that the customer has in his/her bill.
func GetItem(bill map[string]int, item string) (int, bool) {
    qty := bill[item]
    if qty <= 0 {
        return 0, false
    }
	return qty, true
}

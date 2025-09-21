package purchase

// NeedsLicense determines whether a license is needed to drive a type of vehicle. Only "car" and "truck" require a license.
func NeedsLicense(kind string) bool {
	if kind == "car" || kind == "truck"  {
        return true
    }

    return false
}

// ChooseVehicle recommends a vehicle for selection. It always recommends the vehicle that comes first in lexicographical order.
func ChooseVehicle(option1, option2 string) string {
    const sufixPhrase = " is clearly the better choice."
	if option1 < option2 {
        return option1 + sufixPhrase
    }else {
        return option2 + sufixPhrase
    }
}

// CalculateResellPrice calculates how much a vehicle can resell for at a certain age.
func CalculateResellPrice(originalPrice, age float64) float64 {
	percentage := 100

    if age < 3 {
        percentage = 80
    }else if age < 10 {
        percentage = 70
    }else {
        percentage = 50
    }

    return float64(percentage)/100.0 * originalPrice 
}

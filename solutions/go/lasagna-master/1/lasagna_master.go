package lasagna

func CountStringInArray(arr []string, str string) int {
    count:= 0

    for _, item := range arr {
        if item == str {
            count++
        }
    }

    return count
}
// TODO: define the 'PreparationTime()' function
func PreparationTime(layers []string, average int) int {
    defaultAverage := 2
    if average > 0 {
        defaultAverage = average
    }
    
    return len(layers) * defaultAverage
}


// TODO: define the 'Quantities()' function
func Quantities(layers []string) (noodles int, sauce float64) {
    qtyNoodles, qtySauce := CountStringInArray(layers, "noodles"), CountStringInArray(layers, "sauce") 

    noodles = qtyNoodles * 50
    sauce = float64(qtySauce) * 0.2

    return
}

// TODO: define the 'AddSecretIngredient()' function
func AddSecretIngredient(friendsList, myList []string) {
    myLastIndex := len(myList) - 1
	friendsLastIndex := len(friendsList) - 1

    myList[myLastIndex] = friendsList[friendsLastIndex]
}
// TODO: define the 'ScaleRecipe()' function
func ScaleRecipe(quantities []float64, portions int) []float64 {
    multiplier := float64(portions) / 2.0
    
    scaledQuantities := []float64{}

    for _, item := range quantities {
     	scaledQuantities = append(scaledQuantities, item * float64(multiplier))
    }

    return scaledQuantities
}

// Your first steps could be to read through the tasks, and create
// these functions with their correct parameter lists and return types.
// The function body only needs to contain `panic("")`.
//
// This will make the tests compile, but they will fail.
// You can then implement the function logic one by one and see
// an increasing number of tests passing as you implement more
// functionality.

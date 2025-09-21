// Package weather provides wather based on your location.
package weather

// CurrentCondition is a current condition.
var CurrentCondition string

// CurrentLocations is a current location.
var CurrentLocation string

// Forecast returns an string that contain current weather condition formatted based on your city and condition parameters.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}

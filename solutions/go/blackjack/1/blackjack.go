package blackjack

// ParseCard returns the integer value of a card following blackjack ruleset.
func ParseCard(card string) int {
	switch card {
        case "ace": 
        	return 11
        case "jack", "queen", "king", "ten":
        	return 10
        case "two":
        	return 2
        case "three":
        	return 3
        case "four":
        	return 4
        case "five":
        	return 5
        case "six":
        	return 6
        case "seven":
        	return 7
        case "eight":
        	return 8
        case "nine":
        	return 9
        default: 
        	return 0
    }
}

// FirstTurn returns the decision for the first turn, given two cards of the
// player and one card of the dealer.
func FirstTurn(card1, card2, dealerCard string) string {
    parsedCard1 := ParseCard(card1)
    parsedCard2 := ParseCard(card2)
    parsedDealerCard := ParseCard(dealerCard)

    sumPlayer := parsedCard1 + parsedCard2
    
	switch {
        case sumPlayer == 21 && parsedDealerCard < 10:
        	return "W"
        case card1 == card2 && parsedCard1 != 10 && sumPlayer > 11:
        	return "P"
        case sumPlayer >= 17 && sumPlayer <= 21 || sumPlayer >= 12 && sumPlayer <= 16 && parsedDealerCard < 7 :
        	return "S"
        case sumPlayer <= 11:
        	return "H"
        default:
        	return "H"
    }
}

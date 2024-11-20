import java.util.Scanner;

public class Main {
/*	
	public static String cardToString(Card c) {
		return c.getValue() + " of " + c.getSuit();
	}
*/
	public static void printHand(Card[] hand, int amountOfCards){
		for(int i = 0; i < amountOfCards; i++){
			System.out.println(hand[i]);
		}
	}
	
	public static int scoreHand(Card[] hand, int amountOfCards) {
		int returnVal = 0;
		
		boolean hasAce = false;
		
		for(int i = 0; i < amountOfCards; i++){
			returnVal += hand[i].getValue();
			if(hand[i].getValue() == 1){
				hasAce = true;
			}
			
			if(hasAce && returnVal <= 11){
				returnVal += 10;
			}
		}
		
		return returnVal;
	}
	
	
	public static void main(String[] args) {
		/*
		Card card = new Card();
		Card card1 = new Card();
		
		card.setSuit("Hearts");
		
		System.out.println(card.equals(card1));
		System.out.println(card.getSuit());
		System.out.println(card.getValue());
		//System.out.println(cardToString(card));
		System.out.println(card);
		*/
		//System.out.println(d);
		//System.out.println(d.randomDeal());
		
		//TODO List:
		
		//Welcome player
		
		//Show the player their hand
		
		//Show the player the dealers visible card
		
		//Ask the user if they want to hit or stay
		
		//if the user goes over 21, they lose
		
		//Otherwise, deal cards to the dealer util they are 17 or higher
		
		//if the dealer goes over, they lose
		
		//if neither lost, compare scores
		
		System.out.println("Welcome to blackjack!");
		
		Deck d = new Deck();
		
		//index is keeping track of where we are putting the next card
		//And is keeping track of how many cards we have
		int playerIndex = 0;
		Card[] playerHand = new Card[10];
		int dealerIndex = 0;
		Card[] dealerHand = new Card[10];
		
		playerHand[playerIndex] = d.randomDeal();
		playerIndex++;
		dealerHand[dealerIndex] = d.randomDeal();
		dealerIndex++;
		
		playerHand[playerIndex] = d.randomDeal();
		playerIndex++;
		dealerHand[dealerIndex] = d.randomDeal();
		dealerIndex++;
		
		printHand(playerHand,playerIndex);
		System.out.println();
		System.out.println("Dealer shown card: ");
		System.out.println(dealerHand[dealerIndex - 1]);
		
		Scanner k =  new Scanner(System.in);
		System.out.println("Do you want to hit or stay");
		String input = k.nextLine();
		
		do
		{
			if(input.toLowerCase().equals("hit")) {
				
				playerHand[playerIndex] = d.randomDeal();
				playerIndex++;
				
				System.out.println("Player Hand: ");
				
				if(scoreHand(playerHand, playerIndex) > 21) {
					break;
				}
				
			
			} else if(input.toLowerCase().equals("stay")){
				break;
			}
		}while(true);
		
		if(scoreHand(playerHand, playerIndex) >= 21) {
			while(scoreHand(dealerHand, dealerIndex) < 17){
				dealerHand[dealerIndex] = d.randomDeal();
				dealerIndex++;
			}
			System.out.println("Dealers final Hand");
			printHand(dealerHand, dealerIndex);
			
			
			int playerScore = scoreHand(playerHand, playerIndex);
			int dealerScore = scoreHand(playerHand, playerIndex);
			
			if(dealerScore > 21){
				System.out.println("Player wins!");
			}else if(dealerScore >= playerScore){
				System.out.println("Dealer wins!");
			}else {
				System.out.println("Player wins!");
			}
			
		}else {
			System.out.println("Player lost :(");
		}
		
	}

}

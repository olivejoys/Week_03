/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rndm = new Random(); // creating a random object 
       
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rndm.nextInt(13) + 1); //insert call to random number generator here)
            c.setSuit(Card.SUITS[rndm.nextInt(4)]); //insert call to random number between 0-3 here])
            magicHand [i] = c; // stores card object in array 
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue()); 
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there, pick a card: ");
        int inputValue = input.nextInt(); 
        
        System.out.println("Now, it's time to pick a suit! " 
                + "(Please enter 0 for Diamonds, 1 for Hearts, 2 for Spades, "
                + "3 for Clubs"); 
        int suitInd = input.nextInt();
        String inputSuit = Card.SUITS[suitInd]; 
        
        Card inpCard = new Card();
        inpCard.setValue(inputValue); 
        inpCard.setSuit(inputSuit);
        
        
        
        
        // and search magicHand here
        boolean found = false; 
        for(Card card : magicHand) {
            if (card.getValue() == inpCard.getValue() && 
                    card.getSuit().equals(inpCard.getSuit())) {
                found = true; 
                break; 
                
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Cheers! your card is in the magic hand. "); 
            
        } else { 
            System.out.println("Oh, my bad! your card "
                    + "is not in the magic hand :(");
            
        }
        input.close();
    }
    
}

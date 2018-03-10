package com.codedbyscott;

public class Main {

    public static void main(String[] args) {

        boolean[] deck = new boolean[52];

        int cardID;
        int card;
        int suit;
        int rank;

        int count = 0;
        String suitString;
        String rankString;

        // clear the deck
        for (int i = 0; i < 52; i++) {
            deck[i] = false;
            // count = 0;
        }

        for (int i = 0; i < 250; i++) {

            cardID = (int) (Math.random() * 52); // for use in the array

            card = cardID + 8;

            suit = card % 4;
            rank = card / 4;

            switch (suit) {
                case 0:
                    suitString = "Clubs";
                    break;
                case 1:
                    suitString = "Diamonds";
                    break;
                case 2:
                    suitString = "Hearts";
                    break;
                case 3:
                    suitString = "Spades";
                    break;
                default:
                    suitString = "Error. Suit not found.";

            }

            switch (rank) {
                case 2:
                    rankString = "Two";
                    break;
                case 3:
                    rankString = "Three";
                    break;
                case 4:
                    rankString = "Four";
                    break;
                case 5:
                    rankString = "Five";
                    break;
                case 6:
                    rankString = "Six";
                    break;
                case 7:
                    rankString = "Seven";
                    break;
                case 8:
                    rankString = "Eight";
                    break;
                case 9:
                    rankString = "Nine";
                    break;
                case 10:
                    rankString = "Ten";
                    break;
                case 11:
                    rankString = "Jack";
                    break;
                case 12:
                    rankString = "Queen";
                    break;
                case 13:
                    rankString = "King";
                    break;
                case 14:
                    rankString = "Ace";
                    break;
                default:
                    rankString = "Error. Rank not found.";

            }

            if (!deck[cardID]) {
                System.out.println("Card generated was: " + rankString + " of " + suitString);
                deck[cardID] = true;
                count++;
            } else {
                System.out.println("Duplicate: " + rankString + " of " + suitString);
            }
        }

        System.out.println("Unique cards generated: " + count);
    }
}

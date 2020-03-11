package com.company;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<Card>(108);

    public Deck() {
        this.cards.add(new Card(Color.green, "0"));
        this.cards.add(new Card(Color.red, "0"));
        this.cards.add(new Card(Color.blue, "0"));
        this.cards.add(new Card(Color.yellow, "0"));

        int i = 1;
        while (i <= 9) {
            this.cards.add(new Card(Color.green, i + ""));
            this.cards.add(new Card(Color.red, i + ""));
            this.cards.add(new Card(Color.blue, i + ""));
            this.cards.add(new Card(Color.yellow, i + ""));

            this.cards.add(new Card(Color.green, i + ""));
            this.cards.add(new Card(Color.red, i + ""));
            this.cards.add(new Card(Color.blue, i + ""));
            this.cards.add(new Card(Color.yellow, i + ""));
            i++;
        }
    }
    public void shuffle() {
        int j = 0;
        while( j < 7) {
            for (int i = 0; i < 76; i++) {
                int randomNum = (int) (Math.random() * 75);
                Card temp = this.cards.get(randomNum);
                this.cards.set(randomNum, this.cards.get(i));
                this.cards.set(i, temp);
                j++;
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 76; i++) {
            sb.append(this.cards.get(i).toString() + "|");
            if (((i + 1) % 15) == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    public void sort() {
        Collections.sort(this.cards);
    }
}
package com.company;
import java.awt.Color;

public class Card implements Comparable<Card> {
    public Color color;
    public String value;

public Card(Color color, String value) {
        super();
        this.color = color;
        this.value = value;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String toString() {
        return "Card [" + getColorName()+" " + "" + value+" " +"]";
    }
    public int compareTo(Card input) {
        int shuffle = 0;
        if (input.getValue() != null && this.getValue() != null) {
            shuffle = ((Integer)Integer.parseInt(input.getValue())).compareTo(Integer.parseInt(this.getValue()));
            if(shuffle == 0){
                return input.getColorName().compareTo(this.getColorName());
            }
        }
        return shuffle;
    }

    public String getColorName(){
        if(Color.green == this.color){
            return "green";
        }else if(Color.yellow == this.color){
            return "yellow";
        }else if(Color.blue == this.color){
            return "blue";
        }else{
            return "red";
        }
    }
}
package com.pad.game.cards;

public class Card {
    String cardName;
    int cardType;
    int attackDamage;
    int attackBlock;

    public Card () {

    }

    public Card (String cardName, int cardType, int attackDamage, int attackBlock) {
        this.cardName = cardName;
        this.cardType = cardType;
        this.attackDamage = attackDamage;
        this.attackBlock = attackBlock;
    }

}

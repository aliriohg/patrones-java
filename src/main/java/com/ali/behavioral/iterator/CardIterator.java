package com.ali.behavioral.iterator;

public class CardIterator implements Iterator {
    private Card[] cards;
    private int position;

    public CardIterator(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public Object next() {
        return cards[position++];
    }

    @Override
    public boolean hasNext() {
        if (position >= cards.length) {
            return false;
        }
        return true;
    }

    @Override
    public Object currentItem() {
        return cards[position];
    }
}

package edu.blackjack.service;

import edu.blackjack.data.Data;
import edu.blackjack.model.Card;
import edu.blackjack.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BlackJackService {

    @Autowired
    Data data;
    List<Card> deck;

    List<Card> delivery = new ArrayList<>();

    @PostConstruct
    void init() {
        deck = data.getDeck();
    }

    public List<Card> getShuffleDeck() {
        Collections.shuffle(deck);
        return deck;
    }

    public Card pickFirstCardFromShuffledDeck() {
        Card card = this.getShuffleDeck().get(0);
        deck.remove(card);//Удилить эту карту из колоды !!
        return card;
    }

    public List<Card> getCardList() {
        Card card = this.pickFirstCardFromShuffledDeck();
        delivery.add(card);// выдать эту карту на роздачу !
        return delivery;
    }

    public Player InitPlayer(Player player) {
        player.getPrivateSet().clear();
        return player;

    }

    public int getPlayerSum(Player player) {
        List<Card> cards = player.getPrivateSet();
        return cards.stream().mapToInt(Card::getValue).sum();
    }

    public Card showSixPike() {
        Card sixPike = deck.get(4);
        return sixPike;
    }

    public List<Card> getDeck() {
        return deck;
    }
}

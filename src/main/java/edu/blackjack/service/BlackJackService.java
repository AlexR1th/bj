package edu.blackjack.service;

import edu.blackjack.data.Data;
import edu.blackjack.model.Card;
import edu.blackjack.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
public class BlackJackService {
    @Autowired
    Data data;
    List<Card> deck;

    @PostConstruct
    void init() {
        deck = data.getDeck();
    }

    public List<Card> getShuffleDeck() {
        Collections.shuffle(deck);
        return deck;
    }

    public Card pick() {
        Card card = this.getShuffleDeck().get(0);
        deck.remove(card);
        return card;
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
        Card sixPike = deck.get(0);
        sixPike.setImg("/img/img.png");
        return sixPike;
    }

}

package edu.blackjack.data;

import edu.blackjack.model.Card;
import edu.blackjack.model.Nominal;
import edu.blackjack.model.Suit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class Data {
    private List<Card> deck = new ArrayList<>(
            Arrays.asList (
                    new Card(Suit.PIKE, Nominal.N6, 6),
                    new Card(Suit.HEART, Nominal.N6, 6),
                    new Card(Suit.TILE, Nominal.N6, 6),
                    new Card(Suit.CLOVER, Nominal.N6, 6),

                    new Card(Suit.PIKE, Nominal.N7, 7),
                    new Card(Suit.HEART, Nominal.N7, 7),
                    new Card(Suit.TILE, Nominal.N7, 7),
                    new Card(Suit.CLOVER, Nominal.N7, 7),

                    new Card(Suit.PIKE, Nominal.N8, 8),
                    new Card(Suit.HEART, Nominal.N8, 8),
                    new Card(Suit.TILE, Nominal.N8, 8),
                    new Card(Suit.CLOVER, Nominal.N8, 8),

                    new Card(Suit.PIKE, Nominal.N9, 9),
                    new Card(Suit.HEART, Nominal.N9, 9),
                    new Card(Suit.TILE, Nominal.N9, 9),
                    new Card(Suit.CLOVER, Nominal.N9, 9),

                    new Card(Suit.PIKE, Nominal.N10, 10),
                    new Card(Suit.HEART, Nominal.N10, 10),
                    new Card(Suit.TILE, Nominal.N10, 10),
                    new Card(Suit.CLOVER, Nominal.N10, 10),

                    new Card(Suit.PIKE, Nominal.JACK, 2),
                    new Card(Suit.HEART, Nominal.JACK, 2),
                    new Card(Suit.TILE, Nominal.JACK, 2),
                    new Card(Suit.CLOVER, Nominal.JACK, 2),

                    new Card(Suit.PIKE, Nominal.QUEEN, 3),
                    new Card(Suit.HEART, Nominal.QUEEN, 3),
                    new Card(Suit.TILE, Nominal.QUEEN, 3),
                    new Card(Suit.CLOVER, Nominal.QUEEN, 3),

                    new Card(Suit.PIKE, Nominal.KING, 4),
                    new Card(Suit.HEART, Nominal.KING, 4),
                    new Card(Suit.TILE, Nominal.KING, 4),
                    new Card(Suit.CLOVER, Nominal.KING, 4),

                    new Card(Suit.PIKE, Nominal.ACE, 11),
                    new Card(Suit.HEART, Nominal.ACE, 11),
                    new Card(Suit.TILE, Nominal.ACE, 11),
                    new Card(Suit.CLOVER, Nominal.ACE, 11)
            )
    );

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

}

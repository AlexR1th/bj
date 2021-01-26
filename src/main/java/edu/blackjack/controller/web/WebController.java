package edu.blackjack.controller.web;

import edu.blackjack.service.BlackJackService;
import edu.blackjack.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/web/cards")
public class WebController {
    @Autowired
    BlackJackService service;

    @RequestMapping("/game")
    public String showTable(Model model) {
        Card card = service.showSixPike();
//        model.addAttribute("card",card);
        System.out.println("Hellos Amigos");
        List<Card> delivery = new ArrayList<>();
        model.addAttribute("delivery", delivery);
        return "deck";
    }
    @RequestMapping("/deck")
    public String showDeck(Model model){
        List<Card> deck = service.getDeck();
        model.addAttribute("deck",deck);
        return "deck";
    }
    @RequestMapping("/pick")
    public String pick(Model model){
        List<Card> delivery = service.getCardList();
        model.addAttribute("delivery",delivery);
        return "deck";
    }

    public String showSixPike(Model model) {
        Card card = service.showSixPike();
        model.addAttribute("card", card);
        return "gametable";
    }
}

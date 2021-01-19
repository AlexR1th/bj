package edu.blackjack.controller.web;

import edu.blackjack.service.BlackJackService;
import edu.blackjack.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/cards")
public class WebController {
    @Autowired
    BlackJackService service;



    }

//    public String showSixPike(Model model) {
//        Card card = service.showSixPike();
//        model.addAttribute("card", card);
//        return "gametable";
//    }
}

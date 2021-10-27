package be.kdg.outfitly.presentation;

import be.kdg.outfitly.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
@SessionAttributes("user")
public class IndexController {

    @GetMapping("/faq")
    public String showFAQ(Model model, @ModelAttribute("user") User user) {
        return "faq";
    }

    @GetMapping("/...")
    public String showDoesNotExist(Model model) {
        return "doesnotexist";
    }

}

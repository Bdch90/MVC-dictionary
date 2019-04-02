package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DicController
{
    static String[] vietNamDictionary = {"Xin chao","tam biet","nuoc cam"};

    @PostMapping("/homePage")
    public String dictionary(@RequestParam String english, Model model)
    {
        String vietnamese = equal(english);
        model.addAttribute("vietnamese",vietnamese);
        return "homePage";
    }

    @GetMapping("/home")
    public String home()
    {
        return "homePage";
    }
    private String equal(String english)
    {
        if(english.equals("hello"))
        {
            return vietNamDictionary[0];
        }
        else if(english.equals("goodbye"))
        {
            return vietNamDictionary[1];
        }
        else if(english.equals("fanta"))
        {
            return vietNamDictionary[2];
        }
        else
        {
            return "the dictionary does not have this word";
        }
    }
}

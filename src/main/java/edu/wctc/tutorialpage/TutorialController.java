package edu.wctc.tutorialpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TutorialController {

    @RequestMapping("/step1")
    public String goToStepOne()
    {
        return "Pages/stepone";
    }

    @RequestMapping("/step2")
    public String goToStepTwo()
    {
        return "Pages/steptwo";
    }

    @RequestMapping("/step3")
    public String goToStepThree()
    {
        return "Pages/stepthree";
    }

    @RequestMapping("/completetutorial")
    public String completeTutorial ()
    {
        return "index";
    }



}

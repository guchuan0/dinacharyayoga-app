package com.dinacharyayoga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class DinacharyayogaMainController {

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String showIndex() {
        return "index";
    }

    @RequestMapping(value="introduction", method = { RequestMethod.GET, RequestMethod.POST })
    public String showIntroduction() {
        return "pages/introduction";
    }
    @RequestMapping(value="lessons", method = { RequestMethod.GET, RequestMethod.POST })
    public String showLessons() {
        return "pages/lessons";
    }
    @RequestMapping(value="schedules", method = { RequestMethod.GET, RequestMethod.POST })
    public String showSchedules() {
        return "pages/schedules";
    }
    @RequestMapping(value="access", method = { RequestMethod.GET, RequestMethod.POST })
    public String showAccess() {
        return "pages/access";
    }
}

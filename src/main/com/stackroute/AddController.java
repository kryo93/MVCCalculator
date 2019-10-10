package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
    @RequestMapping(value = "/add")

public ModelAndView add(@RequestParam("t1") int a, @RequestParam("t2") int b)
{
    ModelAndView mv = new ModelAndView();
    int c = a+b;
    mv.setViewName("display");
    mv.addObject("result", c);

    return mv;
}
}

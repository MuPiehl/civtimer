package de.mpi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by matthiaspiehl on 14.03.15.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
//@ResponseBody
    String index() {
        return "index";
    }
}
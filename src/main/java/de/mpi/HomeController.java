package de.mpi;

import de.mpi.civ.GlobalNationList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by matthiaspiehl on 14.03.15.
 */
@Controller
public class HomeController {

//    @RequestMapping("/")
////@ResponseBody
//   public String index() {
//        return "index";
//    }

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("nations", GlobalNationList.getAll());
        return "index";
    }

//    @RequestMapping(value = "nation", method = RequestMethod.GET)
//    public ModelAndView nations() {
//        ModelAndView mav = new ModelAndView("nation/list");
////        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("nations", GlobalNationList.getAll());
//        return mav;
//    }
}
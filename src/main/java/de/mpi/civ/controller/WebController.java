package de.mpi.civ.controller;

import de.mpi.civ.GlobalNationList;
import de.mpi.civ.data.InitData;
import de.mpi.civ.game.engine.CivGame;
import de.mpi.civ.game.engine.GameUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by matthiaspiehl on 14.03.15.
 */
@Controller
public class WebController {
    private static Logger log = LoggerFactory.getLogger(WebController.class);

//    @RequestMapping("/")
////@ResponseBody
//   public String index() {
//        return "index";
//    }

    //    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    @RequestMapping(value = {"*"}, method = RequestMethod.GET)
    public String index(Model model) {

        /*
    switch (GameUnit.getCurrentGame().getStatus()) {
        case GameStatus.NEW_NOT_INITIALIZED: return "int";
        case GameStatus.TURN_READY_TO_START: return "ready_to_start";
        case GameStatus.MOVEMENT_RUNNING: return "movement_running";

    }
*/
        model.addAttribute("nations", GlobalNationList.getAll());

//        return GameUnit.getCurrentGame().getStatus().toString();
        return "index";
    }

    @RequestMapping(value = {"process_input"}, method = RequestMethod.POST)
    public String value(HttpServletRequest httpRequest, Model model, InitData initData, HttpServletResponse response) {

        CivGame game = GameUnit.getCurrentGame();

        game.init(initData);

        log.debug("process_input: " + initData.getNumberOfPlayer().toString());

//        model.addAttribute("nations", GlobalNationList.getAll());

        return game.getStatus().toString();
        //   return "index";
    }


//    @RequestMapping(value = "nation", method = RequestMethod.GET)
//    public ModelAndView nations() {
//        ModelAndView mav = new ModelAndView("nation/list");
////        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("nations", GlobalNationList.getAll());
//        return mav;
//    }
}
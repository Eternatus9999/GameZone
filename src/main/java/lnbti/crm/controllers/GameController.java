package lnbti.crm.controllers;

import lnbti.crm.dto.Game;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/game")
@Slf4j
public class GameController {

    @PostMapping("/add")
    String addGame(@RequestBody Game game){
        return "Add Successfully";
    }
}

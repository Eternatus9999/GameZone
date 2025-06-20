package lnbti.crm.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/player")
public class PlayerController {
    @GetMapping("/player-id/")
    public String getPlayerById(){
        return "hello World!";
    }
}

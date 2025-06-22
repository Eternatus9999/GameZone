package lnbti.crm.controllers;

import lnbti.crm.dto.Player;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/player")
public class PlayerController {
    @GetMapping("/player-id/")
    public String getPlayerById(){
        return "hello World!";
    }
    @PostMapping("/player-add/")
    public void addPlayer(@RequestBody Player player){
        System.out.print(player);
    }
    @DeleteMapping("/player-delete/{id}")
    public void deletePlayer(@PathVariable long id){
        System.out.print(id);
    }
}

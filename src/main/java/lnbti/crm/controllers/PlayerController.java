package lnbti.crm.controllers;

import lnbti.crm.dto.Player;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/player")
public class PlayerController {
    @GetMapping("/player-id/{id}")
    public Player getPlayerById(@PathVariable String id){
        return new Player(2,"Chathusha",20,"eternatus9999@gmail.com","1234","Male");
    }
    @PostMapping("/player-add/")
    public void addPlayer(@RequestBody Player player){
        System.out.print(player);
    }
    @DeleteMapping("/player-delete/{id}")
    public void deletePlayer(@PathVariable long id){
        System.out.print(id);
    }
    @PutMapping("player-update/")
    public String updatePlayer(@RequestBody Player player){
        return "Player Updated Successfully!";
    }
}

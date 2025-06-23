package lnbti.crm.controllers;

import lnbti.crm.dto.Player;
import lnbti.crm.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/player")
@RequiredArgsConstructor
@Slf4j
public class PlayerController {

    final PlayerService playerservice;

    @GetMapping("/player-id/{id}")
    public Player getPlayerById(@PathVariable long id){
        return playerservice.getPlayerById(id);
    }
    @PostMapping("/player-add/")
    public String addPlayer(@RequestBody Player player){
        return playerservice.addPlayer(player);
    }
    @DeleteMapping("/player-delete/{id}")
    public String deletePlayer(@PathVariable long id){
        return playerservice.deletePlayer(id);
    }
    @PutMapping("player-update/")
    public String updatePlayer(@RequestBody Player player){
        return playerservice.updatePlayer(player);
    }
}

package lnbti.crm.service.impl;

import lnbti.crm.dto.Player;
import lnbti.crm.service.PlayerService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class PlayerServiceImpl implements PlayerService {
    @Override
    public Player getPlayerById(long id) {
        return new Player(1,"Chathusha",20,"eternatus9999@gmail.com","12345","Male");
    }

    @Override
    public String updatePlayer(Player player) {
        return "Updated Successfully!";
    }

    @Override
    public String addPlayer(Player player) {
        return "Added Successfully!";
    }

    @Override
    public String deletePlayer(long id) {
        return "Deleted Successfully!";
    }

    @Override
    public List<Player> getPlayers() {
        return List.of();
    }
}

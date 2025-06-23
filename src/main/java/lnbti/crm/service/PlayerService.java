package lnbti.crm.service;

import lnbti.crm.dto.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {
    Player getPlayerById(long id);

    String updatePlayer(Player player);

    String addPlayer(Player player);

    String deletePlayer(long id);

    List<Player> getPlayers();
}

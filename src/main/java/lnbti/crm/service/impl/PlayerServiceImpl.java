package lnbti.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lnbti.crm.dto.Player;
import lnbti.crm.entity.PlayerEntity;
import lnbti.crm.repository.PlayerRepository;
import lnbti.crm.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    final PlayerRepository playerrepository;
    final ObjectMapper objectmapper;

    @Override
    public Player getPlayerById(long id) {
        return objectmapper.convertValue(playerrepository.findById(id),Player.class);
    }

    @Override
    public String updatePlayer(Player player) {
        playerrepository.save(objectmapper.convertValue(player,PlayerEntity.class));
        return "Updated Successfully!";
    }

    @Override
    public String addPlayer(Player player) {
        playerrepository.save(objectmapper.convertValue(player,PlayerEntity.class));
        return "Added Successfully!";
    }

    @Override
    public String deletePlayer(long id) {
        playerrepository.delete(objectmapper.convertValue(playerrepository.findById(id),PlayerEntity.class));
        return "Deleted Successfully!";
    }

    @Override
    public List<Player> getPlayers() {
        return List.of();
    }
}

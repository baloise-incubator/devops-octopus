package dev.baloise.octopus.rollout.domain;

import dev.baloise.octopus.rollout.infrastructure.RolloutStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RolloutStatusService {

  private final RolloutStatusRepository rolloutStatusRepository;

  public List<RolloutStatus> getRolloutStausOverview() {
    return rolloutStatusRepository.findByOrOrderByArtifact_idAsc();
  }

}

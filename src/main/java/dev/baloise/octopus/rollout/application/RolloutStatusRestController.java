package dev.baloise.octopus.rollout.application;

import dev.baloise.octopus.rollout.domain.RolloutStatus;
import dev.baloise.octopus.rollout.domain.RolloutStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class RolloutStatusRestController {

  private final RolloutStatusService rolloutStatusService;

  @GetMapping("api/rollouts")
  public List<RolloutStatusDto> getRolloutStatusOverview( ){
    return rolloutStatusService.getRolloutStausOverview().stream().map(this::map).collect(Collectors.toList());
  }

  private RolloutStatusDto map(RolloutStatus rolloutStatus) {
    return new RolloutStatusDto(
      rolloutStatus.getApplication(),
      rolloutStatus.getGroup_id(),
      rolloutStatus.getArtifact_id(),
      rolloutStatus.getPackaging(),
      rolloutStatus.getVersion(),
      rolloutStatus.getClassifier(),
      rolloutStatus.getStage(),
      rolloutStatus.getServer(),
      LocalDateTime.now(),
      rolloutStatus.getUser_id(),
      rolloutStatus.getStatus()
    );
  }
}

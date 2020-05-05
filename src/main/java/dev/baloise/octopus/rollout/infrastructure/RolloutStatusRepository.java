package dev.baloise.octopus.rollout.infrastructure;

import dev.baloise.octopus.rollout.domain.RolloutStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolloutStatusRepository extends CrudRepository<RolloutStatus, Integer> {
}

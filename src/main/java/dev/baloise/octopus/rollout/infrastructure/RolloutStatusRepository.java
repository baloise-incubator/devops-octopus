package dev.baloise.octopus.rollout.infrastructure;

import dev.baloise.octopus.rollout.domain.RolloutStatus;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolloutStatusRepository extends CrudRepository<RolloutStatus, Integer> {

  @Query("Select * from ROLLOUT_STATUS order by artifact_id desc")
  List<RolloutStatus> findByOrOrderByArtifact_idAsc();
}

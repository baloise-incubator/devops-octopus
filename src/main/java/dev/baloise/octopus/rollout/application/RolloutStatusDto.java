package dev.baloise.octopus.rollout.application;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class RolloutStatusDto {

  private String application;
  private String group_id;
  private String artifact_id;
  private String packaging;
  private String version;
  private String classifier;
  private String stage;
  private String server;
  private LocalDateTime timestamp;
  private String user_id;
  private String status;
}

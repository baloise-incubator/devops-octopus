package dev.baloise.octopus.rollout.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class RolloutStatus {

  @Id
  private Integer id;
  private String application;
  private String group_id;
  private String artifact_id;
  private String packaging;
  private String version;
  private String classifier;
  private String stage;
  private String server;
  private Date ddate;
  private Timestamp ttime;
  private String user_id;
  private String status;
}

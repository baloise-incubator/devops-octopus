package com.baloiseincubator.octopus.containerimage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ContainerImage {

    @Id
    private Integer id;
    private ImageOrganisation organisation;
    private ImageRepository repository;
    private String registryUrl;
    private String tag;
    private String digest;
    private int size;
    private LocalDateTime lastPushed;
}

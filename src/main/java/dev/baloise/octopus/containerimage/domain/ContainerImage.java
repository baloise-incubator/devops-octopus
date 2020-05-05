package dev.baloise.octopus.containerimage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class ContainerImage {

    @Id
    private Integer id;
    private String organisation;
    private String repository;
    private String registryUrl;
    private String tag;
    private String digest;
}

package dev.baloise.octopus.containerimage.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {

    private String organisation;
    private String repository;
    private String registryUrl;
    private String tag;
    private String digest;

}

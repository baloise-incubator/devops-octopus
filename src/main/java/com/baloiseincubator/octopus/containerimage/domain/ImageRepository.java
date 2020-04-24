package com.baloiseincubator.octopus.containerimage.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageRepository {

    private String name;
    private String url;
}

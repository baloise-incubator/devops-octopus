package com.baloiseincubator.octopus.containerimage.domain;

import com.baloiseincubator.octopus.containerimage.infrastructure.ContainerImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContainerImageService {

    private final ContainerImageRepository containerImageRepository;

    public Iterable<ContainerImage> getAllContainerImges() {
        return containerImageRepository.findAll();
    }
}

package dev.baloise.octopus.containerimage.domain;

import dev.baloise.octopus.containerimage.infrastructure.ContainerImageRepository;
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

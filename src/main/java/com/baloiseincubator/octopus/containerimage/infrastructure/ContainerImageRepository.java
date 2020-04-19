package com.baloiseincubator.octopus.containerimage.infrastructure;

import com.baloiseincubator.octopus.containerimage.domain.ContainerImage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerImageRepository extends CrudRepository<ContainerImage, Integer> {
}

package com.baloiseincubator.octopus.containerimage.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories
public class ContainerImageRepositoryConfiguration extends AbstractJdbcConfiguration {
}

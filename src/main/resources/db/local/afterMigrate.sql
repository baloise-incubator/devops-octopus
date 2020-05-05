INSERT INTO CONTAINER_IMAGE
    (id, organisation, repository, registry_url, tag, digest)
VALUES
    (100, 'example', 'gitops-nginx-demo', 'https://registry.baloise.dev/harbor/projects/2/repositories/example/gitops-nginx-demo/tags/69de455111ff44fa96481c2f3e734195c7ad9bc3', '69de455111ff44fa96481c2f3e734195c7ad9bc3', 'a3ed95caeb02ffe68cdd9fd84406680ae93d633cb16422d00e8a7c22955b46d4'),
    (101, 'otherorg', 'myrepo', 'https://registry.baloise.dev/harbor/projects/2/repositories/example/gitops-nginx-demo/tags/69de455111ff44fa96481c2f3e734195c7ad9bc3', '69de455111ff44fa96481c2f3e734195c7ad9bc3', 'a3ed95caeb02ffe68cdd9fd84406680ae93d633cb16422d00e8a7c22955b46d4')
    ;

INSERT INTO ROLLOUT_STATUS
    (id, application, group_id, artifact_id, packaging, version, classifier, stage, server, ddate, ttime, user_id, status)
VALUES
    (100, 'applicationname', 'groupid', 'ArtifactId', 'packaging', 'version', 'classifier', 'stage', 'server', '2020-05-05', current_time, 'userid', 'status'),
    (101, 'myapp', 'dev.baloise', 'Octokube', 'jar', '0.1.0', '', 'T', 'as_ch_myserver', '2020-05-05', current_time, 'userid', 'deployed')
    ;

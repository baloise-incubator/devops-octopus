package com.baloiseincubator.octopus.k8scluster.application;

import io.fabric8.kubernetes.api.model.NamespaceList;
import io.fabric8.kubernetes.api.model.PodList;
import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/k8s")
public class K8sClusterRestController {

  @GetMapping("ns")
  public NamespaceList getStuff() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.namespaces().withLabel("client", "joachim").list();
  }

  @GetMapping("pods")
  public PodList getStuff2() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.pods().inNamespace("dialogflow-api").list();
  }


}

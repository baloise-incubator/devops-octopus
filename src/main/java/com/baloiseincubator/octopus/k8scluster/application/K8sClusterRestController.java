package com.baloiseincubator.octopus.k8scluster.application;

import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LimitRangeList;
import io.fabric8.kubernetes.api.model.NamespaceList;
import io.fabric8.kubernetes.api.model.PodList;
import io.fabric8.openshift.api.model.ProjectList;
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
  public NamespaceList getNamespaces() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.namespaces().withLabel("client", "joachim").list();
  }

  @GetMapping("pods")
  public PodList getPods() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.pods().inNamespace("dialogflow-api").list();
  }

  @GetMapping("quota")
  public KubernetesResource getQuota() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.resourceQuotas().inNamespace("dialogflow-api").list();
  }

  @GetMapping("limits")
  public LimitRangeList getLimitRanges() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.limitRanges().inNamespace("dialogflow-api").list();
  }

  @GetMapping("projects")
  public ProjectList getProjects() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.projects().withLabel("client", "joachim").list();
  }

  @GetMapping("metrics")
  public KubernetesResource getOther() {
    OpenShiftClient osClient = new DefaultOpenShiftClient();
    return osClient.top().pods().metrics("dialogflow-api");
  }

}

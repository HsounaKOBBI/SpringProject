package com.example.Membre_service.proxies;

import com.example.Membre_service.Bean.PublicationBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="PUBLICATION-SERVICE")
public interface PublicationProxyService {
    @GetMapping("/publications/{id}")
    public PublicationBean findPublicationById(@PathVariable(name = "id") Long id);
}
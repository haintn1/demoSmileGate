package com.example.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


@RestController
public class SearchProductController
{
    @Resource
    private RestTemplate restTemplate;

    @Value("${search.service.url}")
    private String searchServiceUrl;

    @PostMapping("/products/index")
    public Object fullIndex() {
        return restTemplate.postForEntity(searchServiceUrl + "/products", null, Object.class);
    }

    @GetMapping("/products/search")
    public Object search(@RequestParam(name = "query", defaultValue = "") final String query,
                         @RequestParam(name = "currentPage", required = false) final Integer currentPage,
                         @RequestParam(name = "pageSize", required = false) final Integer pageSize,
                         @RequestParam(name = "sort", required = false) final String sort) {
        final Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("query", query);
        uriVariables.put("currentPage", currentPage);
        uriVariables.put("pageSize", pageSize);
        uriVariables.put("sort", sort);
        return restTemplate.getForEntity(searchServiceUrl + "/products/search?query={query}&currentPage={currentPage}&pageSize={pageSize}&sort={sort}",
                Object.class, uriVariables);
    }
}

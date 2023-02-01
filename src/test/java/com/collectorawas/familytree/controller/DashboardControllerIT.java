package com.collectorawas.familytree.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @SpringBootTest: we are asking for the whole application context to be created.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DashboardControllerIT {

    /**
     * MockMvc: comes from Spring Test and uses a set of convenient builder classes to
     * -send HTTP requests into the DispatcherServlet
     * -make assertions about the result.
     */
    @Autowired
    private TestRestTemplate template;

    @Test
    public void index() {
        ResponseEntity<String> response = template.getForEntity("/family-tree/dashboard", String.class);
        assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
    }
}
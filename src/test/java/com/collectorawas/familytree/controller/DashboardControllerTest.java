package com.collectorawas.familytree.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *@SpringBootTest: we are asking for the whole application context to be created.
 */
@SpringBootTest
@AutoConfigureMockMvc
class DashboardControllerTest {

    /**
     * MockMvc: comes from Spring Test and uses a set of convenient builder classes to
     * -send HTTP requests into the DispatcherServlet
     * -make assertions about the result.
     */
    @Autowired
    private MockMvc mvc;

    @Test
    public void index() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/family-tree/dashboard").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }
}
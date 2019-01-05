package com.akbar.app.controller;

import com.akbar.app.domain.QuoteRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteRequestController.class)
public class QuoteRequestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private QuoteRequestController quoteRequestController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getQuoteForm() throws Exception {
        mockMvc.perform(get("/newquote"))
                .andExpect(status().is(200))
                .andReturn();
    }

    @Test
    public void postQuoteForm() throws Exception {
        QuoteRequest aFormBean = new QuoteRequest();
        mockMvc.perform(MockMvcRequestBuilders.post("/newquote", aFormBean))
                .andExpect(status().isOk())
                .andReturn();
    }


}

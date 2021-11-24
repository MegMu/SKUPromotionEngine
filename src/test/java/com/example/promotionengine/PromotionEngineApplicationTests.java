package com.example.promotionengine;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.promotionengine.model.RequestSKU;
import com.example.promotionengine.model.TotalResponse;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PromotionEngineApplicationTests {
  
  @Autowired
  private TestRestTemplate restTemplate;
   @Test
   @DisplayName("/PromotionEngineTest ")
   void testMessage() {
     
     RequestSKU req = new RequestSKU();
     req.setSKUA(1);
     req.setSKUB(1);
     req.setSKUC(1);
     req.setSKUD(1);
     URI targetUrl= UriComponentsBuilder.fromUriString("/promotionEngine/v1/calculateTotalPrice/")                             
            .queryParam("request",req)                               
            .build()                                                
            .encode()                                               
            .toUri();
     
    ResponseEntity<TotalResponse> message = this.restTemplate.postForEntity(targetUrl,req, TotalResponse.class);
    assertThat(message.getBody().getTotalPrice()).isEqualTo(100);
   }

}

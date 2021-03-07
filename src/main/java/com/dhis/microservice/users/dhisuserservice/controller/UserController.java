package com.dhis.microservice.users.dhisuserservice.controller;

import com.dhis.microservice.users.dhisuserservice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private static RestTemplate restTemplate;

    private static final String GET_USER = "http://server/api/api/userLookup";

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String userId) {
        String url = GET_USER + "/{id}";
        User user = new User();
        user.setUserId("QqvaU7JjkUV");

        return restTemplate.getForObject(url, User.class, user.getUserId());
    }
//    @GetMapping("/users/lookup")
//    private void getEmployees() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity< String > entity = new HttpEntity < String > ("parameters", headers);
//
//        ResponseEntity< String > result = restTemplate.exchange(CREATE_EMPLOYEE_ENDPOINT_URL, HttpMethod.GET, entity,
//                String.class);
//
//        System.out.println(result);
//    }




}

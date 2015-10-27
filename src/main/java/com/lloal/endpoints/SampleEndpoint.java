/*
 * Copyright (c) 2015, CloudSherpas Incorporated. All rights reserved.
 */
package com.lloal.endpoints;

import com.lloal.model.Greeting;
import com.lloal.services.SampleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/sample")
public class SampleEndpoint {

    @Inject
    @Qualifier("sampleService")
    @Lazy
    private SampleService sampleService;

    @RequestMapping(value="greet", method=RequestMethod.GET)
    public ResponseEntity<Greeting> getGreeting() {
        final Greeting greet = sampleService.getGreeting();
        return new ResponseEntity<>(greet, HttpStatus.OK);
    }
}

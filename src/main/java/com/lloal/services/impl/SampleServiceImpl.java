/*
 * Copyright (c) 2015, CloudSherpas Incorporated. All rights reserved.
 */
package com.lloal.services.impl;

import com.lloal.model.Greeting;
import com.lloal.services.SampleService;

public class SampleServiceImpl implements SampleService {

    @Override
    public Greeting getGreeting() {
        return new Greeting("Hello world!");
    }
}

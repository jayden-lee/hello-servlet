package com.jayden;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @Filter(Controller.class))
public class WebConfig {
}

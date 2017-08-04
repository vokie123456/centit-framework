package com.centit.framework.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zou_wy on 2017/3/29.
 */
@Configuration
@ComponentScan(basePackages = {"com.centit.framework.**.controller"},
               includeFilters = {@ComponentScan.Filter(value= org.springframework.stereotype.Controller.class)},
               useDefaultFilters = false)
public class SystemSpringMvcConfig extends BaseSpringMvcConfig {

}

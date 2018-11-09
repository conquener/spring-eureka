package com.example.springeureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;

/**
 * declare
 *
 * @user: ritchey
 * @date: 2018/11/5
 * @time: 16:02
 * @version: v1.0
 * Description:
 */
@Component
public class BaseController extends ApplicationObjectSupport {

    protected final static Logger log4j = LoggerFactory.getLogger(BaseController.class);

    @Value("${app.name}")
    public String appName;


}

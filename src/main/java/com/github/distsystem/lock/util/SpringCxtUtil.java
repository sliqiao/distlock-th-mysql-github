package com.github.distsystem.lock.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringCxtUtil implements ApplicationContextAware
{
    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext ()
    {
        return applicationContext;
    }

    public static Object getBean (String name)
    {
        return getApplicationContext ().getBean (name);
    }

    public static <T> T getBean (Class <T> clazz)
    {
        return getApplicationContext ().getBean (clazz);
    }

    public static <T> T getBean (String name, Class <T> clazz)
    {
        return getApplicationContext ().getBean (name, clazz);
    }

    @Override
    public void setApplicationContext (ApplicationContext applicationContext) throws BeansException
    {
        if (SpringCxtUtil.applicationContext == null)
        {
            SpringCxtUtil.applicationContext = applicationContext;
        }
    }
}
package com.kpbs;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KPBSThreadPoolExecutor implements ServletContextListener {
    private static Logger LOG = Logger.getLogger(KPBSThreadPoolExecutor.class);
    static ExecutorService service;

    static {
        //ExecutorService service;
        service = Executors.newCachedThreadPool();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    public static ExecutorService getService() {
        return service;

    }
}


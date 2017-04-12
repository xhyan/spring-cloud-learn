package com.xhyan.zero.admin.dashboard;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AdminDashboardApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminDashboardApp.class).run(args);
    }
}

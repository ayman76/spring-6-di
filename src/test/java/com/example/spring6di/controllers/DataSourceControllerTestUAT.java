package com.example.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"UAT", "EN"})
@SpringBootTest
class DataSourceControllerTestUAT {

    @Autowired
    private DataSourceController dataSourceController;
    @Test
    void getDataSourceName() {
        System.out.println(dataSourceController.getDataSourceName());
    }
}
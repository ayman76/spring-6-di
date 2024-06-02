package com.example.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"PROD","EN"})
@SpringBootTest
class DataSourceControllerTestPROD {

    @Autowired
    private DataSourceController dataSourceController;
    @Test
    void getDataSourceName() {
        System.out.println(dataSourceController.getDataSourceName());
    }
}
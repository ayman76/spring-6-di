package com.example.spring6di.controllers;

import com.example.spring6di.service.datasource.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSourceService dataSourceService;

    public DataSourceController(@Qualifier("datasourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSourceName() {
        return dataSourceService.getDataSourceName();
    }
}

package com.example.spring6di.service.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("datasourceService")
public class UATService implements DataSourceService{

    @Override
    public String getDataSourceName() {
        return "UAT Datasource";
    }
}

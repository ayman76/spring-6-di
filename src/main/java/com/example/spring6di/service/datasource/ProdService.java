package com.example.spring6di.service.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("datasourceService")
public class ProdService implements DataSourceService{
    @Override
    public String getDataSourceName() {
        return "Production Datasource";
    }
}

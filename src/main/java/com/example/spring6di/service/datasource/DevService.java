package com.example.spring6di.service.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("datasourceService")
public class DevService implements DataSourceService{
    @Override
    public String getDataSourceName() {
        return "Dev Datasource";
    }
}

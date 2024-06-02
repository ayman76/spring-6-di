package com.example.spring6di.service.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("datasourceService")
public class QAService implements DataSourceService{
    @Override
    public String getDataSourceName() {
        return "QA Datasource";
    }
}

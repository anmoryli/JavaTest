package com.anmory.config.Model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-17 下午8:19
 */

@Configuration
@Component
@ConfigurationProperties(prefix = "dbtypes")
public class DbTypes {
    private List<String> name;
    private Map<String,String> map;

    @Override
    public String toString() {
        return "DbTypes{" +
                "name=" + name +
                ", map=" + map +
                '}';
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}

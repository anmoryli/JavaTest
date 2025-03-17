package com.anmory.neo4jherb.Entity;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.io.Serializable;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-15 下午2:46
 */

@Node("Herb")
public class Herb implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Herb(String name) {
        this.name = name;
    }
}

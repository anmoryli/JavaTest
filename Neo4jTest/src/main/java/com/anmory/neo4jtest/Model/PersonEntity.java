package com.anmory.neo4jtest.Model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-12 上午8:07
 */

@Node("Person")
public class PersonEntity {
    @Id
    private final String name;
    private final Integer born;
    public PersonEntity(Integer born, String name) {
        this.born = born;
        this.name = name;
    }
    //Getters omitted

    public Integer getBorn() {
        return born;
    }

    public String getName() {
        return name;
    }
}

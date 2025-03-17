package com.anmory.neo4jherb;

import com.anmory.neo4jherb.Entity.Herb;
import com.anmory.neo4jherb.Repository.HerbRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class Neo4jHerbApplicationTests {

    @Autowired
    HerbRepo herbRepo;
    @Test
    void testCreate() {
        Optional<Herb> byId = herbRepo.findById(242L);
        byId.orElse(null);
    }
}
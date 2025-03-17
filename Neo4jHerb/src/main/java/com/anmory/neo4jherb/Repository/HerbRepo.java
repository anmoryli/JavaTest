package com.anmory.neo4jherb.Repository;

import com.anmory.neo4jherb.Entity.Herb;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-15 下午2:49
 */

@Repository
public interface HerbRepo extends Neo4jRepository<Herb, Long> {
}

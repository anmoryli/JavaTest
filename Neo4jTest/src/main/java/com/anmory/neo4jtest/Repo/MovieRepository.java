package com.anmory.neo4jtest.Repo;

import com.anmory.neo4jtest.Model.MovieEntity;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-03-12 上午8:08
 */

public interface MovieRepository extends ReactiveNeo4jRepository<MovieEntity, String> {
    Mono<MovieEntity> findOneByTitle(String title);
}

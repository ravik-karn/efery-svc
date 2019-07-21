package com.efery.web.pages;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PageRepository extends CrudRepository<Page, Integer> {
    @Query("SELECT p FROM Page p WHERE p.title = :pageTitle")
    Optional<Page> findBypageTitle(@Param("pageTitle") String pageTitle);
}

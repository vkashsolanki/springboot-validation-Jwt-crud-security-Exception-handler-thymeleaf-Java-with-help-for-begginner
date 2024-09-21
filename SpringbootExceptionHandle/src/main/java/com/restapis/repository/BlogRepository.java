package com.restapis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapis.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long>{

}

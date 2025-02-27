package com.migia.week7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.migia.week7.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

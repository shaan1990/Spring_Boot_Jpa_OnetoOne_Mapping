package com.example.springonetoonemapping.springonetoonemapping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

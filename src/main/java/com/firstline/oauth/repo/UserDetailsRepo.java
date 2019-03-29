package com.firstline.oauth.repo;

import com.firstline.oauth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}

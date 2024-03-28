package com.melcam.app.repository;

import com.melcam.app.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity,Long> {
    Optional<UserEntity> findUserEntitiesByUsername(String username);
}

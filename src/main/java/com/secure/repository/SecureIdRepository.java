package com.secure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secure.entity.SecureIdEntity;

@Repository
public interface SecureIdRepository extends JpaRepository<SecureIdEntity, Integer> {

}

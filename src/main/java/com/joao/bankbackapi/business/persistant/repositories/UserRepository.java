package com.joao.bankbackapi.business.persistant.repositories;

import com.joao.bankbackapi.business.persistant.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long>{

}

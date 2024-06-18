package com.cibertec.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.*;

public interface IUserRepository extends JpaRepository<User, Integer>{

}

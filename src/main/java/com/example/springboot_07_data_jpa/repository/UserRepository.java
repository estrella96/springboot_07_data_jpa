package com.example.springboot_07_data_jpa.repository;

import com.example.springboot_07_data_jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer>{

}

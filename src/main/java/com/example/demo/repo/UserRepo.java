package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE ID=?1",nativeQuery = true)
    User getUserByUserId(String userId);
    @Query(value = "select * from user where ID=?1 and ADDRESS=?2",nativeQuery = true)
    User getUserByUserIdAndAddress(String userId, String address);
}

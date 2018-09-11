package bupt.edu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bupt.edu.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
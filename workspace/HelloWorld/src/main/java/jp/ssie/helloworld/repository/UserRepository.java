package jp.ssie.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ssie.helloworld.model.LoginUser;

@Repository
public interface UserRepository extends JpaRepository<LoginUser, String>{

}

package org.TeamTaskManagement.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.TeamTaskManagement.User.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    List<User> findByFirstNameContainingAndLastNameContaining(String firstName, String lastName);
}

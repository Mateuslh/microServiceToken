package betha.microServiceToken.repository;

import betha.microServiceToken.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String login);
}

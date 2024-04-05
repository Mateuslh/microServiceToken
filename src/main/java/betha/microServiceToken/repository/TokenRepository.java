package betha.microServiceToken.repository;

import betha.microServiceToken.model.Token.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface TokenRepository extends JpaRepository<Token, Long> {

}

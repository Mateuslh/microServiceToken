package betha.microServiceToken.repository;

import betha.microServiceToken.model.Token.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

}

package betha.microServiceToken.controller;

import betha.microServiceToken.model.Token.Token;
import betha.microServiceToken.repository.TokenRepository;
import betha.microServiceToken.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

import java.util.Collection;

@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity getAllTokens(Authentication authentication) {
        String username = ((UserDetails) authentication.getPrincipal()).getUsername();
        Collection<Token> tokens = userRepository.findByUsername(username).getTokens();
        return ResponseEntity.ok(tokens);
    }
}

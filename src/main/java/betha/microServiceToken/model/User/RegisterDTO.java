package betha.microServiceToken.model.User;

public record RegisterDTO(String username, String password, UserRole role) {
}

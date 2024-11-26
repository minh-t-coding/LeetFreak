package mn.leetfreak;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

      // Create a new user
      @Transactional
      public User createUser(String username, String email, String passwordHash, int eloRating) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPasswordHash(passwordHash);
        user.setEloRating(eloRating);
        return userRepository.save(user);
    }

    // Find user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Find user by username
    public Optional<User> getUserByUsername(String username) {
        return Optional.ofNullable(userRepository.findByUsername(username));
    }

    // Find all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Update user information
    @Transactional
    public User updateUser(Long id, String username, String email, String passwordHash, int eloRating) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUsername(username);
            user.setEmail(email);
            user.setPasswordHash(passwordHash);
            user.setEloRating(eloRating);
            return userRepository.save(user);
        }
        return null;  // Or throw a custom exception
    }

    // Delete a user by ID
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

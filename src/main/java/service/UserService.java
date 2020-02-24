package service;
import exception.UserNotFoundException;
import model.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository
                .findById(id)
                .orElseThrow(UserNotFoundException::new);

    }

}

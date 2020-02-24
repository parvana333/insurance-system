package service;

import org.springframework.stereotype.Service;
import repository.ClientRepository;
import repository.UserRepository;

@Service
public class LoginService {
    private final UserRepository userRepository;
    private final ClientRepository clientRepository;

    public LoginService(UserRepository userRepository, ClientRepository clientRepository) {
        this.userRepository = userRepository;
        this.clientRepository = clientRepository;
    }

}

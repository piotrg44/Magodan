package pl.magodan.magodan.Service;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pl.magodan.magodan.Model.Role;
import pl.magodan.magodan.Model.User;
import pl.magodan.magodan.Repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;

    @Bean
    public void init(){
        userRepository.save(User.builder().name("User1").role(Role.ADMIN).build());
    }
}

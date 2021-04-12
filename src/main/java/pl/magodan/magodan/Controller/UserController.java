package pl.magodan.magodan.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.magodan.magodan.Service.Dtos.UserResponse;
import pl.magodan.magodan.Service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getUsers() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
}

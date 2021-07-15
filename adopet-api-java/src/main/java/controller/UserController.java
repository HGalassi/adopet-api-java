package controller;

import dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping()
    public ResponseEntity<?> post(
            @RequestBody Set<UserDto> usersDto
    ) {
        return new ResponseEntity<>(usersDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> get(){
        return new ResponseEntity<>("Hello man", HttpStatus.OK);
    }
}

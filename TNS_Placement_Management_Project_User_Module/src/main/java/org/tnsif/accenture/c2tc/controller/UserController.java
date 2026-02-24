package org.tnsif.accenture.c2tc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tnsif.accenture.c2tc.dto.ApiResponse;
import org.tnsif.accenture.c2tc.dto.LoginRequest;
import org.tnsif.accenture.c2tc.dto.UserDTO;
import org.tnsif.accenture.c2tc.entity.User;
import org.tnsif.accenture.c2tc.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(@RequestBody UserDTO userDTO) {
        User user = toEntity(userDTO);
        User saved = userService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse("User registered successfully.", 201, toDTO(saved)));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@RequestBody LoginRequest loginRequest) {
        User user = userService.login(loginRequest.getUsername(), loginRequest.getPassword());
        return ResponseEntity.ok(new ApiResponse("Login successful.", 200, toSafeDTO(user)));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ApiResponse> update(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        User user = toEntity(userDTO);
        User updated = userService.updateUser(id, user);
        return ResponseEntity.ok(new ApiResponse("User updated successfully.", 200, toDTO(updated)));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse> delete(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(new ApiResponse("User deleted successfully.", 200, null));
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers()
                .stream()
                .map(this::toSafeDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(new ApiResponse("Users fetched successfully.", 200, users));
    }

    private User toEntity(UserDTO dto) {
        return User.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .name(dto.getName())
                .type(dto.getType())
                .password(dto.getPassword())
                .build();
    }

    private UserDTO toDTO(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getName(), user.getType(), null);
    }

    private UserDTO toSafeDTO(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getName(), user.getType(), null);
    }
}

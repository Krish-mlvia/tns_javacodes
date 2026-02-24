package org.tnsif.accenture.c2tc.dto;

public class UserDTO {

    private Long id;
    private String username;
    private String name;
    private String type;
    private String password;

    public UserDTO() {}

    public UserDTO(Long id, String username, String name, String type, String password) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.type = type;
        this.password = password;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

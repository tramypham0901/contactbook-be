package com.my.contactbook.jwt;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    /**
     * Need default constructor for JSON Parsing
     */
    public JwtRequest() {
        // nop
    }

    public JwtRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

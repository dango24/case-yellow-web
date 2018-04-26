package com.icarusrises.caseyellowweb.commands;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class LoginCommand {

    @NotEmpty
    @Size(min = 4, max = 50)
    private String userName;

    @NotEmpty
    @Size(min = 8, max = 50)
    private String password;
}

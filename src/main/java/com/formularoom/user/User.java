package com.formularoom.user;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class User implements Serializable {

    private long id;

    private String userName;

    private String email;

    private String password;

    private long created_at;

    private long updated_at;
}

package lnbti.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {

    public Player(String name, int age, String email, String password, String gender){
        this.name = name;
        this.age= age;
        this.email=email;
        this.password = password;
        this.gender = gender;
    }

    private long id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String gender;

}

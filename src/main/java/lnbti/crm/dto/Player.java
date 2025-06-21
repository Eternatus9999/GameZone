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

    private long id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String gender;

}

package kr.re.kitri.hello.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private String userId;
    private String name;
    private int age;
}

package kr.re.kitri.hello.model;

import lombok.*;

@AllArgsConstructor
@Data
public class Product {
    private String id;
    private String name;
    private Long price;
    private String description;
}

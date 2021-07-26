package hello.springmvc.basic;

import lombok.Data;

//Lombok의 @Data 사용으로 인해 Getter, Setter, toString, EqualsAndHashCode 등 자동 적용
@Data
public class HelloData {
    private String username;
    private int age;
}

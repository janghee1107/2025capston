package highFive.calendar.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//  아래 두 어노테이션 vsc 에서 추가
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private Long userId;

    private String email;

    private String pwd;

    private String name;

    private int gender;
}

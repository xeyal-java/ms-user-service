package com.example.msuserservice.dto.common;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCommonDto {
    private Long id;
    private String fullName;
}

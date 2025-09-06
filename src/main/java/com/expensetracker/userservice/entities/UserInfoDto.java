package com.expensetracker.userservice.entities;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserInfoDto
{

    private String firstName; // first_name

    private String lastName; //last_name

    private Long phoneNumber;

    private String email; // email

    private String profilePic; // profile_pic

    private String username;

    private String password;

    private Set<UserRole> roles = new HashSet<>();

    public UserInfo transformToUserInfo() {
        return UserInfo.builder()
                .username(username)
                .firstName(firstName)
                .lastName(lastName)
                .phoneNumber(phoneNumber)
                .email(email)
                .profilePic(profilePic)
                .build();
    }

    public UserInfoDto transformToUserInfoDto(UserInfo userInfo) {
        return UserInfoDto.builder()
                .firstName(userInfo.getFirstName())
                .lastName(userInfo.getLastName())
                .email(userInfo.getEmail())
                .phoneNumber(userInfo.getPhoneNumber())
                .profilePic(userInfo.getProfilePic())
                .username(userInfo.getUsername())
                .build();
    }
}

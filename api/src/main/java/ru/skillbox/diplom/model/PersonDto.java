package ru.skillbox.diplom.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class PersonDto {
    private Long id;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastName;

    @JsonProperty(value = "reg_date")
    private Long registrationDate;

    @JsonProperty(value = "birth_date")
    private Long birthDate;

    @JsonProperty(value = "e_mail")
    private String email;

    private String phone;

    private String photo;

    @JsonProperty(value = "about")
    private String description;

    private CityDto city;

    private CountryDto country;

    @JsonProperty(value = "messages_permission")
    private String permission;

    @JsonProperty(value = "last_online_time")
    private Long lastOnlineTime;

    @JsonProperty(value = "is_blocked")
    private boolean isBlocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String refreshToken;

    private List<PostDto> posts = new ArrayList<>();

    public PersonDto setToken(String token) {
        this.token = token;
        return this;
    }

    public PersonDto setRefreshToken(String token){
        this.refreshToken = token;
        return this;
    }
}

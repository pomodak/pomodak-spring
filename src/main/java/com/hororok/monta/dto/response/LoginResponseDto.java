package com.hororok.monta.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {

    private int status;
    private Data data;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data{
        @JsonProperty("access_token")
        private String accessToken;
    }

    public LoginResponseDto(String token) {
        this.data = new Data(token);
        this.status = HttpStatus.OK.value();
    }
}

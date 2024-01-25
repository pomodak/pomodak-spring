package com.hororok.monta.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class DeleteResponseDto {

    private String status;
    private String data;

    public DeleteResponseDto() {
        this.status = "success";
        this.data = null;
    }
}

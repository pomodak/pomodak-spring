package com.hororok.monta.dto.request.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateItemRequestDto {
    @NotBlank(message = "아이템 타입은 필수 입력 값 입니다.")
    @JsonProperty("item_type")
    private String itemType;

    @NotBlank(message = "아이템 이름은 필수 입력 값 입니다.")
    private String name;

    private String grade;

    @NotBlank(message = "아이템 설명은 필수 입력 값 입니다.")
    private String description;

    @NotBlank(message = "이미지 URL은 필수 입력 값 입니다.")
    @JsonProperty("image_url")
    private String imageUrl;

    @NotNull(message = "비용은 필수 입력 값 입니다.")
    private int cost;

    @JsonProperty("required_study_time")
    private Integer requiredStudyTime;

    @NotNull(message = "아이템 효과 코드는 필수 입력 값 입니다.")
    @JsonProperty("effect_code")
    private int effectCode;

    @NotNull(message = "hidden 여부 필수 입력 값 입니다.")
    @JsonProperty("is_hidden")
    private Boolean isHidden;
}

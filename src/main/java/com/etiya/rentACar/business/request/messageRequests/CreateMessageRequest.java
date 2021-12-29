package com.etiya.rentACar.business.request.messageRequests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMessageRequest {

    @JsonIgnore
    private int messageId;

    @NotNull
    private String message;

    @NotNull
    private int languageId;

    @NotNull
    private int messageKeyId;
}

package com.etiya.rentACar.business.request.messageKeyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMessageKeyRequest {
    @NotNull
    private String messageKey;
}

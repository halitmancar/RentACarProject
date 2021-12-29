package com.etiya.rentACar.business.request.messageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteMessageRequest {
    @NotNull
    private int messageId;
}

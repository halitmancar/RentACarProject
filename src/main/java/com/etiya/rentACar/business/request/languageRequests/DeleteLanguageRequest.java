package com.etiya.rentACar.business.request.languageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteLanguageRequest {

    @NotNull
    private int languageId;
}

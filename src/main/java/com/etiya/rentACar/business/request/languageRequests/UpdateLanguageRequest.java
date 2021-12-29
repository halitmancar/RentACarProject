package com.etiya.rentACar.business.request.languageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageRequest {
    @NotNull
    private int languageId;

    @NotNull
    private String languageName;
}

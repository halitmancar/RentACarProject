package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.request.languageRequests.CreateLanguageRequest;
import com.etiya.rentACar.business.request.languageRequests.DeleteLanguageRequest;
import com.etiya.rentACar.business.request.languageRequests.UpdateLanguageRequest;
import com.etiya.rentACar.core.utilities.results.Result;

public interface LanguageService {
    Result save(CreateLanguageRequest createLanguageRequest);
    Result delete(DeleteLanguageRequest deleteLanguageRequest);
    Result update(UpdateLanguageRequest updateLanguageRequest);
}

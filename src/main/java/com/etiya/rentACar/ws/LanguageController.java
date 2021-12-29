package com.etiya.rentACar.ws;

import com.etiya.rentACar.business.abstracts.LanguageService;
import com.etiya.rentACar.business.request.languageRequests.CreateLanguageRequest;
import com.etiya.rentACar.business.request.languageRequests.DeleteLanguageRequest;
import com.etiya.rentACar.business.request.languageRequests.UpdateLanguageRequest;
import com.etiya.rentACar.business.request.messageRequests.CreateMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.DeleteMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.UpdateMessageRequest;
import com.etiya.rentACar.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/languages")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @PostMapping("add")
    public Result add(@RequestBody @Valid CreateLanguageRequest createLanguageRequest) {
        return this.languageService.save(createLanguageRequest);
    }
    @DeleteMapping("delete")
    public Result delete(@RequestBody @Valid DeleteLanguageRequest deleteLanguageRequest) {
        return this.languageService.delete(deleteLanguageRequest);
    }
    @PutMapping("update")
    public Result update(@RequestBody @Valid UpdateLanguageRequest updateLanguageRequest) {
        return this.languageService.update(updateLanguageRequest);
    }
}

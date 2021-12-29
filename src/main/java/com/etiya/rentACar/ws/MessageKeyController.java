package com.etiya.rentACar.ws;

import com.etiya.rentACar.business.abstracts.MessageKeyService;
import com.etiya.rentACar.business.request.messageKeyRequests.CreateMessageKeyRequest;
import com.etiya.rentACar.business.request.messageKeyRequests.DeleteMessageKeyRequest;
import com.etiya.rentACar.business.request.messageKeyRequests.UpdateMessageKeyRequest;
import com.etiya.rentACar.business.request.messageRequests.CreateMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.DeleteMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.UpdateMessageRequest;
import com.etiya.rentACar.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/messageKeys")
public class MessageKeyController {
    private MessageKeyService messageKeyService;

    @Autowired
    public MessageKeyController(MessageKeyService messageKeyService) {
        this.messageKeyService = messageKeyService;
    }
    @PostMapping("add")
    public Result add(@RequestBody @Valid CreateMessageKeyRequest createMessageKeyRequest) {
        return this.messageKeyService.save(createMessageKeyRequest);
    }
    @DeleteMapping("delete")
    public Result delete(@RequestBody @Valid DeleteMessageKeyRequest deleteMessageKeyRequest) {
        return this.messageKeyService.delete(deleteMessageKeyRequest);
    }
    @PutMapping("update")
    public Result update(@RequestBody @Valid UpdateMessageKeyRequest updateMessageKeyRequest) {
        return this.messageKeyService.update(updateMessageKeyRequest);
    }
}

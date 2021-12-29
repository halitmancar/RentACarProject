package com.etiya.rentACar.ws;

import com.etiya.rentACar.business.abstracts.MessageService;
import com.etiya.rentACar.business.request.messageRequests.CreateMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.DeleteMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.UpdateMessageRequest;
import com.etiya.rentACar.business.request.rentalRequests.CreateRentalRequest;
import com.etiya.rentACar.business.request.rentalRequests.DeleteRentalRequest;
import com.etiya.rentACar.business.request.rentalRequests.UpdateRentalRequest;
import com.etiya.rentACar.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/messages")
public class MessageController {
    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
    @PostMapping("add")
    public Result add(@RequestBody @Valid CreateMessageRequest createMessageRequest) {
        return this.messageService.save(createMessageRequest);
    }
    @DeleteMapping("delete")
    public Result delete(@RequestBody @Valid DeleteMessageRequest deleteMessageRequest) {
        return this.messageService.delete(deleteMessageRequest);
    }
    @PutMapping("update")
    public Result update(@RequestBody @Valid UpdateMessageRequest updateMessageRequest) {
        return this.messageService.update(updateMessageRequest);
    }
}

package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.request.messageRequests.CreateMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.DeleteMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.UpdateMessageRequest;
import com.etiya.rentACar.core.utilities.results.Result;

public interface MessageService {
    Result save(CreateMessageRequest createMessageRequest);
    Result delete(DeleteMessageRequest deleteMessageRequest);
    Result update(UpdateMessageRequest updateMessageRequest);
    String getMessage(int languageId, int messageKeyId);
}

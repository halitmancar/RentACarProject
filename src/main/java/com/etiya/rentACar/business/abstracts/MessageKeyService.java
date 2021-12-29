package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.request.messageKeyRequests.CreateMessageKeyRequest;
import com.etiya.rentACar.business.request.messageKeyRequests.DeleteMessageKeyRequest;
import com.etiya.rentACar.business.request.messageKeyRequests.UpdateMessageKeyRequest;
import com.etiya.rentACar.core.utilities.results.Result;

public interface MessageKeyService {
    Result save(CreateMessageKeyRequest createMessageKeyRequest);
    Result delete(DeleteMessageKeyRequest deleteMessageKeyRequest);
    Result update(UpdateMessageKeyRequest updateMessageKeyRequest);
}

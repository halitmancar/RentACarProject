package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.MessageService;
import com.etiya.rentACar.business.request.messageRequests.CreateMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.DeleteMessageRequest;
import com.etiya.rentACar.business.request.messageRequests.UpdateMessageRequest;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.core.utilities.results.Result;
import com.etiya.rentACar.core.utilities.results.SuccessResult;
import com.etiya.rentACar.dataAccess.abstracts.MessageDao;
import com.etiya.rentACar.entities.multipleLanguageMessages.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageManager implements MessageService {

    private MessageDao messageDao;
    private ModelMapperService modelMapperService;

    @Autowired
    public MessageManager(MessageDao messageDao, ModelMapperService modelMapperService) {
        this.messageDao = messageDao;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public Result save(CreateMessageRequest createMessageRequest) {
        Message message = modelMapperService.forRequest().map(createMessageRequest, Message.class);
        this.messageDao.save(message);
        return new SuccessResult("");
    }

    @Override
    public Result delete(DeleteMessageRequest deleteMessageRequest) {
        Message message = modelMapperService.forRequest().map(deleteMessageRequest, Message.class);
        this.messageDao.delete(message);
        return new SuccessResult("");
    }

    @Override
    public Result update(UpdateMessageRequest updateMessageRequest) {
        Message message = modelMapperService.forRequest().map(updateMessageRequest, Message.class);
        this.messageDao.save(message);
        return new SuccessResult("");
    }

    @Override
    public String getMessage(int languageId, int messageKeyId) {
        return this.messageDao.getMessage(languageId,messageKeyId);
    }
}

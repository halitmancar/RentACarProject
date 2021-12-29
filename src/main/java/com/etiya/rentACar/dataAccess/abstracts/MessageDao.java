package com.etiya.rentACar.dataAccess.abstracts;


import com.etiya.rentACar.entities.multipleLanguageMessages.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MessageDao extends JpaRepository<Message, Integer> {

    @Query(value = "select m.message from messages as m where m.language_id = ?1 and m.message_key_id = ?2", nativeQuery = true)
    String getMessage(int languageId, int messageKeyId);
}

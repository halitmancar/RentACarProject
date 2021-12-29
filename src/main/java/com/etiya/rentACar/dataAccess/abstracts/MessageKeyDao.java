package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.multipleLanguageMessages.MessageKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageKeyDao extends JpaRepository<MessageKey, Integer> {
}

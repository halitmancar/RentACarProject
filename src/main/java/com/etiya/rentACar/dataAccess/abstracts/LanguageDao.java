package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.multipleLanguageMessages.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language, Integer> {
}

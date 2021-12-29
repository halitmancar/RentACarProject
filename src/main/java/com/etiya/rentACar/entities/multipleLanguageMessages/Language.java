package com.etiya.rentACar.entities.multipleLanguageMessages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int languageId;

    @Column(name = "language_name")
    private String languageName;

    @OneToMany(mappedBy = "language")
    private List<Message> messages;
}

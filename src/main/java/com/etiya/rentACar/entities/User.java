package com.etiya.rentACar.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="email")
	private String eMail;
	
	@Column(name="password")
	private String password;

	@OneToMany(mappedBy="user") 
	private List<Rental> rentals;
	
	@OneToMany(mappedBy="user")
	private List<CreditCard> creditCards;
	
	@OneToMany(mappedBy="user")
	private List<RentingBill> rentingBills;
}

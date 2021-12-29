package com.etiya.rentACar.business.request.carRequests;

import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateCarRequest {
	
	@NotNull
	@Min(1)
	private int brandId;
	
	@NotNull
	@Min(1)
	private int colorId;
	
	@NotNull
	@Size(min=4, max=4)
	private String modelYear;
	
	@NotNull
	@Min(0)
	private Double dailyPrice;
	
	@NotNull
	@Size(max=50)
	@NotBlank
	private String description;

	@NotNull
	@Min(0)
	@Max(1900)
	private Integer findeksPointCar;
	
	@NotNull
	@Min(1)
	@Max(81)
	private int cityId;

	@Min(0)
	@NotNull
	private Integer kilometer;
 
}

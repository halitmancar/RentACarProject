package com.etiya.rentACar.business.abstracts;

import java.sql.Date;
import java.util.List;

import com.etiya.rentACar.business.dtos.RentalSearchListDto;
import com.etiya.rentACar.business.request.rentalRequests.CreateRentalRequest;
import com.etiya.rentACar.business.request.rentalRequests.DeleteRentalRequest;
import com.etiya.rentACar.business.request.rentalRequests.UpdateRentalRequest;
import com.etiya.rentACar.core.utilities.results.DataResult;
import com.etiya.rentACar.core.utilities.results.Result;
import com.etiya.rentACar.entities.AdditionalService;
import com.etiya.rentACar.entities.Rental;

public interface RentalService {
	DataResult<List<RentalSearchListDto>> getAll();
	Result save(CreateRentalRequest createRentalRequest);
	Result delete(DeleteRentalRequest deleteRentalRequest);
	Result update(UpdateRentalRequest updateRentalRequest);
	Result checkCarIsReturned(int carId);
	public DataResult<List<AdditionalService>> extractAdditionalServicesFromString(UpdateRentalRequest updateRentalRequest);
	public Result checkIfEndDateIsAfterStartDate(Date endDate, Date startDate);
	Rental getById(int rentalId);
}

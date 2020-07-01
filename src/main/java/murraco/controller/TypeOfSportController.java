package murraco.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.ResponseDTO;
import murraco.dto.tempDTO.QualificationTempDTO;
import murraco.dto.tempDTO.TypeOfSportTempDTO;

@RestController
@RequestMapping("/typeofsport")
@Api(tags = "Type Of Sports")
public class TypeOfSportController {
	
	@GetMapping("/typeofsports")
	@ApiOperation(value = "${TypeOfSportController.typeofsports}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> religions() {
		List<TypeOfSportTempDTO> resultList = populateTypeOfSport();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<TypeOfSportTempDTO> populateTypeOfSport() {
		List<TypeOfSportTempDTO> resultList = new ArrayList<>();

		TypeOfSportTempDTO qualification1 = TypeOfSportTempDTO.builder().id("ISSYS044001000000000121062019")
				.name("Karate").description("Karate").build();
		TypeOfSportTempDTO qualification2 = TypeOfSportTempDTO.builder().id("ISSYS044001000000001109082019")
				.name("Wrestlesport").description("Wrestlesport").build();
		TypeOfSportTempDTO qualification3 = TypeOfSportTempDTO.builder().id("ISSYS044001000000000121062019")
				.name("Karate").description("Karate").build();
		TypeOfSportTempDTO qualification4 = TypeOfSportTempDTO.builder().id("ISSYS044001000000001109082019")
				.name("Wrestlesport").description("Wrestlesport").build();
		TypeOfSportTempDTO qualification5 = TypeOfSportTempDTO.builder().id("ISSYS044001000000000121062019")
				.name("Karate").description("Karate").build();

		resultList.add(qualification1);
		resultList.add(qualification2);
		resultList.add(qualification3);
		resultList.add(qualification4);
		resultList.add(qualification5);

		return resultList;
	}

}

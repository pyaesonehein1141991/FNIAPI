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

@RestController
@RequestMapping("/qualification")
@Api(tags = "Qualification")
public class QualificationController {

	@GetMapping("/qualifications")
	@ApiOperation(value = "${QualificationController.qualifications}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> religions() {
		List<QualificationTempDTO> resultList = populateQualification();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<QualificationTempDTO> populateQualification() {
		List<QualificationTempDTO> resultList = new ArrayList<>();

		QualificationTempDTO qualification1 = QualificationTempDTO.builder().id("ISSYS016001000009576109032019")
				.name("B.C.Sc").description("some description").build();
		QualificationTempDTO qualification2 = QualificationTempDTO.builder().id("ISSYS016001000009577210032019")
				.name("M.C.Sc").description("some description").build();

		resultList.add(qualification1);
		resultList.add(qualification2);

		return resultList;
	}

}

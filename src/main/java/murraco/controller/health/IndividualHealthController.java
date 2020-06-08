package murraco.controller.health;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.ResponseDTO;
import murraco.dto.health.IndividualHealthInsuranceDTO;
import murraco.dto.responseDTO.LifeResponseDTO;

@RestController
@RequestMapping("/individualHealth")
@Api(tags = "Individual Health")
public class IndividualHealthController {

	@PostMapping("/submitproposal")
	@ApiOperation(value = "${IndividualHealthController.submitproposal}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public ResponseDTO<Object> submitproposal(@Valid @RequestBody IndividualHealthInsuranceDTO individualHealthDTO) {

		LifeResponseDTO dto = new LifeResponseDTO();
		List<LifeResponseDTO> responseList = new ArrayList<>();

		individualHealthDTO.getProposalInsuredPersonList().stream().forEach(insuredPerson -> {
			dto.setProposalID("ID77777");
			dto.setProposalNo("H/1904/0000000006");

			/*
			 * if (studentLifeProposalDTO.getCustomerID().equals(null) ||
			 * studentLifeProposalDTO.getCustomerID().isEmpty()) { }
			 */
			responseList.add(dto);
		});

		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success!").responseBody(responseList).build();

		return responseDTO;

	}

}

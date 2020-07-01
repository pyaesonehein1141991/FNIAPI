package murraco.controller;

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
import murraco.dto.FarmerLifeProposalDTO;
import murraco.dto.FarmerProposalInsuredPersonDTO;
import murraco.dto.FarmerResponseDTO;
import murraco.dto.ResponseDTO;

@RestController
@RequestMapping("/farmer")
@Api(tags = "Farmer")
public class FarmerController {

	@PostMapping("/submitproposal")
	@ApiOperation(value = "${FarmerController.submitproposal}")
	@ApiResponses(value = { //
			@ApiResponse(code = 400, message = "Something went wrong"), //
			@ApiResponse(code = 403, message = "Access denied"), //
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })

	public ResponseDTO<Object> submitproposal(@Valid @RequestBody FarmerLifeProposalDTO groupFarmerProposalDTO) {

		FarmerResponseDTO dto = new FarmerResponseDTO();
		List<FarmerResponseDTO> responseList = new ArrayList<>();
		for (FarmerProposalInsuredPersonDTO insuredPerson : groupFarmerProposalDTO
				.getProposalInsuredPersonList()) {
			dto.setProposalID("F9999999");
			dto.setProposalNo("FP/1904/0000000006");
			// dto.setGroupProposalNo("GFP/1904/0000000006");
			/*
			 * if (insuredPerson.getCustomerID().equals(null) || insuredPerson.getCustomerID().isEmpty()) {
			 * dto.setCustomerId("CUS111"); }
			 */
			responseList.add(dto);
		}
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success!").responseBody(responseList).build();

		return responseDTO;
	}

}

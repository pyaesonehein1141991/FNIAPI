package murraco.controller.criticalIllness;

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
import murraco.dto.criticalIllness.GroupCriticalIllnessDTO;
import murraco.dto.responseDTO.LifeResponseDTO;

@RestController
@RequestMapping("/groupCriticalIllness")
@Api(tags = "Group CriticalIllness")
public class GroupCriticalIllnessController {
	

	@PostMapping("/submitproposal")
	@ApiOperation(value = "${GroupCriticalIllnessController.submitproposal}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public ResponseDTO<Object> submitproposal(@Valid @RequestBody GroupCriticalIllnessDTO personalAccidentDTO) {

		LifeResponseDTO dto = new LifeResponseDTO();
		List<LifeResponseDTO> responseList = new ArrayList<>();

		personalAccidentDTO.getProposalInsuredPersonList().stream().forEach(insuredPerson -> {
			dto.setProposalID("ID77777");
			dto.setProposalNo("CG/1904/0000000006");
			
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

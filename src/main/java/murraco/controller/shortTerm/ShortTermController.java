package murraco.controller.shortTerm;

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
import murraco.dto.responseDTO.LifeResponseDTO;
import murraco.dto.shortTerm.ShortTermEndowmentLifeDTO;

@RestController
@RequestMapping("/shortTerm")
@Api(tags = "Short-Term Life Insurance")
public class ShortTermController {
	

	@PostMapping("/submitproposal")
	@ApiOperation(value = "${ShortTerm.submitproposal}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public ResponseDTO<Object> submitproposal(@Valid @RequestBody ShortTermEndowmentLifeDTO shortTermDTO) {

		LifeResponseDTO dto = new LifeResponseDTO();
		List<LifeResponseDTO> responseList = new ArrayList<>();

		shortTermDTO.getProposalInsuredPersonList().stream().forEach(insuredPerson -> {
			dto.setProposalID("ID111111");
			dto.setProposalNo("ST/1904/0000000006");
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

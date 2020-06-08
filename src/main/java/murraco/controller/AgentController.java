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
import murraco.dto.tempDTO.AgentTempDTO;
import murraco.model.common.Gender;
import murraco.model.common.IdType;

@RestController
@RequestMapping("/agent")
@Api(tags = "Agents")
public class AgentController {

	@GetMapping("/agents")
	@ApiOperation(value = "${AgentController.agents}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> agents() {
		List<AgentTempDTO> resultList = populateAgent();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<AgentTempDTO> populateAgent() {
		List<AgentTempDTO> resultList = new ArrayList<>();

		AgentTempDTO agent1 = AgentTempDTO.builder().id("ISSYS002001000000000103062019").name("Than Naing")
				.codeNo("TATLA/6-2019/00001/001").fatherName("U Ba").gender(Gender.MALE).idType(IdType.STILL_APPLYING)
				.joinDate("2020-12-16")
				.email("thannaing@gmail.com")
				.initialId("U").build();
		AgentTempDTO agent2 = AgentTempDTO.builder().id("ISSYS002001000000001104062019").name("Hnin Nu Nu Naing")
				.codeNo("TATLA/6-2019/00002/001").fatherName("U Ye Nyunt").gender(Gender.FEMALE).idType(IdType.NRCNO)
				.joinDate("2015-1-1")
				.email("hninnu@gmail.com")
				.initialId("Daw ").build();
		AgentTempDTO agent3 = AgentTempDTO.builder().id("ISSYS002001000000002205062019").name("Zin May Han Win")
				.codeNo("TATLA/6-2019/00004/001").fatherName("U Tin Maung").gender(Gender.FEMALE)
				.idType(IdType.STILL_APPLYING)
				.joinDate("2019-10-3")
				.email("zinmayhanwin@gmail.com")
				.initialId("Daw").build();
		AgentTempDTO agent4 = AgentTempDTO.builder().id("ISSYS002001000000005107062019").name("Kyaw Than Htun")
				.codeNo("TATLA/6-2019/00012/001").fatherName("-").gender(Gender.MALE).idType(IdType.STILL_APPLYING)
				.joinDate("2019-10-10")
				.email("kyawthanhtun@gmail.com")
				.initialId("U").build();
		AgentTempDTO agent5 = AgentTempDTO.builder().id("ISSYS002001000000009215062019").name("Yar Zar Soe")
				.codeNo("TATLA/6-2019/00019/001").fatherName("U Nyi NYi").gender(Gender.MALE).idType(IdType.NRCNO)
				.joinDate("2020-1-11")
				.email("yarzarsoe@gmail.com")
				.initialId("U").build();

		resultList.add(agent1);
		resultList.add(agent2);
		resultList.add(agent3);
		resultList.add(agent4);
		resultList.add(agent5);

		return resultList;
	}

}

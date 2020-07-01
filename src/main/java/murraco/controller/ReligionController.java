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
import murraco.dto.tempDTO.OccupationTempDTO;
import murraco.dto.tempDTO.ReligionTempDTO;

@RestController
@RequestMapping("/religion")
@Api(tags = "Religions")
public class ReligionController {
	
	@GetMapping("/religions")
	@ApiOperation(value = "${ReligionController.religions}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> religions() {
		List<ReligionTempDTO> resultList = populateReligion();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<ReligionTempDTO> populateReligion() {
		List<ReligionTempDTO> resultList = new ArrayList<>();

		ReligionTempDTO religion1 = ReligionTempDTO.builder().id("ISSYS017001000000032203072015")
				.name("CHINESE-BURMA").description("CHINESE-BURMA").build();
		ReligionTempDTO religion2 = ReligionTempDTO.builder().id("ISSYS017001000009447209052017").name("ITALIAN")
				.description("ITALIAN").build();
		ReligionTempDTO religion3 = ReligionTempDTO.builder().id("ISSYS017001000000245219122015")
				.name("MYANMAR-ISLAM").description("MYANMAR-ISLAM").build();
		ReligionTempDTO religion4 = ReligionTempDTO.builder().id("ISSYS017HO000000000214062013").name("CHRISTIAN")
				.description("CHRISTIAN").build();
		ReligionTempDTO religion5 = ReligionTempDTO.builder().id("ISSYS017HO000000001113052013")
				.name("BUDDHISM").description("THERAVADA BUDDHIST").build();

		resultList.add(religion1);
		resultList.add(religion2);
		resultList.add(religion3);
		resultList.add(religion4);
		resultList.add(religion5);

		return resultList;
	}

}

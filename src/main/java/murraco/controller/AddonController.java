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
import murraco.dto.tempDTO.AddonTempDTO;
import murraco.dto.tempDTO.AgentTempDTO;
import murraco.model.common.AddOnType;
import murraco.model.common.Gender;
import murraco.model.common.IdType;
import murraco.model.common.ProductBaseType;

@RestController
@RequestMapping("/addon")
@Api(tags = "Addon")
public class AddonController {

	@GetMapping("/addons")
	@ApiOperation(value = "${AddonController.addons}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> addons() {
		List<AddonTempDTO> resultList = populateAddon();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<AddonTempDTO> populateAddon() {
		List<AddonTempDTO> resultList = new ArrayList<>();

		AddonTempDTO addon1 = AddonTempDTO.builder().id("ISSYS014001000000000110012020").basedAmount(100)
				.isBasedOnKeyfactor(false).isCompulsory(false).maximumValue(0).minimumValue(0)
				.premiumRateType(AddOnType.BASED_ON_PREMIUN).productBaseType(null).build();
		AddonTempDTO addon2 = AddonTempDTO.builder().id("ISSYS014001000009374822062017").basedAmount(100)
				.isBasedOnKeyfactor(false).isCompulsory(null).maximumValue(0).minimumValue(0)
				.premiumRateType(AddOnType.BASED_ON_PREMIUN).productBaseType(null).build();
		AddonTempDTO addon3 = AddonTempDTO.builder().id("ISSYS014001000009603223042019").basedAmount(100)
				.isBasedOnKeyfactor(true).isCompulsory(false).maximumValue(10).minimumValue(1)
				.premiumRateType(AddOnType.PER_UNIT).productBaseType(ProductBaseType.UNIT).build();
		AddonTempDTO addon4 = AddonTempDTO.builder().id("ISSYS014001000009603323042019").basedAmount(100)
				.isBasedOnKeyfactor(true).isCompulsory(false).maximumValue(10).minimumValue(1)
				.premiumRateType(AddOnType.PER_UNIT).productBaseType(ProductBaseType.UNIT).build();

		resultList.add(addon1);
		resultList.add(addon2);
		resultList.add(addon3);
		resultList.add(addon4);

		return resultList;
	}

}

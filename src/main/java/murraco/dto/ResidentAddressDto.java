package murraco.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data
public class ResidentAddressDto implements Serializable {
	private static final long serialVersionUID = -2074848703209463245L;

	@ApiModelProperty(position = 0,required = false)
	@NotBlank(message = "ResidentAddress is mandatory")
	private String residentAddress;

	@ApiModelProperty(position = 1,required = false)
	@NotBlank(message = "TownshipId is mandatory")
	private String townshipId;


}
package murraco.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OfficeAddressDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(position = 0,required = false)
	private String officeAddress;

	@ApiModelProperty(position = 1,required = false)
	private String townshipId;

}
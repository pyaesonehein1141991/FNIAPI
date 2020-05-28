package murraco.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class ContentInfoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(position = 0, required = false)
	private String phone;

	@ApiModelProperty(position = 1, required = false)
	private String fax;

	@ApiModelProperty(position = 2, required = false)
	private String mobile;

	@ApiModelProperty(position = 3, required = false)
	private String email;
	
}
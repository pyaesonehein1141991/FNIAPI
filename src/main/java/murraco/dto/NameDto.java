package murraco.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NameDto implements Serializable {
	private static final long serialVersionUID = -8381245681586350716L;
	
	@ApiModelProperty(position = 0, required = true)
	@NotBlank(message = "firstName is mandatory")	
	private String firstName;

	@ApiModelProperty(position = 1, required = false)
	private String middleName;

	@ApiModelProperty(position = 2, required = false)
	private String lastName;

}

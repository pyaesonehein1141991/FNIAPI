package murraco.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.configuration.DateHandler;
import murraco.model.common.Gender;
import murraco.model.common.IdType;
import murraco.model.common.MaritalStatus;

@Data
public class CustomerDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(position = 0,required = false)
	private String initialId;

	@ApiModelProperty(position = 1, required = false)
	private String fatherName;

	@ApiModelProperty(position = 2, required = false)
	private String idNo;

	@ApiModelProperty(position = 3, example = "2020-12-16", required = true)
	@NotNull(message = "DateOfBirth is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date dateOfBirth;

	@ApiModelProperty(position = 4, required = false)
	private String labourNo;

	@ApiModelProperty(position = 5,example = "MALE", required = true)
	@NotBlank(message = "Gender is mandatory")
	private Gender gender;

	@ApiModelProperty(position = 6,example = "STILL_APPLYING", required = true)
	@NotBlank(message = "Id Type is mandatory")
	private IdType idType;

	@ApiModelProperty(position = 7, required = false)
	private MaritalStatus maritalStatus;

	@Valid
	@ApiModelProperty(position = 8, required = false)
	private OfficeAddressDto officeAddress;

	@Valid
	@ApiModelProperty(position = 9, required = false)
	private PermanentAddressDto permanentAddress;

	@Valid
	@ApiModelProperty(position = 10, required = true)
	@NotBlank(message = "ResidentAddress is mandatory")
	private ResidentAddressDto residentAddress;

	@Valid
	@ApiModelProperty(position = 11, required = true)
	private ContentInfoDto contentInfo;

	@Valid
	@ApiModelProperty(position = 12, required = true)
	@NotBlank(message = "Name is mandatory")
	private NameDto name;

	@ApiModelProperty(position = 13, required = false)
	private List<FamilyInfoDto> familyInfo;

	@ApiModelProperty(position = 14, required = false)
	private String qualificationId;

	@ApiModelProperty(position = 15, required = false)
	private String religionId;

	@ApiModelProperty(position = 16, required = false)
	private String occupationId;

	@ApiModelProperty(position = 17, required = true)
	@NotBlank(message = "CountryId ID is mandatory")
	private String countryId;

}

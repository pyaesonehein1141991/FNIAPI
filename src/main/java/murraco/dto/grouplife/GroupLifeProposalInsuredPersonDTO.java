package murraco.dto.grouplife;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.configuration.DateHandler;

@Data
public class GroupLifeProposalInsuredPersonDTO {
	
	@ApiModelProperty(position = 1, example = "23", required = true)
	@NotNull(message = "age is mandatory")
	private int age;
	
	@ApiModelProperty(position = 3, example = "U", required = true)
	@NotBlank(message = "InitialId is mandatory")
	private String initialId;
	
	@ApiModelProperty(position = 4, example = "AUNG ", required = true)
	@NotNull(message = "firstName is mandatory")
	private String firstName;
	
	@ApiModelProperty(position = 5, example = "AUNG")
	private String middleName;

	@ApiModelProperty(position = 6, example = "AUNG")
	private String lastName;	

	@ApiModelProperty(position = 7, example = "U Maung Maung", required = true)
	@NotBlank(message = "fatherName is mandatory")
	private String fatherName;
	  
	@ApiModelProperty(position = 8, example = "1999-12-16", required = true)
	@NotNull(message = "dateOfBirth is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date dateOfBirth;
	
	@ApiModelProperty(position = 9, example = "098888888")
	private String phone;
	
	@ApiModelProperty(position = 10, example = "NRCNO", required = true)
	@NotNull(message = "idType is mandatory")
	private String idType;
	
	@ApiModelProperty(position = 11, example = "123123123", required = true)
	@NotNull(message = "idNo is mandatory")
	private String idNo;

	@ApiModelProperty(position = 12, example = "ISSYS0120001000000000129032013", required = true)
	@NotBlank(message = "relationshipId is mandatory")
	private String relationshipId;
	
	@ApiModelProperty(position = 13, example = "Yangon", required = true)
	@NotNull(message = "residentAddress is mandatory")
	private String residentAddress;
	
	@ApiModelProperty(position = 14, example = "ISSYS004001000000731326012017", required = true)
	@NotBlank(message = "residentTownshipId is mandatory")
	private String residentTownshipId;
	
	@ApiModelProperty(position = 15, example = "ISSYS011000009823001042019", required = true)
	@NotBlank(message = "occupationID is mandatory")
	private String occupationID;
	
	@ApiModelProperty(position = 16, example = "MALE", required = true)
	@NotNull(message = "gender is mandatory")
	private String gender;

	@ApiModelProperty(position = 17, example = "100000", required = true)
	@NotNull(message = "proposedSumInsured is mandatory")
	private double proposedSumInsured;
	
	@ApiModelProperty(position = 20, example = "100000", required = true)
	@NotNull(message = "proposedPremium is mandatory")
	private double proposedPremium;
	
	@Valid
	@ApiModelProperty(position = 25)
	@NotNull(message = "insuredPersonBeneficiariesList is mandatory")
	private List<GroupLifeProposalInsuredPersonBeneficiariesDTO> insuredPersonBeneficiariesList;

}

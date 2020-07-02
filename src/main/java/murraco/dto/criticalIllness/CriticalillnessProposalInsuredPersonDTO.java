package murraco.dto.criticalIllness;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.configuration.DateHandler;
import murraco.dto.InsuredPersonAddOnDTO;


@Data
public class CriticalillnessProposalInsuredPersonDTO {

  @ApiModelProperty(position = 0, example = "U", required = true)
  @NotBlank(message = "InitialId is mandatory")
  private String initialId;

  @ApiModelProperty(position = 1, example = "23", required = true)
  @NotNull(message = "age is mandatory")
  private int age;


  @ApiModelProperty(position = 4, example = "100000", required = true)
  @NotNull(message = "premium is mandatory")
  private double premium;

  @ApiModelProperty(position = 5, example = "true", required = true)
  @NotNull(message = "approve is mandatory")
  private boolean needMedicalCheckup;

  @ApiModelProperty(position = 6, example = "5", required = true)
  @NotNull(message = "unit is mandatory")
  private int unit;



  @ApiModelProperty(position = 7, example = "ISSYS0120001000000000129032013", required = true)
  @NotBlank(message = "relationshipId is mandatory")
  @NotEmpty
  private String relationshipId;


  @ApiModelProperty(position = 2, example = "AUNG ", required = true)
  @NotNull(message = "firstName is mandatory")
  private String firstName;

  @ApiModelProperty(position = 3, example = "AUNG")
  private String middleName;

  @ApiModelProperty(position = 4, example = "AUNG")
  private String lastName;

  @ApiModelProperty(position = 5, example = "U Maung Maung", required = true)
  @NotBlank(message = "fatherName is mandatory")
  private String fatherName;

  @ApiModelProperty(position = 6, example = "1999-12-16", required = true)
  @NotNull(message = "dateOfBirth is mandatory")
  @JsonDeserialize(using = DateHandler.class)
  private Date dateOfBirth;

  @ApiModelProperty(position = 7, example = "099876543")
  private String phone;

  @ApiModelProperty(position = 8, example = "NRCNO", required = true)
  @NotNull(message = "idType is mandatory")
  private String idType;

  @ApiModelProperty(position = 9, example = "123123123")
  private String idNo;


  @ApiModelProperty(position = 11, example = "Yangon", required = true)
  @NotNull(message = "residentAddress is mandatory")
  private String residentAddress;

  @ApiModelProperty(position = 12, example = "ISSYS004001000000731326012017", required = true)
  @NotBlank(message = "townshipId is mandatory")
  @NotEmpty
  private String townshipId;

  @ApiModelProperty(position = 13, example = "ISSYS011000009823001042019", required = true)
  private String occupationID;

  @ApiModelProperty(position = 14, example = "MALE", required = true)
  @NotNull(message = "gender is mandatory")
  private String gender;

  @ApiModelProperty(position = 15, example = "100000", required = true)
  @NotNull(message = "proposedSumInsured is mandatory")
  private double proposedSumInsured;

  @ApiModelProperty(position = 16, example = "100000", required = true)
  @NotNull(message = "proposedPremium is mandatory")
  private double proposedPremium;

  @Valid
  @ApiModelProperty(position = 20)
  @NotNull(message = "insuredPersonBeneficiariesList is mandatory")
  private List<CriticalillnessProposalInsuredPersonBeneficiariesDTO> insuredPersonBeneficiariesList;

  @Valid
  @ApiModelProperty(position = 21)
  @NotNull(message = "insuredPersonAddonOnList is mandatory")
  private List<InsuredPersonAddOnDTO> insuredPersonAddonOnList;

}

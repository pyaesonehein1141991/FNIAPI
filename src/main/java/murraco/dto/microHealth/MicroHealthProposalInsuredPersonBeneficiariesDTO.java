package murraco.dto.microHealth;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.configuration.DateHandler;

@Data
public class MicroHealthProposalInsuredPersonBeneficiariesDTO {


  @ApiModelProperty(position = 0, example = "U", required = true)
  @NotBlank(message = "InitialId is mandatory")
  private String initialId;


  @ApiModelProperty(position = 2, example = "Aung", required = true)
  @NotBlank(message = "firstName is mandatory")
  private String firstName;

  @ApiModelProperty(position = 3, example = "Aung", required = true)
  private String middleName;

  @ApiModelProperty(position = 4, example = "Aung", required = true)
  private String lastName;


  @ApiModelProperty(position = 5, example = "1999-12-16", required = true)
  @NotNull(message = "dateOfBirth is mandatory")
  @JsonDeserialize(using = DateHandler.class)
  private Date dateOfBirth;

  @ApiModelProperty(position = 6, example = "0996543423", required = true)
  @NotNull(message = "phone is mandatory")
  private int phone;


  @ApiModelProperty(position = 7, example = "0996543423", required = true)
  @NotNull(message = "mobile is mandatory")
  private int mobile;


  @ApiModelProperty(position = 7, example = "NRCNO", required = true)
  @NotBlank(message = "idType is mandatory")
  private String idType;

  @ApiModelProperty(position = 8, example = "123123123", required = true)
  private String idNo;

  @ApiModelProperty(position = 9, example = "ISSYS0120001000000000129032013      ", required = true)
  @NotBlank(message = "relationship is mandatory")
  private String relationshipId;



  @ApiModelProperty(position = 10, example = "5", required = true)
  @NotNull(message = "percentage is mandatory")
  private float percentage;

  @ApiModelProperty(position = 11, example = "23", required = true)
  @NotNull(message = "age is mandatory")
  private int age;



  @ApiModelProperty(position = 12, example = "Yangon", required = true)
  @NotBlank(message = "residentAddress is mandatory")
  private String residentAddress;

  @ApiModelProperty(position = 13, example = "ISSYS004001000000731326012017", required = true)
  @NotBlank(message = "townshipId is mandatory")
  @NotEmpty
  private String townshipId;

}

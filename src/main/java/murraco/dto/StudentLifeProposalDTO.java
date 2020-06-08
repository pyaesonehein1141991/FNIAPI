package murraco.dto;

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
public class StudentLifeProposalDTO {

	@ApiModelProperty(position = 0, example = "2019-12-16", required = true)
	@NotNull(message = "SubmittedDate is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date submittedDate;

	@Valid
	@ApiModelProperty(position = 4, required = true)
	private CustomerDto customer;

	@ApiModelProperty(position = 7, example = "ISSYS0090001000000000429032013", required = true)
	@NotBlank(message = "paymentTypeId is mandatory")
	private String paymentTypeId;

	@ApiModelProperty(position = 8, example = "ISSYS002000009756217052019", required = true)
	@NotBlank(message = "agentID is mandatory")
	private String agentID;

	@ApiModelProperty(position = 10, required = true)
	@NotNull(message = "proposalInsuredPersonList is mandatory")
	private List<StudentLifeProposalInsuredPersonDTO> proposalInsuredPersonList;

	@ApiModelProperty(position = 11, example = "11", required = true)
	@NotBlank(message = "salePointId is mandatory")
	private String salePointId;

}

package murraco.dto.snakeBite;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.configuration.DateHandler;
import murraco.dto.CustomerDto;

@Data
public class SnakeBiteDTO {
	
	@ApiModelProperty(position = 0, required = true)
	@NotNull(message = "Period Month is mandatory")
	private int periodMonth;

	@ApiModelProperty(position = 2, example = "Agent", required = true)
	@NotBlank(message = "SaleChannel Type is mandatory")
	private String saleChannelType;
	
	@ApiModelProperty(position = 3, example = "ISSYS002001000000000103062019", required = true)
	@NotBlank(message = "Agent ID is mandatory")
	private String agentId;
	
	@Valid
	@ApiModelProperty(position = 5, required = true)
	@NotNull
	private CustomerDto customer;

	@ApiModelProperty(position = 7, example = "ISSYS0090001000000000229032013", required = true)
	@NotBlank(message = "Payment Type ID is mandatory")
	private String paymentTypeId;
	
	@ApiModelProperty(position = 8, example = "2020-12-16", required = true)
	@NotNull(message = "SubmittedDate is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date submittedDate;
	
	@ApiModelProperty(position = 9, example = "2020-12-18", required = true)
	@NotNull(message = "StartDate is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date startDate;
	
	@ApiModelProperty(position = 10, example = "2021-12-18", required = true)
	@NotNull(message = "EndDate is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date endDate;
	
	@ApiModelProperty(position = 11, example = "ISSYS052001000000000101062019", required = true)
	@NotBlank(message = "Sales Points ID is mandatory")
	private String salesPointsId;
	
	@ApiModelProperty(position = 12, required = true)
	@NotNull(message = "proposalInsuredPersonList is mandatory")
	private List<SnakeBiteProposalInsuredPersonDTO> proposalInsuredPersonList;


}

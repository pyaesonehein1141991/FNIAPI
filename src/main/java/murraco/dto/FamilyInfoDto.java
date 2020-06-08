package murraco.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import murraco.model.common.IdType;

@Data
@NoArgsConstructor
public class FamilyInfoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(position = 0, required = false)
	private String initialId;

	@ApiModelProperty(position = 1, required = false)
	private String idNo;

	@ApiModelProperty(position = 2,example="2020-12-16", required = false)
	private Date dateOfBirth;

	@ApiModelProperty(position = 3, required = false)
	private String refCustomerId;

	@ApiModelProperty(position = 4, required = true)
	@NotBlank(message = "IdType is mandatory")
	private NameDto name;

	@ApiModelProperty(position = 5,example = "STILL_APPLYING", required = true)
	@NotBlank(message = "IdType is mandatory")
	private IdType idType;

	@ApiModelProperty(position = 6, required = false)
	private String relationShipId;

	@ApiModelProperty(position = 7, required = false)
	private String industryId;

	@ApiModelProperty(position = 8, required = true)
	@NotBlank(message = "Name is mandatory")
	private String occupationId;

	public FamilyInfoDto(String initialId, String idNo, IdType idType, Date dateOfBirth, String refCustomerId,
			NameDto name, String relationShipId, String industryId, String occupationId) {
		this.initialId = initialId;
		this.idNo = idNo;
		this.idType = idType;
		this.dateOfBirth = dateOfBirth;
		this.refCustomerId = refCustomerId;
		this.name = name;
		this.idType = idType;
		this.relationShipId = relationShipId;
		this.industryId = industryId;
		this.occupationId = occupationId;
	}

}
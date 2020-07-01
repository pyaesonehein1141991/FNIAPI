package murraco.dto;

import lombok.Data;

@Data
public class FarmerResponseDTO {
	private String proposalID;

	private String proposalNo;
	
	private double proposedPremium=100000;

}

package murraco.dto;



import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentLifeReponseDTO {

	private String proposalID;

	private String proposalNo;
	
	private double proposedPremium=100000;
}

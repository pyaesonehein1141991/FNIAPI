package murraco.dto.snakeBite;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SnakeBiteResponseDTO {
	
	private String proposalID;
	private String proposalNo;
	private double proposedPremium;

}

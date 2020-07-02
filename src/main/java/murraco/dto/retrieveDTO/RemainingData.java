package murraco.dto.retrieveDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RemainingData {
	private String date;
	private double agentCommission;
	private double termPremium;
	private boolean isPaid;

}

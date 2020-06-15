package murraco.dto.retrieveDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PolicyData {

	private String policyStartDate;

	private String policyEndDate;

	private int periodMonth;

	private String commenmanceDate;

	private String policyNo;

	private String saleChannelType;

	private String paymentType;

	private String salesPoints;

	private String coverageDate;

	private String productName;

}

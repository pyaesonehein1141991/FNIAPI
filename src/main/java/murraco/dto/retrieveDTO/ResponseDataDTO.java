package murraco.dto.retrieveDTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDataDTO {

	private String proposalNo;

	private boolean isApprove;

	private PolicyData policyData;

	private CustomerData customer;

	private AgentData agent;

	private List<InsuredPersonData> insuredPersonDataList;

	private List<BeneficiaryData> beneficiaryDataList;

	private List<BillCollectionData> billCollectionDataList;

}

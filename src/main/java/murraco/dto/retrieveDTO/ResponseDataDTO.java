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

	private List<BillCollectionData> billCollectionDataList;

}

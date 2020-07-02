package murraco.dto.retrieveDTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillCollectionData {
	private int lastPaymentTerm;
	private String coverDate;
	private int totalPaymentTerm;
	private List<RemainingData> remainingDateList;

}

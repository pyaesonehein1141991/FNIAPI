package murraco.dto.retrieveDTO;

import lombok.Builder;
import lombok.Data;
import murraco.dto.NameDto;

@Data
@Builder
public class BeneficiaryData {
	private NameDto name;

	private String dateOfBirth;

	private String phoneNo;

	private String idNo;

	private String relationship;

	private float percentage;

	private String address;

}

package murraco.dto.retrieveDTO;

import lombok.Builder;
import lombok.Data;
import murraco.dto.NameDto;
import murraco.model.common.Gender;

@Data
@Builder
public class CustomerData {
	private NameDto name;
	private String idNo;
	private String dateOfBirth;
	private String address;
	private String phoneNo;

	private String fatherName;

	private Gender gender;

	private String occupation;
}

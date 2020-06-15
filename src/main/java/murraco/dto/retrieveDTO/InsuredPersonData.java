package murraco.dto.retrieveDTO;

import lombok.Builder;
import lombok.Data;
import murraco.dto.NameDto;
import murraco.model.common.Gender;

@Data
@Builder
public class InsuredPersonData {

	private double proposedSumInsured;

	private double proposedPremium;

	private String idNo;

	private String fatherName;

	private String dateOfBirth;

	private Gender gender;

	private String address;

	private NameDto name;

	private String schoolName;

	private String gradeInfo;

	private String motherName;

	private String motherIdNo;

	private String motherDOB;

}

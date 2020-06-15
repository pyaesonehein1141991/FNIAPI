package murraco.dto.retrieveDTO;

import lombok.Builder;
import lombok.Data;
import murraco.dto.NameDto;
import murraco.model.common.Gender;

@Data
@Builder
public class AgentData {

	private NameDto name;

	private String codeNo;

	private String fatherName;

	private Gender gender;

	private String idNo;

	private String email;

}

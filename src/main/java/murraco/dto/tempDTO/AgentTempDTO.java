package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;
import murraco.model.common.Gender;
import murraco.model.common.IdType;

@Data
@Builder
public class AgentTempDTO {

	private String id;

	private String name;

	private String codeNo;

	private String fatherName;

	private Gender gender;

	private IdType idType;

	private String initialId;
	
	private String joinDate;
	private String email;

}

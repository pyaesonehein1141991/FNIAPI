package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QualificationTempDTO {
	
	private String id;

	private String name;

	private String description;

}

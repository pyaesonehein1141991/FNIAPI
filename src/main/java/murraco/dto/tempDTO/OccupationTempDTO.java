package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OccupationTempDTO {

	private String id;

	private String name;

	private String description;

}

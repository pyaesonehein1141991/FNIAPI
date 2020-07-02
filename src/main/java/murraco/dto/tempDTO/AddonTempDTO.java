package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;
import murraco.model.common.AddOnType;
import murraco.model.common.ProductBaseType;

@Data
@Builder
public class AddonTempDTO {
	
	private String id;

	private String name;

}

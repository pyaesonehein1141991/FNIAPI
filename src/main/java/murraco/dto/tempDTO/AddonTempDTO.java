package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;
import murraco.model.common.AddOnType;
import murraco.model.common.ProductBaseType;

@Data
@Builder
public class AddonTempDTO {
	
	private String id;

	private double basedAmount;

	private Boolean isCompulsory;

	private boolean isBasedOnKeyfactor;

	private double maximumValue;

	private double minimumValue;

	private AddOnType premiumRateType;
	
	private ProductBaseType productBaseType;
	
	private String sumInsuredPerUnit;

}

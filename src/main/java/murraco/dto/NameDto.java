package murraco.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NameDto {

	private String firstName;

	private String middleName;

	private String lastName;

}

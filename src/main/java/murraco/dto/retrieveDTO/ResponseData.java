package murraco.dto.retrieveDTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseData {

	List<ResponseDataDTO> responseDataDTOList;
}

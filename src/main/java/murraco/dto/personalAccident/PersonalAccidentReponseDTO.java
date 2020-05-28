package murraco.dto.personalAccident;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonalAccidentReponseDTO {

  private String proposalID;
  private String proposalNo;
  private double proposedPremium;

}



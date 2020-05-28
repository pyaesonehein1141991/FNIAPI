package murraco.dto.health;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IndividualHealthReponseDTO {

  private String proposalID;
  private String proposalNo;
  private double proposedPremium;



}

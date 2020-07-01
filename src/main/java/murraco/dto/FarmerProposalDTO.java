package murraco.dto;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import murraco.model.common.ProposalType;

public class FarmerProposalDTO {

	@ApiModelProperty(position = 0, example = "2019-12-16", required = true)
	@NotNull(message = "Submitted date is mandatory")
	private Date submittedDate;

	@ApiModelProperty(position = 0, example = "UNDERWRITING", required = true)
	@NotNull(message = "ProposalType date is mandatory")
	private ProposalType proposalType;
	@ApiModelProperty(position = 0, example = "20", required = true)
	@NotNull(message = "noOfInsuredPerson is mandatory")
	private int noOfInsuredPerson;
	@Min(value = (long) 0.0)
	private double totalSI;
	@ApiModelProperty(position = 3, example = "BANCH0000000000000012903201",required = true)
	@NotBlank(message = "branchId is mandatory")
	private String branchId;
	@ApiModelProperty(position = 7, example = "ISSYS002000009756117052019",required = true)
	@NotBlank(message = "paymentTypeId is mandatory")
	private String paymentTypeID;
	@ApiModelProperty(position = 8, example = "ISSYS002000009756117052019",required = true)
	@NotBlank(message = "agentID is mandatory")
	private String agentId;
	@ApiModelProperty(position = 8, example = "ISSYS002000009756117052019",required = true)
	private String saleManID;
	@ApiModelProperty(position = 8, example = "ISSYS002000009756117052019",required = true)
	private String referralID;
	@ApiModelProperty(position = 8, example = "ISSYS002000009756117052019",required = true)
	private String organizationID;
	@Min(value = (long) 0.0)
	private double premium;
	@ApiModelProperty(position = 11, example = "11", required = true)
	@NotBlank(message = "salePointId is mandatory")
	private String salePointId;

	public FarmerProposalDTO() {

	}

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	public ProposalType getProposalType() {
		return proposalType;
	}

	public void setProposalType(ProposalType proposalType) {
		this.proposalType = proposalType;
	}


	public int getNoOfInsuredPerson() {
		return noOfInsuredPerson;
	}

	public void setNoOfInsuredPerson(int noOfInsuredPerson) {
		this.noOfInsuredPerson = noOfInsuredPerson;
	}

	public double getTotalSI() {
		return totalSI;
	}

	public void setTotalSI(double totalSI) {
		this.totalSI = totalSI;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getPaymentTypeID() {
		return paymentTypeID;
	}

	public void setPaymentTypeID(String paymentTypeID) {
		this.paymentTypeID = paymentTypeID;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getSaleManID() {
		return saleManID;
	}

	public void setSaleManID(String saleManID) {
		this.saleManID = saleManID;
	}

	public String getReferralID() {
		return referralID;
	}

	public void setReferralID(String referralID) {
		this.referralID = referralID;
	}

	public String getOrganizationID() {
		return organizationID;
	}

	public void setOrganizationID(String organizationID) {
		this.organizationID = organizationID;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public String getSalePointId() {
		return salePointId;
	}

	public void setSalePointId(String salePointId) {
		this.salePointId = salePointId;
	}

}

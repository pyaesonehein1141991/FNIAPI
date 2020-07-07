package murraco.controller.retrieveapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.NameDto;
import murraco.dto.ResponseDTO;
import murraco.dto.retrieveDTO.BeneficiaryData;
import murraco.dto.retrieveDTO.BillCollectionData;
import murraco.dto.retrieveDTO.InsuredPersonData;
import murraco.dto.retrieveDTO.PolicyData;
import murraco.dto.retrieveDTO.PolicyDataCriteria;
import murraco.dto.retrieveDTO.RemainingData;
import murraco.dto.retrieveDTO.ResponseData;
import murraco.dto.retrieveDTO.ResponseDataDTO;
import murraco.model.common.Gender;

@RestController
@RequestMapping("/policyData")
@Api(tags = "PolicyData")
public class PolicyDataController {

	@PostMapping("/policyData")
	@ApiOperation(value = "${PolicyDataController.getPolicyData}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"), @ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public ResponseDTO<Object> getPolicyData(@Valid @RequestBody PolicyDataCriteria policyDataCriteria) {

		List<ResponseDataDTO> responseDataDTOList = new ArrayList<>();

		// policyDataCriteria.getProposalNoList().stream().forEach(proposalNo ->
		// {
		// ResponseDataDTO responseDataDTO = generateResponseData(proposalNo);
		// responseDataDTOList.add(responseDataDTO);
		// });

		ResponseDataDTO responseDataDTO = generateResponseData("");
		responseDataDTOList.add(responseDataDTO);

		ResponseDataDTO responseDataDTO1 = generateResponseData("");
		responseDataDTO1.setApprove(true);
		responseDataDTO1.setPolicyData(getPOlicyData());
		responseDataDTOList.add(responseDataDTO1);

		ResponseData responseData = ResponseData.builder().responseDataDTOList(responseDataDTOList).build();

		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success!").responseBody(responseData).build();

		return responseDTO;

	}

	private ResponseDataDTO generateResponseData(String proposalNo) {
		List<InsuredPersonData> nsuredPersonDataList = new ArrayList<>();
		InsuredPersonData insuredPersonData = getInsuredPersonData();
		nsuredPersonDataList.add(insuredPersonData);

		List<BeneficiaryData> beneficiaryDataList = new ArrayList<>();
		BeneficiaryData beneficiaryData = getBeneficiaryData();
		beneficiaryDataList.add(beneficiaryData);

		BillCollectionData billCollectionData = getBillCollectionData();
		// billCollectionDataList.add(billCollectionData);

		ResponseDataDTO responseDataDTO = ResponseDataDTO.builder().proposalNo("FNI-HO/SL/PO/00000001/6-2019").isApprove(true).policyData(getPOlicyData())
				.billCollectionData(billCollectionData).build();

		return responseDataDTO;

	}

	private PolicyData getPOlicyData() {
		PolicyData policyData = PolicyData.builder().policyStartDate("2019-06-03 00:00:00.000").policyEndDate("2024-06-03 00:00:00.000").periodMonth(60)
				.commenmanceDate("2019-06-03 16:28:23.327").policyNo("FNI-HO/SL/PL/00000005/6-2019").saleChannelType("AGENT").paymentType("MONTHLY").salesPoints("MOBILE")
				.coverageDate("2020-06-03 00:00:00.000").productName("SHORT TERM ENDOWMENT LIFE ").build();

		return policyData;
	}

	private InsuredPersonData getInsuredPersonData() {
		NameDto nameDto = NameDto.builder().firstName("Thida").build();
		InsuredPersonData insuredPersonData = InsuredPersonData.builder().proposedSumInsured(100000000).proposedPremium(10000).idNo("11/KALANA(N)121212").fatherName("U Mya")
				.dateOfBirth("2015-4-30").gender(Gender.FEMALE).address("Yangon,Hlaing").name(nameDto).build();

		return insuredPersonData;
	}

	private BeneficiaryData getBeneficiaryData() {
		NameDto nameDto = NameDto.builder().firstName("U Mya").build();
		BeneficiaryData beneficiaryData = BeneficiaryData.builder().name(nameDto).dateOfBirth("1955-2-15").phoneNo("0933333333").idNo("12/MAGADA(N)222222").relationship("Daughter")
				.percentage(100).address("Yangon,Hlaing").build();
		return beneficiaryData;
	}

	private BillCollectionData getBillCollectionData() {
		List<String> remainingDateList = Arrays.asList("2019-07-01", "2019-08-01", "2019-09-01", "2019-10-01", "2019-11-01", "2019-12-01", "2020-01-01", "2020-02-01", "2020-03-01",
				"2020-04-01", "2020-05-01", "2020-06-01", "2020-07-01", "2020-08-01", "2020-09-01", "2020-10-01", "2020-11-01", "2020-12-01", "2021-01-01", "2021-02-01",
				"2021-03-01", "2021-04-01", "2021-05-01", "2021-06-01", "2021-07-01", "2021-08-01", "2021-09-01", "2021-10-01", "2021-11-01", "2021-12-01", "2022-01-01",
				"2022-02-01", "2022-03-01", "2022-04-01", "2022-05-01", "2022-06-01", "2022-07-01", "2022-08-01", "2022-09-01", "2022-10-01", "2022-11-01", "2022-12-01",
				"2023-01-01", "2023-02-01", "2023-03-01", "2023-04-01", "2023-05-01", "2023-06-01", "2023-07-01", "2023-08-01", "2023-09-01", "2023-10-01", "2023-11-01",
				"2023-12-01", "2024-01-01", "2024-02-01", "2024-03-01", "2024-04-01", "2024-05-01");

		List<RemainingData> remainingDataList = new ArrayList<>();
		RemainingData remainingData = RemainingData.builder().date("2019-06-01").agentCommission(1000).termPremium(4800).isPaid(true).build();
		remainingDataList.add(remainingData);
		for (String date : remainingDateList) {
			RemainingData remainingData1 = RemainingData.builder().date(date).agentCommission(1000).termPremium(4800).isPaid(false).build();
			remainingDataList.add(remainingData1);
		}
		BillCollectionData billCollectionData = BillCollectionData.builder().lastPaymentTerm(1).coverDate("2020-06-03 00:00:00.000").totalPaymentTerm(60)
				.remainingDateList(remainingDataList).build();
		// .remainingDateList(remainingDateList).agentCommission(1000).termPremium(48000)

		return billCollectionData;
	}

}

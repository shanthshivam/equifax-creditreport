package com.b4nkd.creditscore.equifax.api;

import com.b4nkd.creditscore.equifax.model.APIErrorResponse;
import com.b4nkd.creditscore.equifax.model.CreditReportRequest;
import com.b4nkd.creditscore.equifax.model.CreditReportResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import io.swagger.annotations.*;
import io.swagger.models.parameters.HeaderParameter;

import org.apache.commons.io.IOUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")
@Controller
public class ReportsApiController implements ReportsApi {

	private static final Logger log = LoggerFactory.getLogger(ReportsApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public ReportsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<CreditReportResponse> requestConsumerCreditReport(
			@ApiParam(value = "", required = true) @Valid @RequestBody CreditReportRequest body,
			@ApiParam(value = "ID provided by client to uniquely track service request") @RequestHeader(value = "efx-client-correlation-id", required = false) String efxClientCorrelationId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
//				HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
//			            HttpClientBuilder.create().build());
				//RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
				RestTemplate restTemplate = new RestTemplate();

				final String uri = "https://api.sandbox.equifax.com/business/consumer-credit/v1/reports/credit-report";

				HttpHeaders headers = new HttpHeaders();
				// headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
				headers.set("Content-Type", "application/json");
				headers.set("Accept", "application/json");
				headers.add("Authorization", "Bearer wt0pRKOSpOexb0TWHAoW3seAlGus");

				System.out.println("OUTPUT OF THE INPUT REQUEST : " + body.toString());

				InputStream iStream = new FileInputStream(
						new File("D:\\Swagger\\EquifaxCreditReport\\creditResponse.json"));
				String jsonText = IOUtils.toString(iStream, "UTF-8");

				HttpEntity<CreditReportRequest> entity = new HttpEntity<CreditReportRequest>(body, headers);

//				 ResponseEntity<CreditReportResponse> response = restTemplate.exchange(uri,
//				 HttpMethod.POST,entity, CreditReportResponse.class);

				// CreditReportResponse response = restTemplate.exchange(uri,
				// HttpMethod.POST,entity, CreditReportResponse.class).getBody();

				 ResponseEntity<String> response = restTemplate.exchange(uri,
				 HttpMethod.POST,entity, String.class);
//
				 System.out.println("OUTPUT OF THE EQUIFAX RESPONSE : " +
				 response.toString());
				 return new
				 ResponseEntity<CreditReportResponse>(objectMapper.readValue(jsonText,
				 CreditReportResponse.class), HttpStatus.CREATED);

				// return new
				// ResponseEntity<CreditReportResponse>(objectMapper.readValue(jsonText,
				// CreditReportResponse.class), HttpStatus.CREATED);

				//return response;
			} catch (IOException e) {
				e.printStackTrace();
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<CreditReportResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<CreditReportResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

}

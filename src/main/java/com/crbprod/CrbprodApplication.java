package com.crbprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.UUID;
//
//import javax.xml.namespace.QName;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.soap.SOAPElement;
//import javax.xml.soap.SOAPEnvelope;
//import javax.xml.soap.SOAPHeader;
//import javax.xml.soap.SOAPMessage;
//import javax.xml.ws.handler.Handler;
//import javax.xml.ws.handler.HandlerResolver;
//import javax.xml.ws.handler.MessageContext;
//import javax.xml.ws.handler.PortInfo;
//import javax.xml.ws.handler.soap.SOAPHandler;
//import javax.xml.ws.handler.soap.SOAPMessageContext;
//
//import org.tempuri.MultiConnectorService;
//import org.tempuri.MultiConnectorService_Service;
//import org.w3c.dom.Element;
//
//import com.creditinfo.schemas._2012._09.multiconnector.ConnectorSchemaRequest;
//import com.creditinfo.schemas._2012._09.multiconnector.ConnectorSchemaResponse;
//import com.creditinfo.schemas._2012._09.multiconnector.MultiConnectorRequest;
//import com.creditinfo.schemas._2012._09.multiconnector.MultiConnectorRequest.RequestXml;
//import com.creditinfo.schemas._2012._09.multiconnector.MultiConnectorResponse;
//import com.creditinfo.schemas._2012._09.multiconnector.MultiConnectorTicket;
//import com.creditinfo.schemas._2012._09.multiconnector.connectors._int.idmstrategy.request.Request;
//import com.creditinfo.schemas._2012._09.multiconnector.connectors._int.idmstrategy.request.Request.Cb5SearchParameters;
//import com.creditinfo.schemas._2012._09.multiconnector.connectors._int.idmstrategy.request.Request.CustomFields;
//import com.creditinfo.schemas._2012._09.multiconnector.connectors._int.idmstrategy.request.Request.Strategy;
//import com.creditinfo.schemas._2012._09.multiconnector.messages.request.RequestXml.Connector;
//import com.creditinfo.schemas._2012._09.multiconnector.messages.request.RequestXml.Connector.Data;
//import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;


/**
 * 
 *  This class shows an example of how to make a simple client for testing the web services.
 *
 */
@SpringBootApplication
public class CrbprodApplication 
{
//	static final String serviceUrl = "https://idmtest.creditinfo.co.ke/multiconnector.svc"; //URL OF WEB SERVICE API OF IDM
//	static final String strategyId = "776f7132-aad5-4636-a336-ce8faffbf523"; //STRATEGY ID GIVEN BY CIK
//	static final String companyStrategyId = "776f7132-aad5-4636-a336-ce8faffbf523"; //STRATEGY ID GIVEN BY CIK
//	static final String username = "uipcredit"; //CREDENTIALS TO IDM
//	static final String password = "Uipcredit1"; //CREDENTIALS TO IDM
//	static final String connectorId = "1c8f01f8-71a2-4c99-98a1-8bd1d85c4f63"; //CONNECTOR IDENTIFICATIO
//			
//	
	public static void main(String[] args) throws Exception 
	{
		SpringApplication.run(CrbprodApplication.class, args);
	}
//		MultiConnectorService_Service service = new MultiConnectorService_Service(new URL(serviceUrl));
//		service.setHandlerResolver(new HeaderHandlerResolver(username, password));
//		MultiConnectorService mcService = service.getBasicHttpBindingMultiConnectorService();
//		
//		// -- Test Schema method--
//		System.out.println("Starting Test Case 1...");
//		ArrayOfguid connectorIds = new ArrayOfguid();
//		connectorIds.getGuid().add(connectorId);
//		ConnectorSchemaRequest connectorSchemaRequest = new ConnectorSchemaRequest();
//		connectorSchemaRequest.setConnectorIds(connectorIds);
//		connectorSchemaRequest.setMessageId(UUID.randomUUID().toString());
//		ConnectorSchemaResponse schemaResponse = mcService.schema(connectorSchemaRequest);
//		System.out.println("SchemaResponse message ID = " + schemaResponse.getMessageId());
//				
//		// -- Test Query method--		
//		// Test case 1
//		// input - Individual, GenericStrategy, NationalId: 23667407 
//		System.out.println("Starting Test Case 2...");
//		MultiConnectorRequest multiConnectorRequest1 = new MultiConnectorRequest();
//		multiConnectorRequest1.setMessageId(UUID.randomUUID().toString());
//		multiConnectorRequest1.setRequestXml(createRequestXmlIndividualIdm());
//		MultiConnectorResponse response1 = mcService.query(multiConnectorRequest1);
//		System.out.println("Response1 message ID = " + response1.getMessageId());
//		
//		// Test case 2
//		// the same input, calling async query + get result using end query
//		System.out.println("Starting Test Case 3...");
//		MultiConnectorRequest multiConnectorRequest2 = new MultiConnectorRequest();
//		multiConnectorRequest2.setMessageId(UUID.randomUUID().toString());
//		multiConnectorRequest2.setRequestXml(createRequestXmlIndividualIdm());
//		MultiConnectorTicket response2 = mcService.beginQuery(multiConnectorRequest2);
//		System.out.println("Response2 message ID = " + response2.getMessageId());		
//		MultiConnectorResponse response21 = getReport(mcService, response2);
//		System.out.println("Response21 message ID = " + response21.getMessageId());
//		
//		// Test case 3
//		// input - Company, GenericStrategy, RegistrationNumber: C125446, async query + get response
//		System.out.println("Starting Test Case 4...");
//		MultiConnectorRequest multiConnectorRequest3 = new MultiConnectorRequest();
//		multiConnectorRequest3.setMessageId(UUID.randomUUID().toString());
//		multiConnectorRequest3.setRequestXml(createRequestXmlCompanyIdm());
//		MultiConnectorTicket response3 = mcService.beginQuery(multiConnectorRequest3);
//		System.out.println("Response3 message ID = " + response3.getMessageId());
//		MultiConnectorResponse response31 = getReport(mcService, response3);
//		System.out.println("Response31 message ID = " + response31.getMessageId());
//	}
//	
//	private static MultiConnectorResponse getReport(MultiConnectorService mcService, MultiConnectorTicket ticket) throws Exception
//	{
//		int tryCount = 10;
//		while(tryCount > 0)
//		{
//			System.out.println(String.format("Trying to get report response, tryCount: %s", 11 - tryCount));
//			try 
//			{
//				MultiConnectorRequest multiConnectorRequest = new MultiConnectorRequest();
//				multiConnectorRequest.setMessageId(UUID.randomUUID().toString());
//				MultiConnectorResponse response = mcService.endQuery(ticket);
//				return response;
//			}
//			catch(Exception ex)
//			{
//				System.out.println(ex.getMessage());
//			}
//			Thread.sleep(5000);
//			tryCount--;
//		}
//		throw new Exception("report was not generated within 150s");
//	}
//	
//	private static RequestXml createRequestXmlIndividualIdm() throws Exception
//	{
//		Request request = new Request();
//		request.setConsent(true);
//		Strategy strategy = new Strategy();
//		strategy.setId(strategyId);
//		request.setStrategy(strategy);		
//		request.setCb5SearchParameters(getIndividualSearchParameters("23667407"));		
//		request.setCustomFields(getCustomFields());
//		
//		RequestXml requestXml = new RequestXml();
//		requestXml.setRequestXml(new com.creditinfo.schemas._2012._09.multiconnector.messages.request.RequestXml());
//		requestXml.getRequestXml().getConnector().add(getConnector(request));
//		return requestXml;
//	}
//	
//	private static RequestXml createRequestXmlCompanyIdm() throws Exception
//	{
//		Request request = new Request();
//		request.setConsent(true);
//		Strategy strategy = new Strategy();
//		strategy.setId(companyStrategyId);
//		request.setStrategy(strategy);
//		
//		request.setCb5SearchParameters(getCompanySearchParameters("C125446"));
//		request.setCustomFields(getCustomFieldsCompany());
//		
//		RequestXml requestXml = new RequestXml();
//		requestXml.setRequestXml(new com.creditinfo.schemas._2012._09.multiconnector.messages.request.RequestXml());
//		requestXml.getRequestXml().getConnector().add(getConnector(request));	
//		return requestXml;
//	}
//			
//	private static Cb5SearchParameters getIndividualSearchParameters(String nationalId) throws Exception
//	{
//		Cb5SearchParameters searchParams = new Cb5SearchParameters();		
//		searchParams.getAny().add(createElement("NationalId", nationalId));
//		return searchParams;
//	}
//	
//	private static Cb5SearchParameters getCompanySearchParameters(String registrationNumber) throws Exception
//	{
//		Cb5SearchParameters searchParams = new Cb5SearchParameters();		
//		searchParams.getAny().add(createElement("RegistrationNumber", registrationNumber));
//		return searchParams;
//	}
//	
//	private static CustomFields getCustomFields() throws Exception
//	{
//		CustomFields customFields = new CustomFields();
//		customFields.getAny().add(createElement("Age", "35"));
//		customFields.getAny().add(createElement("Gender", "MALE"));
//		customFields.getAny().add(createElement("IsEmployed", "YES"));
//		customFields.getAny().add(createElement("IsHFCCustomer", "YES"));
//		customFields.getAny().add(createElement("IsKenyan", "YES"));
//		customFields.getAny().add(createElement("AgeOnWhizz", "18"));
//		customFields.getAny().add(createElement("OkoaJahaziCount", "1"));
//		customFields.getAny().add(createElement("AvgOkoaJahaziAmount", "175000"));
//		customFields.getAny().add(createElement("AvgBankTurnovers", "2000000"));
//		customFields.getAny().add(createElement("LoanRepaymentCount", "2"));
//		customFields.getAny().add(createElement("AvgmPesaCredit6M", "15000"));
//		customFields.getAny().add(createElement("AvgAirtimePurchase", "165000"));
//		customFields.getAny().add(createElement("PaidMobileLoansCount", "2"));
//		customFields.getAny().add(createElement("Education", "NONE"));
//		customFields.getAny().add(createElement("Employment", "EMPLOYED"));
//		customFields.getAny().add(createElement("LoanPurpose", "BUSINESS"));		
//		customFields.getAny().add(createElement("mpesa_transaction_count", "1"));
//		customFields.getAny().add(createElement("mpesa_total_inout_2mon", "1"));
//		return customFields;
//	}
//	
//	private static CustomFields getCustomFieldsCompany() throws Exception
//	{
//		CustomFields customFields = new CustomFields();
//		return customFields;
//	}
//	
//	private static Element createElement(String elementName, String elementValue) throws Exception
//	{
//		Element e = DocumentBuilderFactory.newInstance()
//		        .newDocumentBuilder()
//		        .newDocument()
//		        .createElementNS("http://creditinfo.com/schemas/2012/09/MultiConnector/Connectors/INT/IdmStrategy/Request", elementName);
//		e.setTextContent(elementValue);
//		return e;
//	}
//	
//	private static Connector getConnector(Request request) 
//	{
//		Data data = new Data();
//		data.getContent().add(request);
//		data.setId(UUID.randomUUID().toString());
//		Connector connector = new Connector();
//		connector.setData(data);
//		connector.setId(connectorId);	
//		return connector;
//	}
//}
//
//
///**
// * Helper class to create the request header with provided authentication
// *
// */
//class HeaderHandler implements SOAPHandler<SOAPMessageContext> 
//{
//	
//	public static final String WSSE_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
//	public static final String SECURITY_TOKEN_FORMAT = "SecurityToken-%s";
//	public static final String WSSE = "wsse";
//	
//	private String username;
//	private String password;
//	
//	public HeaderHandler(String username, String password) 
//	{
//		this.username = username;
//		this.password = password;
//	}
//
//	@Override
//	public boolean handleMessage(SOAPMessageContext context) 
//	{
//
//		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
//
//		if (outboundProperty.booleanValue()) 
//		{
//			SOAPMessage message = context.getMessage();
//
//			try 
//			{
//				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
//				if (envelope.getHeader() != null) 
//				{
//				     envelope.getHeader().detachNode();
//				}
//				SOAPHeader header = envelope.addHeader();
//
//				SOAPElement security = header.addChildElement("Security", WSSE, WSSE_NS);
//
//				SOAPElement usernameToken = security.addChildElement("UsernameToken", WSSE);
//				usernameToken.addAttribute(new QName("xmlns:wsu"), WSSE_NS);
//				usernameToken.addAttribute(new QName("wsu:Id"), String.format(SECURITY_TOKEN_FORMAT, UUID.randomUUID().toString()));
//				SOAPElement usernameElement = usernameToken.addChildElement("Username", WSSE);
//				SOAPElement passwordElement = usernameToken.addChildElement("Password", WSSE);
//				passwordElement.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
//
//				usernameElement.setTextContent(username);
//				passwordElement.setTextContent(password);
//
//				// Print out the outbound SOAP message
//				System.out.println("Request:");
//				message.writeTo(System.out);
//				System.out.println("");
//			} 
//			catch (Exception e) 
//			{
//				e.printStackTrace();
//			}
//		} 
//		else 
//		{
//			try 
//			{
//				SOAPMessage message = context.getMessage();
//				// Print out the inbound SOAP message
//				System.out.println("Response:");
//				message.writeTo(System.out);
//				System.out.println("");
//			} 
//			catch (Exception e) 
//			{
//				e.printStackTrace();
//			}
//		}
//		return true;
//	}
//
//	@Override
//	public boolean handleFault(SOAPMessageContext context) 
//	{
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public void close(MessageContext context) 
//	{
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Set<QName> getHeaders() 
//	{
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//
//
//class HeaderHandlerResolver implements HandlerResolver {
//
//	private String username;
//	private String password;
//
//	public HeaderHandlerResolver(String username, String password) 
//	{
//		this.username = username;
//		this.password = password;
//	}
//
//	public List<Handler> getHandlerChain(PortInfo portInfo) 
//	{
//		List<Handler> handlerChain = new ArrayList<Handler>();
//		HeaderHandler headerHandler = new HeaderHandler(username, password);
//		handlerChain.add(headerHandler);
//		return handlerChain;
//	}
}

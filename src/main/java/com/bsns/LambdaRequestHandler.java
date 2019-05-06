package com.bsns;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;

public class LambdaRequestHandler implements RequestHandler<SNSEvent, Void>{
	
	
	public Void handleRequest(SNSEvent snsPayload, Context lambdaContext) {
		System.out.println("Hello World!!!!!");
		return (Void) null;
	}

	
}

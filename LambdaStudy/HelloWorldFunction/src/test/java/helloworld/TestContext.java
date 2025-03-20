//package helloworld;
//
//
//import com.amazonaws.services.lambda.runtime.ClientContext;
//import com.amazonaws.services.lambda.runtime.CognitoIdentity;
//import com.amazonaws.services.lambda.runtime.Context;
//import com.amazonaws.services.lambda.runtime.LambdaLogger;
//
//public class TestContext implements Context {
//    @Override
//    public String getAwsRequestId() { return "test-request-id"; }
//    @Override
//    public String getLogGroupName() { return "test-log-group"; }
//    @Override
//    public String getLogStreamName() { return "test-log-stream"; }
//    @Override
//    public String getFunctionName() { return "test-function"; }
//    @Override
//    public String getFunctionVersion() { return "LATEST"; }
//    @Override
//    public String getInvokedFunctionArn() { return "arn:aws:lambda:us-east-1:123456789012:function:test-function"; }
//    @Override
//    public CognitoIdentity getIdentity() { return null; }
//    @Override
//    public ClientContext getClientContext() { return null; }
//    @Override
//    public int getRemainingTimeInMillis() { return 30000; }
//    @Override
//    public int getMemoryLimitInMB() { return 512; }
//    @Override
//    public LambdaLogger getLogger() { return null; }
//}
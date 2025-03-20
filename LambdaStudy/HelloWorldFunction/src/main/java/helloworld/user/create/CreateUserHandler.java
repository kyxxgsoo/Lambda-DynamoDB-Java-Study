package helloworld.user.create;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class CreateUserHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {
    private final CreateUserService createUserService = new CreateUserService();
    private static final ObjectMapper objectMapper = new ObjectMapper(); // JSON 변환기

    @Override
    public Map<String, Object> handleRequest(Map<String, Object> request, Context context) {
        System.out.println("RAW REQUEST: " + request); // 받아온 객체 출력
//        System.out.println("ID: " + request.getId() + ", NAME: " + request.getName()); // 값 확인

//        if (request.getId() == null || request.getName() == null) {
//            return new CreateUserResponse("Error: id and name cannot be null", 400);
//        }

        Map<String, Object> response = new HashMap<>();
        try {
            createUserService.createUser("1", "TEST");

            // ✅ API Gateway가 요구하는 응답 형식
            response.put("statusCode", 200);
            response.put("headers", Map.of("Content-Type", "application/json"));
            response.put("body", "{\"message\": \"User created successfully\"}");

        } catch (Exception e) {
            response.put("statusCode", 500);
            response.put("headers", Map.of("Content-Type", "application/json"));
            response.put("body", "{\"message\": \"Error creating user: " + e.getMessage() + "\"}");
        }
        return response;
    }

}
//package helloworld;
//
//import com.amazonaws.services.lambda.runtime.Context;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import helloworld.user.create.CreateUserHandler;
//import helloworld.user.create.CreateUserResponse;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class CreateUserHandlerTest {
//    public static void main(String[] args) {
//        try {
//            // 1️⃣ 테스트할 JSON 이벤트 생성
//            String jsonBody = "{ \"id\": \"123\", \"name\": \"John Doe\" }";
//
//            Map<String, Object> event = new HashMap<>();
//            event.put("body", jsonBody);
//
//            // 2️⃣ 핸들러 호출
//            CreateUserHandler handler = new CreateUserHandler();
//            CreateUserResponse response = handler.handleRequest(event, new TestContext());
//
//            // 3️⃣ 결과 출력
//            ObjectMapper objectMapper = new ObjectMapper();
//            String responseJson = objectMapper.writeValueAsString(response);
//            System.out.println("Lambda Response: " + responseJson);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
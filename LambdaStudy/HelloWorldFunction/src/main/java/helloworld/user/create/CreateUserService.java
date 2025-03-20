package helloworld.user.create;

import helloworld.user.common.DynamoDBService;

public class CreateUserService {
    private final DynamoDBService dynamoDBService = new DynamoDBService();

    public void createUser(String id, String name) {
        dynamoDBService.putItem(id, name);
    }
}
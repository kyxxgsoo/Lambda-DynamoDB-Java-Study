package helloworld.user.common;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

public class DynamoDBService {
    private static final String TABLE_NAME = "User";
    private final Table table;

    public DynamoDBService() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withRegion("ap-northeast-2")
                .build();
        DynamoDB dynamoDB = new DynamoDB(client);
        this.table = dynamoDB.getTable(TABLE_NAME);
    }

    public void putItem(String id, String name) {
        Item item = new Item().withPrimaryKey("id", id).withString("name", name);
        table.putItem(item);
    }
}
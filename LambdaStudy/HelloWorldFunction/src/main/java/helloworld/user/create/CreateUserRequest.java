package helloworld.user.create;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserRequest {
    private String id;
    private String name;

    @JsonCreator // JSON 요청을 객체로 변환할 때 사용됨
    public CreateUserRequest(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name
    ) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}
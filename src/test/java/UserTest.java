import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fitnessapp.clearfit.main.model.Customer;
import com.fitnessapp.clearfit.main.model.User;

public class UserTest {
    public static void main(String[] args) throws JsonProcessingException {
        User user = new Customer("jack","jack@gmail.com","999988877");
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(user));

    }
}
/*
curl --location --request POST 'http://localhost:8081/v1/fitness-service/register/customer' \
--data-raw '{"name":"jack","phonenumber":"999988877","emailId":"jack@gmail.com"}'

response
{
    "name": "jack",
    "phonenumber": "999988877",
    "emailId": null
}
 */
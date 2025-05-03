package tests.be;

import modelObject.ResponseCreateUser;
import modelObject.ResponseToken;
import org.testng.annotations.Test;
import services.AccountService;
import services.CommonService;

import java.util.HashMap;
import java.util.Map;

public class CreateUserBETest {

    @Test
    public void testMethod() {
        String userName = "Alice" + System.currentTimeMillis();
        String password = "VreauClatite09!";

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("userName", userName);
        requestBody.put("password", password);

        AccountService accountService = new AccountService();
        ResponseCreateUser responseCreateUser = accountService.createAccount(requestBody);
        String userID = responseCreateUser.getUserID();
        System.out.println(userID);
        ResponseToken responseToken = accountService.generateToken(requestBody);
        String token = responseToken.getToken();
        System.out.println(token);

        accountService.getSpecificAccount(userID, token);
    }

}

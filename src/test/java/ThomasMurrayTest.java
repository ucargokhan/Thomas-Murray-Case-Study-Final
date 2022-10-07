import org.junit.jupiter.api.Test;

public class ThomasMurrayTest extends BaseTest
{

    @Test
    public void ThomasMurrayWebEndtoEnd() throws InterruptedException {

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //login button is clicked
        thomasMurray.clickOnElement(thomasMurray.loginButton);

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //username is typed
        thomasMurray.sendKeysToTheElement(thomasMurray.usernameField,"gokhan_ucar");

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //username is typed
        thomasMurray.sendKeysToTheElement(thomasMurray.passwordField,"test1234");

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //click login button
        thomasMurray.clickOnElement(thomasMurray.loginButtonForSignIn);

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //check if login was successful
        thomasMurray.validateIsEquals(thomasMurray.loginCheckField,thomasMurray.loginCheckString);
        System.out.println("Login was successful./N");

        //click my account button
        thomasMurray.clickOnElement(thomasMurray.myAccountButton);

        //change first name
        thomasMurray.clearThenSendKeysToTheElement(thomasMurray.firstNameFild, thomasMurray.generateRandomString());

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //change email preferences
        thomasMurray.clickOnElement(thomasMurray.emailNotificationField);

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //save changes
        thomasMurray.clickOnElement(thomasMurray.saveChangesButton);

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //see account details
        thomasMurray.clickOnElement(thomasMurray.accountDetailsField);

        //5 sec wait
        thomasMurray.waitSeconds(5);

        //signing out
        thomasMurray.clickOnElement(thomasMurray.signOutButton);

        //check if sign-out was successful
        thomasMurray.checkIfVisible(thomasMurray.loginButton);
        System.out.println("Sign out was successful./N");

        //5 sec wait
        thomasMurray.waitSeconds(5);
        }

    }


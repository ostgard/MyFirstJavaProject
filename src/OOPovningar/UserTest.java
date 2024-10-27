package OOPovningar;

/* Skapa en testklass och utveckla efter TDD
Skapa ett test för en tänkt klass User
 */


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("testar användarnamnet")

        //Har skapat en metod (?) som jag döpt till testOfUser,
        // där konstruktorn fått två paramentrar (attributen?) som jag vill testa
    void testOfUser() {
        User user = new User("erika", "asdf");
        assertEquals("erika",user.getUsername());
        
    }

    @Test
    @DisplayName("testar lösenordet")
    void testOfPassword() {
        User user = new User("erika", "asdf");
        assertEquals("1234",user.getPassword());

    }
}

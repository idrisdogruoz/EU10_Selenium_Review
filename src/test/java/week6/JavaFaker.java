package week6;

import com.github.javafaker.Faker;
import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Test;

public class JavaFaker {
    Faker faker = new Faker();
    @Test
    public void test1(){


        String name1 = faker.name().nameWithMiddle();
        String name2 = faker.name().username();
        String address = faker.address().country() + faker.address().cityName() + faker.address().fullAddress();
        String email = faker.internet().emailAddress();
        int age = faker.number().numberBetween(18,80);

        String actorName = faker.chuckNorris().fact();
        System.out.println(actorName);

    }
}




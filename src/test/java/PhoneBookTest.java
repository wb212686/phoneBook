import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Дмитрий on 18.08.2016.
 */
public class PhoneBookTest {
    @Test
    public void getPhonesByNameTest() throws IOException {
        Assert.assertEquals(PhoneBook.getPhonesByName("Иванов И.И."), "1.+8 800 2000 500" + "\n" + "2.+8 800 200 600"+ "\n");
        Assert.assertEquals(PhoneBook.getPhonesByName("Абросимов С.А."), "1.+8 800 20 500" + "\n"  + "2.+8 800 20000 600" + "\n");
        Assert.assertEquals(PhoneBook.getPhonesByName("Поттер Г.И."), "такого ФИО в БД нет");
    }
}

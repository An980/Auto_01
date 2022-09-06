package ru.netology.service.test;

//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseBelowThousand () {

        int expected = 500;
        int actual = service.remain(500);

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void purchaseAboveThousand () {

        int expected = 500;
        int actual = service.remain(1500);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void equalPurchase () {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void zeroPurchase() {

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(actual, expected);

    }

}

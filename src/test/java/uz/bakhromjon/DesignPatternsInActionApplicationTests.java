package uz.bakhromjon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import uz.bakhromjon.singleton.SingA;
import uz.bakhromjon.singleton.SingB;

@SpringBootTest
class DesignPatternsInActionApplicationTests {

    @Autowired
    SingB singB1;
    @Autowired
    SingB singB2;

    @Test
    public void testSingletons() {
        SingA singA1 = SingA.getInstance();
        SingA singA2 = SingA.getInstance();
        Assertions.assertNotNull(singA1);
        Assertions.assertSame(singA1, singA2);

        Assertions.assertNotNull(singB1);
        Assertions.assertSame(singB1, singB2);
    }

}

package uz.bakhromjon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import uz.bakhromjon.prototype.ProtoFalse;
import uz.bakhromjon.prototype.ProtoTrue;
import uz.bakhromjon.singleton.SingA;
import uz.bakhromjon.singleton.SingB;

@SpringBootTest
class DesignPatternsInActionApplicationTests {

    @Autowired
    SingB singB1;
    @Autowired
    SingB singB2;

    @Autowired
    ProtoTrue true1;
    @Autowired
    ProtoTrue true2;

    @Autowired
    ProtoFalse false1;
    @Autowired
    ProtoFalse false2;

    @Test
    public void testProtoTypes() {
        Assertions.assertSame(false1, false2);
        Assertions.assertNotSame(true1, true2);
    }

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

package tut4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

      @Test
      public void testAdd() {
        int x = 1;
        int y = 1;
        assertEquals(2, new Calc().add(x, y));
      }

      @Test
      public void testSubtract(){
        int x = 1;
        int y = 1;
        assertEquals(0, new Calc().subtract(x, y));
      }
    }



import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
public class apptest {

        /**
         * Unit test for simple App.
         */


        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }

        @Test
        public void testAppConstructor() {
            try {
                new app();
            } catch (Exception e) {
                fail("Construction failed.");
            }
        }

        @Test
        public void testAppMain()
        {
            app.main(null);
            try {
                assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
            } catch (AssertionError e) {
                fail("\"message\" is not \"Hello World!\"");
            }
        }

        @After
        public void cleanUpStreams() {
            System.setOut(null);
        }

    }



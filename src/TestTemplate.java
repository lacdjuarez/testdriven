/**
 * Created by usuario on 12/04/2016.
 */

import org.junit.Test;
        import static org.junit.Assert.*;
public class TestTemplate {
    @Test
    public void oneVariable() throws Exception {
        Template template = new Template("Hello, ${name}");
        template.set("name", "Reader");
        assertEquals("Hello, Reader", template.evaluate());
    }
}
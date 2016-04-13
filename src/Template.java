/**
 * Created by usuario on 12/04/2016.
 */

public class Template {
    private String variableValue;
    public Template(String templateText) {
    }
    public void set(String variable, String value) {
        this.variableValue = value;
    }
    public String evaluate() {
        return "Hello, " + variableValue;
    }
}

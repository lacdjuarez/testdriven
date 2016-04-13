/**
 * Created by usuario on 12/04/2016.
 */

public class Template {
    private String variableValue;
    private String templateText;
    public Template(String templateText) {
        this.templateText = templateText;
    }
    public void set(String variable, String value) {
        this.variableValue = value;
    }
    public String evaluate() {
        return templateText.replaceAll("\\$\\{name\\}", variableValue);
    }
}

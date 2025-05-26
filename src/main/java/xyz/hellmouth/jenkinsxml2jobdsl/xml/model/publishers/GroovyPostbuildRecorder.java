package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.publishers;

import jakarta.xml.bind.annotation.XmlElement;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class GroovyPostbuildRecorder implements Buildable {

    public boolean runForMatrixParent;
    public Integer behavior;

    @XmlElement(name = "script")
    public GroovyPostbuildRecorderScript script;

    @Override
    public void build(Builder builder) {
        builder.create("groovyPostbuild").openClosure();
        if (script != null) {
            builder.create("script").openClosure();
            script.build(builder);
            builder.closeClosure();
        }
        if (behavior != null) {
            String behaviorString;
            switch (behavior) {
                case 0: behaviorString = "ALWAYS"; break;
                case 1: behaviorString = "UNSTABLE_OR_BETTER"; break;
                case 2: behaviorString = "FAILURE_OR_BETTER"; break;
                case 3: behaviorString = "SUCCESS"; break;
                default: behaviorString = "UNKNOWN";
            }
            builder.createMethod("behavior").withStringParameter(behaviorString).endMethod();
        }
        builder.closeClosure();
    }
}

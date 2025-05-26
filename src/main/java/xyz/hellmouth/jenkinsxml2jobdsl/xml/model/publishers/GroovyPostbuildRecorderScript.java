package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.publishers;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class GroovyPostbuildRecorderScript implements Buildable {

    public String script;
    public boolean sandbox;

    @Override
    public void build(Builder builder) {
        builder.createMethod("script").withStringParameter(script).endMethod();
        builder.createMethod("sandbox").withBooleanParameter(sandbox).endMethod();
    }
}

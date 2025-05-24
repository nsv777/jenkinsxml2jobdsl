package xyz.hellmouth.jenkinsxml2jobdsl.xml.model;

import jakarta.xml.bind.annotation.XmlAttribute;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class RebuildSettingsProperty implements Buildable {

    public boolean autoRebuild;
    public boolean rebuildDisabled;

    @XmlAttribute
    public String plugin;

    @Override
    public void build(Builder builder) {
        builder.create("rebuild").openClosure();
        builder.createMethod("autoRebuild").withBooleanParameter(autoRebuild).endMethod();
        builder.createMethod("rebuildDisabled").withBooleanParameter(rebuildDisabled).endMethod();
        builder.closeClosure();
    }
}

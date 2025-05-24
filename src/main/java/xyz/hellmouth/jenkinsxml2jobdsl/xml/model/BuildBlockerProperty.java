package xyz.hellmouth.jenkinsxml2jobdsl.xml.model;

import jakarta.xml.bind.annotation.XmlAttribute;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class BuildBlockerProperty implements Buildable {

    public boolean useBuildBlocker;
    public String blockLevel;
    public String scanQueueFor;
    public String blockingJobs;

    @XmlAttribute
    public String plugin;

    @Override
    public void build(Builder builder) {
        builder.create("buildBlockerJobProperty").openClosure();
        builder.createMethod("useBuildBlocker").withBooleanParameter(useBuildBlocker).endMethod();
        builder.createMethod("blockLevel").withStringParameter(blockLevel).endMethod();
        builder.createMethod("scanQueueFor").withStringParameter(scanQueueFor).endMethod();
        builder.createMethod("blockingJobs").withStringParameter(blockingJobs).endMethod();
        builder.closeClosure();

    }
}

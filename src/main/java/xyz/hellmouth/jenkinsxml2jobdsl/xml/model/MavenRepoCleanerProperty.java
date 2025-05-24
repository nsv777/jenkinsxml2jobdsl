package xyz.hellmouth.jenkinsxml2jobdsl.xml.model;

import jakarta.xml.bind.annotation.XmlAttribute;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class MavenRepoCleanerProperty implements Buildable {

    public boolean notOnThisProject;

    @XmlAttribute
    public String plugin;

    @Override
    public void build(Builder builder) {
        builder.create("mavenRepoCleanerProperty").openClosure();
        builder.createMethod("notOnThisProject").withBooleanParameter(notOnThisProject).endMethod();
        builder.closeClosure();
    }
}

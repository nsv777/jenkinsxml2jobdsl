package xyz.hellmouth.jenkinsxml2jobdsl.xml.model;

import jakarta.xml.bind.annotation.XmlAttribute;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class JobRestrictionProperty implements Buildable {

    @XmlAttribute
    public String plugin;

    @Override
    public void build(Builder builder) {
        builder.create("jobRestrictions").openClosure();
        builder.closeClosure();
    }
}

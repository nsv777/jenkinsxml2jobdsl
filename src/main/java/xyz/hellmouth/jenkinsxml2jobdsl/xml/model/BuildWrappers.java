package xyz.hellmouth.jenkinsxml2jobdsl.xml.model;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.xml.model.wrappers.AnsiColorBuildWrapper;
import xyz.hellmouth.jenkinsxml2jobdsl.xml.model.wrappers.BuildUserBuildWrapper;
import xyz.hellmouth.jenkinsxml2jobdsl.xml.model.wrappers.PreBuildCleanup;
import xyz.hellmouth.jenkinsxml2jobdsl.xml.model.wrappers.TimestamperBuildWrapper;

@XmlRootElement(name = "buildWrappers")
public class BuildWrappers implements Buildable {

    @XmlElements({
            @XmlElement(name = "hudson.plugins.ws__cleanup.PreBuildCleanup", type = PreBuildCleanup.class),
            @XmlElement(name = "hudson.plugins.timestamper.TimestamperBuildWrapper", type = TimestamperBuildWrapper.class),
            @XmlElement(name = "hudson.plugins.ansicolor.AnsiColorBuildWrapper", type = AnsiColorBuildWrapper.class),
            @XmlElement(name = "org.jenkinsci.plugins.builduser.BuildUser", type = BuildUserBuildWrapper.class),
    })
    public List<Buildable> elements;

    @Override
    public void build(xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder builder) {
        if (elements != null) {
            builder.create("wrappers").openClosure();
            for (Buildable b : elements) {
                b.build(builder);
            }
            builder.closeClosure();
        }
    }
}

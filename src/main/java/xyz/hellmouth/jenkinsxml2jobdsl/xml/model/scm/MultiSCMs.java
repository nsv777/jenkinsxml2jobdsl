package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.scm;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;

public class MultiSCMs implements Buildable{

    @XmlElements({
        @XmlElement(name = "hudson.plugins.git.GitSCM", type = MultiSCMSCM.class),
    })
    public List<Buildable> scm_elements;

    @Override
    public void build(xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder builder) {
        if (scm_elements != null) {
            builder.create("multiSCM").openClosure();
            for (Buildable scmso : scm_elements) {
                scmso.build(builder);
            }
            builder.closeClosure();
        }
    }
}

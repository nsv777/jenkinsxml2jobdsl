package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.wrappers;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class SecretBuildWrapperBindings implements Buildable {

    @XmlElements({
            @XmlElement(name = "org.jenkinsci.plugins.credentialsbinding.impl.StringBinding", type = SecretBuildWrapperStringBinding.class)
    })
    public List<Buildable> elements;


    @Override
    public void build(Builder builder) {
        if (elements != null) {
            for (Buildable parameter : elements) {
                parameter.build(builder);
            }
        }
    }

}

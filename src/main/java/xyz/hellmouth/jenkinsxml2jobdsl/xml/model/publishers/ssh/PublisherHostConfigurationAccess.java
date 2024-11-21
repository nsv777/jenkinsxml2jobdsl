package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.publishers.ssh;

import jakarta.xml.bind.annotation.XmlAttribute;

public class PublisherHostConfigurationAccess {

    @XmlAttribute(name = "class")
    public String clazz;

    @XmlAttribute
    public String reference;
}

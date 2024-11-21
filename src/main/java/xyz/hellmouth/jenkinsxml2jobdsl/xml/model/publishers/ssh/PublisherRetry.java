package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.publishers.ssh;

import jakarta.xml.bind.annotation.XmlAttribute;

public class PublisherRetry {

    @XmlAttribute(name = "class")
    public String clazz;

    public long retries;
    public long retryDelay;
}

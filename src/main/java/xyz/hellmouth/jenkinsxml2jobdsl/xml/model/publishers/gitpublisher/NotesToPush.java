package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.publishers.gitpublisher;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

public class NotesToPush {

    @XmlElements({
            @XmlElement(name = "hudson.plugins.git.GitPublisher_-NoteToPush", type = NoteToPush.class)
    })
    public List elements;
}

package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.scm.svn;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

import xyz.hellmouth.jenkinsxml2jobdsl.xml.model.publishers.Publisher;

public class SVNLocations {

    @XmlElements({
            @XmlElement(name = "hudson.scm.SubversionSCM_-ModuleLocation", type = SVNModuleLocation.class),
    })
    public List<Publisher> elements;
}

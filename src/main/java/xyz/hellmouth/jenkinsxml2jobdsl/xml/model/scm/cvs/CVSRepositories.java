package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.scm.cvs;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

public class CVSRepositories {

    @XmlElements({
            @XmlElement(name = "hudson.scm.CvsRepository", type = CVSRepository.class)
    })
    List elements;
}

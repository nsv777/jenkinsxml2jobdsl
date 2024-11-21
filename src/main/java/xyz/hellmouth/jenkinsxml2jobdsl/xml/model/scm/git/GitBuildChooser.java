package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.scm.git;

import jakarta.xml.bind.annotation.XmlAttribute;

public class GitBuildChooser {

    @XmlAttribute(name = "class")
    public String clazz;

    public long maximumAgeInDays;
    public String ancestorCommitSha1;
}

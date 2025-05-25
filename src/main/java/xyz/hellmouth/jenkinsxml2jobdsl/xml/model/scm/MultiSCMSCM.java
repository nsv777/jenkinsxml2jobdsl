package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.scm;

import xyz.hellmouth.jenkinsxml2jobdsl.xml.model.SCM;

public class MultiSCMSCM extends SCM {

    @Override
    public void build(xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder builder) {
        git(builder);
    }

}

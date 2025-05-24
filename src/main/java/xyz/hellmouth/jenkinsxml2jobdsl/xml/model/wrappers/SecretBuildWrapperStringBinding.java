package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.wrappers;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class SecretBuildWrapperStringBinding implements Buildable{

	public SecretBuildWrapperBindings patterns;
	public String credentialsId;
	public String variable;
	
	@Override
	public void build(Builder builder) {
		builder.createMethod("secretText").withStringParameter(variable).withStringParameter(credentialsId).endMethod();
	}

}

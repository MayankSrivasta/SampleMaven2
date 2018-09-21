package com.serenity.thucydides.storySteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.serenity.thucydides.pageObject.ProjectPageObject;

import net.thucydides.core.annotations.Steps;

public class ProjectStorySteps {

	@Steps
	ProjectPageObject projectpageobject;
	

	@Given("Tom a customer")
	public void customerBge() {		
		projectpageobject.openURL();
		System.out.println("Tom is a customer of bge");
		projectpageobject.click1Method();
	}
	
	@When("Tom is on the Home page")
	public void onTheHomePage(){
		projectpageobject.click2Method();
	}
	
	@Then("Tom should be able to see the BGE logo on Home page")
	public void logoOnHomePage(){
		projectpageobject.click3Method();
	}
}

package com.serenity.thucydides.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProjectPageObject extends PageObject{
WebElementFacade driver;
	
	
	@FindBy(xpath="//*[@id='toc']/ul/li[3]/a")
	public WebElementFacade click1;
	
	
	@FindBy(xpath="//*[@id='toc']/ul/li[4]/ul/li[3]/a")
	public WebElementFacade click2;
	
	
	@FindBy(xpath="//*[@id='toc']/ul/li[7]/ul/li[2]/a")
	public WebElementFacade click3;
	
	
	public void openURL(){
		String url="http://thucydides.info/docs/serenity-staging/";
		openAt(url);
	}
	
	public void typeSearchText(String sSearchTerm){

	}
	
	public void click1Method(){
		element(click1).click();
	}
	
	public void click2Method(){
		element(click2).click();
	}
	
	public void click3Method(){
		element(click3).click();
	}
}

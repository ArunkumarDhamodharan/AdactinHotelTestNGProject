package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass extends BaseClass{
	public PageClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(how =How.ID,using ="password")
	private WebElement passWord;

	public WebElement getPassWord() {
		return passWord;
	}
	@FindBy(how=How.ID,using ="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	
	@FindBy(id="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	@FindBy(id="hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	@FindBy(id="room_type")
	private WebElement roomType;

	public WebElement getRoomType() {
		return roomType;
	}
	@FindBy(id="room_nos")
	private WebElement noOfRoom;

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}
	@FindBy(id="datepick_in")
	private WebElement fromDate;

	public WebElement getFromDate() {
		return fromDate;
	}
	@FindBy(id="datepick_out")
	private WebElement outDate;

	public WebElement getOutDate() {
		return outDate;
	}
	@FindBy(id="adult_room")
	private WebElement adultRoom;

	public WebElement getAdultRoom() {
		return adultRoom;
	}
	@FindBy(id="child_room")
	private WebElement childRoom;

	public WebElement getChildRoom() {
		return childRoom;
	}
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}
	@FindBy(id="continue")
	private WebElement continue1;

	public WebElement getContinue1() {
		return continue1;
	}
	@FindBy(id="first_name")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id="last_name")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(id="address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	@FindBy(id="cc_num")
	private WebElement cardNo;

	public WebElement getCardNo() {
		return cardNo;
	}
	@FindBy(id="cc_type")
	private WebElement cardType;

	public WebElement getCardType() {
		return cardType;
	}
	@FindBy(id="cc_exp_month")
	private WebElement mont;

	public WebElement getMont() {
		return mont;
	}
	@FindBy(id="cc_exp_year")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;

	public WebElement getCvvNo() {
		return cvvNo;
	}
	@FindBy(id="book_now")
	private WebElement bookNow;

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
	
	}
	
	


	





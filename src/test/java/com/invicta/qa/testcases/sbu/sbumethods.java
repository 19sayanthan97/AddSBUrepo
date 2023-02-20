package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuFunPage;




public class sbumethods extends DriverIntialization {
	
  static AddSbuFunPage AddSbuFunpg = new AddSbuFunPage();
  
  
  
  public static void Addsbu () throws InterruptedException {
     PageFactory.initElements(driver, AddSbuFunpg);
	  
	// check if element visible

	boolean ActualElement = AddSbuFunPage.AddSBU.isDisplayed();
	boolean ExpectedElement = true;

	boolean visibility = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-VISIBILITY");
	try {
		AssertJUnit.assertEquals(ActualElement, ExpectedElement);

	} catch (AssertionError e) {

		visibility = false;

//	        	  throw(e);
	}
	if (visibility) {
		testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
		testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
		testCase.log(Status.PASS, "Correct Element");
	} else {
		testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
		testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
		testCase.log(Status.FAIL, "No element");

	}
	Thread.sleep(2000);
	
	

	// check position

	Point ActualLocation = AddSbuFunPage.AddSBU.getLocation();

	int actual_x = ActualLocation.getX();
	int actual_y = ActualLocation.getY();

	System.out.println("X axis: " + actual_x);
	System.out.println("Y axis: " + actual_y);

	Point ExpectedLocation = new Point(588, 93);

	boolean Position = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-POSITION");
	try {
		AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

	} catch (AssertionError e) {
		Position = false;
	}
	if (Position) {
		testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
		testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
		testCase.log(Status.PASS, "Correct Location");
	} else {
		testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
		testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
		testCase.log(Status.FAIL, "Wrong Location");
	}
	Thread.sleep(2000);
	

//			 check font size

	String ActualFontSize = AddSbuFunPage.AddSBU.getCssValue("font-size");
	System.out.println("Font Size: " + ActualFontSize);
	String ExpectedFontSize = "14px";

	boolean Fontsize = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-FONT-SIZE");
	try {
		AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

	} catch (AssertionError e) {
		Fontsize = false;
	}
	if (Fontsize) {
		testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
		testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
		testCase.log(Status.PASS, "Correct Font Size");
	} else {
		testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
		testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
		testCase.log(Status.FAIL, "Wrong Font Size");
	}
	Thread.sleep(2000);

//			 check the size 

	Dimension ActualSize = AddSbuFunPage.AddSBU.getSize();
	System.out.println("Size : " + ActualSize);
	Dimension ExpectedSize = new Dimension(180, 32);

	boolean size = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-SIZE");
	try {
		AssertJUnit.assertEquals(ActualSize, ExpectedSize);

	} catch (AssertionError e) {
		size = false;
	}
	if (size) {
		testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
		testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
		testCase.log(Status.PASS, "Correct Size");
	} else {
		testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
		testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
		testCase.log(Status.FAIL, "Wrong Size");
	}
	Thread.sleep(2000);

//	            check the enable

	boolean ActualElementEnable = AddSbuFunPage.AddSBU.isEnabled();
	boolean ExpectedElementEnable = true;

	boolean enablity = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-ENABLE");
	try {
		AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

	} catch (AssertionError e) {
		enablity = false;
	}
	if (enablity) {
		testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
		testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
		testCase.log(Status.PASS, "Element enable");
	} else {
		testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
		testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
		testCase.log(Status.FAIL, "Element is not enable");
	}
	Thread.sleep(2000);

//	            check the button color

	String ActualButtonColor = AddSbuFunPage.AddSBU.getCssValue("background-color");
	System.out.println("rgb :" + ActualButtonColor);

	String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

	boolean buttoncolor = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-COLOR");
	try {
		AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

	} catch (AssertionError e) {
		buttoncolor = false;
	}
	if (buttoncolor) {
		testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
		testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
		testCase.log(Status.PASS, "Correct Button Color");
	} else {
		testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
		testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
		testCase.log(Status.FAIL, "Wrong Button Color");
	}
	Thread.sleep(2000);

//	            check the border color

	String ActualBorderColor = AddSbuFunPage.AddSBU.getCssValue("border-colour");
	System.out.println("rgb :" + ActualBorderColor);

	String ExpectedBorderColor = " ";

	boolean bordercolor = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-BORDER-COLOR");
	try {
		AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

	} catch (AssertionError e) {
		bordercolor = false;
	}
	if (bordercolor) {
		testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
		testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
		testCase.log(Status.PASS, "Correct Border Color");
	} else {
		testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
		testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
		testCase.log(Status.FAIL, "Wrong Border Color");
	}
	Thread.sleep(2000);

//	            check the font type 

	String ActualFontType = AddSbuFunPage.AddSBU.getCssValue("font-type");
	System.out.println("Font type: " + ActualFontType);

	String ExpectedFontType = "";
	
	//input[@id='sub_business_unit']

	boolean fonttype = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-FONT-TYPE");
	try {
		AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

	} catch (AssertionError e) {
		fonttype = false;
	}
	if (fonttype) {
		testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
		testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
		testCase.log(Status.PASS, "Correct Font Type");
	} else {
		testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
		testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
		testCase.log(Status.FAIL, "Wrong Font Type");
	}
	Thread.sleep(2000);

//	                    check font color

	String ActualFontColor = AddSbuFunPage.AddSBU.getCssValue("color");

	System.out.println("Font colour: " + ActualFontColor);

	String ExpectedFontColor = "rgba(255, 255, 255, 1)";
	testCase = extent.createTest("ADD_SBU_BUTTON-FONT-COLOUR");
	try {
		AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
		testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
		testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

		testCase.log(Status.PASS, "Correct font Colour");
	} catch (AssertionError e) {
		testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
		testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

		testCase.log(Status.FAIL, "wrong font Colour");
	}
	Thread.sleep(2000);

//			cursor

	String ActualActions = AddSbuFunPage.AddSBU.getCssValue("cursor");
	System.out.println("cursor :" + ActualActions);
	String ExpectedActions = "pointer";

	boolean cursor = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-CURSOR");
	try {
		AssertJUnit.assertEquals(ActualActions, ExpectedActions);

	} catch (AssertionError e) {
		cursor = false;
	}
	if (cursor) {
		testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
		testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
		testCase.log(Status.PASS, "drop down auto");
	} else {
		testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
		testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
		testCase.log(Status.FAIL, "drop dow not auto");
	}
	Thread.sleep(2000);

//			text spelling

	String text = AddSbuFunPage.AddSBU.getText();

	String text1 = "Add SBU";
	boolean txt1 = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-SPELLING");

	try {
		AssertJUnit.assertEquals(text, text1);
	} catch (AssertionError e) {
		txt1 = false;
	}
	if (txt1) {
		testCase.log(Status.INFO, "ActualElement :- " + text);
		testCase.log(Status.INFO, "ExpectedElement :- " + text1);
		testCase.log(Status.INFO, "correct text");
		testCase.log(Status.PASS, "Correct ");
	} else {
		testCase.log(Status.INFO, "ActualElement :- " + text);
		testCase.log(Status.INFO, "ExpectedElement :- " + text1);
		testCase.log(Status.INFO, "wrong text");
		testCase.log(Status.FAIL, "wrong");
	}

	Thread.sleep(2000);

//			padding

	String Actualvalue = AddSbuFunPage.AddSBU.getCssValue("padding");
	System.out.println("paddingvalue :" + Actualvalue);
	String Expectedvalue = "4px 15px";

	boolean padding = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-PADDING");
	try {
		AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

	} catch (AssertionError e) {
		padding = false;
	}
	if (padding) {
		testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
		testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
		testCase.log(Status.PASS, "Correct value");
	} else {
		testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
		testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
		testCase.log(Status.FAIL, "Wrong Value");
	}
	Thread.sleep(2000);

//	  		border radius

	String Actualradius = AddSbuFunPage.AddSBU.getCssValue("border-radius");
	System.out.println("radius value :" + Actualradius);
	String Expectedradius = "2px";

	boolean radius = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-RADIUS");
	try {
		AssertJUnit.assertEquals(Actualradius, Expectedradius);

	} catch (AssertionError e) {
		padding = false;
	}
	if (padding) {
		testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
		testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
		testCase.log(Status.PASS, "Correct value");
	} else {
		testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
		testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
		testCase.log(Status.FAIL, "Wrong Value");
	}
	Thread.sleep(2000);

//			opacity

	String Actualopacity = AddSbuFunPage.AddSBU.getCssValue("opacity");
	System.out.println("opacity  :" + Actualopacity);
	String Expectedopacity = "1";

	boolean opacity = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-OPACITY");
	try {
		AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

	} catch (AssertionError e) {
		opacity = false;
	}
	if (opacity) {
		testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
		testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
		testCase.log(Status.PASS, "Correct value");
	} else {
		testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
		testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
		testCase.log(Status.FAIL, "Wrong Value");
	}
	Thread.sleep(2000);

//			font weight

	String Actualfontweight = AddSbuFunPage.AddSBU.getCssValue("font-weight");
	System.out.println("fontweight  :" + Actualfontweight);
	String Expectedfontweight = "400";

	boolean fontweight = true;
	testCase = extent.createTest("ADD_SBU_BUTTON-FONT-WEIGHT");
	try {
		AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

	} catch (AssertionError e) {
		fontweight = false;
	}
	if (fontweight) {
		testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
		testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
		testCase.log(Status.PASS, "Correct font weight");
	} else {
		testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
		testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
		testCase.log(Status.FAIL, "Wrong font weight");
	}
	Thread.sleep(2000);
}

  
  
  
  
// --------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------
//  
  
  
  
  public static void sbumodal() throws InterruptedException {
	  
	  PageFactory.initElements(driver, AddSbuFunpg);
	  
	  
		// ***** element visible test

		boolean AcctualVisible = AddSbuFunPage.sbumodal.isDisplayed();
		boolean ExpectedVisible = true;

		boolean elementvisible = true;
		testCase = extent.createTest("SUB_MODAL-VISIBLE");
		try {
			AssertJUnit.assertEquals(AcctualVisible, ExpectedVisible);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// ***** element position test

		Point ActualLocation = AddSbuFunPage.sbumodal.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(383, 100);

		boolean Position = true;
		testCase = extent.createTest("SUB_MODAL-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

		// ***** element size

		Dimension ActualSize = AddSbuFunPage.sbumodal.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(600, 230);

		boolean size = true;
		testCase = extent.createTest("SUB_MODAL-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correcrt size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(2000);

		// ***** element background-color

		String ActualButtonColor = AddSbuFunPage.sbumodal.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);
		String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("SUB_MODAL-BACKGROUND-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(2000);

		// ***** element border-color

		String ActualBorderColor = AddSbuFunPage.sbumodal.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = "";

		boolean bordercolor = true;
		testCase = extent.createTest("SUB_MODAL-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(2000);

		// ***** element overflow

		String ActualOverflow = AddSbuFunPage.sbumodal.getCssValue("overflow");
		System.out.println("overflow :" + ActualOverflow);

		String ExpectedOverflow = "visible";

		boolean overflow = true;
		testCase = extent.createTest("SUB_MODAL-OVERFLOW-TYPE");
		try {
			AssertJUnit.assertEquals(ActualOverflow, ExpectedOverflow);

		} catch (AssertionError e) {
			overflow = false;
		}
		if (overflow) {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.PASS, "Correct overflow");
		} else {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.FAIL, "Wrong overflow");
		}
		Thread.sleep(2000);

		// ***** element margin

		String ActualMargin = AddSbuFunPage.sbumodal.getCssValue("margin");
		System.out.println("margin :" + ActualMargin);

		String ExpectedMargin = "0px";

		boolean margin = true;
		testCase = extent.createTest("SUB_MODAL-MARGIN-TYPE");
		try {
			AssertJUnit.assertEquals(ActualMargin, ExpectedMargin);

		} catch (AssertionError e) {
			margin = false;
		}
		if (margin) {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.PASS, "Correct Margin");
		} else {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.FAIL, "Wrong Margin");
		}
		Thread.sleep(2000);

		// ***** element cursor

		String ActualActions = AddSbuFunPage.sbumodal.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "auto";

		boolean cursor = true;
		testCase = extent.createTest("SUB_MODAL-CURSOR-TYPE");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "correct cursor type");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "wrong cursor type");
		}
		Thread.sleep(2000);

		// ***** element z- index

		String ActualZindex = AddSbuFunPage.sbumodal.getCssValue("z-index");
		System.out.println("z-index :" + ActualZindex);
		String ExpectedZindex = "auto";

		boolean z_index = true;
		testCase = extent.createTest("SUB_MODAL-Z-INDEX-TYPE");
		try {
			AssertJUnit.assertEquals(ActualZindex, ExpectedZindex);

		} catch (AssertionError e) {
			z_index = false;
		}
		if (z_index) {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct z-index  type");
		} else {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong z-index type");
		}
		Thread.sleep(2000);
		

		// ***** click-on element

		// identify modal header

		String modalActual = AddSbuFunPage.sbumodalheader.getText();
		System.out.println("Modal Dialog header: " + modalActual);

		String modalExpected = "Add SBU";

		boolean modalHeader = true;
		testCase = extent.createTest("SUB_MODAL-HEADER");
		try {
			AssertJUnit.assertEquals(modalActual, modalExpected);

		} catch (AssertionError e) {
			modalHeader = false;
		}
		if (modalHeader) {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct modal header");
		} else {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong modal header");
		}
		Thread.sleep(2000);
		

		// identify modal content
		
		String ActualmodalContent= AddSbuFunPage.sbumodalcontent.getText();
		System.out.println( ActualmodalContent);
		String ExpectedModalContent = "Sub Business Unit:"+ "\n" + "Description:";

		boolean modalContent = true;
		testCase = extent.createTest("SUB_MODAL-CONTENT");
		try {
			AssertJUnit.assertEquals(ActualmodalContent, ExpectedModalContent);

		} catch (AssertionError e) {
			modalContent = false;
		}
		if (modalContent) {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.PASS, "correct modal content");
		} else {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.FAIL, "wrong modal content");
		}
		Thread.sleep(2000);
		

		//  click on inside of modal
		
		AddSbuFunPage.sbumodal.click();
		Thread.sleep(2000);
		
		boolean AcctualAfterClickinside = AddSbuFunPage.sbumodal.isDisplayed();
		boolean ExpectedAfterClickinside= true;
		
		boolean elementvisibleafterclickinside = true;
		testCase = extent.createTest("SUB_MODAL-INVISIBLE-ONCLICK-INSIDE");
		try {
			AssertJUnit.assertEquals(AcctualAfterClickinside, ExpectedAfterClickinside);
		} catch (AssertionError e) {
			elementvisibleafterclickinside = false;
		}
		if (elementvisibleafterclickinside) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);
			
			testCase.log(Status.PASS, "Modal visible ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);
			
			testCase.log(Status.FAIL, "Modal invisible");
		}
		Thread.sleep(2000);
		
		  
	  
  }
  
  
//  ----------------------------------------------------------------------------------------------------------
//  ----------------------------------------------------------------------------------------------------------
//	
	
  
  public static void sbusavebutton() throws InterruptedException {

		

		PageFactory.initElements(driver, AddSbuFunpg);

		
		// check if element visible

		boolean ActualElement = AddSbuFunPage.SBUsavebutton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("SAVE_BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//		        	  throw(e);

		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(2000);

		// check position

		Point ActualLocation = AddSbuFunPage.SBUsavebutton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(907, 288);

		boolean Position = true;
		testCase = extent.createTest("SAVE_BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

//				 check font size

		String ActualFontSize = AddSbuFunPage.SBUsavebutton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("SAVE_BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(2000);

//				 check the size 

		Dimension ActualSize = AddSbuFunPage.SBUsavebutton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(60, 32);

		boolean size = true;
		testCase = extent.createTest("SAVE_BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(2000);

//		            check the enable

		boolean ActualElementEnable = AddSbuFunPage.SBUsavebutton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("SAVE_BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(2000);

//		            check the button color

		String ActualButtonColor = AddSbuFunPage.SBUsavebutton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("SAVE_BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(2000);

//		            check the border color

		String ActualBorderColor = AddSbuFunPage.SBUsavebutton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("SAVE_BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(2000);

//		            check the font type 

		String ActualFontType = AddSbuFunPage.SBUsavebutton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";
		
		//input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("SAVE_BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(2000);

//		                    check font color

		String ActualFontColor = AddSbuFunPage.SBUsavebutton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("SAVE_BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(2000);

//				cursor

		String ActualActions = AddSbuFunPage.SBUsavebutton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("SAVE_BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(2000);

//				text spelling

		String text = AddSbuFunPage.SBUsavebutton.getText();

		String text1 = "Save";
		boolean txt1 = true;
		testCase = extent.createTest("SAVE_BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(2000);

//				padding

		String Actualvalue = AddSbuFunPage.SBUsavebutton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("SAVE_BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//		  		border radius

		String Actualradius = AddSbuFunPage.SBUsavebutton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("SAVE_BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//				opacity

		String Actualopacity = AddSbuFunPage.SBUsavebutton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("SAVE_BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//				font weight

		String Actualfontweight = AddSbuFunPage.SBUsavebutton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("SAVE_BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(2000);
	}
  
  
  public static void execldata() throws InterruptedException, IOException {
	  
	 PageFactory.initElements(driver, AddSbuFunpg);
	 

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\invicta\\qa\\excel\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sbu");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);

			String sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();
			
			Thread.sleep(2000);
//			AddSbuFunPage.AddSBU.click();

			AddSbuFunPage.SBUtext.sendKeys(sbu); 
			AddSbuFunPage.SBUdestext.sendKeys(description);
			
			Thread.sleep(2000);
  }
  
}
}

	
	


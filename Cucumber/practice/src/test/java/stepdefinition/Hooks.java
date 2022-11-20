package stepdefinition;

import java.io.IOException;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {

	@Before
	public void setUp() throws IOException {
		launchUrl();
	}
	
	@After
	public void end() {
		tearDown();
	}
}

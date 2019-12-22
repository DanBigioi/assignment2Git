package sampletest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModuleClassTest {

	@Test
	public void testModuleClass() {
		moduleClass module = new moduleClass("Software", "CT456", "CT4101", "Dan,Ant,Dec");
		
		String moduleName = module.getModuleName();
		String moduleID = module.getModuleID();
				
		assertEquals("Software", moduleName);
	}
}

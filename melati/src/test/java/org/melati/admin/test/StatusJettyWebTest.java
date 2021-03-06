/**
 * 
 */
package org.melati.admin.test;

import org.melati.JettyWebTestCase;

/**
 * @author timp
 * @since 2008/01/10
 */
public class StatusJettyWebTest extends JettyWebTestCase {

  /**
   * 
   */
  public StatusJettyWebTest() {
    super();
  }

  /**
   * @param name
   */
  public StatusJettyWebTest(String name) {
    super(name);
  }

  /**
   * {@inheritDoc}
   * @see org.melati.JettyWebTestCase#setUp()
   */
  protected void setUp() throws Exception {
    super.setUp();    
  }

  /**
   * {@inheritDoc}
   * @see org.melati.JettyWebTestCase#tearDown()
   */
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  /**
   * Test Display.
   */
  public void testStatus() {
    setScriptingEnabled(false);
    beginAt("/Status/melatijunit");
    assertTextPresent("Database Cache Status");
  }
}

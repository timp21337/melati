/**
 * 
 */
package org.melati.poem.test;

import org.melati.poem.TimestampPoemType;

/**
 * @author timp
 * @since 21 Dec 2006
 *
 */
public class NullableTimestampPoemTypeTest extends NotNullableTimestampPoemTypeTest {

  /**
   * 
   */
  public NullableTimestampPoemTypeTest() {
  }

  /**
   * @param name
   */
  public NullableTimestampPoemTypeTest(String name) {
    super(name);
  }

  /**
   * {@inheritDoc}
   * @see org.melati.poem.test.SQLPoemTypeSpec#setObjectUnderTest()
   */
  void setObjectUnderTest() {
    it = new TimestampPoemType(true);
  }

}

/**
 * 
 */
package org.melati.poem.test;

import org.melati.poem.TableMap;
import org.melati.poem.TableSortedMap;

/**
 * @author timp
 * @since 8 Jun 2007
 *
 */
public class TableSortedMapTest extends TableMapTest {
  TableSortedMap it;
  TableSortedMap noArg;

  /**
   * @param name
   */
  public TableSortedMapTest(String name) {
    super(name);
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.poem.test.TableMapTest#setUp()
   */
  protected void setUp() throws Exception {
    super.setUp();
  }
  
  protected void createObjectsUnderTest() {
    System.err.println("setting in TSM");
    it = new TableSortedMap(getDb().getUserTable());
    noArg = new TableSortedMap();
  }
  protected TableMap getObjectUnderTest() { 
    return it;
  }
  protected TableMap getNoArgObjectUnderTest() { 
    return noArg;
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.poem.test.TableMapTest#tearDown()
   */
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#TableSortedMap()}.
   */
  public void testTableSortedMap() {
    
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#TableSortedMap(org.melati.poem.Table)}.
   */
  public void testTableSortedMapTable() {
    
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#comparator()}.
   */
  public void testComparator() {
    assertNull(it.comparator());
    assertNull(noArg.comparator());
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#firstKey()}.
   */
  public void testFirstKey() {
    assertEquals(new Integer(0), it.firstKey());
    try { 
      noArg.firstKey();
      fail("Should have bombed");
    } catch (NullPointerException e) { 
      e = null;
    }
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#lastKey()}.
   */
  public void testLastKey() {
    assertEquals(new Integer(2), it.lastKey());
    try { 
      noArg.lastKey();
      fail("Should have bombed");
    } catch (NullPointerException e) { 
      e = null;
    }    
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#subMap(java.lang.Object, java.lang.Object)}.
   */
  public void testSubMap() {
    try { 
      it.subMap(new Integer(0),new Integer(1));
      fail("Should have bombed");
    } catch (UnsupportedOperationException e) { 
      e = null;
    }                    
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#headMap(java.lang.Object)}.
   */
  public void testHeadMap() {
    try { 
      it.headMap(new Integer(1));
      fail("Should have bombed");
    } catch (UnsupportedOperationException e) { 
      e = null;
    }                
  }

  /**
   * Test method for {@link org.melati.poem.TableSortedMap#tailMap(java.lang.Object)}.
   */
  public void testTailMap() {
    try { 
      it.tailMap(new Integer(1));
      fail("Should have bombed");
    } catch (UnsupportedOperationException e) { 
      e = null;
    }                
  }

}
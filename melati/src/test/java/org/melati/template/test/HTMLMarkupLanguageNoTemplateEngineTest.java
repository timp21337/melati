/**
 * 
 */
package org.melati.template.test;

import org.melati.MelatiConfig;
import org.melati.template.NoTemplateEngine;
import org.melati.template.TemplateEngineException;
import org.melati.util.MelatiException;

/**
 * @author timp
 * @since 26 Jun 2007
 *
 */
public class HTMLMarkupLanguageNoTemplateEngineTest extends
        HTMLMarkupLanguageTest {

  /**
   * Constructor.
   */
  public HTMLMarkupLanguageNoTemplateEngineTest() {
    super();
  }

  protected void melatiConfig() throws MelatiException {
    mc = new MelatiConfig();
    mc.setTemplateEngine(new NoTemplateEngine());
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.HTMLMarkupLanguageTest#testGetName()
   */
  public void testGetName() {
    super.testGetName();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.HTMLMarkupLanguageTest#testRenderedTreeable()
   */
  public void testRenderedTreeable() throws Exception {
    try { 
      super.testRenderedTreeable();
      fail("Should have bombed");
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/org.melati.util.JSStaticTree.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }


  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testEncoded()
   */
  public void testEncoded() {
    super.testEncoded();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testEntitySubstitution()
   */
  public void testEntitySubstitution() throws Exception {
    super.testEntitySubstitution();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testEscapedPersistent()
   */
  public void testEscapedPersistent() {
    super.testEscapedPersistent();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testEscapedString()
   */
  public void testEscapedString() throws Exception {
    super.testEscapedString();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testGetAttr()
   */
  public void testGetAttr() {
    super.testGetAttr();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testHTMLMarkupLanguageMelatiTempletLoaderPoemLocale()
   */
  public void testHTMLMarkupLanguageMelatiTempletLoaderPoemLocale() {
    super.testHTMLMarkupLanguageMelatiTempletLoaderPoemLocale();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testHTMLMarkupLanguageStringHTMLMarkupLanguage()
   */
  public void testHTMLMarkupLanguageStringHTMLMarkupLanguage() {
    super.testHTMLMarkupLanguageStringHTMLMarkupLanguage();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testInputAs()
   */
  public void testInputAs() throws Exception {
    try { 
      super.testInputAs();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/org.melati.poem.StringPoemType.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testInputField()
   */
  public void testInputField() throws Exception {
    try { 
      super.testInputField();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/org.melati.poem.StringPoemType.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testNull()
   */
  public void testNull() throws Exception {
    super.testNull();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedAccessPoemException()
   */
  public void testRenderedAccessPoemException() throws Exception {
    try { 
      super.testRenderedAccessPoemException();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/org.melati.poem.AccessPoemException.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedField()
   */
  public void testRenderedField() throws Exception {
    super.testRenderedField();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedFieldInt()
   */
  public void testRenderedFieldInt() throws Exception {
    super.testRenderedFieldInt();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedFieldIntInt()
   */
  public void testRenderedFieldIntInt() throws Exception {
    super.testRenderedFieldIntInt();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedObject()
   */
  public void testRenderedObject() throws Exception {
    try { 
      super.testRenderedObject();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/java.lang.Integer.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedStart()
   */
  public void testRenderedStart() throws Exception {
    super.testRenderedStart();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedString()
   */
  public void testRenderedString() throws Exception {
    super.testRenderedString();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testRenderedStringInt()
   */
  public void testRenderedStringInt() throws Exception {
    super.testRenderedStringInt();
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testSearchInput()
   */
  public void testSearchInput() throws Exception {
    try { 
      super.testSearchInput();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/org.melati.poem.StringPoemType.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testSpecialTemplateFound()
   */
  public void testSpecialTemplateFound() throws Exception {
    try { 
      super.testSpecialTemplateFound();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/SelectionWindow.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testTemplateFoundOnClasspath()
   */
  public void testTemplateFoundOnClasspath() throws Exception {
    try { 
      super.testTemplateFoundOnClasspath();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/org.melati.template.test.Templated.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

  /** 
   * {@inheritDoc}
   * @see org.melati.template.test.MarkupLanguageSpec#testUntemplatedObjectUsesToString()
   */
  public void testUntemplatedObjectUsesToString() throws Exception {
    try { 
      super.testUntemplatedObjectUsesToString();
    } catch (TemplateEngineException e) { 
      assertEquals("The template " + 
              "org/melati/template/none/templets/html/java.util.Properties.none" +  
              " could not be found because you have not configured a template engine.", e.getMessage());
    }
  }

}
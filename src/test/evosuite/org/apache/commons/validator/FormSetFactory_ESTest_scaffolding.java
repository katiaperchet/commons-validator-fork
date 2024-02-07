/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Feb 07 18:02:49 GMT 2024
 */

package org.apache.commons.validator;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FormSetFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.validator.FormSetFactory"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\KATIAP~1\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Katia Perchet\\Documents\\UNISA\\Software Dependability\\Project\\commons-validator-fork"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Katia Perchet"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Katia"); 
    java.lang.System.setProperty("user.timezone", "Europe/Paris"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FormSetFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.digester.SetTopRule",
      "org.apache.commons.digester.substitution.VariableExpander",
      "org.apache.commons.digester.Rules",
      "org.apache.commons.digester.substitution.VariableSubstitutor",
      "org.apache.commons.digester.substitution.VariableAttributes",
      "org.apache.commons.digester.FactoryCreateRule",
      "org.apache.commons.digester.SetNextRule",
      "org.apache.commons.validator.FormSetFactory",
      "org.apache.commons.digester.CallMethodRule",
      "org.apache.commons.validator.FormSet",
      "org.apache.commons.digester.SetPropertiesRule",
      "org.apache.commons.digester.SetNestedPropertiesRule",
      "org.apache.commons.digester.PathCallParamRule",
      "org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLocationAwareLog",
      "org.apache.commons.digester.StackAction",
      "org.apache.commons.digester.ObjectParamRule",
      "org.apache.commons.digester.Digester",
      "org.apache.commons.digester.ObjectCreateRule",
      "org.apache.commons.digester.RuleSet",
      "org.apache.commons.validator.ValidatorResources",
      "org.apache.commons.digester.BeanPropertySetterRule",
      "org.apache.commons.digester.Substitutor",
      "org.apache.commons.digester.ObjectCreationFactory",
      "org.apache.commons.digester.Rule",
      "org.apache.commons.digester.SetPropertyRule",
      "org.apache.commons.digester.CallParamRule",
      "org.apache.commons.logging.impl.Slf4jLogFactory",
      "org.apache.commons.digester.SetRootRule",
      "org.apache.commons.digester.substitution.MultiVariableExpander",
      "org.apache.commons.digester.AbstractObjectCreationFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FormSetFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.digester.AbstractObjectCreationFactory",
      "org.apache.commons.validator.FormSetFactory",
      "org.apache.commons.logging.impl.Slf4jLogFactory",
      "org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLocationAwareLog",
      "org.apache.commons.digester.annotations.providers.BeanPropertySetterRuleProvider",
      "org.apache.commons.digester.Rule",
      "org.apache.commons.digester.BeanPropertySetterRule",
      "org.apache.commons.digester.RegexMatcher",
      "org.apache.commons.digester.SimpleRegexMatcher",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.digester.AbstractRulesImpl",
      "org.apache.commons.digester.RegexRules",
      "org.apache.commons.logging.impl.NoOpLog",
      "org.apache.commons.digester.substitution.MultiVariableExpander",
      "org.apache.commons.digester.Substitutor",
      "org.apache.commons.digester.substitution.VariableSubstitutor",
      "org.apache.commons.digester.substitution.VariableAttributes",
      "org.apache.commons.digester.RulesBase",
      "org.apache.commons.digester.ExtendedBaseRules",
      "org.apache.commons.digester.Digester",
      "org.apache.commons.digester.CallMethodRule",
      "org.apache.commons.digester.FactoryCreateRule",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.validator.ValidatorResources",
      "org.apache.commons.digester.xmlrules.DigesterLoader",
      "org.apache.commons.digester.RuleSetBase",
      "org.apache.commons.digester.xmlrules.FromXmlRuleSet",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$PatternStack",
      "org.apache.commons.digester.xmlrules.FromXmlRuleSet$XMLRulesLoader",
      "org.apache.commons.digester.xmlrules.FromXmlRuleSet$URLXMLRulesLoader",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$PatternRule",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$IncludeRule",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$BeanPropertySetterRuleFactory",
      "org.apache.commons.digester.SetNextRule",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$CallMethodRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$ObjectParamRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$CallParamRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$FactoryCreateRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$ObjectCreateRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$NodeCreateRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetPropertiesRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetPropertiesAliasRule",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetPropertyRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetNestedPropertiesRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetNestedPropertiesAliasRule",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetTopRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetNextRuleFactory",
      "org.apache.commons.digester.xmlrules.DigesterRuleParser$SetRootRuleFactory",
      "org.apache.commons.digester.xmlrules.XmlLoadException",
      "org.apache.commons.digester.WithDefaultsRulesWrapper",
      "org.apache.commons.digester.RegexRules$RegisteredRule",
      "org.apache.commons.validator.FormSet",
      "org.apache.commons.digester.CallParamRule",
      "org.apache.commons.digester.ObjectCreateRule",
      "org.apache.commons.digester.SetPropertiesRule",
      "org.apache.commons.digester.SetRootRule",
      "org.apache.commons.validator.ValidatorResults",
      "org.apache.commons.validator.Field",
      "org.apache.commons.validator.ValidatorResult",
      "org.apache.commons.validator.ValidatorResult$ResultStatus",
      "org.apache.commons.digester.ExtendedBaseRules$1",
      "org.apache.commons.validator.Form",
      "org.apache.commons.digester.SetNestedPropertiesRule",
      "org.apache.commons.digester.xmlrules.FromXmlRuleSet$InputSourceXMLRulesLoader",
      "org.apache.commons.digester.ObjectParamRule",
      "org.apache.commons.digester.PathCallParamRule",
      "org.apache.commons.digester.SetTopRule",
      "org.apache.commons.digester.SetPropertyRule",
      "org.apache.commons.digester.NodeCreateRule",
      "org.apache.commons.digester.annotations.providers.SetTopRuleProvider",
      "org.apache.commons.digester.annotations.providers.FactoryCreateRuleProvider"
    );
  }
}

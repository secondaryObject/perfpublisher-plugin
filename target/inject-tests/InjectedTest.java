import java.util.*;
/**
 * Entry point to auto-generated tests (generated by maven-hpi-plugin).
 * If this fails to compile, you are probably using Hudson &lt; 1.327. If so, disable
 * this code generation by configuring maven-hpi-plugin to &lt;disabledTestInjection>false&lt;/disabledTestInjection>.
 */
public class InjectedTest extends junit.framework.TestCase {
  public static junit.framework.Test suite() throws Exception {
    Map parameters = new HashMap();
    parameters.put("basedir","/home/gbossert/Developpement/Workspaces/Hudson_official/plugins/perfpublisher");
    parameters.put("artifactId","PerfPublisher");
    parameters.put("outputDirectory","/home/gbossert/Developpement/Workspaces/Hudson_official/plugins/perfpublisher/target/classes");
    parameters.put("testOutputDirectory","/home/gbossert/Developpement/Workspaces/Hudson_official/plugins/perfpublisher/target/test-classes");
    return new org.jvnet.hudson.test.PluginAutomaticTestBuilder().build(parameters);
  }
}
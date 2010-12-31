package com.thoughtworks.webanalyticsautomation.plugins;

/**
 * Created by: Anand Bagmar
 * Email: anandb@thoughtworks.com, abagmar@gmail.com
 * Date: Dec 29, 2010
 * Time: 9:34:02 AM
 */

public class PluginFactory {
    public IWAATPlugin getWebAnalyticsPluginInstance(WebAnalyticTool webAnalyticTool) {
        if (webAnalyticTool.equals(WebAnalyticTool.OMNITURE)) {
            return new OmnitureDebugger();
        }
        else {
            throw new IllegalArgumentException("Invalid type of Web Analytic Tool (" + webAnalyticTool + ") specified");
        }
    }
}

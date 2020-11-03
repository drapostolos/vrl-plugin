package vrl.service;

import eu.mihosoft.vrl.system.InitPluginAPI;
import eu.mihosoft.vrl.system.PluginAPI;
import eu.mihosoft.vrl.system.PluginIdentifier;
import eu.mihosoft.vrl.system.VPluginAPI;
import eu.mihosoft.vrl.system.VPluginConfigurator;

public class PluginConf extends VPluginConfigurator{
	
	public PluginConf() {
	       setIdentifier(new PluginIdentifier("ServiceLoader-TEST", "0.1.0"));
	       setDescription("Plugin Description...");
	       setCopyrightInfo("Sample-Plugin---",
	               "(c) Your Name..",
	               "www.you.com..", "License Name...", "License Text...");
	}

	@Override
	public void register(PluginAPI api) {
	       if (api instanceof VPluginAPI) {
	           VPluginAPI vapi = (VPluginAPI) api;
	           vapi.addComponent(MyComponent.class);
	       }
			exportPackage("vrl.service");
	}

	@Override
	public void init(InitPluginAPI iApi) {
	}

}

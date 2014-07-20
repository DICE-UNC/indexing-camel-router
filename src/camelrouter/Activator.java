package camelrouter;

import java.io.InputStream;

import org.irods.jargon.core.packinstr.InxVal;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		System.out.println("camel router started");
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("camel router stopped");
	}

}

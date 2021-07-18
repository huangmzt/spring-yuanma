package runmodule.IOC;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleTest implements SmartLifecycle {

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void start() {
		System.out.println("lifeCYCLE");
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}
}

package chapter3.visibility;

import java.awt.Event;
import java.util.EventListener;

/**
 * 3-8
 */
public class SafeListener {
	private final EventListener listener;

	private SafeListener() {
		listener = new EventListener() {
			public void onEvent(Event e) {
				// doSomething
			}
		};
	}

	public static SafeListener newInstance(EventSource source) {
		SafeListener safeListener = new SafeListener();
		source.registerListener(safeListener.listener);
		return safeListener;
	}
}

package chapter3.visibility;

import java.awt.Event;
import java.util.EventListener;

/**
 * 3-7 ��ʽ��ʹthis�������(����)
 * <q>��ThisEscape����EventListenerʱ,��������ThisEscape
 *
 */
public class ThisEscape {
	public ThisEscape(EventSource source) {
		source.registerListener(new EventListener() {
			public void onEvent(Event e){
				//doSomething
			}
		});
	}

	
}

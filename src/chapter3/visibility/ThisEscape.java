package chapter3.visibility;

import java.awt.Event;
import java.util.EventListener;

/**
 * 3-7 隐式地使this引用溢出(不好)
 * <q>当ThisEscape发布EventListener时,隐含发布ThisEscape
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

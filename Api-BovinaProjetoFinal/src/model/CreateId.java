package model;

import java.util.concurrent.atomic.AtomicLong;

public class CreateId {
	private static AtomicLong idCounter = new AtomicLong();
	
	public static String createID() {
		return String.valueOf(idCounter.getAndIncrement());
	}
}

package ReentrantReadWriteLockCase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁实现缓存
 * @author zhangbo
 *
 */
public class ReadWriteCache {
	private static final Map<String,Object> data = new HashMap<>();
	private static final ReentrantReadWriteLock REENTRANT_READ_WRITE_LOCK = new ReentrantReadWriteLock(false);
	private static final Lock rLock = REENTRANT_READ_WRITE_LOCK.readLock();
	private static final Lock wLock = REENTRANT_READ_WRITE_LOCK.writeLock();
	 public static Object get(String key) {
	        rLock.lock();
	        try {
	            return data.get(key);
	        } finally {
	            rLock.unlock();
	        }
	    }

	    public static Object put(String key, Object value) {
	        wLock.lock();
	        try {
	            return data.put(key, value);
	        } finally {
	            wLock.unlock();
	        }
	    }
}

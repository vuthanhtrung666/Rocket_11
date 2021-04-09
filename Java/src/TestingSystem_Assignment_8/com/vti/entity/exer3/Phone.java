package TestingSystem_Assignment_8.com.vti.entity.exer3;

public class Phone<K, V> extends MyMap<K, V> {

	public Phone(K key, V value) {
		super(key, value);
	}

	public V getPhoneNumber() {
		return super.getValue();
	}

}

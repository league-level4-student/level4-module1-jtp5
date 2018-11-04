package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	private T[] list;
	
	public ArrayList() {
		list = ((T[])new Object[0]);
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
	}
	
	public void add(T val) {
		T[] copy = ((T[])new Object[list.length + 1]);
		for (int i = 0; i < list.length; i++) {
			copy[i] = list[i];
		}
		copy[copy.length - 1] = val;
		list = copy;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] copy = ((T[])new Object[list.length + 1]);
		copy[loc] = val;
		for (int i = 0; i < loc; i++) {
			copy[i] = list[i];
		}
		for (int i = loc; i < list.length; i++) {
			copy[i + 1] = list[i];
		}
		list = copy;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] copy = ((T[])new Object[list.length - 1]);
		for (int i = 0; i < loc; i++) {
			copy[i] = list[i];
		}
		for (int i = loc; i < copy.length; i++) {
			copy[i] = list[i+1];
		}
		list = copy;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < list.length; i++) {
			if(list[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return list.length;
	}
}
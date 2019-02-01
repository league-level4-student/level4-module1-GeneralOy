package _01_Custom_ArrayList;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	Object[] List;
	int r = 0;

	public ArrayList() {
		List = new Object[50] ;
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return (T) List[loc];
	}
	
	public void add(T val) {
		List[r] = val;
		r += 1;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (r >= 2) {
			for (int i = r; i >= loc; i--) {
				List[i + 1] = List[i];
				if (i == loc) {
					List[i] = val;
				}
				r += 1;
			}
		}
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		List[loc] = val;
	}

	
	public void remove(int loc) throws IndexOutOfBoundsException {
		for (int i = loc; i < r; i++) {
			if (i > loc) {
				//int remNum = r - (loc + 1);
				//System.arraycopy(List, loc + 1, List, loc, remNum);
				List[i-1]=List[i];
			}
			
		}
		r -= 1;
	}

	
	public boolean contains(T val) {
		for(int i = r-1; i >= 0; i--) {
			if(List[i]==val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return r;
	}
}
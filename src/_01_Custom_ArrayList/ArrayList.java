package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] List;
	
	int r = 0;

	public ArrayList() {
		List = new <T>[50];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return List[loc];
	}

	public void add(T val) {
		List[List.length] = val;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (List.length >= 2) {
			for (int i = List.length; i >= loc; i--) {
				List[i + 1] = List[i];
				if (i == loc) {
					List[i] = val;
				}
			}
		}
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		List[loc] = val;
	}

//*********
	public void remove(int loc) throws IndexOutOfBoundsException {
		for (int i = loc; i < List.length; i++) {
			if (i < loc) {
				int remNum = List.length - (loc + 1);
				System.arraycopy(List, loc + 1, List, loc, remNum);
			}
		}
	}

//**********
	public boolean contains(T val) {

		return false;
	}

	public int size() {
		return List.length;
	}
}
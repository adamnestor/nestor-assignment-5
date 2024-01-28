package main.java.com.coderscampus.arraylist;

// Would you mind including whether this is too many comments? 
// I commented as I went to follow my logic, I imagine this is too much in a professional setting

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0; // Keep track of the current size of the list

// add method
	@Override
	public boolean add(T item) {
		ensureCapacity(); // First make sure there is room

		items[size] = item; // Add the item being passes into the method to the next spot in the list
		size++; // Increase the size of the list so that next time something is added it'll go
				// to the next spot

		return true; // Everything worked and the item is added
	}

// getSize Method
	@Override
	public int getSize() {
		return size; // This will return our int "size" which is updated every time something is
						// added to the CustomArrayList
	}

// get Method
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) { // Index starts at 0, so it cannot be lower OR the index cannot be larger
											// than the capacity of the CustomArrayList
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}

		@SuppressWarnings("unchecked") // Not sure what this is about but it was recommended and didn't hurt my code
		T element = (T) items[index]; // Creating a variable "element" with the generic T type which has the value of
										// the item of the items CustomArrayList at the index location, being cast to
										// also be the generic T type
		return element;
	}

	
// Method created to assist with add method	
	private void ensureCapacity() {
		if (size == items.length) { // If the current size equals the current capacity of the array, then...
			int newCapacity = items.length * 2; // double the length and call it the new capacity
			Object[] newItems = new Object[newCapacity]; // create a new array and copy everything from the old array
															// into the new, larger array. This array will only be
															// temporary.
			System.arraycopy(items, 0, newItems, 0, size);
			items = newItems; // Set the old array to be the newly created array
		}
	}

}

public class LList<E>
{
    // attributes
    private Link<E> head; // first link in the list
    private Link<E> tail; // last link in the list
    private int size; // number of links in the list

    //constructor
    public LList()
    {
        head =  null;
        tail = null;
        size = 0;
    }

    // add a new Link that contains newData to the end of this list
    public void append(E newData)
    {
        size ++;
        Link<E> newLink = new Link<E>(newData);
        // if empty, set head and tail to newLink
        if (head == null){
            head = newLink;
            tail = newLink;
            return;
        }
        // otherwise connect current tail to newLink then set the new tail to newLink
        tail.setNext(newLink);
        tail = newLink;

    }

    // add a new Link that contains newData to the beginning of this list
    public void prepend(E newData)
    {
        size ++;
        Link<E> newLink = new Link<E>(newData);
        // if empty, set head and tail to newLink
        if (head == null){
            head = newLink;
            tail = newLink;
            return;
        } // otherwise connect newLink to current head then set the new head to newLink
        newLink.setNext(head);
        head = newLink;
    }

    // Add value to list at position 'index'; do nothing if index is out of bounds
    public void insert(int index, E value){
        if (index >= size) {
            return;
        }
    }

    // Remove and return the value at position 'index' from the list; return null if 'index' is out of bounds
    public E remove(int index){

    }

    // Return the value at position 'index'; return null if 'index' is out of bounds
    public E get(int index){
        if (index >= size){
            return null;
        }
        else if (index < size / 2) { // start at head if index is in lower half

        }
        else { // start at tail if index is in upper half

        }
    }

    // Modify the data at 'index' to replace it with 'value', return old value; return null if 'index' is out of bounds
    public E set(int index, E value){

    }

    // Return number of items in the list
    public int size(){
        return size;
    }

    public String toString()
    {
        if (head == null){
            return "Empty";
        }
        else{
            return head.toString();
        }
    }

}
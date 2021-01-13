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
    public void insert(int index, E value) {
        if (index < size) {
            Link<E> newLink = new Link<E>(value);
            if (index == 0) { // starting from head doesn't work if we want to insert something before head
                newLink.setNext(head);
                head = newLink;
                return;
            }
            Link<E> ptr = head; // point to the link which newLink will be inserted after
            for (int i = 0; i < index - 1; i ++){
                ptr = ptr.getNext();
            }
            newLink.setNext(ptr.getNext());
            ptr.setNext(newLink);
        }
    }

    // Remove and return the value at position 'index' from the list; return null if 'index' is out of bounds
    public E remove(int index){
        if (index == 0){ // head should be updated if removing first element
            E ret = head.getData();
            head = head.getNext();
            return ret;
        }
        else if (index > 0 && index < size - 1){
            Link<E> ptr = head; // point to the link before the link to be removed
            for (int i = 0; i < index - 1; i ++){
                ptr = ptr.getNext();
            }
            ptr.setNext(ptr.getNext().getNext());
            return ptr.getData();
        }
        else if (index == size - 1){ // tail should be updated if removing last element
            Link<E> ptr = head; // point to the link before tail
            for (int i = 0; i < size - 4; i ++){
                System.out.println("\t" + ptr.getData() + " " + ptr.getNext().getData());
                ptr = ptr.getNext();
            }
            ptr.setNext(null);
            tail = ptr;
            return ptr.getData();
        }
        return null;
    }

    // Return the value at position 'index'; return null if 'index' is out of bounds
    public E get(int index){
        if (index >= size) {
            return null;
        }
        else {
            Link<E> ret = head;
            for (int i = 0; i < index; i ++){
                ret = ret.getNext();
            }
            return ret.getData();
        }
    }

    // Modify the data at 'index' to replace it with 'value', return old value; return null if 'index' is out of bounds
    public E set(int index, E value){
        return null;
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
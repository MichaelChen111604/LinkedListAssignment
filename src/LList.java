public class LList<E>
{
    // attributes
    // head must always refer (point) to the first link in the list.
    private Link<E> head;

    //constructor
    public LList()
    {
        head =  null;
    }

    // add a new Link that contains newData to the end of this list
    public void append(E newData)
    {
        // if empty, set head to newData
        if (head == null){
            head = new Link<E>(newData);
            return;
        }
        // otherwise get the last element and setNext to newData
        Link<E> tail = head;
        while (tail.getNext() != null){
            tail = tail.getNext();
        }
        tail.setNext(new Link<E>(newData));
    }

    public void prepend(E newData)
    {
        Link<E> newLink = new Link<E>(newData);
        if (head != null){
            newLink.setNext(head);
        }
        head = newLink;
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
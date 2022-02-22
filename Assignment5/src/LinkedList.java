
//Exercises 3.6  , 3.12   ,  3.28
class LinkedList<E>
{
    private node<E> head=null;
    private node<E> tail=null;
    private int size=0;

    public LinkedList() {

    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public E first(){
        if(isEmpty())return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty())return null;
        return tail.getElement();

    }

    public void  addFirst(E element)
    {
        head=new node<E>(element,head);
        if (size==0)
            tail=head;
        size++;

    }

    public void addLast(E element)
    {
        node<E> x=new node<E>(element,null);
        if(size==0)
            head=x;
        else
            tail.setNext(x);
        tail=x;
        size++;
    }

    public E removeFirst()
    {
        if(isEmpty())return null;
        E del=head.getElement();
        head=head.getNext();
        size--;
        if(size==0)
            tail=null;
        return del;

    }

    public void rotate (E data){
        addLast(data);
        if (size>1)
            removeFirst();
    }

    // Finding the Second-to-last node in a Singly Linked List
    public void findSecondLastNode() {
        if (isEmpty())
            System.out.println(" Empty ");
        else {
            node<E> pointer = head.getNext();
            while (pointer.getNext() != null) {
                System.out.println(pointer.getElement());
                pointer = pointer.getNext();
            }
            System.out.println(pointer.getElement());
        }
    }

    // Reversing a Singly Linked List
     public void reverse() {
         if (head==null){
             return;
         }
         node prev = null;
         node current = head;
         node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;

    }

    public void print (){
        while (head!=null){
            System.out.println(head.getElement());
            head=head.getNext();
        }
    }




    // Node class
    private static class node<E>{
        E element ;
        node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }
    }




    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();


       ll.addLast(12);
        ll.addLast(29);
        ll.addLast(11);
        ll.addLast(23);
        ll.addLast(8);
       /* ll.findSecondLastNode();

        System.out.println(" Linked List after Rotate");
        ll.rotate(23);
        ll.findSecondLastNode();*/

        System.out.println(" Linked List after reverse" );
        ll.reverse();
        ll.print();

    }
}


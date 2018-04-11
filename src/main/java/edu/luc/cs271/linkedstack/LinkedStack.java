package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    top=new Node<E>(obj,top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO
    if(isEmpty())
      throw new NoSuchElementException();
    else
      return top.data;
  }

  @Override
  public E pop() {
    // TODO
    if(isEmpty())
      throw new NoSuchElementException();
    else{
      Node<E> toGive= top;
      top=top.next;
      return toGive.data;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return top==null;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // TODO add any instance variable(s) required to support this
    List<E> myListFromStack=new ArrayList<E>();
    Node<E> hold=top;
      while(hold!=null)
      {
        myListFromStack.add(hold.data);
        hold=hold.next;
      }

    return myListFromStack;
  }
}

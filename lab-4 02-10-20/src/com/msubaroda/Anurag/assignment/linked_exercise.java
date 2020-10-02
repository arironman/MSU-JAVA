//
package com.msubaroda.Anurag.assignment;

import java.util.*;

public class linked_exercise {

    //  Map is used to store multiple linkedList
    Map<String, LinkedList<String>> linked = new HashMap<>();

    //  Map is used to store multiple array
//    used while converting linked list to array
    Map<String, List<String>> arrays = new HashMap<>();


    Scanner sc = new Scanner(System.in);

    //    method to create linked list
    public void create_linked_list()
    {
        System.out.print("Please Enter a name for Linked List: ");
        String name  = sc.next();
        linked.put (name,new LinkedList<>());
        System.out.println("Linked List is created sucessfully !");
    }

    //    method to show Linked List
    public void show_all_elements()
    {
        System.out.print("Enter the name of Linked List which u wanna to display: ");
        String name = sc.next();
        System.out.print("The Elements of the linked " + name + " are: ");
        System.out.println(linked.get(name));
    }

    //    method to add element in linked list
    public void append_element()
    {
        System.out.print("Enter the name of the Linked List: ");
        String linked_name = sc.next();
        System.out.print("Enter the element: ");
        String element = sc.next();
        linked.get(linked_name).add(element);
        System.out.println(element + " is added sucessfully in " + linked_name);
    }


    //    add element by specifing index
    public void add()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        System.out.print("Enter the element: ");
        String element = sc.next();
        linked.get(linked_name).add(index, element);
        System.out.println(element + " is added sucessfully in " + linked_name);
    }

//    add element from first
    public void add_first()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the element: ");
        String element = sc.next();
        linked.get(linked_name).addFirst(element);
        System.out.println(element + " is added sucessfully in " + linked_name);
    }


    //    add element from first
    public void add_last()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the element: ");
        String element = sc.next();
        linked.get(linked_name).addLast(element);
        System.out.println(element + " is added sucessfully in " + linked_name);
    }



    //    first element of linked list
    public void first_element()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        String element = linked.get(linked_name).getFirst();
        System.out.println("The first Element of the " + linked_name + " Linked List is: " + element);
    }



    //    last element of linked list
    public void last_element()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        String element = linked.get(linked_name).getLast();
        System.out.println("The last Element of the " + linked_name + " Linked List is: " + element);
    }




    //   remove first element of linked list
    public void remove_first_element()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        linked.get(linked_name).removeFirst();
        System.out.println("The first Element of the " + linked_name + " Linked List is Sucessfully removed. ");
    }



    //   remove last element of linked list
    public void remove_last_element()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        linked.get(linked_name).getLast();
        System.out.println("The last Element of the " + linked_name + " Linked List is Sucessfully removed. ");
    }




    //    delete linked element
    public void remove_element_by_index()
    {
        System.out.print("Enter the linked list name: ");
        String linked_name = sc.next();
        System.out.print("The elements of the linked list are: ");
        System.out.println(linked.get(linked_name));
        System.out.print("\n Enter the index of the element which u want to remove: ");
        int index = sc.nextInt();
        linked.get(linked_name).remove(index);
        System.out.println("The element removed sucessfully.");
    }


//    remove element by element value
    public void remove_element_by_value()
    {
        System.out.print("Enter the linked list name: ");
        String linked_name = sc.next();
        System.out.print("The elements of the linked list are: ");
        System.out.println(linked.get(linked_name));
        System.out.print("\n Enter the value of the element which u want to remove: ");
        String element = sc.next();
        linked.get(linked_name).remove(element);
        System.out.println("The element removed sucessfully.");
    }



    //    update element of linked list
    public void update_element()
    {
        System.out.print("Enter the linked list name: ");
        String linked_name = sc.next();
        System.out.print("The elements of the linked are: ");
        System.out.println(linked.get(linked_name));
        System.out.print("Enter the index of element which u want to update: ");
        int index = sc.nextInt();
        System.out.print("Enter the value of new element: ");
        String new_element = sc.next();
        linked.get(linked_name).set(index, new_element);
        System.out.println("linked list get updated sucessfully.");
    }

    //    length of linked
    public void length_linked()
    {
        System.out.print("Enter the linked name: ");
        String linked_name = sc.next();
        System.out.println("The length of the linked list is: " + linked.get(linked_name).size());
    }


    //    iterate through all element
    public void iterate_linked()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        System.out.println("Index ----------> Element");
        for (int i = 0; i < linked.get(linked_name).size(); i++)
        {
            System.out.println( i + "     ----------> " + linked.get(linked_name).get(i));
        }
    }

//    iterate from specific position
    public void iterate_specific_index()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the index from where u want to start the iteration: ");
        int index = sc.nextInt();
        Iterator iter = linked.get(linked_name).listIterator(index);
        while (iter.hasNext())
            System.out.println(iter.next());
    }


//    iterate in rverse order
    public void iterate_reverse()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        Iterator iter = linked.get(linked_name).descendingIterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }


    //    get element of specific index
    public void element_index()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the Index Number: ");
        int index = sc.nextInt();
        System.out.println("Element at " + index + " is: " + linked.get(linked_name).get(index));
    }


    //    search element in linked list
    public void search_element()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the element: ");
        String element = sc.next();
        if (linked.get(linked_name).contains(element))
        {
            System.out.println("The element is present in linked list.");
        }
        else
        {
            System.out.println("The element is not found.");
        }
    }


    //    sort an linked list
    public void sort_linked()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        Collections.sort(linked.get(linked_name));
        System.out.println("The linked list is sucessfully sorted.");
    }


    //    copy linked
    public void copy_linked()
    {
        System.out.print("Enter the name of linked which elements u want to copy: ");
        String primary_linked = sc.next();
        System.out.print("Enter the name of new linked in which u want copy: ");
        String secondary_linked = sc.next();
//        Collections.copy(linked.get(primary_linked), linked.get(secondary_linked));
//        System.out.println(linked.get(secondary_linked));
//        copy is not working in linkedList so we clone linked list which means similar to copy
        linked.put(secondary_linked, (LinkedList<String>)linked.get(primary_linked).clone() );
        System.out.println("linked list copied sucessfully. ");
    }


    //    shuffle the elements of linked list
    public void shuffle_elements()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        Collections.shuffle(linked.get(linked_name));
        System.out.println("linked list Shuffle sucessfully.");
    }

    //    reverse the elements of the linked
    public void reverse_elements()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        Collections.reverse(linked.get(linked_name));
        System.out.println("Elements of the linked list are sucessfully reversed.");
    }


    //    slice the linked list element
    public void slice_linked()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int end = sc.nextInt();
        List<String> sliced_linked = linked.get(linked_name).subList(start, end);
        System.out.println("The sliced linked list is: " + sliced_linked);
    }


    //    compare two linked list
    public void compare_linked()
    {
        System.out.print("Enter the name of first linked: ");
        String linked1 = sc.next();
        System.out.print("Enter the name of second linked: ");
        String linked2 = sc.next();
        int length;
        if (linked.get(linked1).size() == linked.get(linked2).size())
        {
            length = linked.get(linked1).size();
        }
        else
        {
            System.out.println("linked are not equal.");
            length = (linked.get(linked1).size() > linked.get(linked2).size())? linked.get(linked2).size(): linked.get(linked1).size();
        }

        for (int i = 0; i < length; i++)
        {
            if (linked.get(linked1).get(i) == linked.get(linked2).get(i))
                System.out.println("Elements of index " + i + " are same.");
            else
                System.out.println("Elements  of index " + i + " are not same.");
        }

    }


    //    swap elements in linked list
    public void swap_elements()
    {
        System.out.print("Enter the linked list name: ");
        String linked_name = sc.next();
        System.out.print("Enter the index of first element: ");
        int index1 = sc.nextInt();
        System.out.print("Enter the index of second element: ");
        int index2 = sc.nextInt();
        Collections.swap(linked.get(linked_name), index1, index2);
        System.out.println("Element swap sucessfully ! ");
    }


    //    join two linked list
    public void join_linked()
    {
        System.out.print("Enter the name of first linked list: ");
        String linked1 = sc.next();
        System.out.print("Enter the name of second linked list: ");
        String linked2 = sc.next();
        System.out.print("Enter the name of new linked list: ");
        String new_linked = sc.next();
        linked.put (new_linked,new LinkedList<> ());
        linked.get(new_linked).addAll(linked.get(linked1));
        linked.get(new_linked).addAll(linked.get(linked2));
        System.out.println("All the Elements are added sucessfully in new linked list.");
    }


    //    clone the linked list
    public void clone_linked()
    {
        System.out.print("Enter the name of new linked list: ");
        String new_linked = sc.next();
        System.out.print("Enter the name of linked list with whom u want to clone: ");
        String linked_main = sc.next();
        linked.put(new_linked, (LinkedList<String>)linked.get(linked_main).clone() );
//        linked.get(new_linked) = (linkedList)linked.get(linked_main).clone();
        System.out.println("Linked list clone sucessfully.");
    }



    //    empty an linked list
    public void empty_linked()
    {
        System.out.print("Enter the name of the linked list: ");
        String linked_name = sc.next();
        linked.get(linked_name).clear();
        System.out.println("The linked list is empty now.");
    }


    //    check empty or not
    public void empty_check()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        String message = (linked.get(linked_name).isEmpty())?"linked List is Empty": "linked List is not Empty";
        System.out.println(message);
    }



    //    convert linked list to array
    public void linked_list_to_array()
    {
        System.out.print("Enter the name of linked list: ");
        String linked_name = sc.next();
        System.out.print("Enter the name of new array: ");
        String array_name = sc.next();
        arrays.put (array_name,new ArrayList<String>(linked.get(linked_name)));
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //       create the object of class linked list to access the methods
        linked_exercise object = new linked_exercise();
        while (true)
        {
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t Menu");
            System.out.println("Press ---------------> Option                              ||    Press ---------------> Option");
            System.out.println(" 1 ------------------> To Create Linked List               ||     16 -----------------> To Iterate Starting From Specific Index ");
            System.out.println(" 2 ------------------> To Show Linked List                 ||     17 -----------------> To Iterate Reverse ");
            System.out.println(" 3 ------------------> To Append Linked List               ||     18 -----------------> To Get The Element By Index ");
            System.out.println(" 4 ------------------> To Add Element At Specific Index    ||     19 -----------------> To Search The Element In Linked List ");
            System.out.println(" 5 ------------------> To Add Element At First             ||     20------------------> To Sort The Elements Of Linked List ");
            System.out.println(" 6 ------------------> To Add Element At Last              ||     21 -----------------> To Copy The Linked List ");
            System.out.println(" 7 ------------------> To Show First Element               ||     22 -----------------> To Shuffle The Elements Of Linked List ");
            System.out.println(" 8 ------------------> To Show Last Element                ||     23 -----------------> To Reverse The Elements Of The Linked List ");
            System.out.println(" 9 ------------------> To Remove First Element             ||     24 -----------------> To Slice The Linked List");
            System.out.println(" 10 -----------------> To Remove Last Element              ||     25 -----------------> To Compare The Linked Lists");
            System.out.println(" 11 -----------------> To Remove Element By Index          ||     26 -----------------> To Swap The Elements Of Linked List ");
            System.out.println(" 12 -----------------> To Remove Element By Value          ||     27 -----------------> To Join The Two Linked List ");
            System.out.println(" 13 -----------------> To Update Element                   ||     28 -----------------> To Clone The Linked List ");
            System.out.println(" 14 -----------------> To Get The Length Of Linked List    ||     29 -----------------> To Empty The Linked List ");
            System.out.println(" 15 -----------------> To Iterate Over Linked List         ||     30 -----------------> To Check The Linked List Is Empty Or Not ");
            System.out.println(" 0 ------------------> To Exit The Program                 ||     31 -----------------> To Convert The Linked List Into Array. ");



//            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ur Choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:      object.create_linked_list();
                    break;
                case 2:      object.show_all_elements();
                    break;
                case 3:      object.append_element();
                    break;
                case 4:      object.add();
                    break;
                case 5:      object.add_first();
                    break;
                case 6:      object.add_last();
                    break;
                case 7:      object.first_element();
                    break;
                case 8:      object.last_element();
                    break;
                case 9:      object.remove_first_element();
                    break;
                case 10:     object.remove_last_element();
                    break;
                case 11:     object.remove_element_by_index();
                    break;
                case 12:     object.remove_element_by_value();
                    break;
                case 13:     object.update_element();
                    break;
                case 14:     object.length_linked();
                    break;
                case 15:     object.iterate_linked();
                    break;
                case 16:     object.iterate_specific_index();
                    break;
                case 17:     object.iterate_reverse();
                    break;
                case 18:     object.element_index();
                    break;
                case 19:     object.search_element();
                    break;
                case 20:     object.sort_linked();
                    break;
                case 21:     object.copy_linked();
                    break;
                case 22:     object.shuffle_elements();
                    break;
                case 23:     object.reverse_elements();
                    break;
                case 24:     object.slice_linked();
                    break;
                case 25:     object.compare_linked();
                    break;
                case 26:     object.swap_elements();
                    break;
                case 27:     object.join_linked();
                    break;
                case 28:     object.clone_linked();
                    break;
                case 29:     object.empty_linked();
                    break;
                case 30:     object.empty_check();
                    break;
                case 31:     object.linked_list_to_array();
                    break;
                case 0:     System.exit(0);
                default:
                    System.out.println("Try Again !");
            }
        }



    }

}

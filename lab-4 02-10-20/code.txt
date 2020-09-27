package com.msubaroda.Anurag.assignment;

import java.util.*;


public class Main {

    //  Map is used to store multiple arrayList
    Map<String, ArrayList<String>> arrays = new HashMap<>();


    Scanner sc = new Scanner(System.in);
    //    method to create array
    public void create_array()
    {
        System.out.print("Please Enter a name for array: ");
        String name  = sc.next();
        arrays.put (name,new ArrayList<> ());
        System.out.println("Array is created sucessfully !");
    }

    //    method to show array
    public void show_array()
    {
        System.out.print("Enter the name of array whic u wanna to display: ");
        String name = sc.next();
        System.out.print("The Elements of the array " + name + " are: ");
        System.out.println(arrays.get(name));
    }

    //    method to add element in array
    public void append_element()
    {
        System.out.print("Enter the name of the array: ");
        String array_name = sc.next();
        System.out.print("Enter the element: ");
        String element = sc.next();
        arrays.get(array_name).add(element);
        System.out.println(element + " is added sucessfully in " + array_name);
    }


    //    add element by specifing index
    public void add()
    {
        System.out.print("Enter the name of the array: ");
        String array_name = sc.next();
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        System.out.print("Enter the element: ");
        String element = sc.next();
        arrays.get(array_name).add(index, element);
        System.out.println(element + " is added sucessfully in " + array_name);
    }

    //    delete array element
    public void remove_element()
    {
        System.out.print("Enter the array name: ");
        String array_name = sc.next();
        System.out.print("The elements of the array are: ");
        System.out.println(arrays.get(array_name));
        System.out.print("\n Enter the index of the element which u want to remove: ");
        int index = sc.nextInt();
        arrays.get(array_name).remove(index);
        System.out.println("The element removed sucessfully.");
    }


    //    update element of array
    public void update_element()
    {
        System.out.print("Enter the array name: ");
        String array_name = sc.next();
        System.out.print("The elements of the array are: ");
        System.out.println(arrays.get(array_name));
        System.out.print("Enter the index of element which u want to update: ");
        int index = sc.nextInt();
        System.out.print("Enter the value of new element: ");
        String new_element = sc.next();
        arrays.get(array_name).set(index, new_element);
        System.out.println("Array get updated sucessfully.");
    }

    //    length of array
    public void length_array()
    {
        System.out.print("Enter the array name: ");
        String array_name = sc.next();
        System.out.println("The length of the array is: " + arrays.get(array_name).size());
    }


    //    iterate through all element
    public void iterate_array()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        System.out.println("Index ----------> Element");
        for (int i = 0; i < arrays.get(array_name).size(); i++)
        {
            System.out.println( i + "     ----------> " + arrays.get(array_name).get(i));
        }
    }


    //    get element of specific index
    public void element_index()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        System.out.print("Enter the Index Number: ");
        int index = sc.nextInt();
        System.out.println("Element at " + index + " is: " + arrays.get(array_name).get(index));
    }


    //    search element in array
    public void search_element()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        System.out.print("Enter the element: ");
        String element = sc.next();
        if (arrays.get(array_name).contains(element))
        {
            System.out.println("The element is present in array.");
        }
        else
        {
            System.out.println("The element is not found.");
        }
    }


    //    sort an array
    public void sort_array()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        Collections.sort(arrays.get(array_name));
        System.out.println("The array is sucessfully sorted.");
    }


    //    copy array
    public void copy_array()
    {
        System.out.print("Enter the name of array which elements u want to copy: ");
        String primary_array = sc.next();
        System.out.print("Enter the name of new array in which u want copy: ");
        String secondary_array = sc.next();
//        Collections.copy(arrays.get(primary_array), arrays.get(secondary_array));
//        System.out.println(arrays.get(secondary_array));
//        copy is not working in arrayList so we clone array wich means similar to copy
        arrays.put(secondary_array, (ArrayList<String>)arrays.get(primary_array).clone() );
        System.out.println("Array copied sucessfully. ");
    }


    //    shuffle the elements
    public void shuffle_elements()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        Collections.shuffle(arrays.get(array_name));
        System.out.println("Array Shuffle sucessfully.");
    }

    //    reverse the elements of the array
    public void reverse_elements()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        Collections.reverse(arrays.get(array_name));
        System.out.println("Elements of the Array are sucessfully reversed.");
    }


    //    slice the array element
    public void slice_array()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        System.out.print("Enter the starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int end = sc.nextInt();
        List<String> sliced_array = arrays.get(array_name).subList(start, end);
        System.out.println("The sliced array list is: " + sliced_array);
    }


    //    compare two array list
    public void compare_arrays()
    {
        System.out.print("Enter the name of first array: ");
        String array1 = sc.next();
        System.out.print("Enter the name of second array: ");
        String array2 = sc.next();
        int length;
        if (arrays.get(array1).size() == arrays.get(array2).size())
        {
            length = arrays.get(array1).size();
        }
        else
        {
            System.out.println("Arrays are not equal.");
            length = (arrays.get(array1).size() > arrays.get(array2).size())? arrays.get(array2).size(): arrays.get(array1).size();
        }

        for (int i = 0; i < length; i++)
        {
            if (arrays.get(array1).get(i) == arrays.get(array2).get(i))
                System.out.println("Elements of index " + i + " are same.");
            else
                System.out.println("Elements  of index " + i + " are not same.");
        }

    }


    //    swap elements in array
    public void swap_elements()
    {
        System.out.print("Enter the array name: ");
        String array_name = sc.next();
        System.out.print("Enter the index of first element: ");
        int index1 = sc.nextInt();
        System.out.print("Enter the index of second element: ");
        int index2 = sc.nextInt();
        Collections.swap(arrays.get(array_name), index1, index2);
        System.out.println("Element swap sucessfully ! ");
    }


    //    join two array
    public void join_array()
    {
        System.out.print("Enter the name of first array: ");
        String array1 = sc.next();
        System.out.print("Enter the name of second array: ");
        String array2 = sc.next();
        System.out.print("Enter the name of new array list: ");
        String new_array = sc.next();
        arrays.put (new_array,new ArrayList<> ());
        arrays.get(new_array).addAll(arrays.get(array1));
        arrays.get(new_array).addAll(arrays.get(array2));
        System.out.println("All the Elements are addes sucessfully in new array.");
    }


    //    clone the arraylist
    public void clone_array()
    {
        System.out.print("Enter the name of new array list: ");
        String new_array = sc.next();
        System.out.print("Enter the name of array list with whom u want to clone: ");
        String array_main = sc.next();
        arrays.put(new_array, (ArrayList<String>)arrays.get(array_main).clone() );
//        arrays.get(new_array) = (ArrayList)arrays.get(array_main).clone();

    }



    //    empty an array list
    public void empty_array()
    {
        System.out.print("Enter the name of the array: ");
        String array_name = sc.next();
        arrays.get(array_name).clear();
        System.out.println("The array list is empty now.");
    }


    //    check empty or not
    public void empty_check()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        String message = (arrays.get(array_name).isEmpty())?"Array List is Empty": "Array List is not Empty";
        System.out.println(message);
    }


    //   trim array to current size
    public void trim_to_size()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        arrays.get(array_name).trimToSize();
        System.out.println("The array is getted trimmed to its current size.");
    }

    //   increase the size of array
    public void resize()
    {
        System.out.print("Enter the name of array: ");
        String array_name = sc.next();
        System.out.print("Enter the new size of array: ");
        int size = sc.nextInt();
        arrays.get(array_name).ensureCapacity(size);
        System.out.println("The array is resized.");
    }



    public static void main(String[] args)
    {
//       create the object of array to access the methods
        Main object = new Main();
        while (true)
        {
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t Menu");
            System.out.println("Press ---------------> Option                              ||    Press ---------------> Option");
            System.out.println(" 1 ------------------> To Create Array                     ||     13 -----------------> To Shuffle The Elements Of Array ");
            System.out.println(" 2 ------------------> To Show Array                       ||     14 -----------------> To Reverse The Elements Of Array ");
            System.out.println(" 3 ------------------> To Append Element                   ||     15 -----------------> To Slice The Array ");
            System.out.println(" 4 ------------------> To Add Element At Specific Index    ||     16 -----------------> To Compare The Elements Of Array ");
            System.out.println(" 5 ------------------> To Remove Element                   ||     17------------------> To Swap The Element ");
            System.out.println(" 6 ------------------> To Update Element                   ||     18 -----------------> To Join Two Array And Get As New Array ");
            System.out.println(" 7 ------------------> To Get The Length Of Array          ||     19 -----------------> To Clone The Array ");
            System.out.println(" 8 ------------------> To Iterate Through All The Elements ||     20 -----------------> To Empty Array ");
            System.out.println(" 9 ------------------> To Get Element Of Specifix Index    ||     21 -----------------> To Check The Array Is Empty Or Not");
            System.out.println(" 10 -----------------> To Search Element                   ||     22 -----------------> To Trim The Size Of Array To Its Current Length");
            System.out.println(" 11 -----------------> To Sort Array                       ||     23 -----------------> To Resize The Array ");
            System.out.println(" 12 -----------------> To Copy Array                       ||     24 -----------------> To Exit The Program ");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ur Choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:      object.create_array();
                    break;
                case 2:      object.show_array();
                    break;
                case 3:      object.append_element();
                    break;
                case 4:      object.add();
                    break;
                case 5:      object.remove_element();
                    break;
                case 6:      object.update_element();
                    break;
                case 7:      object.length_array();
                    break;
                case 8:      object.iterate_array();
                    break;
                case 9:      object.element_index();
                    break;
                case 10:     object.search_element();
                    break;
                case 11:     object.sort_array();
                    break;
                case 12:     object.copy_array();
                    break;
                case 13:     object.shuffle_elements();
                    break;
                case 14:     object.reverse_elements();
                    break;
                case 15:     object.slice_array();
                    break;
                case 16:     object.compare_arrays();
                    break;
                case 17:     object.swap_elements();
                    break;
                case 18:     object.join_array();
                    break;
                case 19:     object.clone_array();
                    break;
                case 20:     object.empty_array();
                    break;
                case 21:     object.empty_check();
                    break;
                case 22:     object.trim_to_size();
                    break;
                case 23:     object.resize();
                    break;
                case 24:     System.exit(0);
                default:
                    System.out.println("Try Again !");
            }
        }



    }
}

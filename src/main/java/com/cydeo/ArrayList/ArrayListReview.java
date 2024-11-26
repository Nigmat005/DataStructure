package com.cydeo.ArrayList;

import java.util.*;

public class ArrayListReview  {
    public static void sortByID(List<Student> studentsList){
        System.out.println("===================sorting by Id=========================");
        Comparator<Student> sortByID=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getId()>o2.getId()){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
        Collections.sort(studentsList,sortByID);
    }

    public static void sortByName(List<Student> students){
        System.out.println("===================sorting by name=========================");
        Comparator<Student> sortByName=(student1, student2)->{
            return student1.getName().compareTo(student2.getName());
        };
        Collections.sort(students,sortByName);
    }


    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));

        for(Student eachStudent: students){
            System.out.println(eachStudent);
        }

        Iterator<Student> studentIterator=students.iterator();

//        System.out.println("=================== With Forward Iterator  =============================");
//        while(studentIterator.hasNext()){
//            ArrayList.Student s1=studentIterator.next();
//            if(s1.name.equalsIgnoreCase("Ronnie")){
//                studentIterator.remove();
//            }
//        }
//        System.out.println(students);


        System.out.println("=================== With Backward Iterator  =============================");
        Iterator<Student> studentIterator_backWard=students.listIterator(students.size());

        while(((ListIterator<Student>) studentIterator_backWard).hasPrevious()){
            Student s1= ((ListIterator<Student>) studentIterator_backWard).previous();
//            if(s1.name.equalsIgnoreCase("Ronnie")){
////                studentIterator_backWard.remove();
////            }
            System.out.println(s1);
        }
//        System.out.println(students);

        System.out.println("=================== With Lambda  =============================");
        students.forEach(System.out::println);

        System.out.println("=================== Sorting Custom class Element in list  =============================");

//        List<Integer> demoList=new ArrayList<>(Arrays.asList(1,5,8,9,10,23,55));
//        Collections.sort(demoList);
//        Collections.reverse(demoList);
//        demoList.forEach(System.out::println);

        students.add(new Student(6,"Kelly"));
        students.add(new Student(8,"Jessica"));
        students.add(new Student(5,"David"));
        students.add(new Student(7,"Bob"));

//        ArrayList.ArrayListReview.sortByID(students);
//        students.forEach(System.out::println);
//
//        ArrayList.ArrayListReview.sortByName(students);
//        students.forEach(System.out::println);
        Collections.sort(students,new sortId_Desc());
        System.out.println("====================Print sort by ID Desc============");
        students.forEach(System.out::println);

        Collections.sort(students,new sortName_Desc());
        System.out.println("====================Print sort by Name Desc============");
        students.forEach(System.out::println);
    }
    static class sortId_Desc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
//            if(o2.getId()<o1.getId()){
//                return -1;
//            }
//            else{
//                return 1;
//            }
            return o2.getId()-o1.getId();
        }
    }

    static class sortName_Desc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }
}
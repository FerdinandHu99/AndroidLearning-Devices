package com.ferdinand;

import com.ferdinand.Student;

interface IHelloService {
      void sayhello();
      int sayhello_to(String name);
      int printList(in List<String> strs);
      int printMap(in Map maps);
      int printStudent(in Student student);
}

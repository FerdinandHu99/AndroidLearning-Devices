package com.ferdinand;

import com.ferdinand.Student;

interface IHelloService {
      void sayhello();
      int sayhello_to(String name);
      int printList(in List<String> strs);
      int printMap(in Map maps);
      int printStudent(in Student student);

      int printStudent_in(in Student student);
      int printStudent_out(out Student student);
      int printStudent_inout(inout Student student);
      oneway void printStudent_oneway(in Student student);
}
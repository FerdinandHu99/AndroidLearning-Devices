package com.ferdinand;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
      int age;
      String name;

      @Override
      public int describeContents() {
            return 0;
      }

      @Override
      public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(age);
            dest.writeString(name);
      }

      public Student() {

      }

      protected Student(Parcel in) {
            this.age = in.readInt();
            this.name = in.readString();
      }

      public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
            @Override
            public Student createFromParcel(Parcel source) {
                  return new Student(source);
            }

            @Override
            public Student[] newArray(int size) {
                  return new Student[size];
            }
      };
}

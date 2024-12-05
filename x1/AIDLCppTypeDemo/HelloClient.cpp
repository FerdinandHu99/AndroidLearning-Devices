#define LOG_TAG "aidl_cpp"

#include <stdlib.h>
#include <utils/RefBase.h>
#include <utils/Log.h>
#include <binder/TextOutput.h>
#include <binder/IInterface.h>
#include <binder/IBinder.h>
#include <binder/ProcessState.h>
#include <binder/IServiceManager.h>
#include <binder/IPCThreadState.h>

#include "com/ferdinand/IHelloService.h"
#include "com/ferdinand/BpHelloService.h"
#include "com/ferdinand/Student.h"

using namespace android;

int main() {
      sp<com::ferdinand::IHelloService> service = interface_cast<com::ferdinand::IHelloService>(
            android::defaultServiceManager()->getService(String16("hello"))
      );

      int res = 0;

      service->sayhello();
      service->sayhello_to(android::String16("ferdinand"), &res);

      std::vector<android::String16> strs;
      strs.emplace_back("hello");
      strs.emplace_back("world");
      service->printList(strs, &res);

      binder::Map maps;
      maps.insert(binder::Map::value_type("test", binder::Value("value")));
      // maps.insert("key2", "value2");
      service->printMap(maps, &res);

      com::ferdinand::Student student;
      student.setAge(20);
      student.setName(String16("ferdinand"));
      service->printStudent(student, &res);

      com::ferdinand::Student student_in;
      student_in.setAge(20);
      student_in.setName(String16("ferdinand"));
      service->printStudent_in(student_in, &res);

      com::ferdinand::Student student_out;
      ALOGI("before HelloService printStudent_out name %s, age %d", String8(student_out.getName()).string(), student_out.getAge());
      service->printStudent_out(&student_out, &res);
      ALOGI("after HelloService printStudent_out name %s, age %d", String8(student_out.getName()).string(), student_out.getAge());

      com::ferdinand::Student student_inout;
      student_inout.setAge(20);
      student_inout.setName(String16("Ferdinand"));
      ALOGI("before HelloService printStudent_inout name %s, age %d", String8(student_inout.getName()).string(), student_inout.getAge());
      service->printStudent_inout(&student_inout, &res);
      ALOGI("after HelloService printStudent_inout name %s, age %d", String8(student_inout.getName()).string(), student_inout.getAge());

      com::ferdinand::Student student_oneway;
      student_oneway.setAge(20);
      student_oneway.setName(String16("Ferdinand"));
      service->printStudent_oneway(student_oneway);

      return 0;
}

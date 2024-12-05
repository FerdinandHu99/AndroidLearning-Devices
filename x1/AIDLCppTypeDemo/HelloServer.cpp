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
#include "com/ferdinand/BnHelloService.h"

using namespace android;

//定义服务端
class HelloServer : public com::ferdinand::BnHelloService {
public:
      binder::Status sayhello() override {
          ALOGI("HelloService sayhello");
          return binder::Status();
      }

      binder::Status sayhello_to(const android::String16& name, int32_t* _aidl_return) override {
          ALOGI("HelloService sayhello %s", String8(name).string());
          *_aidl_return = 1;
          return binder::Status();
      }

      binder::Status printList(const std::vector<android::String16>& strs, int32_t* _aidl_return) override {
            for (const auto& str : strs) {
                  ALOGI("HelloService printList %s", String8(str).string());
            }
            *_aidl_return = 1;
            return binder::Status();
      }

      binder::Status printMap(const binder::Map& maps, int32_t* _aidl_return) override {
            for (const auto& entry : maps) {
                  auto key = entry.first;
                  std::string value;
                  entry.second.getString(&value);
                  ALOGI("HelloService printMap key %s, value %s", key.c_str(), value.c_str());
            }
            *_aidl_return = 1;
            return binder::Status();
      }

      binder::Status printStudent(const com::ferdinand::Student& student, int32_t* _aidl_return) override {
            ALOGI("HelloService printStudent name %s, age %d", String8(student.getName()).string(), student.getAge());
            *_aidl_return = 1;
            return binder::Status();
      }

      binder::Status printStudent_in(const com::ferdinand::Student& student, int32_t* _aidl_return) override {
            // student.setName(String16("ferdinand"));
            // student.setAge(18);
            ALOGI("HelloService printStudent_in name %s, age %d", String8(student.getName()).string(), student.getAge());
            *_aidl_return = 1;
            return binder::Status();
      }

      binder::Status printStudent_out(com::ferdinand::Student* student, int32_t* _aidl_return) override {
            student->setName(String16("ferdinand"));
            student->setAge(18);
            *_aidl_return = 1;
            return binder::Status();
      }

      binder::Status printStudent_inout(com::ferdinand::Student* student, int32_t* _aidl_return) override {
            student->setName(String16("ferdinand"));
            student->setAge(18);
            *_aidl_return = 1;
            return binder::Status();
      }

      binder::Status printStudent_oneway(const com::ferdinand::Student& student) override {
            // student.setName(String16("ferdinand"));
            // student.setAge(18);
            ALOGI("HelloService printStudent_oneway name %s, age %d", String8(student.getName()).string(), student.getAge());
            return binder::Status();
      }
};

int main(int argc, char const *argv[]) {
    defaultServiceManager()->addService(String16("hello"), new HelloServer());
    ProcessState::self()->startThreadPool();
    IPCThreadState::self()->joinThreadPool();
    return 0;
}
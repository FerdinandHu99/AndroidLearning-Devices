#ifndef AIDL_GENERATED_COM_FERDINAND_I_HELLO_SERVICE_H_
#define AIDL_GENERATED_COM_FERDINAND_I_HELLO_SERVICE_H_

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Map.h>
#include <binder/Status.h>
#include <binder/Value.h>
#include <com/ferdinand/Student.h>
#include <cstdint>
#include <utils/String16.h>
#include <utils/StrongPointer.h>
#include <vector>

namespace com {

namespace ferdinand {

class IHelloService : public ::android::IInterface {
public:
  DECLARE_META_INTERFACE(HelloService)
  virtual ::android::binder::Status sayhello() = 0;
  virtual ::android::binder::Status sayhello_to(const ::android::String16& name, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status printList(const ::std::vector<::android::String16>& strs, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status printMap(const ::android::binder::Map& maps, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status printStudent(const ::com::ferdinand::Student& student, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status printStudent_in(const ::com::ferdinand::Student& student, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status printStudent_out(::com::ferdinand::Student* student, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status printStudent_inout(::com::ferdinand::Student* student, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status printStudent_oneway(const ::com::ferdinand::Student& student) = 0;
};  // class IHelloService

class IHelloServiceDefault : public IHelloService {
public:
  ::android::IBinder* onAsBinder() override;
  ::android::binder::Status sayhello() override;
  ::android::binder::Status sayhello_to(const ::android::String16& name, int32_t* _aidl_return) override;
  ::android::binder::Status printList(const ::std::vector<::android::String16>& strs, int32_t* _aidl_return) override;
  ::android::binder::Status printMap(const ::android::binder::Map& maps, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent(const ::com::ferdinand::Student& student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_in(const ::com::ferdinand::Student& student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_out(::com::ferdinand::Student* student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_inout(::com::ferdinand::Student* student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_oneway(const ::com::ferdinand::Student& student) override;

};

}  // namespace ferdinand

}  // namespace com

#endif  // AIDL_GENERATED_COM_FERDINAND_I_HELLO_SERVICE_H_

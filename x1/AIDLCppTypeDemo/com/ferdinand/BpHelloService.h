#ifndef AIDL_GENERATED_COM_FERDINAND_BP_HELLO_SERVICE_H_
#define AIDL_GENERATED_COM_FERDINAND_BP_HELLO_SERVICE_H_

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <utils/Errors.h>
#include <com/ferdinand/IHelloService.h>

namespace com {

namespace ferdinand {

class BpHelloService : public ::android::BpInterface<IHelloService> {
public:
  explicit BpHelloService(const ::android::sp<::android::IBinder>& _aidl_impl);
  virtual ~BpHelloService() = default;
  ::android::binder::Status sayhello() override;
  ::android::binder::Status sayhello_to(const ::android::String16& name, int32_t* _aidl_return) override;
  ::android::binder::Status printList(const ::std::vector<::android::String16>& strs, int32_t* _aidl_return) override;
  ::android::binder::Status printMap(const ::android::binder::Map& maps, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent(const ::com::ferdinand::Student& student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_in(const ::com::ferdinand::Student& student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_out(::com::ferdinand::Student* student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_inout(::com::ferdinand::Student* student, int32_t* _aidl_return) override;
  ::android::binder::Status printStudent_oneway(const ::com::ferdinand::Student& student) override;
};  // class BpHelloService

}  // namespace ferdinand

}  // namespace com

#endif  // AIDL_GENERATED_COM_FERDINAND_BP_HELLO_SERVICE_H_

#ifndef AIDL_GENERATED_COM_FERDINAND_BP_HELLO_H_
#define AIDL_GENERATED_COM_FERDINAND_BP_HELLO_H_

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <utils/Errors.h>
#include <com/ferdinand/IHello.h>

namespace com {

namespace ferdinand {

class BpHello : public ::android::BpInterface<IHello> {
public:
  explicit BpHello(const ::android::sp<::android::IBinder>& _aidl_impl);
  virtual ~BpHello() = default;
  ::android::binder::Status hello() override;
  ::android::binder::Status sum(int32_t x, int32_t y, int32_t* _aidl_return) override;
  ::android::binder::Status registerCallback(const ::android::sp<::com::ferdinand::ICallback>& cb) override;
};  // class BpHello

}  // namespace ferdinand

}  // namespace com

#endif  // AIDL_GENERATED_COM_FERDINAND_BP_HELLO_H_

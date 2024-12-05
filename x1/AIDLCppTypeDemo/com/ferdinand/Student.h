#ifndef _COM_FERDINAND_STUDENT_H_
#define _COM_FERDINAND_STUDENT_H_

#include <utils/RefBase.h>
#include <android-base/unique_fd.h>
#include <binder/Parcel.h>
#include <binder/Parcelable.h>
#include <binder/Status.h>
#include <vector>

using namespace std;
using namespace android;

namespace com {
namespace ferdinand {

class Student : public Parcelable {
public:
      Student();
      virtual ~Student();

      virtual status_t writeToParcel(Parcel* parcel) const override;
      virtual status_t readFromParcel(const Parcel* parcel) override;

      void setAge(int32_t age);
      int32_t getAge() const;
      void setName(String16 name);
      String16 getName() const;

private:
      int32_t mAge;
      String16 mName;
};

}
}
#endif  // _COM_FERDINAND_STUDENT_H_
#include "Student.h"
#include "sys/types.h"
#include "sys/stat.h"
#include "fcntl.h"

using namespace std;
using namespace android;

namespace com {
namespace ferdinand {   
      Student::Student(){
            this->mAge = 25;
            this->mName = String16("Ferdinand");
      }

      Student::~Student(){}

      status_t Student::writeToParcel(Parcel* parcel) const {
            status_t err;
            err = parcel->writeInt32(mAge);
            if (err != NO_ERROR) {
                  return err;
            }
            err = parcel->writeString16(mName);
            if (err != NO_ERROR) {
                  return err;
            }
            return NO_ERROR;
      }

      status_t Student::readFromParcel(const Parcel* parcel) {
            status_t err;
            err = parcel->readInt32(&mAge);
            if (err != NO_ERROR) {
                  return err;
            }
            err = parcel->readString16(&mName);
            if (err != NO_ERROR) {
                  return err;
            }
            return NO_ERROR;
      }

      void Student::setAge(int32_t age){
            mAge = age;
      }
      int32_t Student::getAge() const {
            return mAge;
      }
      void Student::setName(String16 name) {
            mName = name;
      }
      String16 Student::getName() const {
            return mName;
      }
}
}
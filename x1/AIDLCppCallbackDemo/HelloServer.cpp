#define LOG_TAG "aidl_cpp"
#include <log/log.h>
#include <stdlib.h>
#include <utils/RefBase.h>
#include <utils/Log.h>
#include <binder/TextOutput.h>
#include <binder/IInterface.h>
#include <binder/IBinder.h>
#include <binder/ProcessState.h>
#include <binder/IServiceManager.h>
#include <binder/IPCThreadState.h>

#include "com/ferdinand/IHello.h"
#include "com/ferdinand/BnHello.h"
#include "com/ferdinand/ICallback.h"
#include "com/ferdinand/BpCallback.h"

using namespace android;

//定义服务端
class IHelloServer : public com::ferdinand::BnHello
{
private:
    //回调接口
    sp<com::ferdinand::ICallback> mCallback;
public:
    binder::Status hello() override
    {
        ALOGI("hello");
        return binder::Status();
    }
    binder::Status sum(int32_t v1, int32_t v2, int32_t *_aidl_return) override
    {
        ALOGI("server: sum: %d + %d", v1, v2);
        *_aidl_return = v1 + v2;

        //使用回调接口
        if(mCallback.get() != nullptr) {
            mCallback->onCallback(String16("str from server"));
        }

        return binder::Status();
    }
    //注册回调接口
    binder::Status registerCallback(const sp<::com::ferdinand::ICallback>& cb) override 
    {
        ALOGI("Server registerCallback");
        mCallback = cb;
        return binder::Status();
    }
};

int main(int argc, char const *argv[])
{   
    ALOGD("HelloServer is running");
    defaultServiceManager()->addService(String16("IHello"), new IHelloServer());
    ProcessState::self()->startThreadPool();
    IPCThreadState::self()->joinThreadPool();
    return 0;
}
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
#include "com/ferdinand/BpHello.h"

using namespace android;

int main(int argc, char const *argv[])
{
    sp<IServiceManager> sm = defaultServiceManager();
    sp<IBinder> binder = sm->getService(String16("MyHelloService"));
    sp<com::ferdinand::IHello> hello = interface_cast<com::ferdinand::IHello>(binder);

    hello->hello();
    int ret = 0;
    hello->sum(1, 2, &ret);
    return 0;
}
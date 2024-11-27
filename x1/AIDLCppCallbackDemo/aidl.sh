#!/bin/bash

aidl-cpp com/ferdinand/ICallback.aidl ./ ./ICallback.cpp
aidl-cpp -I./com/ferdinand com/ferdinand/IHello.aidl ./ ./IHello.cpp
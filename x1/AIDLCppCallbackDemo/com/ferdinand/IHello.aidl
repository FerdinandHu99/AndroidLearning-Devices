package com.ferdinand;

import com.ferdinand.ICallback;

interface IHello
{
    void hello();
    int sum(int x, int y);
    void registerCallback(ICallback cb);
}
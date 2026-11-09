package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractFuture abstractFuture, long j6, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j6, obj, obj2)) {
            if (unsafe.getObject(abstractFuture, j6) != obj) {
                return false;
            }
        }
        return true;
    }
}

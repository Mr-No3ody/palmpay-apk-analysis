package com.didi.drouter.store;

import U2.B;
import android.content.Context;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IRouterProxy {
    Object callMethod(Object instance, String methodName, Object[] args) throws B;

    Object newInstance(Context context);
}

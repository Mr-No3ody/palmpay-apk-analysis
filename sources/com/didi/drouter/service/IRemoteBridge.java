package com.didi.drouter.service;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractC1205o;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IRemoteBridge {
    <T> T getService(@NonNull p031c2.a strategy, AbstractC1205o lifecycle, Class<T> serviceClass, String alias, Object feature, @Nullable Object... constructor);
}

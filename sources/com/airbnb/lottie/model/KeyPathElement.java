package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;
import p192n.c;
import p212o1.e;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface KeyPathElement {
    <T> void addValueCallback(T t, @Nullable p243q1.c cVar);

    void resolveKeyPath(e eVar, int i7, List<e> list, e eVar2);
}

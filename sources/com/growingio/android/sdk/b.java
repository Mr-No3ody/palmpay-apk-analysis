package com.growingio.android.sdk;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public <T> T getConfiguration(Class<? extends Configurable> cls) {
        return (T) ((HashMap) p279s5.d.b().f42026c).get(cls);
    }

    public void registerComponents(Context context, p247q5.c registry) {
    }
}

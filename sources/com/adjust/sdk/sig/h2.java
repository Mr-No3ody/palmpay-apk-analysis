package com.adjust.sdk.sig;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f19459a;

    static {
        i2 i2Var;
        try {
            i2Var = (i2) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            i2Var = null;
        }
        if (i2Var == null) {
            i2Var = new i2();
        }
        f19459a = i2Var;
    }
}

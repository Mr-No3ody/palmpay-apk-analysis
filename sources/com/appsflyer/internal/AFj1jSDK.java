package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1jSDK implements AFj1hSDK {
    @Override // com.appsflyer.internal.AFj1hSDK
    @NotNull
    public final String getMediationNetwork() {
        Object objF;
        try {
            o oVar = q.f43977a;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.f(obj, "");
            objF = (String) obj;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        return (String) (objF instanceof p ? "" : objF);
    }
}

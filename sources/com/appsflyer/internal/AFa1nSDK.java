package com.appsflyer.internal;

import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK getMediationNetwork;
    private final Object getMonetizationNetwork = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        try {
            if (getMediationNetwork == null) {
                getMediationNetwork = new AFa1nSDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return getMediationNetwork;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.getMonetizationNetwork) {
            str2 = (String) super.put(num, str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean zRemove;
        synchronized (this.getMonetizationNetwork) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(@Nullable Object obj) {
        String str;
        synchronized (this.getMonetizationNetwork) {
            str = (String) super.remove(obj);
        }
        return str;
    }
}

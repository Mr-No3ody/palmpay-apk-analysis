package org.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements SignatureImpl$Cache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SoftReference f41005a;

    @Override // org.aspectj.runtime.reflect.SignatureImpl$Cache
    public final String get(int i7) {
        String[] strArr = (String[]) this.f41005a.get();
        if (strArr == null) {
            return null;
        }
        return strArr[i7];
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl$Cache
    public final void set(int i7, String str) {
        String[] strArr = (String[]) this.f41005a.get();
        if (strArr == null) {
            strArr = new String[3];
            this.f41005a = new SoftReference(strArr);
        }
        strArr[i7] = str;
    }
}

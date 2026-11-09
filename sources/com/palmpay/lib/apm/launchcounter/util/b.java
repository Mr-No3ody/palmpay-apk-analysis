package com.palmpay.lib.apm.launchcounter.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReflectUtils f23790b;

    public /* synthetic */ b(ReflectUtils reflectUtils, int i7) {
        this.f23789a = i7;
        this.f23790b = reflectUtils;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23789a) {
            case 0:
                Class<?>[] parameterTypes = ((Constructor) obj).getParameterTypes();
                Class<?>[] parameterTypes2 = ((Constructor) obj2).getParameterTypes();
                int length = parameterTypes.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if (!parameterTypes[i7].equals(parameterTypes2[i7])) {
                        Class<?> cls = parameterTypes[i7];
                        ReflectUtils reflectUtils = this.f23790b;
                        return reflectUtils.wrapper(cls).isAssignableFrom(reflectUtils.wrapper(parameterTypes2[i7])) ? 1 : -1;
                    }
                }
                return 0;
            default:
                Class<?>[] parameterTypes3 = ((Method) obj).getParameterTypes();
                Class<?>[] parameterTypes4 = ((Method) obj2).getParameterTypes();
                int length2 = parameterTypes3.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    if (!parameterTypes3[i10].equals(parameterTypes4[i10])) {
                        Class<?> cls2 = parameterTypes3[i10];
                        ReflectUtils reflectUtils2 = this.f23790b;
                        return reflectUtils2.wrapper(cls2).isAssignableFrom(reflectUtils2.wrapper(parameterTypes4[i10])) ? 1 : -1;
                    }
                }
                return 0;
        }
    }
}

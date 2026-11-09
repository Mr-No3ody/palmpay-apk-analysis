package com.didi.drouter.service;

import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p092g2.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f21156a;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object[] objArr2 = (Object[]) objArr[0];
        if (objArr2 == null) {
            objArr2 = new Object[]{null};
        }
        Object obj2 = this.f21156a;
        if ((obj2 instanceof ICallService.Type0) && objArr2.length == 0) {
            return ((ICallService.Type0) obj2).call();
        }
        if ((obj2 instanceof ICallService.Type1) && objArr2.length == 1) {
            return ((ICallService.Type1) obj2).call(objArr2[0]);
        }
        if ((obj2 instanceof ICallService.Type2) && objArr2.length == 2) {
            return ((ICallService.Type2) obj2).call(objArr2[0], objArr2[1]);
        }
        if ((obj2 instanceof ICallService.Type3) && objArr2.length == 3) {
            return ((ICallService.Type3) obj2).call(objArr2[0], objArr2[1], objArr2[2]);
        }
        if ((obj2 instanceof ICallService.Type4) && objArr2.length == 4) {
            return ((ICallService.Type4) obj2).call(objArr2[0], objArr2[1], objArr2[2], objArr2[3]);
        }
        if ((obj2 instanceof ICallService.Type5) && objArr2.length == 5) {
            return ((ICallService.Type5) obj2).call(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4]);
        }
        if (obj2 instanceof ICallService.TypeN) {
            return ((ICallService.TypeN) obj2).call(objArr2);
        }
        Object[] objArr3 = {obj2.getClass().getSimpleName(), Integer.valueOf(objArr2.length)};
        if (c.c()) {
            Log.e("DRouterCore", c.a("%s not match with argument length %s ", objArr3));
        }
        return null;
    }
}

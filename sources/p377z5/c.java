package p377z5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44455a;

    public c(Object obj) {
        this.f44455a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        switch (name) {
            case "cancelToast":
            case "enqueueToastEx":
            case "enqueueToast":
                objArr[0] = "android";
                break;
        }
        return method.invoke(this.f44455a, objArr);
    }
}

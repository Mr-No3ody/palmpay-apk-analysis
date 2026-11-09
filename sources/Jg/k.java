package Jg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4857c;

    public k(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        this.f4855a = protocols;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.c(name, "supports") && Intrinsics.c(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.c(name, "unsupported") && Intrinsics.c(Void.TYPE, returnType)) {
            this.f4856b = true;
            return null;
        }
        boolean zC = Intrinsics.c(name, "protocols");
        List list = this.f4855a;
        if (zC && objArr.length == 0) {
            return list;
        }
        if ((Intrinsics.c(name, "selectProtocol") || Intrinsics.c(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj;
                int size = list2.size();
                if (size >= 0) {
                    int i7 = 0;
                    while (true) {
                        Object obj2 = list2.get(i7);
                        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (list.contains(str)) {
                            this.f4857c = str;
                            return str;
                        }
                        if (i7 != size) {
                            i7++;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.f4857c = str2;
                return str2;
            }
        }
        if ((!Intrinsics.c(name, "protocolSelected") && !Intrinsics.c(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f4857c = (String) obj3;
        return null;
    }
}

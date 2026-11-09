package Hf;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f3922a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f3923b;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        Intrinsics.e(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (Intrinsics.c(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                if (Intrinsics.c(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        f3923b = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !Intrinsics.c(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}

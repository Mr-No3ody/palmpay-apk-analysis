package Ff;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f2828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f2829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f2830c;

    public d(Method method, Method method2, Method method3) {
        this.f2828a = method;
        this.f2829b = method2;
        this.f2830c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}

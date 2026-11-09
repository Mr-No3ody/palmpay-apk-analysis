package Kg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.android.SocketAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class s {
    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ SocketAdapter buildIfSupported$default(s sVar, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "com.android.org.conscrypt";
        }
        return sVar.buildIfSupported(str);
    }

    @Nullable
    public final SocketAdapter buildIfSupported(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
            Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            return new t(cls, cls2, paramsClass);
        } catch (Exception e10) {
            Jg.t.f4869a.get().getClass();
            Jg.t.i(5, "unable to load android socket classes", e10);
            return null;
        }
    }

    private s() {
    }
}

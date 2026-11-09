package Jg;

import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class l {
    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final t buildIfSupported() {
        String jvmVersion = System.getProperty("java.specification.version", "unknown");
        try {
            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
            if (Integer.parseInt(jvmVersion) < 9) {
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                    Method getMethod = cls.getMethod("get", SSLSocket.class);
                    Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                    Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                    Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                    Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                    Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                    Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                    return new m(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            }
            return null;
        } catch (NumberFormatException unused2) {
        }
    }

    private l() {
    }
}

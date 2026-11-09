package okhttp3;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    public /* synthetic */ j0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @NotNull
    public final k0 forJavaName(@NotNull String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return k0.f40942e;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return k0.f40941d;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return k0.f40940c;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return k0.f40943f;
            }
        } else if (javaName.equals("SSLv3")) {
            return k0.f40944g;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    private j0() {
    }
}

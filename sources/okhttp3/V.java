package okhttp3;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class V {
    public /* synthetic */ V(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final W get(@NotNull String protocol) throws IOException {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        W w3 = W.f40672c;
        if (Intrinsics.c(protocol, "http/1.0")) {
            return w3;
        }
        W w6 = W.f40673d;
        if (Intrinsics.c(protocol, "http/1.1")) {
            return w6;
        }
        W w10 = W.f40676g;
        if (Intrinsics.c(protocol, "h2_prior_knowledge")) {
            return w10;
        }
        W w11 = W.f40675f;
        if (Intrinsics.c(protocol, "h2")) {
            return w11;
        }
        W w12 = W.f40674e;
        if (Intrinsics.c(protocol, "spdy/3.1")) {
            return w12;
        }
        W w13 = W.f40677i;
        if (Intrinsics.c(protocol, "quic")) {
            return w13;
        }
        throw new IOException(C0.G.o("Unexpected protocol: ", protocol));
    }

    private V() {
    }
}

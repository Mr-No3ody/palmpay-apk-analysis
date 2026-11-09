package Hg;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.W;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f3948d = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f3949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3951c;

    public k(W protocol, int i7, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f3949a = protocol;
        this.f3950b = i7;
        this.f3951c = message;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f3949a == W.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f3950b);
        sb2.append(' ');
        sb2.append(this.f3951c);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

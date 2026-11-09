package androidx.webkit;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18290b;

    public h(String str) {
        this.f18289a = str;
        this.f18290b = 0;
    }

    public h(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f18289a = null;
        this.f18290b = 1;
    }
}

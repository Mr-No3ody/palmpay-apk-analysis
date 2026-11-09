package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f40705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f40707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40708d;

    public a0(L l5, byte[] bArr, int i7, int i10) {
        this.f40705a = l5;
        this.f40706b = i7;
        this.f40707c = bArr;
        this.f40708d = i10;
    }

    @Override // okhttp3.c0
    public final long contentLength() {
        return this.f40706b;
    }

    @Override // okhttp3.c0
    public final L contentType() {
        return this.f40705a;
    }

    @Override // okhttp3.c0
    public final void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.f40707c, this.f40708d, this.f40706b);
    }
}

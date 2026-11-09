package okhttp3;

import Pg.C0558e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f40692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40693c;

    public /* synthetic */ Z(L l5, Object obj, int i7) {
        this.f40691a = i7;
        this.f40692b = l5;
        this.f40693c = obj;
    }

    @Override // okhttp3.c0
    public final long contentLength() {
        switch (this.f40691a) {
            case 0:
                return ((File) this.f40693c).length();
            case 1:
                return ((Pg.m) this.f40693c).d();
            default:
                return ((c0) this.f40693c).contentLength();
        }
    }

    @Override // okhttp3.c0
    public final L contentType() {
        switch (this.f40691a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f40692b;
    }

    @Override // okhttp3.c0
    public final void writeTo(BufferedSink sink) throws IOException {
        Object obj = this.f40693c;
        switch (this.f40691a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                Logger logger = Pg.s.f7375a;
                File file = (File) obj;
                Intrinsics.checkNotNullParameter(file, "<this>");
                C0558e c0558e = new C0558e(new FileInputStream(file), Pg.F.NONE);
                try {
                    sink.writeAll(c0558e);
                    c0558e.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(c0558e, th);
                        throw th2;
                    }
                }
            case 1:
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write((Pg.m) obj);
                return;
            default:
                ((c0) obj).writeTo(sink);
                return;
        }
    }

    public Z(c0 c0Var, L l5) {
        this.f40691a = 2;
        this.f40693c = c0Var;
        this.f40692b = l5;
    }
}

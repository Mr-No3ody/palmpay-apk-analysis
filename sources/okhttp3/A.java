package okhttp3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L f40553c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40555b;

    static {
        new C1957z(null);
        f40553c = L.f40589e.get("application/x-www-form-urlencoded");
    }

    public A(ArrayList encodedNames, ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f40554a = Dg.c.y(encodedNames);
        this.f40555b = Dg.c.y(encodedValues);
    }

    public final long a(BufferedSink bufferedSink, boolean z3) throws EOFException {
        Pg.k buffer;
        if (z3) {
            buffer = new Pg.k();
        } else {
            Intrinsics.e(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        List list = this.f40554a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 > 0) {
                buffer.m(38);
            }
            buffer.v((String) list.get(i7));
            buffer.m(61);
            buffer.v((String) this.f40555b.get(i7));
        }
        if (!z3) {
            return 0L;
        }
        long j6 = buffer.f7358b;
        buffer.a();
        return j6;
    }

    @Override // okhttp3.c0
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.c0
    public final L contentType() {
        return f40553c;
    }

    @Override // okhttp3.c0
    public final void writeTo(BufferedSink sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}

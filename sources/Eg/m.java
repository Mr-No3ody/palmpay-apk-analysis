package Eg;

import Pg.n;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Sink delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f2493b = (o) onException;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.o] */
    @Override // Pg.n, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2494c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f2494c = true;
            this.f2493b.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.o] */
    @Override // Pg.n, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.f2494c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f2494c = true;
            this.f2493b.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.o] */
    @Override // Pg.n, okio.Sink
    public final void write(Pg.k source, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f2494c) {
            source.skip(j6);
            return;
        }
        try {
            super.write(source, j6);
        } catch (IOException e10) {
            this.f2494c = true;
            this.f2493b.invoke(e10);
        }
    }
}

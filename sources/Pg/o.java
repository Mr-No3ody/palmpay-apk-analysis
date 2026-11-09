package Pg;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements Source {

    @NotNull
    private final Source delegate;

    public o(Source delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final Source m8deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final Source delegate() {
        return this.delegate;
    }

    @Override // okio.Source
    public long read(k sink, long j6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j6);
    }

    @Override // okio.Source
    @NotNull
    public F timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}

package okhttp3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedSource f40741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f40742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStreamReader f40744d;

    public f0(BufferedSource source, Charset charset) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f40741a = source;
        this.f40742b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Unit unit;
        this.f40743c = true;
        InputStreamReader inputStreamReader = this.f40744d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f40741a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i7, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(cbuf, "cbuf");
        if (this.f40743c) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f40744d;
        if (inputStreamReader == null) {
            BufferedSource bufferedSource = this.f40741a;
            inputStreamReader = new InputStreamReader(bufferedSource.inputStream(), Dg.c.s(bufferedSource, this.f40742b));
            this.f40744d = inputStreamReader;
        }
        return inputStreamReader.read(cbuf, i7, i10);
    }
}

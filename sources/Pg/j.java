package Pg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7356b;

    public /* synthetic */ j(BufferedSink bufferedSink, int i7) {
        this.f7355a = i7;
        this.f7356b = bufferedSink;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7355a) {
            case 1:
                ((w) this.f7356b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f7355a) {
            case 0:
                break;
            case 1:
                w wVar = (w) this.f7356b;
                if (!wVar.f7387c) {
                    wVar.flush();
                }
                break;
            default:
                ((FileOutputStream) this.f7356b).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f7355a) {
            case 0:
                return ((k) this.f7356b) + ".outputStream()";
            case 1:
                return ((w) this.f7356b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        switch (this.f7355a) {
            case 0:
                ((k) this.f7356b).m(i7);
                return;
            case 1:
                w wVar = (w) this.f7356b;
                if (wVar.f7387c) {
                    throw new IOException("closed");
                }
                wVar.f7386b.m((byte) i7);
                wVar.emitCompleteSegments();
                return;
            default:
                ((FileOutputStream) this.f7356b).write(i7);
                return;
        }
    }

    public j(FileOutputStream fileOutputStream) {
        this.f7355a = 2;
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f7356b = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b7) throws IOException {
        switch (this.f7355a) {
            case 2:
                Intrinsics.checkNotNullParameter(b7, "b");
                ((FileOutputStream) this.f7356b).write(b7);
                break;
            default:
                super.write(b7);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i7, int i10) throws IOException {
        switch (this.f7355a) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                ((k) this.f7356b).l(data, i7, i10);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                w wVar = (w) this.f7356b;
                if (!wVar.f7387c) {
                    wVar.f7386b.l(data, i7, i10);
                    wVar.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            default:
                Intrinsics.checkNotNullParameter(data, "bytes");
                ((FileOutputStream) this.f7356b).write(data, i7, i10);
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}

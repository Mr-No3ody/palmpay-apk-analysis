package Xe;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f11200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f11201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Exception f11202d;

    public b(h hVar, d dVar, InputStream inputStream, Exception exc) {
        this.f11199a = hVar;
        this.f11200b = dVar;
        this.f11201c = inputStream;
        this.f11202d = exc;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f11201c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
        h hVar = this.f11199a;
        if (hVar != null) {
            try {
                hVar.close();
            } catch (Exception unused2) {
            }
        }
    }
}

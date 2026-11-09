package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.io.FileSystem;

/* JADX INFO: renamed from: okhttp3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1929i implements Closeable, Flushable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1925e f40759b = new C1925e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eg.l f40760a;

    public C1929i(File directory, long j6) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        okhttp3.internal.io.a fileSystem = FileSystem.f40914a;
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f40760a = new Eg.l(fileSystem, directory, j6, Fg.d.f2846i);
    }

    public final void a(Y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Eg.l lVar = this.f40760a;
        String key = f40759b.key(request.f40685a);
        synchronized (lVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            lVar.e();
            lVar.a();
            Eg.l.m(key);
            Eg.i iVar = (Eg.i) lVar.f2488j.get(key);
            if (iVar == null) {
                return;
            }
            lVar.k(iVar);
            if (lVar.f2486g <= lVar.f2482c) {
                lVar.f2475A = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40760a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f40760a.flush();
    }
}

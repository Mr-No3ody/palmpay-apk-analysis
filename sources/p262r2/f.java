package p262r2;

import java.io.IOException;
import java.io.OutputStream;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e10) {
            e.j(e10);
            throw null;
        }
    }
}

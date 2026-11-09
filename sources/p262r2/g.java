package p262r2;

import com.facebook.common.memory.ByteArrayPool;
import java.io.InputStream;
import java.io.OutputStream;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayPool f41563b;

    public g(ByteArrayPool byteArrayPool) {
        e.a(true);
        this.f41562a = 16384;
        this.f41563b = byteArrayPool;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) {
        ByteArrayPool byteArrayPool = this.f41563b;
        int i7 = this.f41562a;
        byte[] bArr = byteArrayPool.get(i7);
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, i7);
                if (i10 == -1) {
                    byteArrayPool.release(bArr);
                    return;
                }
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                byteArrayPool.release(bArr);
                throw th;
            }
        }
    }
}

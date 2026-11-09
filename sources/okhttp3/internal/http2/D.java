package okhttp3.internal.http2;

import Pg.C0559f;
import com.luck.picture.lib.config.FileSizeUnit;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends C0559f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f40775a;

    public D(E e10) {
        this.f40775a = e10;
    }

    public final void a() {
        if (exit()) {
            throw newTimeoutException(null);
        }
    }

    @Override // Pg.C0559f
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // Pg.C0559f
    public final void timedOut() {
        this.f40775a.e(EnumC1932c.CANCEL);
        u uVar = this.f40775a.f40777b;
        synchronized (uVar) {
            long j6 = uVar.f40893w;
            long j10 = uVar.f40892v;
            if (j6 < j10) {
                return;
            }
            uVar.f40892v = j10 + 1;
            uVar.f40870A = System.nanoTime() + ((long) FileSizeUnit.ACCURATE_GB);
            Unit unit = Unit.f38893a;
            uVar.f40887i.c(new Eg.k(C0.G.r(new StringBuilder(), uVar.f40882c, " ping"), uVar, 3), 0L);
        }
    }
}

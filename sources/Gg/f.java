package Gg;

import Jg.t;
import com.didiglobal.booster.instrument.ShadowThread;
import com.transsnet.palmpay.custom_view.dialog.y;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Callback;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callback f3432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3434c;

    public f(i iVar, Callback responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f3434c = iVar;
        this.f3432a = responseCallback;
        this.f3433b = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Callback callback = this.f3432a;
        StringBuilder sb2 = new StringBuilder("OkHttp ");
        i iVar = this.f3434c;
        sb2.append(iVar.f3442b.f40685a.i());
        String string = sb2.toString();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(ShadowThread.makeThreadName(string, "\u200bokhttp3.internal.connection.RealCall$AsyncCall"));
        try {
            h hVar = iVar.f3446f;
            y yVar = iVar.f3441a.f40653a;
            hVar.enter();
            boolean z3 = false;
            try {
                try {
                    try {
                        callback.onResponse(iVar, iVar.e());
                    } catch (IOException e10) {
                        e = e10;
                        z3 = true;
                        if (z3) {
                            t tVar = t.f4869a.get();
                            String str = "Callback failure for " + i.a(iVar);
                            tVar.getClass();
                            t.i(4, str, e);
                        } else {
                            callback.onFailure(iVar, e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z3 = true;
                        iVar.cancel();
                        if (!z3) {
                            IOException iOException = new IOException("canceled due to " + th);
                            C2126e.a(iOException, th);
                            callback.onFailure(iVar, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    yVar.d(this);
                    throw th2;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th3) {
                th = th3;
            }
            yVar.d(this);
            threadCurrentThread.setName(ShadowThread.makeThreadName(name, "\u200bokhttp3.internal.connection.RealCall$AsyncCall"));
        } catch (Throwable th4) {
            threadCurrentThread.setName(ShadowThread.makeThreadName(name, "\u200bokhttp3.internal.connection.RealCall$AsyncCall"));
            throw th4;
        }
    }
}

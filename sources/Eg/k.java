package Eg;

import Gg.n;
import Pg.AbstractC0555b;
import V8.p;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Fg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, String str, int i7) {
        super(str, true);
        this.f2462e = i7;
        this.f2463f = obj;
    }

    @Override // Fg.a
    public final long a() {
        n nVar = null;
        int i7 = 0;
        switch (this.f2462e) {
            case 0:
                l lVar = (l) this.f2463f;
                synchronized (lVar) {
                    try {
                        if (lVar.f2491v && !lVar.f2492w) {
                            try {
                                lVar.l();
                            } catch (IOException unused) {
                                lVar.f2475A = true;
                            }
                            try {
                                if (lVar.f()) {
                                    lVar.j();
                                    lVar.f2489o = 0;
                                }
                            } catch (IOException unused2) {
                                lVar.f2476B = true;
                                lVar.f2487i = AbstractC0555b.b(new Pg.g());
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return -1L;
            case 1:
                ((p) this.f2463f).invoke();
                return -1L;
            case 2:
                Gg.p pVar = (Gg.p) this.f2463f;
                long jNanoTime = System.nanoTime();
                long j6 = Long.MIN_VALUE;
                int i10 = 0;
                for (n connection : pVar.f3482e) {
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (pVar.b(connection, jNanoTime) > 0) {
                            i10++;
                        } else {
                            i7++;
                            long j10 = jNanoTime - connection.f3477q;
                            if (j10 > j6) {
                                nVar = connection;
                                j6 = j10;
                            }
                            Unit unit = Unit.f38893a;
                        }
                    }
                }
                long j11 = pVar.f3479b;
                if (j6 < j11 && i7 <= pVar.f3478a) {
                    if (i7 > 0) {
                        return j11 - j6;
                    }
                    if (i10 > 0) {
                        return j11;
                    }
                    return -1L;
                }
                Intrinsics.e(nVar);
                synchronized (nVar) {
                    if (!nVar.f3476p.isEmpty()) {
                        return 0L;
                    }
                    if (nVar.f3477q + j6 != jNanoTime) {
                        return 0L;
                    }
                    nVar.f3470j = true;
                    pVar.f3482e.remove(nVar);
                    Socket socket = nVar.f3464d;
                    Intrinsics.e(socket);
                    Dg.c.d(socket);
                    if (!pVar.f3482e.isEmpty()) {
                        return 0L;
                    }
                    pVar.f3480c.a();
                    return 0L;
                }
            case 3:
                u uVar = (u) this.f2463f;
                uVar.getClass();
                try {
                    uVar.f40878Y.f(false, 2, 0);
                    break;
                } catch (IOException e10) {
                    uVar.b(e10);
                }
                return -1L;
            default:
                p337w8.l lVar2 = (p337w8.l) this.f2463f;
                lVar2.getClass();
                V v3 = V.f10828a;
                p042cg.f fVar = I.f10809a;
                AbstractC0780y.m(v3, p042cg.e.f19009c, null, new p337w8.i(lVar2, null), 2);
                return TimeUnit.MILLISECONDS.toNanos(lVar2.f43331f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, int i7) {
        super(str, true);
        this.f2462e = i7;
        this.f2463f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p337w8.l lVar) {
        super("RefreshDNS", true);
        this.f2462e = 4;
        this.f2463f = lVar;
    }
}

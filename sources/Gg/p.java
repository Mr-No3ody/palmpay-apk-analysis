package Gg;

import C0.G;
import Jg.t;
import androidx.camera.video.u;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1921a;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fg.b f3480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eg.k f3481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3482e;

    static {
        new o(null);
    }

    public p(Fg.d taskRunner, int i7, long j6) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f3478a = i7;
        this.f3479b = timeUnit.toNanos(j6);
        this.f3480c = taskRunner.e();
        this.f3481d = new Eg.k(this, G.r(new StringBuilder(), Dg.c.f1885g, " ConnectionPool"), 2);
        this.f3482e = new ConcurrentLinkedQueue();
        if (j6 <= 0) {
            throw new IllegalArgumentException(u.i(j6, "keepAliveDuration <= 0: ").toString());
        }
    }

    public final boolean a(C1921a address, i call, ArrayList arrayList, boolean z3) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f3482e.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            n connection = (n) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z3) {
                    if (connection.f3467g != null) {
                    }
                    Unit unit = Unit.f38893a;
                }
                if (connection.h(address, arrayList)) {
                    call.b(connection);
                    return true;
                }
                Unit unit2 = Unit.f38893a;
            }
        }
    }

    public final int b(n nVar, long j6) {
        byte[] bArr = Dg.c.f1879a;
        ArrayList arrayList = nVar.f3476p;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                t.f4869a.get().k(((g) reference).f3435a, "A connection to " + nVar.f3462b.f40761a.f40702i + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i7);
                nVar.f3470j = true;
                if (arrayList.isEmpty()) {
                    nVar.f3477q = j6 - this.f3479b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}

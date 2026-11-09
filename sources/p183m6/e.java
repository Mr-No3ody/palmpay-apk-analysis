package p183m6;

import Wf.AbstractC0774s;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import Wf.v0;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import p015ag.c;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f39492h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0774s f39494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f39496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f39497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f39498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f39499g;

    static {
        new a(null);
        f39492h = TimeUnit.SECONDS.toMillis(30L);
    }

    public e(Context context, long j6) {
        v0 v0VarC = AbstractC0780y.c();
        f fVar = I.f10809a;
        p042cg.e dispatcher = p042cg.e.f19009c;
        c scope = AbstractC0777v.a(kotlin.coroutines.e.c(v0VarC, dispatcher));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f39493a = scope;
        this.f39494b = dispatcher;
        this.f39495c = TimeUnit.SECONDS.toMillis(j6);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f39496d = applicationContext;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[Catch: all -> 0x0065, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x0027, B:10:0x002d, B:12:0x0035, B:22:0x0050, B:21:0x004e, B:7:0x001e), top: B:30:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    public final synchronized void a(boolean z3, f method) {
        MMKV mmkv;
        long j6;
        long j10;
        long j11;
        Intrinsics.checkNotNullParameter(method, "method");
        b();
        this.f39499g = method;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = this.f39496d;
        if (k.f39521a == null) {
            try {
                k.f39521a = MMKV.o("PalmPayRemoteConfig");
            } catch (IllegalStateException unused) {
                MMKV.m(context);
                k.f39521a = MMKV.o("PalmPayRemoteConfig");
            }
            mmkv = k.f39521a;
            long j12 = 0;
            if (mmkv != null) {
                j6 = mmkv.getLong("_lats_poll_time", 0L);
            } else {
                j6 = 0;
            }
            j10 = jElapsedRealtime - j6;
            j11 = this.f39495c;
            E e10 = new E();
            if ((z3 || j10 <= DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) && j10 <= j11 && j10 > 0) {
            }
            e10.f38950a = j12;
            this.f39497e = AbstractC0780y.m(this.f39493a, this.f39494b, null, new d(e10, method, this, null), 2);
        } else {
            mmkv = k.f39521a;
            long j13 = 0;
            if (mmkv != null) {
                j6 = mmkv.getLong("_lats_poll_time", 0L);
            } else {
                j6 = 0;
            }
            j10 = jElapsedRealtime - j6;
            j11 = this.f39495c;
            E e11 = new E();
            j13 = z3 ? j11 - j10 : j11 - j10;
            e11.f38950a = j13;
            this.f39497e = AbstractC0780y.m(this.f39493a, this.f39494b, null, new d(e11, method, this, null), 2);
        }
        throw th;
    }

    public final synchronized void b() {
        t0 t0Var = this.f39497e;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        t0 t0Var2 = this.f39498f;
        if (t0Var2 != null) {
            t0Var2.cancel((CancellationException) null);
        }
        this.f39497e = null;
        this.f39498f = null;
    }
}

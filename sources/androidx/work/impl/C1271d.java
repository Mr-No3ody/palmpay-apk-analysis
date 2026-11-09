package androidx.work.impl;

import V0.AbstractC0703w;
import V0.C0684c;
import V0.C0699s;
import V0.a0;
import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import Wf.C0757c0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.appcompat.widget.m1;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: androidx.work.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1271d implements ForegroundProcessor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f18529l = V0.C.d("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0684c f18532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f18533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f18534e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f18536g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f18535f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f18538i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f18539j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f18530a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f18540k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f18537h = new HashMap();

    public C1271d(Context context, C0684c c0684c, androidx.work.impl.utils.taskexecutor.a aVar, WorkDatabase workDatabase) {
        this.f18531b = context;
        this.f18532c = c0684c;
        this.f18533d = aVar;
        this.f18534e = workDatabase;
    }

    public static boolean d(J j6, int i7) {
        if (j6 == null) {
            V0.C.c().getClass();
            return false;
        }
        j6.f18384m.e(new v(i7));
        V0.C.c().getClass();
        return true;
    }

    public final void a(ExecutionListener executionListener) {
        synchronized (this.f18540k) {
            this.f18539j.add(executionListener);
        }
    }

    public final J b(String str) {
        J j6 = (J) this.f18535f.remove(str);
        boolean z3 = j6 != null;
        if (!z3) {
            j6 = (J) this.f18536g.remove(str);
        }
        this.f18537h.remove(str);
        if (z3) {
            synchronized (this.f18540k) {
                try {
                    if (this.f18535f.isEmpty()) {
                        Context context = this.f18531b;
                        String str2 = androidx.work.impl.foreground.a.f18552o;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f18531b.startService(intent);
                        } catch (Throwable th) {
                            V0.C.c().b(f18529l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f18530a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f18530a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return j6;
    }

    public final J c(String str) {
        J j6 = (J) this.f18535f.get(str);
        return j6 == null ? (J) this.f18536g.get(str) : j6;
    }

    public final boolean e(String str) {
        boolean z3;
        synchronized (this.f18540k) {
            z3 = c(str) != null;
        }
        return z3;
    }

    public final void f(ExecutionListener executionListener) {
        synchronized (this.f18540k) {
            this.f18539j.remove(executionListener);
        }
    }

    public final boolean g(C1275h c1275h, a0 a0Var) {
        Throwable th;
        androidx.work.impl.model.e eVar = c1275h.f18563a;
        String str = eVar.f18587a;
        ArrayList arrayList = new ArrayList();
        androidx.work.impl.model.k kVar = (androidx.work.impl.model.k) this.f18534e.runInTransaction(new CallableC1270c(this, 0, arrayList, str));
        if (kVar == null) {
            V0.C c6 = V0.C.c();
            eVar.toString();
            c6.getClass();
            androidx.work.impl.utils.taskexecutor.a aVar = this.f18533d;
            aVar.f18730d.execute(new androidx.camera.video.internal.encoder.o(17, this, eVar));
            return false;
        }
        synchronized (this.f18540k) {
            try {
                try {
                    try {
                        if (e(str)) {
                            Set set = (Set) this.f18537h.get(str);
                            if (((C1275h) set.iterator().next()).f18563a.f18588b == eVar.f18588b) {
                                set.add(c1275h);
                                V0.C c10 = V0.C.c();
                                eVar.toString();
                                c10.getClass();
                            } else {
                                androidx.work.impl.utils.taskexecutor.a aVar2 = this.f18533d;
                                aVar2.f18730d.execute(new androidx.camera.video.internal.encoder.o(17, this, eVar));
                            }
                            return false;
                        }
                        if (kVar.t != eVar.f18588b) {
                            androidx.work.impl.utils.taskexecutor.a aVar3 = this.f18533d;
                            aVar3.f18730d.execute(new androidx.camera.video.internal.encoder.o(17, this, eVar));
                            return false;
                        }
                        J j6 = new J(new m1(this.f18531b, this.f18532c, this.f18533d, this, this.f18534e, kVar, arrayList));
                        AbstractC0774s abstractC0774s = j6.f18375d.f18728b;
                        C0757c0 c0757c0B = AbstractC0780y.b();
                        abstractC0774s.getClass();
                        androidx.concurrent.futures.m mVarB = AbstractC0703w.b(kotlin.coroutines.e.c(abstractC0774s, c0757c0B), new F(j6, null));
                        mVarB.addListener(new androidx.emoji2.text.j(this, 2, mVarB, j6), this.f18533d.f18730d);
                        this.f18536g.put(str, j6);
                        HashSet hashSet = new HashSet();
                        hashSet.add(c1275h);
                        this.f18537h.put(str, hashSet);
                        V0.C c11 = V0.C.c();
                        eVar.toString();
                        c11.getClass();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public final void startForeground(String str, C0699s c0699s) {
        synchronized (this.f18540k) {
            try {
                V0.C.c().getClass();
                J j6 = (J) this.f18536g.remove(str);
                if (j6 != null) {
                    if (this.f18530a == null) {
                        PowerManager.WakeLock wakeLockA = androidx.work.impl.utils.m.a(this.f18531b, "ProcessorForegroundLck");
                        this.f18530a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f18535f.put(str, j6);
                    Intent intentA = androidx.work.impl.foreground.a.a(this.f18531b, p140j8.f.j(j6.f18372a), c0699s);
                    Context context = this.f18531b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        androidx.core.content.a.c(context, intentA);
                    } else {
                        context.startService(intentA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

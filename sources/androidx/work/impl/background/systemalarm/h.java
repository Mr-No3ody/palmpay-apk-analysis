package androidx.work.impl.background.systemalarm;

import V0.C;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.C1271d;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.s;
import androidx.work.impl.utils.m;
import androidx.work.impl.utils.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ExecutionListener {
    public static final String t = C.d("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f18441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f18442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1271d f18443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f18444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f18445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f18446g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Intent f18447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SystemAlarmService f18448j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StartStopTokens f18449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WorkLauncher f18450p;

    public h(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f18440a = applicationContext;
        StartStopTokens startStopTokensCreate = StartStopTokens.create();
        this.f18449o = startStopTokensCreate;
        s sVarG = s.g(systemAlarmService);
        this.f18444e = sVarG;
        this.f18445f = new b(applicationContext, sVarG.f18676c.f9923d, startStopTokensCreate);
        this.f18442c = new u(sVarG.f18676c.f9926g);
        C1271d c1271d = sVarG.f18680g;
        this.f18443d = c1271d;
        androidx.work.impl.utils.taskexecutor.a aVar = sVarG.f18678e;
        this.f18441b = aVar;
        this.f18450p = new p279s5.d(c1271d, aVar);
        c1271d.a(this);
        this.f18446g = new ArrayList();
        this.f18447i = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i7, Intent intent) {
        C c6 = C.c();
        Objects.toString(intent);
        c6.getClass();
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C.c().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f18446g) {
                try {
                    Iterator it = this.f18446g.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f18446g) {
            try {
                boolean zIsEmpty = this.f18446g.isEmpty();
                this.f18446g.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock wakeLockA = m.a(this.f18440a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f18444e.f18678e.executeOnTaskThread(new g(this, 1));
        } finally {
            wakeLockA.release();
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(androidx.work.impl.model.e eVar, boolean z3) {
        androidx.camera.core.impl.utils.executor.f fVar = this.f18441b.f18730d;
        String str = b.f18412f;
        Intent intent = new Intent(this.f18440a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        b.c(intent, eVar);
        fVar.execute(new F6.a(this, intent, 0, 3));
    }
}

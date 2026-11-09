package androidx.work.impl.foreground;

import V0.C;
import V0.C0699s;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.C1275h;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.c;
import androidx.work.impl.model.e;
import androidx.work.impl.model.k;
import androidx.work.impl.s;
import androidx.work.impl.utils.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements OnConstraintsStateChangedListener, ExecutionListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f18552o = C.d("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f18553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f18554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18555c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f18556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f18557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f18558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f18559g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F1.b f18560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SystemForegroundService f18561j;

    public a(Context context) {
        s sVarG = s.g(context);
        this.f18553a = sVarG;
        this.f18554b = sVarG.f18678e;
        this.f18556d = null;
        this.f18557e = new LinkedHashMap();
        this.f18559g = new HashMap();
        this.f18558f = new HashMap();
        this.f18560i = new F1.b(sVarG.f18684k);
        sVarG.f18680g.a(this);
    }

    public static Intent a(Context context, e eVar, C0699s c0699s) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", eVar.f18587a);
        intent.putExtra("KEY_GENERATION", eVar.f18588b);
        intent.putExtra("KEY_NOTIFICATION_ID", c0699s.f9969a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0699s.f9970b);
        intent.putExtra("KEY_NOTIFICATION", c0699s.f9971c);
        return intent;
    }

    public final void b(Intent intent) {
        if (this.f18561j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        e eVar = new e(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C.c().getClass();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C0699s c0699s = new C0699s(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f18557e;
        linkedHashMap.put(eVar, c0699s);
        C0699s c0699s2 = (C0699s) linkedHashMap.get(this.f18556d);
        if (c0699s2 == null) {
            this.f18556d = eVar;
        } else {
            this.f18561j.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i7 |= ((C0699s) ((Map.Entry) it.next()).getValue()).f9970b;
                }
                c0699s = new C0699s(c0699s2.f9969a, i7, c0699s2.f9971c);
            } else {
                c0699s = c0699s2;
            }
        }
        this.f18561j.startForeground(c0699s.f9969a, c0699s.f9970b, c0699s.f9971c);
    }

    public final void c() {
        this.f18561j = null;
        synchronized (this.f18555c) {
            try {
                Iterator it = this.f18559g.values().iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18553a.f18680g.f(this);
    }

    public final void d(int i7, int i10) {
        C.c().getClass();
        for (Map.Entry entry : this.f18557e.entrySet()) {
            if (((C0699s) entry.getValue()).f9970b == i10) {
                e eVar = (e) entry.getKey();
                s sVar = this.f18553a;
                sVar.getClass();
                sVar.f18678e.executeOnTaskThread(new l(sVar.f18680g, new C1275h(eVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f18561j;
        if (systemForegroundService != null) {
            systemForegroundService.stop(i7);
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void onConstraintsStateChanged(k kVar, c cVar) {
        if (cVar instanceof androidx.work.impl.constraints.b) {
            String str = kVar.f18612a;
            C.c().getClass();
            e eVarJ = f.j(kVar);
            int i7 = ((androidx.work.impl.constraints.b) cVar).f18471a;
            s sVar = this.f18553a;
            sVar.getClass();
            sVar.f18678e.executeOnTaskThread(new l(sVar.f18680g, new C1275h(eVarJ), true, i7));
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(e eVar, boolean z3) {
        Map.Entry entry;
        synchronized (this.f18555c) {
            try {
                Job job = ((k) this.f18558f.remove(eVar)) != null ? (Job) this.f18559g.remove(eVar) : null;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0699s c0699s = (C0699s) this.f18557e.remove(eVar);
        if (eVar.equals(this.f18556d)) {
            if (this.f18557e.size() > 0) {
                Iterator it = this.f18557e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f18556d = (e) entry.getKey();
                if (this.f18561j != null) {
                    C0699s c0699s2 = (C0699s) entry.getValue();
                    this.f18561j.startForeground(c0699s2.f9969a, c0699s2.f9970b, c0699s2.f9971c);
                    this.f18561j.cancelNotification(c0699s2.f9969a);
                }
            } else {
                this.f18556d = null;
            }
        }
        SystemForegroundService systemForegroundService = this.f18561j;
        if (c0699s == null || systemForegroundService == null) {
            return;
        }
        C c6 = C.c();
        eVar.toString();
        c6.getClass();
        systemForegroundService.cancelNotification(c0699s.f9969a);
    }
}

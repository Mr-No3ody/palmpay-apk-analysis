package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f22747a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f22749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22750d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Intent f22755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z f22756j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private ServiceConnection f22760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private IInterface f22761o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f22751e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    private final Set f22752f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f22753g = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final IBinder.DeathRecipient f22758l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae.k(this.f22773a);
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    private final AtomicInteger f22759m = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f22757k = new WeakReference(null);

    public ae(Context context, s sVar, String str, Intent intent, z zVar, @Nullable y yVar) {
        this.f22748b = context;
        this.f22749c = sVar;
        this.f22750d = str;
        this.f22755i = intent;
        this.f22756j = zVar;
    }

    public static /* synthetic */ void k(ae aeVar) {
        aeVar.f22749c.d("reportBinderDeath", new Object[0]);
        y yVar = (y) aeVar.f22757k.get();
        if (yVar != null) {
            aeVar.f22749c.d("calling onBinderDied", new Object[0]);
            yVar.a();
        } else {
            aeVar.f22749c.d("%s : Binder has died.", aeVar.f22750d);
            Iterator it = aeVar.f22751e.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(aeVar.w());
            }
            aeVar.f22751e.clear();
        }
        synchronized (aeVar.f22753g) {
            aeVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(final ae aeVar, final TaskCompletionSource taskCompletionSource) {
        aeVar.f22752f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f22774a.u(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(ae aeVar, t tVar) {
        if (aeVar.f22761o != null || aeVar.f22754h) {
            if (!aeVar.f22754h) {
                tVar.run();
                return;
            } else {
                aeVar.f22749c.d("Waiting to bind to the service.", new Object[0]);
                aeVar.f22751e.add(tVar);
                return;
            }
        }
        aeVar.f22749c.d("Initiate binding to the service.", new Object[0]);
        aeVar.f22751e.add(tVar);
        ad adVar = new ad(aeVar, null);
        aeVar.f22760n = adVar;
        aeVar.f22754h = true;
        if (aeVar.f22748b.bindService(aeVar.f22755i, adVar, 1)) {
            return;
        }
        aeVar.f22749c.d("Failed to bind to the service.", new Object[0]);
        aeVar.f22754h = false;
        Iterator it = aeVar.f22751e.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(new af());
        }
        aeVar.f22751e.clear();
    }

    public static /* bridge */ /* synthetic */ void r(ae aeVar) {
        aeVar.f22749c.d("linkToDeath", new Object[0]);
        try {
            aeVar.f22761o.asBinder().linkToDeath(aeVar.f22758l, 0);
        } catch (RemoteException e10) {
            aeVar.f22749c.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(ae aeVar) {
        aeVar.f22749c.d("unlinkToDeath", new Object[0]);
        aeVar.f22761o.asBinder().unlinkToDeath(aeVar.f22758l, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f22750d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("attachedRemoteTasksLock")
    public final void x() {
        Iterator it = this.f22752f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f22752f.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f22747a;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f22750d)) {
                    ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread(this.f22750d, 10, "\u200bcom.google.android.play.integrity.internal.ae");
                    ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.google.android.play.integrity.internal.ae").start();
                    map.put(this.f22750d, new Handler(shadowHandlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f22750d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    @Nullable
    public final IInterface e() {
        return this.f22761o;
    }

    public final void t(t tVar, @Nullable TaskCompletionSource taskCompletionSource) {
        c().post(new w(this, tVar.c(), taskCompletionSource, tVar));
    }

    public final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f22753g) {
            this.f22752f.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f22753g) {
            this.f22752f.remove(taskCompletionSource);
        }
        c().post(new x(this));
    }
}

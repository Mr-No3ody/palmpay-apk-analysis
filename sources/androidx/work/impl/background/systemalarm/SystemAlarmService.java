package androidx.work.impl.background.systemalarm;

import V0.C;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractServiceC1213x;
import androidx.work.impl.utils.m;
import androidx.work.impl.utils.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public class SystemAlarmService extends AbstractServiceC1213x implements SystemAlarmDispatcher$CommandsCompletedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f18409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18410c;

    static {
        C.d("SystemAlarmService");
    }

    @Override // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$CommandsCompletedListener
    public final void onAllCommandsCompleted() {
        this.f18410c = true;
        C.c().getClass();
        int i7 = m.f18709a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (n.f18710a) {
            linkedHashMap.putAll(n.f18711b);
            Unit unit = Unit.f38893a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                C.c().getClass();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC1213x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f18409b = hVar;
        if (hVar.f18448j != null) {
            C.c().a(h.t, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            hVar.f18448j = this;
        }
        this.f18410c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC1213x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f18410c = true;
        h hVar = this.f18409b;
        hVar.getClass();
        C.c().getClass();
        hVar.f18443d.f(hVar);
        hVar.f18448j = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        super.onStartCommand(intent, i7, i10);
        if (this.f18410c) {
            C.c().getClass();
            h hVar = this.f18409b;
            hVar.getClass();
            C.c().getClass();
            hVar.f18443d.f(hVar);
            hVar.f18448j = null;
            h hVar2 = new h(this);
            this.f18409b = hVar2;
            if (hVar2.f18448j != null) {
                C.c().a(h.t, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                hVar2.f18448j = this;
            }
            this.f18410c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f18409b.a(i10, intent);
        return 3;
    }
}

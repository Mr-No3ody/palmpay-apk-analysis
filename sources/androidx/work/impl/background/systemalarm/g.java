package androidx.work.impl.background.systemalarm;

import V0.C;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.utils.k;
import androidx.work.impl.utils.m;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f18439b;

    public /* synthetic */ g(h hVar, int i7) {
        this.f18438a = i7;
        this.f18439b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEmpty;
        androidx.camera.core.impl.utils.executor.f fVar;
        g gVar;
        int i7 = 0;
        switch (this.f18438a) {
            case 0:
                h hVar = this.f18439b;
                hVar.getClass();
                C.c().getClass();
                h.b();
                synchronized (hVar.f18446g) {
                    try {
                        if (hVar.f18447i != null) {
                            C c6 = C.c();
                            Objects.toString(hVar.f18447i);
                            c6.getClass();
                            if (!((Intent) hVar.f18446g.remove(0)).equals(hVar.f18447i)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar.f18447i = null;
                        }
                        k kVar = hVar.f18441b.f18727a;
                        b bVar = hVar.f18445f;
                        synchronized (bVar.f18415c) {
                            zIsEmpty = bVar.f18414b.isEmpty();
                            break;
                        }
                        if (zIsEmpty && hVar.f18446g.isEmpty() && !kVar.hasPendingTasks()) {
                            C.c().getClass();
                            SystemAlarmService systemAlarmService = hVar.f18448j;
                            if (systemAlarmService != null) {
                                systemAlarmService.onAllCommandsCompleted();
                            }
                        } else if (!hVar.f18446g.isEmpty()) {
                            hVar.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f18439b.f18446g) {
                    h hVar2 = this.f18439b;
                    hVar2.f18447i = (Intent) hVar2.f18446g.get(0);
                    break;
                }
                Intent intent = this.f18439b.f18447i;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f18439b.f18447i.getIntExtra("KEY_START_ID", 0);
                    C c10 = C.c();
                    String str = h.t;
                    Objects.toString(this.f18439b.f18447i);
                    c10.getClass();
                    PowerManager.WakeLock wakeLockA = m.a(this.f18439b.f18440a, action + " (" + intExtra + ")");
                    try {
                        C c11 = C.c();
                        Objects.toString(wakeLockA);
                        c11.getClass();
                        wakeLockA.acquire();
                        h hVar3 = this.f18439b;
                        hVar3.f18445f.a(hVar3.f18447i, intExtra, hVar3);
                        C c12 = C.c();
                        wakeLockA.toString();
                        c12.getClass();
                        wakeLockA.release();
                        h hVar4 = this.f18439b;
                        fVar = hVar4.f18441b.f18730d;
                        gVar = new g(hVar4, i7);
                    } catch (Throwable th2) {
                        try {
                            C.c().b(h.t, "Unexpected error in onHandleIntent", th2);
                            C c13 = C.c();
                            Objects.toString(wakeLockA);
                            c13.getClass();
                            wakeLockA.release();
                            h hVar5 = this.f18439b;
                            fVar = hVar5.f18441b.f18730d;
                            gVar = new g(hVar5, i7);
                        } catch (Throwable th3) {
                            C c14 = C.c();
                            String str2 = h.t;
                            Objects.toString(wakeLockA);
                            c14.getClass();
                            wakeLockA.release();
                            h hVar6 = this.f18439b;
                            hVar6.f18441b.f18730d.execute(new g(hVar6, i7));
                            throw th3;
                        }
                    }
                    fVar.execute(gVar);
                    return;
                }
                return;
        }
    }
}

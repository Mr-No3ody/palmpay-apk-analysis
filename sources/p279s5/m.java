package p279s5;

import android.app.Activity;
import com.growingio.android.sdk.a;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import e5.c;
import java.util.ArrayList;
import java.util.UUID;
import p141j9.B;
import p152k5.e;
import p152k5.f;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements IActivityLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42041a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42042b;

    public m() {
        ((a) d.b().f42025b).getClass();
        this.f42042b = ((long) 30) * 1000;
    }

    public static void a() {
        ((a) d.b().f42025b).getClass();
        e.f38687a.f38688a.putBoolean("SEND_VISIT_AFTER_REFRESH_SESSION_ID", true);
        c.f36164a.y(new p094g5.m());
    }

    public static void b() {
        f fVar = e.f38687a;
        fVar.f38688a.putString("SESSION_ID", UUID.randomUUID().toString());
        fVar.f38688a.putBoolean("SEND_VISIT_AFTER_REFRESH_SESSION_ID", false);
    }

    @Override // com.growingio.android.sdk.track.listener.IActivityLifecycle
    public final void onActivityLifecycle(p182m5.a aVar) {
        Activity activityA = aVar.a();
        if (activityA == null) {
            return;
        }
        ArrayList arrayList = this.f42041a;
        int i7 = aVar.f39477a;
        if (i7 == 2) {
            f fVar = e.f38687a;
            if (fVar.f38691d == 0) {
                c.f36164a.x(new B(this, 12));
            }
            arrayList.add(activityA.toString());
            fVar.f38691d++;
            return;
        }
        if (i7 == 7 && arrayList.contains(activityA.toString())) {
            if (arrayList.remove(activityA.toString())) {
                e.f38687a.f38691d = 0;
            }
            if (e.f38687a.f38691d == 0) {
                c.f36164a.x(new L7.a(5));
            }
        }
    }
}

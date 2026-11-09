package androidx.camera.camera2.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0957v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f13662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13663c;

    public /* synthetic */ RunnableC0957v(J j6, ArrayList arrayList, int i7) {
        this.f13661a = i7;
        this.f13662b = j6;
        this.f13663c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13661a) {
            case 0:
                J j6 = this.f13662b;
                ArrayList<C0920c> arrayList = this.f13663c;
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (C0920c c0920c : arrayList) {
                    if (j6.f13175a.i(c0920c.f13363a)) {
                        ((LinkedHashMap) j6.f13175a.f41079b).remove(c0920c.f13363a);
                        arrayList2.add(c0920c.f13363a);
                        if (c0920c.f13364b == E.b0.class) {
                            z3 = true;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                j6.f("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera");
                if (z3) {
                    j6.f13181g.f13610h.f13207e = null;
                }
                j6.a();
                if (j6.f13175a.h().isEmpty()) {
                    j6.f13181g.f13614l.f13587c = false;
                } else {
                    j6.y();
                }
                if (j6.f13175a.g().isEmpty()) {
                    j6.f13181g.b();
                    j6.q();
                    j6.f13181g.j(false);
                    j6.t = j6.l();
                    j6.c();
                    return;
                }
                j6.x();
                j6.q();
                if (j6.f13166B0 == 9) {
                    j6.n();
                    return;
                }
                return;
            default:
                ArrayList arrayList3 = this.f13663c;
                J j10 = this.f13662b;
                C0944o c0944o = j10.f13181g;
                try {
                    j10.u(arrayList3);
                    return;
                } finally {
                    c0944o.b();
                }
        }
    }
}

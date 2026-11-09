package androidx.work.impl.utils;

import V0.C;
import androidx.work.impl.C1271d;
import androidx.work.impl.C1275h;
import androidx.work.impl.J;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1271d f18705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1275h f18706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18708d;

    public l(C1271d processor, C1275h token, boolean z3, int i7) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f18705a = processor;
        this.f18706b = token;
        this.f18707c = z3;
        this.f18708d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J jB;
        if (this.f18707c) {
            C1271d c1271d = this.f18705a;
            C1275h c1275h = this.f18706b;
            int i7 = this.f18708d;
            c1271d.getClass();
            String str = c1275h.f18563a.f18587a;
            synchronized (c1271d.f18540k) {
                jB = c1271d.b(str);
            }
            C1271d.d(jB, i7);
        } else {
            C1271d c1271d2 = this.f18705a;
            C1275h c1275h2 = this.f18706b;
            int i10 = this.f18708d;
            c1271d2.getClass();
            String str2 = c1275h2.f18563a.f18587a;
            synchronized (c1271d2.f18540k) {
                try {
                    if (c1271d2.f18535f.get(str2) != null) {
                        C.c().getClass();
                    } else {
                        Set set = (Set) c1271d2.f18537h.get(str2);
                        if (set != null && set.contains(c1275h2)) {
                            C1271d.d(c1271d2.b(str2), i10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C c6 = C.c();
        C.d("StopWorkRunnable");
        String str3 = this.f18706b.f18563a.f18587a;
        c6.getClass();
    }
}

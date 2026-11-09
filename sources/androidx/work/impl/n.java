package androidx.work.impl;

import V0.X;
import android.text.TextUtils;
import androidx.work.Operation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends androidx.camera.core.impl.utils.n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f18660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f18661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V0.r f18662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f18663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f18664s;
    public final ArrayList t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18665u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p1.d f18666v;

    static {
        V0.C.d("WorkContinuationImpl");
    }

    public n(s sVar, String str, V0.r rVar, List list) {
        this.f18660o = sVar;
        this.f18661p = str;
        this.f18662q = rVar;
        this.f18663r = list;
        this.f18664s = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (rVar == V0.r.f9964a && ((X) list.get(i7)).f9910b.f18631u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((X) list.get(i7)).f9909a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.f18664s.add(string);
            this.t.add(string);
        }
    }

    public static HashSet F(n nVar) {
        HashSet hashSet = new HashSet();
        nVar.getClass();
        return hashSet;
    }

    public final Operation E() {
        if (this.f18665u) {
            V0.C c6 = V0.C.c();
            TextUtils.join(", ", this.f18664s);
            c6.getClass();
        } else {
            s sVar = this.f18660o;
            this.f18666v = p002a.a.q(sVar.f18676c.f9934o, "EnqueueRunnable_" + this.f18662q.name(), sVar.f18678e.f18727a, new X6.c(this, 6));
        }
        return this.f18666v;
    }
}

package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17204e;

    public r0(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f17200a = i7;
        this.f17201b = arrayList;
        this.f17202c = arrayList2;
        this.f17203d = arrayList3;
        this.f17204e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i7 = 0; i7 < this.f17200a; i7++) {
            View view = (View) this.f17201b.get(i7);
            String str = (String) this.f17202c.get(i7);
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            androidx.core.view.E.o(view, str);
            androidx.core.view.E.o((View) this.f17203d.get(i7), (String) this.f17204e.get(i7));
        }
    }
}

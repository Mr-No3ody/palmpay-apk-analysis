package androidx.core.view;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f16198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f16199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f16200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f16201d;

    public a0(W w3) {
        super(w3.getDispatchMode());
        this.f16201d = new HashMap();
        this.f16198a = w3;
    }

    public final d0 a(WindowInsetsAnimation windowInsetsAnimation) {
        d0 d0Var = (d0) this.f16201d.get(windowInsetsAnimation);
        if (d0Var == null) {
            d0Var = new d0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                d0Var.f16210a = new b0(windowInsetsAnimation);
            }
            this.f16201d.put(windowInsetsAnimation, d0Var);
        }
        return d0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f16198a.onEnd(a(windowInsetsAnimation));
        this.f16201d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f16198a.onPrepare(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f16200c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f16200c = arrayList2;
            this.f16199b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = Va.a.j(list.get(size));
            d0 d0VarA = a(windowInsetsAnimationJ);
            d0VarA.f16210a.d(windowInsetsAnimationJ.getFraction());
            this.f16200c.add(d0VarA);
        }
        return this.f16198a.onProgress(q0.h(null, windowInsets), this.f16199b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        V vOnStart = this.f16198a.onStart(a(windowInsetsAnimation), new V(bounds));
        vOnStart.getClass();
        Va.a.l();
        return Va.a.h(vOnStart.f16185a.d(), vOnStart.f16186b.d());
    }
}

package p343x;

import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.appcompat.widget.h1;
import androidx.core.view.U;
import java.util.ArrayList;
import java.util.Iterator;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseInterpolator f43549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f43550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43551e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f43548b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f43552f = new h1(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43547a = new ArrayList();

    public final void a() {
        if (this.f43551e) {
            Iterator it = this.f43547a.iterator();
            while (it.hasNext()) {
                ((U) it.next()).b();
            }
            this.f43551e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f43551e) {
            return;
        }
        for (U u6 : this.f43547a) {
            long j6 = this.f43548b;
            if (j6 >= 0) {
                u6.c(j6);
            }
            BaseInterpolator baseInterpolator = this.f43549c;
            if (baseInterpolator != null && (view = (View) u6.f16184a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f43550d != null) {
                u6.d(this.f43552f);
            }
            View view2 = (View) u6.f16184a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f43551e = true;
    }
}

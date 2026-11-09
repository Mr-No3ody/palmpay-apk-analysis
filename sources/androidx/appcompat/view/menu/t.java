package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public class t implements MenuHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f12482e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuPresenter.Callback f12485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f12486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f12487j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12483f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f12488k = new s(this);

    public t(int i7, Context context, View view, k kVar, boolean z3) {
        this.f12478a = context;
        this.f12479b = kVar;
        this.f12482e = view;
        this.f12480c = z3;
        this.f12481d = i7;
    }

    public final r a() {
        r vVar;
        if (this.f12486i == null) {
            Context context = this.f12478a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(p241q.d.abc_cascading_menus_min_smallest_width)) {
                vVar = new g(context, this.f12482e, this.f12481d, this.f12480c);
            } else {
                View view = this.f12482e;
                Context context2 = this.f12478a;
                boolean z3 = this.f12480c;
                vVar = new v(this.f12481d, context2, view, this.f12479b, z3);
            }
            vVar.a(this.f12479b);
            vVar.g(this.f12488k);
            vVar.c(this.f12482e);
            vVar.setCallback(this.f12485h);
            vVar.d(this.f12484g);
            vVar.e(this.f12483f);
            this.f12486i = vVar;
        }
        return this.f12486i;
    }

    public final boolean b() {
        r rVar = this.f12486i;
        return rVar != null && rVar.isShowing();
    }

    public void c() {
        this.f12486i = null;
        s sVar = this.f12487j;
        if (sVar != null) {
            sVar.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z3, boolean z8) {
        r rVarA = a();
        rVarA.h(z8);
        if (z3) {
            if ((Gravity.getAbsoluteGravity(this.f12483f, this.f12482e.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f12482e.getWidth();
            }
            rVarA.f(i7);
            rVarA.i(i10);
            int i11 = (int) ((this.f12478a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            rVarA.f12476a = new Rect(i7 - i11, i10 - i11, i7 + i11, i10 + i11);
        }
        rVarA.show();
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public final void dismiss() {
        if (b()) {
            this.f12486i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public final void setPresenterCallback(MenuPresenter.Callback callback) {
        this.f12485h = callback;
        r rVar = this.f12486i;
        if (rVar != null) {
            rVar.setCallback(callback);
        }
    }
}

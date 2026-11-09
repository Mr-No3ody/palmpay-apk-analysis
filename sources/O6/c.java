package O6;

import L6.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f6596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f6598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f6602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f6603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnClickListener f6604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f6608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f6610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f6611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6613s;
    public String t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f6616w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6614u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6615v = i.ppDefaultDialogTheme;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6617x = true;

    public c(Context context) {
        this.f6595a = context;
    }

    public final d a() {
        int i7;
        int i10 = this.f6614u;
        Context context = this.f6595a;
        d dVar = (i10 == 3 || i10 == 4) ? new d(context, L6.g.lib_ui_layout_dialog_type_at_bottom) : new d(context, L6.g.lib_ui_layout_dialog_type_at_center);
        if (this.f6606l == 0 && ((i7 = this.f6614u) == 3 || i7 == 4)) {
            this.f6606l = 3;
        }
        dVar.f6632d = this.f6616w;
        dVar.f6628Q = this.f6598d;
        dVar.f6629X = this.f6599e;
        dVar.f6627M = this.f6596b;
        String str = this.f6597c;
        dVar.f6626L = d.f(str) == null ? null : str.toString();
        dVar.f6638k0 = this.f6601g;
        dVar.f6631Z = this.f6600f;
        dVar.f6642q0 = this.f6603i;
        dVar.f6641p0 = this.f6602h;
        dVar.f6643r0 = this.f6604j;
        dVar.f6644s0 = this.f6605k;
        dVar.f6630Y = this.f6606l;
        dVar.f6645t0 = this.f6607m;
        dVar.f6648v0 = this.f6608n;
        dVar.f6650w0 = this.f6609o;
        dVar.f6646u0 = 0;
        dVar.f6651x0 = this.f6610p;
        dVar.f6652y0 = this.f6611q;
        dVar.f6653z0 = this.f6612r;
        dVar.f6619A0 = this.f6613s;
        dVar.f6621B0 = this.t;
        dVar.f6590a = context;
        dVar.f6623C0 = this.f6614u;
        dVar.f6624D0 = this.f6615v;
        dVar.setCancelable(this.f6617x);
        return dVar;
    }

    public final void b(int i7) {
        Context context = this.f6595a;
        if (context != null) {
            this.f6598d = context.getString(i7);
        }
    }

    public final void c(int i7, View.OnClickListener onClickListener) {
        Context context = this.f6595a;
        if (context != null) {
            this.f6601g = context.getString(i7);
        }
        this.f6603i = onClickListener;
    }

    public final void d(int i7, View.OnClickListener onClickListener) {
        Context context = this.f6595a;
        if (context != null) {
            this.f6600f = context.getString(i7);
        }
        this.f6602h = onClickListener;
    }

    public final void e(int i7) {
        Context context = this.f6595a;
        if (context != null) {
            this.f6596b = context.getString(i7);
        }
    }

    public final void f(String str) {
        this.f6596b = d.f(str);
    }

    public final d g() {
        d dVarA = a();
        dVarA.show();
        int i7 = this.f6614u;
        if (i7 == 3 || i7 == 4) {
            dVarA.showAtBottom(dVarA.getWindow());
            return dVarA;
        }
        Window window = dVarA.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (p059e1.a.y(this.f6595a) * 0.916f);
        window.setAttributes(attributes);
        return dVarA;
    }
}

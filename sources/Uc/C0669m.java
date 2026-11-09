package Uc;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: renamed from: Uc.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0669m extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f9673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f9674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f9675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f9676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f9677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f9678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f9679g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f9680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f9681j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f9682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f9683p;
    public final /* synthetic */ C0670n t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0669m(C0670n c0670n, View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.t = c0670n;
        this.f9673a = C2131j.b(new C0665k(view, 0));
        this.f9674b = C2131j.b(new C0665k(view, 3));
        this.f9675c = C2131j.b(new C0665k(view, 4));
        this.f9676d = C2131j.b(new C0665k(view, 5));
        this.f9677e = C2131j.b(new C0665k(view, 6));
        this.f9678f = C2131j.b(new C0665k(view, 7));
        this.f9679g = C2131j.b(new C0665k(view, 8));
        this.f9680i = C2131j.b(new C0665k(view, 9));
        this.f9681j = C2131j.b(new C0665k(view, 10));
        this.f9682o = C2131j.b(new C0665k(view, 1));
        this.f9683p = C2131j.b(new C0665k(view, 2));
    }

    public final TextView a() {
        Object value = this.f9679g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }
}

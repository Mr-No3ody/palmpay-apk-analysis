package Uc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: renamed from: Uc.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0662i0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f9653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f9654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f9655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f9656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f9657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f9658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f9659g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f9660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0664j0 f9661j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0662i0(C0664j0 c0664j0, View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f9661j = c0664j0;
        this.f9653a = C2131j.b(new C0665k(view, 11));
        this.f9654b = C2131j.b(new C0665k(view, 12));
        this.f9655c = C2131j.b(new C0665k(view, 13));
        this.f9656d = C2131j.b(new C0665k(view, 14));
        this.f9657e = C2131j.b(new C0665k(view, 15));
        this.f9658f = C2131j.b(new C0665k(view, 16));
        this.f9659g = C2131j.b(new C0665k(view, 17));
        this.f9660i = C2131j.b(new C0665k(view, 18));
    }

    public final ViewGroup a() {
        Object value = this.f9659g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewGroup) value;
    }
}

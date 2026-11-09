package Xd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Kb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f11151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f11152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f11153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f11154g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f11155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f11156j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f11157o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, View view) {
        super(lVar, view);
        this.f11157o = lVar;
        this.f11151d = view != null ? (TextView) view.findViewById(Pd.c.textViewText) : null;
        this.f11152e = view != null ? (ImageView) view.findViewById(Pd.c.company_img) : null;
        this.f11153f = view != null ? (TextView) view.findViewById(Pd.c.qlp_cashback_iv) : null;
        this.f11154g = view != null ? (ImageView) view.findViewById(Pd.c.qlp_coupon_iv) : null;
        this.f11155i = view != null ? (TextView) view.findViewById(Pd.c.qlp_desc_tv) : null;
        this.f11156j = view != null ? (TextView) view.findViewById(Pd.c.qlp_title_tv) : null;
        a(view);
    }
}

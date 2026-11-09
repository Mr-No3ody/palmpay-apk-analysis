package p052da;

import Kb.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;

/* JADX INFO: renamed from: da.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1642n extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinearLayout f35783A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinearLayout f35784B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ConstraintLayout f35785C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final TextView f35786H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ C1643o f35787L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f35788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f35789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f35790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f35791g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f35792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f35793j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IconicsImageView f35794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f35795p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RelativeLayout f35796v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f35797w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642n(C1643o c1643o, View itemView) {
        super(c1643o, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f35787L = c1643o;
        View viewFindViewById = itemView.findViewById(e.icii_coupon_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f35788d = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.icil_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f35789e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.icil_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f35790f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.icil_text_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f35791g = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.icil_text_tv1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f35792i = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(e.icil_text_tv2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f35793j = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(e.icii_iv_expand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f35794o = (IconicsImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(e.imageViewCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById8;
        this.f35795p = imageView;
        View viewFindViewById9 = itemView.findViewById(e.icil_coupon_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.t = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(e.rl_left);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f35796v = (RelativeLayout) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(e.ll_right);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f35797w = (LinearLayout) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(e.cl_expand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f35785C = (ConstraintLayout) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(e.llDetailArrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById13;
        this.f35783A = linearLayout;
        View viewFindViewById14 = itemView.findViewById(e.tvUnavailableReason);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f35786H = (TextView) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(e.ll_expand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f35784B = (LinearLayout) viewFindViewById15;
        a(linearLayout);
        a(imageView);
    }
}

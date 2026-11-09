package p351xb;

import Ya.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f43790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f43791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f43792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProgressBar f43793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43795g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f43796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f43797j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f43798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f43799p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Group f43800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f43801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.top_divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43789a = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.bottom_divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43790b = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.hor_divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43791c = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.status_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43792d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.index_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43793e = (ProgressBar) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(e.index_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f43794f = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(e.index_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f43795g = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(e.due_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f43796i = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(e.amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f43797j = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(e.principal_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f43798o = (TextView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(e.interest_fee_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f43799p = (TextView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(e.service_fee_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.t = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(e.principal_group);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f43800v = (Group) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(e.tvPeriod);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f43801w = (TextView) viewFindViewById14;
    }
}

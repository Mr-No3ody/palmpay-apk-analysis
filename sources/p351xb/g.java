package p351xb;

import Ya.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f43763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IconicsImageView f43765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f43766g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f43767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f43768j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f43769o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.icil_coupon_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43760a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.icil_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43761b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.icil_text_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43762c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.imageViewCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43763d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.icil_text_tv1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43764e = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(e.icii_iv_expand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f43765f = (IconicsImageView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(e.llDetailArrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f43766g = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(e.icii_coupon_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f43767i = (ImageView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(e.ll_expand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f43768j = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(e.icil_text_tv2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f43769o = (TextView) viewFindViewById10;
    }
}

package D9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f1706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f1707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f1708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f1709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f1710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f1711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IconicsTextView f1712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PpButton f1713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PpButton f1714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IconicsTextView f1715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f1716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddMoneyHomeActivity f1717m;

    public c(AddMoneyHomeActivity addMoneyHomeActivity, View mItemView) {
        Intrinsics.checkNotNullParameter(mItemView, "mItemView");
        this.f1717m = addMoneyHomeActivity;
        this.f1705a = mItemView;
        View viewFindViewById = mItemView.findViewById(p366y9.b.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f1706b = (ImageView) viewFindViewById;
        View viewFindViewById2 = mItemView.findViewById(p366y9.b.ivCorner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f1707c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = mItemView.findViewById(p366y9.b.ivLevel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f1708d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = mItemView.findViewById(p366y9.b.tvLine1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f1709e = (TextView) viewFindViewById4;
        View viewFindViewById5 = mItemView.findViewById(p366y9.b.tvLine2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f1710f = (TextView) viewFindViewById5;
        View viewFindViewById6 = mItemView.findViewById(p366y9.b.tvAccountNo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f1711g = (TextView) viewFindViewById6;
        View viewFindViewById7 = mItemView.findViewById(p366y9.b.tvLevel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f1712h = (IconicsTextView) viewFindViewById7;
        View viewFindViewById8 = mItemView.findViewById(p366y9.b.rtvCopy);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f1713i = (PpButton) viewFindViewById8;
        View viewFindViewById9 = mItemView.findViewById(p366y9.b.rtvShare);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f1714j = (PpButton) viewFindViewById9;
        View viewFindViewById10 = mItemView.findViewById(p366y9.b.ivExchange);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f1715k = (IconicsTextView) viewFindViewById10;
        View viewFindViewById11 = mItemView.findViewById(p366y9.b.csl_top);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f1716l = (ConstraintLayout) viewFindViewById11;
    }
}

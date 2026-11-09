package N8;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3PendingActivity;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SimpleDateFormat f6121o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f6123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f6124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f6125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f6126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f6127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f6128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f6129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f6130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f6131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f6132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f6133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f6134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f6135n;

    static {
        new A(null);
        f6121o = new SimpleDateFormat("MMM d, yyyy h:mma", Locale.ENGLISH);
    }

    public B(PalmPayTier3PendingActivity mContext, View itemView) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f6122a = itemView;
        View viewFindViewById = itemView.findViewById(F8.d.tvTime1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f6123b = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(F8.d.tvTime2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f6124c = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(F8.d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f6125d = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(F8.d.tvTitle1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f6126e = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(F8.d.tvTitle2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f6127f = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(F8.d.tvTitle3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f6128g = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(F8.d.tvMessage1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f6129h = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(F8.d.tvMessage2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f6130i = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(F8.d.ivIcon1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        View viewFindViewById10 = itemView.findViewById(F8.d.ivIcon2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f6131j = (ImageView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(F8.d.ivIcon3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f6132k = (ImageView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(F8.d.successView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f6133l = viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(F8.d.failView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f6134m = viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(F8.d.tvError);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f6135n = (TextView) viewFindViewById14;
        ((ImageView) viewFindViewById9).setImageDrawable(G8.a.x(mContext, S6.a.pay_SelectedFill, null, Integer.valueOf(L6.b.ppColorSuccess), 20.0f, 114));
    }
}

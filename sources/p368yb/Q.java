package p368yb;

import Kb.b;
import Ya.e;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f44194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f44195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f44196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f44197g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f44198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s3, View itemView) {
        super(s3, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44194d = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.tvPhoneNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44195e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = itemView.findViewById(e.tvInvite);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        this.f44196f = textView;
        View viewFindViewById5 = itemView.findViewById(e.tvCash);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f44197g = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(e.tvStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f44198i = (TextView) viewFindViewById6;
        a(textView);
    }
}

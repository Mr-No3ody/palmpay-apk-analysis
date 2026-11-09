package p368yb;

import Kb.b;
import Ya.e;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f44188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f44189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f44190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f44191g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f44192i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, View itemView) {
        super(n10, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.tvName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44188d = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.tvTime);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44189e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.tvPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44190f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.tvFailed);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f44191g = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.tvProcessing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f44192i = (TextView) viewFindViewById5;
    }
}

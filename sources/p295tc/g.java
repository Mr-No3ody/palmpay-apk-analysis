package p295tc;

import Kb.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p236pc.d;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f42565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f42566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f42567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f42568g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, View itemView) {
        super(hVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(d.tvRank);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f42565d = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(d.tvName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f42566e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(d.tvMoney);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f42567f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(d.ivRank);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f42568g = (ImageView) viewFindViewById4;
    }
}

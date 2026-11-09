package W9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Kb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f10630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f10631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f10632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f10633g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f10634i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, View itemView) {
        super(kVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R9.d.cpt_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f10630d = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R9.d.cpt_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f10631e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R9.d.cpt_link);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f10632f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R9.d.cpt_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f10633g = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R9.d.iv3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f10634i = (ImageView) viewFindViewById5;
    }
}

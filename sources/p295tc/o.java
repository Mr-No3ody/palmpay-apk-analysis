package p295tc;

import Kb.b;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p236pc.d;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f42584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f42585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f42586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f42587g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f42588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f42589j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, View itemView) {
        super(pVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(d.jp_history_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f42584d = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(d.jp_history_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f42585e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(d.jp_history_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f42586f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(d.jp_history_failed);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        this.f42587g = textView;
        View viewFindViewById5 = itemView.findViewById(d.jp_history_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById5;
        this.f42588i = textView2;
        View viewFindViewById6 = itemView.findViewById(d.jp_history_risk_desc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f42589j = (TextView) viewFindViewById6;
        a(textView2);
        a(textView);
    }
}

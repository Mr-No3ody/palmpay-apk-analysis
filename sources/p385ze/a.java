package p385ze;

import Ac.e;
import Yb.b;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f44690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f44690d = bVar;
        View viewFindViewById = itemView.findViewById(e.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44687a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.tvValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44688b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.tvIncome);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44689c = (TextView) viewFindViewById3;
    }
}

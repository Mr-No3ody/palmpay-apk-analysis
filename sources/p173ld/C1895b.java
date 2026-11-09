package p173ld;

import Kb.b;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;

/* JADX INFO: renamed from: ld.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1895b extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f39318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f39319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f39320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f39321g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895b(d dVar, View itemView) {
        super(dVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f39321g = dVar;
        View viewFindViewById = itemView.findViewById(e.abl_month_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f39318d = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.money_in_textViewSummary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f39320f = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.money_out_textViewSummary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f39319e = (TextView) viewFindViewById3;
    }
}

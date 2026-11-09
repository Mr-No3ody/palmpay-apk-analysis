package p368yb;

import Ya.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2134b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2134b(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.bill_name_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44222a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.bill_overdue_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44223b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.bill_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44224c = (TextView) viewFindViewById3;
    }
}

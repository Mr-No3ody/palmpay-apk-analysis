package p368yb;

import Ya.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2145m extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2145m(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.history_bill_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44238a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.oc_bill_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44239b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.oc_bill_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44240c = (TextView) viewFindViewById3;
    }
}

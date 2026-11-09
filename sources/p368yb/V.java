package p368yb;

import Ya.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.oc_repaid_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44208a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.oc_bill_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44209b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.oc_bill_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44210c = (TextView) viewFindViewById3;
    }
}

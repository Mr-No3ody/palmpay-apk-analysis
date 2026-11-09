package p351xb;

import Ya.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.cl_repayment_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43814a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.cl_repayment_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43815b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.repayment_type_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43816c = (TextView) viewFindViewById3;
    }
}

package p351xb;

import Ya.e;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckedTextView f43822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.repayment_date_fl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43821a = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.installment_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43822b = (CheckedTextView) viewFindViewById2;
    }
}

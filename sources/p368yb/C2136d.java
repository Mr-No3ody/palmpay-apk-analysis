package p368yb;

import Ya.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2136d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2136d(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.increase_name_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44226a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.increase_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44227b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.increase_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44228c = (TextView) viewFindViewById3;
    }
}

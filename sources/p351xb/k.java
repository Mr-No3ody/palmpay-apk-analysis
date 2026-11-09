package p351xb;

import Ya.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.tvOrderName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43783a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.tvOrderDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43784b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.tvOrderAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43785c = (TextView) viewFindViewById3;
    }
}

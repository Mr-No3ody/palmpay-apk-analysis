package p368yb;

import Ya.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f44174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44172a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.interest_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44173b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44174c = viewFindViewById3;
    }
}

package p351xb;

import Ya.e;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f43778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f43779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f43780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.index_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43775a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43776b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.due_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43777c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.plan_progress_pb);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43778d = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.top_divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43779e = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(e.bottom_divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f43780f = viewFindViewById6;
    }
}

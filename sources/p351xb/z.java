package p351xb;

import Ya.e;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f43833g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f43834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f43835j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.plan_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43827a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.cur_plan_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43828b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.index_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43829c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.due_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43830d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.plan_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43831e = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(e.service_fee_amount_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f43832f = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(e.plan_progress_pb);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f43833g = (ProgressBar) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(e.top_divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f43834i = viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(e.bottom_divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f43835j = viewFindViewById9;
    }
}

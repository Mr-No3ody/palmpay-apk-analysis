package p351xb;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(Ya.e.cl_borrow_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43757a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Ya.e.cl_borrow_date_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43758b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Ya.e.cl_borrow_status_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43759c = (TextView) viewFindViewById3;
    }
}

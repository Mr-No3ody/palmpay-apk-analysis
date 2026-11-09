package p368yb;

import Ya.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2153v extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f44268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f44269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2153v(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.feedback_title_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44265a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.feedback_status_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44266b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.feedback_no_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44267c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.copy_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f44268d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.feedback_time_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f44269e = (TextView) viewFindViewById5;
    }
}

package p370ye;

import Ac.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f44317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f44319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f44320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f44321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(e.tvTime);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44317a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(e.tvStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44318b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(e.tvLine1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44319c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(e.tvAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f44320d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(e.dividerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f44321e = viewFindViewById5;
    }
}

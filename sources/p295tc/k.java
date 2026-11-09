package p295tc;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p236pc.d;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f42573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f42574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f42575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f42576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = this.itemView.findViewById(d.jp_history_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f42573a = (TextView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(d.jp_history_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f42574b = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(d.jp_history_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f42575c = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(d.jp_history_failed);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f42576d = (TextView) viewFindViewById4;
    }
}

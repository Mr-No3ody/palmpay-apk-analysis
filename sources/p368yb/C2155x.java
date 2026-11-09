package p368yb;

import Ya.e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2155x extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2155x(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.cofsParent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44270a = viewFindViewById;
    }
}

package p368yb;

import Ya.e;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckedTextView f44181a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.check_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44181a = (CheckedTextView) viewFindViewById;
    }
}

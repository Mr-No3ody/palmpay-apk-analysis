package p368yb;

import Ya.e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2138f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2138f(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.bank_card_empty_root_cl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44229a = viewFindViewById;
    }
}

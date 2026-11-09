package p052da;

import L9.a;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f35673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f35674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(a.ivShareImg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f35673a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(a.ivShareClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f35674b = (ImageView) viewFindViewById2;
    }
}

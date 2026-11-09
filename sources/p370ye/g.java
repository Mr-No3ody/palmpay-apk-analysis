package p370ye;

import Ac.e;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f44324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f44325b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f44325b = hVar;
        View viewFindViewById = itemView.findViewById(e.indicatorIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44324a = (ImageView) viewFindViewById;
    }
}

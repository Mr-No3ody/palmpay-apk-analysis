package p351xb;

import Ya.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f43810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.receive_account_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43808a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.receive_account_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43809b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.selected_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43810c = (ImageView) viewFindViewById3;
    }
}

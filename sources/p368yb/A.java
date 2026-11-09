package p368yb;

import Ya.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f44152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f44153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.menu_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44152a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.menu_content_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44153b = (TextView) viewFindViewById2;
    }
}

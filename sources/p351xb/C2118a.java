package p351xb;

import Ya.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2118a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2118a(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.payment_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43748a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.payment_name_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43749b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.payment_num_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43750c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.first_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43751d = (TextView) viewFindViewById4;
    }
}

package p368yb;

import Ya.e;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2156y extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapeableImageView f44271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f44272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156y(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.selected_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44271a = (ShapeableImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.delete_fl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44272b = (FrameLayout) viewFindViewById2;
    }
}

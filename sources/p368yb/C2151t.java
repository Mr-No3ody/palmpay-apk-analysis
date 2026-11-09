package p368yb;

import Ya.e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2151t extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapeableImageView f44262a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2151t(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.feedback_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44262a = (ShapeableImageView) viewFindViewById;
    }
}

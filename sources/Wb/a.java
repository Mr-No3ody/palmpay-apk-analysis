package Wb;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f10662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f10663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(s.top_menu_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f10661a = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(s.top_menu_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f10662b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(s.divider_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f10663c = viewFindViewById3;
    }
}

package yc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p236pc.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Kb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f44279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f44280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f44281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, View itemView) {
        super(bVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(d.parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44279d = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(d.ivCommentsHead);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f44280e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(d.tvCommentsContent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f44281f = (TextView) viewFindViewById3;
        a(viewFindViewById);
    }
}

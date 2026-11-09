package B6;

import E.AbstractC0198c;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f481h;

    public e0(View contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        View viewFindViewById = contentView.findViewById(p232p6.t.itemLeft);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f474a = viewFindViewById;
        View viewFindViewById2 = contentView.findViewById(p232p6.t.itemRight);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f475b = viewFindViewById2;
        View viewFindViewById3 = contentView.findViewById(p232p6.t.tv_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f476c = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(p232p6.t.iv_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f477d = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById.findViewById(p232p6.t.tv_directive);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f478e = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewFindViewById2.findViewById(p232p6.t.iv_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f479f = (AppCompatImageView) viewFindViewById6;
        View viewFindViewById7 = viewFindViewById2.findViewById(p232p6.t.tv_directive);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f480g = (TextView) viewFindViewById7;
        Context context = contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f481h = AbstractC0198c.h(p232p6.q.face_primary_color, context);
    }
}

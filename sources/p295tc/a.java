package p295tc;

import Kb.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p236pc.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f42534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f42535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f42536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f42537g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f42538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f42539j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f42540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f42541p;
    public final TextView t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, View itemView) {
        super(bVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(d.parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f42534d = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(d.ivAvatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f42535e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(d.ivMark);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = itemView.findViewById(d.ivPic1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f42536f = imageView;
        View viewFindViewById5 = itemView.findViewById(d.ivPic2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f42537g = imageView2;
        View viewFindViewById6 = itemView.findViewById(d.ivPic3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById6;
        this.f42538i = imageView3;
        View viewFindViewById7 = itemView.findViewById(d.tvName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f42539j = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(d.tvTime);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f42540o = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(d.tvMoney);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f42541p = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(d.tvComments);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.t = (TextView) viewFindViewById10;
        a(imageView);
        a(imageView2);
        a(imageView3);
    }
}

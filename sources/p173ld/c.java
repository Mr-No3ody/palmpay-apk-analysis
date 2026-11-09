package p173ld;

import Kb.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p159kd.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f39322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f39323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f39324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f39325g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f39326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f39327j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f39328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f39329p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, View itemView) {
        super(dVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f39329p = dVar;
        View viewFindViewById = itemView.findViewById(e.imageViewAvatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f39322d = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(e.textViewAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f39323e = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(e.textViewState);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f39324f = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(e.textViewLine1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f39325g = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(e.textViewLine2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f39326i = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(e.tvLine3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f39327j = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(e.tv_booked);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f39328o = (TextView) viewFindViewById7;
        a(itemView);
    }
}

package we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43478g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f43479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f43480j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(Ac.e.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43472a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Ac.e.textViewTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43473b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Ac.e.textViewState);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43474c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Ac.e.textViewAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43475d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(Ac.e.textViewLine10);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43476e = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(Ac.e.textViewLine11);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f43477f = (TextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(Ac.e.textViewDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f43478g = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(Ac.e.textViewNext);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f43479i = (TextView) viewFindViewById8;
        this.f43480j = itemView.getContext().getColor(L6.b.ppColorPrimary);
    }
}

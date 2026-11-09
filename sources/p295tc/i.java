package p295tc;

import Kb.b;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p236pc.d;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f42569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f42570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Button f42571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f42572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, View itemView) {
        super(jVar, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = this.itemView.findViewById(d.tvPhoneNum);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f42569d = (TextView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(d.tvUserName);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f42570e = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(d.jp_invitees_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        Button button = (Button) viewFindViewById3;
        this.f42571f = button;
        View viewFindViewById4 = this.itemView.findViewById(d.jp_invitees_complete);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f42572g = (ImageView) viewFindViewById4;
        a(button);
    }
}

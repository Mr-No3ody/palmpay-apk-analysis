package p368yb;

import Kb.b;
import Ya.e;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f44193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s3, View itemView) {
        super(s3, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(e.parentInvite);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f44193d = viewFindViewById;
        a(viewFindViewById);
    }
}

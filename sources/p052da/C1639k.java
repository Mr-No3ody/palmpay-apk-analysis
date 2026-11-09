package p052da;

import Kb.b;
import Uc.C0665k;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: renamed from: da.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1639k extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f35779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f35780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f35781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f35782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639k(C1640l c1640l, View itemView) {
        super(c1640l, itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f35779d = C2131j.b(new C0665k(itemView, 26));
        this.f35780e = C2131j.b(new C0665k(itemView, 27));
        this.f35781f = C2131j.b(new C0665k(itemView, 28));
        this.f35782g = C2131j.b(new C0665k(itemView, 29));
        View viewFindViewById = itemView.findViewById(e.cib_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((ConstraintLayout) viewFindViewById).getLayoutParams().width = ScreenUtils.getScreenWidth() / 4;
    }
}

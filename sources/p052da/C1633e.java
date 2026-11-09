package p052da;

import Kb.b;
import com.transsnet.palmpay.core.viewmodel.PayMethodItemV3;
import com.transsnet.palmpay.custom_view.r;

/* JADX INFO: renamed from: da.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1633e extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PayMethodItemV3 f35764d;

    public C1633e(C1634f c1634f, PayMethodItemV3 payMethodItemV3) {
        super(c1634f, payMethodItemV3);
        this.f35764d = payMethodItemV3;
        payMethodItemV3.f28554j.setImageResource(r.cv_check);
        payMethodItemV3.f28556p.setVisibility(0);
        a(payMethodItemV3.f28553i);
    }
}

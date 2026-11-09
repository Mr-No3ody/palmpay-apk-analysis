package p052da;

import Kb.b;
import com.transsnet.palmpay.core.viewmodel.PayMethodItem;
import com.transsnet.palmpay.custom_view.r;

/* JADX INFO: renamed from: da.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1631c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PayMethodItem f35758d;

    public C1631c(C1632d c1632d, PayMethodItem payMethodItem) {
        super(c1632d, payMethodItem);
        this.f35758d = payMethodItem;
        payMethodItem.f28534j.setImageResource(r.cv_check);
        payMethodItem.f28536p.setVisibility(0);
        a(payMethodItem.f28533i);
    }
}

package p052da;

import Kb.b;
import android.view.View;
import com.transsnet.palmpay.core.viewmodel.PayMethodItem;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Q extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PayMethodItem f35723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35724e;

    public Q(S s3, View view) {
        super(s3, view);
        this.f35724e = 17;
        int iDp2px = SizeUtils.dp2px(20.0f);
        PayMethodItem payMethodItem = (PayMethodItem) view;
        this.f35723d = payMethodItem;
        payMethodItem.f28534j.setVisibility(0);
        payMethodItem.f28534j.getLayoutParams().width = iDp2px;
        payMethodItem.f28534j.getLayoutParams().height = iDp2px;
        a(payMethodItem.f28533i);
    }
}

package Pc;

import La.F;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.managemoney.ui.mvp.contract.FixedSavingContract;
import kotlin.jvm.internal.Intrinsics;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends F implements FixedSavingContract.Presenter {
    @Override // com.transsnet.palmpay.managemoney.ui.mvp.contract.FixedSavingContract.Presenter
    public final void queryPreviewInfo(PreviewPayInfoV2Req req) {
        Intrinsics.checkNotNullParameter(req, "req");
        ((PayApiService) c.f43141a.f14621b).queryPreviewPayInfoV2(req).k(f.f42629b).i(p071ef.b.a()).subscribe(new a(this));
    }
}

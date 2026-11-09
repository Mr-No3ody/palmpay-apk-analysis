package La;

import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewPayInfoV2Req f5608b;

    public /* synthetic */ w(PreviewPayInfoV2Req previewPayInfoV2Req, int i7) {
        this.f5607a = i7;
        this.f5608b = previewPayInfoV2Req;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5607a) {
            case 0:
                break;
        }
        return ((PayApiService) p324va.c.f43141a.f14621b).queryPreviewPayInfoV2(this.f5608b);
    }
}

package La;

import com.transsnet.palmpay.core.bean.req.DefaultPayMethodReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultPayMethodReq f5565b;

    public /* synthetic */ B(DefaultPayMethodReq defaultPayMethodReq, int i7) {
        this.f5564a = i7;
        this.f5565b = defaultPayMethodReq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5564a) {
            case 0:
                return ((AccountApiService) p324va.c.f43141a.f14623d).queryPaymentMethodV4(this.f5565b);
            default:
                return ((AccountApiService) p324va.c.f43141a.f14623d).queryDefaultMethod(this.f5565b);
        }
    }
}

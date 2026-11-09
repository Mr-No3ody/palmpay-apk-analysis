package Fe;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.CheckAppVersionAndUploadRsp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fe.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0264l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2790b;

    public /* synthetic */ C0264l(long j6, int i7) {
        this.f2789a = i7;
        this.f2790b = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2789a) {
            case 0:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                if (commonBeanResult.isSuccess()) {
                    long j6 = ((CheckAppVersionAndUploadRsp) commonBeanResult.data).maxVersion;
                    if (j6 == 0) {
                        j6 = this.f2790b;
                    }
                    String strR = androidx.camera.core.impl.utils.executor.g.r();
                    Intrinsics.checkNotNullExpressionValue(strR, "getLastUploadAppVersionKey(...)");
                    p059e1.a.V(j6, strR);
                }
                return Unit.f38893a;
            default:
                return Long.valueOf(this.f2790b);
        }
    }
}

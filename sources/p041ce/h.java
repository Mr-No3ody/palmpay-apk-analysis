package p041ce;

import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelActivityBannerWithCoupon f18943b;

    public /* synthetic */ h(ModelActivityBannerWithCoupon modelActivityBannerWithCoupon, int i7) {
        this.f18942a = i7;
        this.f18943b = modelActivityBannerWithCoupon;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f18942a) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                ?? r3 = this.f18943b.f34323c;
                if (r3 != 0) {
                    r3.invoke(Boolean.FALSE);
                }
                ToastUtils.showLong(it, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ?? r10 = this.f18943b.f34323c;
                if (r10 != 0) {
                    r10.invoke(Boolean.FALSE);
                }
                ToastUtils.showLong(it, new Object[0]);
                break;
        }
        return Unit.f38893a;
    }
}

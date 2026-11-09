package p041ce;

import U8.a;
import android.content.Context;
import androidx.camera.core.impl.L;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.dialog.CouponClaimResultDialog;
import com.transsnet.palmpay.teller.ui.view.BillerCouponClickListener;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelActivityBannerWithCoupon f18940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f18941c;

    public /* synthetic */ g(ModelActivityBannerWithCoupon modelActivityBannerWithCoupon, Context context, int i7) {
        this.f18939a = i7;
        this.f18940b = modelActivityBannerWithCoupon;
        this.f18941c = context;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18939a) {
            case 0:
                List<BillerCouponItemBean> list = (List) obj;
                ModelActivityBannerWithCoupon modelActivityBannerWithCoupon = this.f18940b;
                ?? r3 = modelActivityBannerWithCoupon.f34323c;
                if (r3 != 0) {
                    r3.invoke(Boolean.FALSE);
                }
                modelActivityBannerWithCoupon.f();
                CouponClaimResultDialog couponClaimResultDialog = new CouponClaimResultDialog(this.f18941c, 0, 0, 6, null);
                couponClaimResultDialog.setCouponType(ModelActivityBannerWithCoupon.f34320j.getTYPE_COUPON_PACKETAGE_ITEM()).setCouponItem(list).setResultCallback((ResultCallback<List<BillerCouponItemBean>>) new L(couponClaimResultDialog, 9)).show();
                BillerCouponClickListener mListener = modelActivityBannerWithCoupon.getMListener();
                if (mListener != null) {
                    mListener.onCouponClaimComplete();
                }
                break;
            default:
                BillerCouponItemBean billerCouponItemBean = (BillerCouponItemBean) obj;
                ModelActivityBannerWithCoupon modelActivityBannerWithCoupon2 = this.f18940b;
                ?? r10 = modelActivityBannerWithCoupon2.f34323c;
                if (r10 != 0) {
                    r10.invoke(Boolean.FALSE);
                }
                modelActivityBannerWithCoupon2.f();
                if (billerCouponItemBean != null) {
                    CouponClaimResultDialog couponClaimResultDialog2 = new CouponClaimResultDialog(this.f18941c, 0, 0, 6, null);
                    couponClaimResultDialog2.setCouponItem(C1849p.c(billerCouponItemBean)).setResultCallback((ResultCallback<List<BillerCouponItemBean>>) new a(19, modelActivityBannerWithCoupon2, couponClaimResultDialog2)).show();
                }
                BillerCouponClickListener mListener2 = modelActivityBannerWithCoupon2.getMListener();
                if (mListener2 != null) {
                    mListener2.onCouponClaimComplete();
                }
                break;
        }
        return Unit.f38893a;
    }
}

package p284sb;

import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import com.transsnet.palmpay.credit.bean.CouponAndPoint;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p185ma.e;
import p220oa.h;
import p355xf.l;
import p355xf.t;

/* JADX INFO: renamed from: sb.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2021t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayShopHomeActivity f42184b;

    public /* synthetic */ C2021t(PayShopHomeActivity payShopHomeActivity, int i7) {
        this.f42183a = i7;
        this.f42184b = payShopHomeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CouponAndPoint couponAndPoint;
        z = false;
        boolean z3 = false;
        PayShopHomeActivity payShopHomeActivity = this.f42184b;
        switch (this.f42183a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        QueryRecentlyMerchantResp queryRecentlyMerchantResp = (QueryRecentlyMerchantResp) ((p) it).f27360a;
                        if (queryRecentlyMerchantResp.isSuccess()) {
                            List<QueryRecentlyMerchantResp.Data> data = queryRecentlyMerchantResp.getData();
                            if (data != null) {
                                Object value = payShopHomeActivity.f28722p.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                ((LinearLayout) value).setVisibility(data.isEmpty() ? 8 : 0);
                                if (!data.isEmpty()) {
                                    if (!payShopHomeActivity.r().isShown()) {
                                        h.C(payShopHomeActivity.r());
                                        Object value2 = payShopHomeActivity.f28721o.getValue();
                                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                                        h.C((TextView) value2);
                                    }
                                    ((p339wb.q) payShopHomeActivity.f28720k0.getValue()).setList(data);
                                    if (data.size() > 2) {
                                        Object value3 = payShopHomeActivity.f28719j.getValue();
                                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                                        h.C((TextView) value3);
                                    }
                                }
                            }
                        } else {
                            h.x(payShopHomeActivity, queryRecentlyMerchantResp.getRespMsg());
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult.isSuccess() && (couponAndPoint = (CouponAndPoint) commonBeanResult.data) != null) {
                            t tVar = payShopHomeActivity.f28724w;
                            Object value4 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            LinearLayout linearLayout = (LinearLayout) value4;
                            if (!TextUtils.isEmpty(couponAndPoint.copyWriting) && !TextUtils.isEmpty(couponAndPoint.picture)) {
                                z3 = true;
                            }
                            h.s(linearLayout, z3);
                            String str = couponAndPoint.jumpUrl;
                            if (TextUtils.isEmpty(str)) {
                                str = null;
                            }
                            if (str != null) {
                                Object value5 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                                h.l(new e(str, 10), (LinearLayout) value5);
                            }
                            Object value6 = payShopHomeActivity.f28723v.getValue();
                            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                            r0.l1(couponAndPoint.picture, (ImageView) value6);
                            Object value7 = payShopHomeActivity.t.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            ((TextView) value7).setText(couponAndPoint.copyWriting);
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        CommonBooleanResult commonBooleanResult = (CommonBooleanResult) ((p) it3).f27360a;
                        if (commonBooleanResult.isSuccess()) {
                            SPUtils.getInstance().put(BaseApplication.get().getUser().getMemberId(), true);
                            if (!commonBooleanResult.getData()) {
                                int i7 = PayShopHomeActivity.f28705p0;
                                payShopHomeActivity.w(true);
                            }
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ((n) it3).getClass();
                        int i10 = PayShopHomeActivity.f28705p0;
                        payShopHomeActivity.w(true);
                    }
                }
                return Unit.f38893a;
        }
    }
}

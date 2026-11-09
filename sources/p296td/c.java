package p296td;

import Pa.r0;
import android.widget.ImageView;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.resp.VoiceNotifyResp;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayMeActivity f42595b;

    public /* synthetic */ c(PayMeActivity payMeActivity, int i7) {
        this.f42594a = i7;
        this.f42595b = payMeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42594a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        boolean zIsSuccess = commonBeanResult.isSuccess();
                        PayMeActivity payMeActivity = this.f42595b;
                        if (zIsSuccess) {
                            String str = (String) commonBeanResult.data;
                            if (str != null) {
                                Object value = payMeActivity.f33309f.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                r0.l1(str, (ImageView) value);
                            }
                        } else {
                            h.x(payMeActivity, commonBeanResult.getRespMsg());
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        boolean zIsSuccess2 = commonBeanResult2.isSuccess();
                        PayMeActivity payMeActivity2 = this.f42595b;
                        if (zIsSuccess2) {
                            VoiceNotifyResp voiceNotifyResp = (VoiceNotifyResp) commonBeanResult2.data;
                            if (voiceNotifyResp != null) {
                                payMeActivity2.f33313o = voiceNotifyResp;
                                PayMeActivity.m(payMeActivity2);
                            }
                        } else {
                            h.x(payMeActivity2, commonBeanResult2.getRespMsg());
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        n nVar = (n) it2;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}

package p310ub;

import Jb.A;
import Ya.g;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.OcDefaultPayMethodStatusData;
import com.transsnet.palmpay.credit.bean.resp.OcDefaultPayMethodStatusResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSetDefaultPayMethodActivity;
import com.transsnet.palmpay.credit.viewmodel.OcSetDefaultPayMethodViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcSetDefaultPayMethodActivity f42919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OcSetDefaultPayMethodActivity f42920c;

    public /* synthetic */ s1(OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity, OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity2, int i7) {
        this.f42918a = i7;
        this.f42919b = ocSetDefaultPayMethodActivity;
        this.f42920c = ocSetDefaultPayMethodActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42918a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity = this.f42919b;
                if (z3) {
                    ocSetDefaultPayMethodActivity.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof p;
                    OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity2 = this.f42920c;
                    if (z8) {
                        ocSetDefaultPayMethodActivity.showLoadingDialog(false, true);
                        OcDefaultPayMethodStatusResp ocDefaultPayMethodStatusResp = (OcDefaultPayMethodStatusResp) ((p) it).f27360a;
                        if (!ocDefaultPayMethodStatusResp.isSuccess() || ocDefaultPayMethodStatusResp.getData() == null) {
                            ToastUtils.showLong(ocDefaultPayMethodStatusResp.getRespMsg(), new Object[0]);
                        } else {
                            OcDefaultPayMethodStatusData data = ocDefaultPayMethodStatusResp.getData();
                            ocSetDefaultPayMethodActivity2.f29868i = data;
                            boolean zC = data != null ? Intrinsics.c(data.getFlexiFlag(), Boolean.TRUE) : false;
                            t tVar = ocSetDefaultPayMethodActivity2.f29866f;
                            t tVar2 = ocSetDefaultPayMethodActivity2.f29867g;
                            if (zC) {
                                Object value = tVar2.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                ((TextView) value).setText(ocSetDefaultPayMethodActivity2.getString(g.cs_you_have_selected));
                                Object value2 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                                ((TextView) value2).setText(ocSetDefaultPayMethodActivity2.getString(g.cs_oc_pay_with_flexi_now));
                            } else {
                                Object value3 = tVar2.getValue();
                                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                                ((TextView) value3).setText(ocSetDefaultPayMethodActivity2.getString(g.cs_we_recommend_that_set));
                                Object value4 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                                ((TextView) value4).setText(ocSetDefaultPayMethodActivity2.getString(g.cs_oc_set_now));
                            }
                        }
                    } else if (it instanceof m) {
                        ocSetDefaultPayMethodActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ocSetDefaultPayMethodActivity.showLoadingDialog(false, true);
                        String str = ((n) it).f27358a;
                        ocSetDefaultPayMethodActivity2.showLoadingDialog(false);
                        ToastUtils.showLong(str, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof o;
                OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity3 = this.f42919b;
                if (z10) {
                    ocSetDefaultPayMethodActivity3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof p;
                    OcSetDefaultPayMethodActivity ocSetDefaultPayMethodActivity4 = this.f42920c;
                    if (z11) {
                        ocSetDefaultPayMethodActivity3.showLoadingDialog(false, true);
                        CommonResult commonResult = (CommonResult) ((p) it2).f27360a;
                        if (commonResult.isSuccess()) {
                            androidx.camera.core.impl.utils.n.w(ocSetDefaultPayMethodActivity4.getString(g.cs_set_successfully));
                            OcSetDefaultPayMethodViewModel ocSetDefaultPayMethodViewModel = (OcSetDefaultPayMethodViewModel) ocSetDefaultPayMethodActivity4.l();
                            ocSetDefaultPayMethodViewModel.getClass();
                            f.s(ocSetDefaultPayMethodViewModel, new A(1, null), ocSetDefaultPayMethodViewModel.f30922e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else {
                            ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
                        }
                    } else if (it2 instanceof m) {
                        ocSetDefaultPayMethodActivity3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ocSetDefaultPayMethodActivity3.showLoadingDialog(false, true);
                        String str2 = ((n) it2).f27358a;
                        ocSetDefaultPayMethodActivity4.showLoadingDialog(false);
                        ToastUtils.showLong(str2, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}

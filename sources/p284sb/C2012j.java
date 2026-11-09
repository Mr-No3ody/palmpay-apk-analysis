package p284sb;

import C0.G;
import Pa.r0;
import Ya.g;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.credit.bean.BindStatusEnum;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p270rd.ViewOnClickListenerC1968k;
import p355xf.l;
import p355xf.t;

/* JADX INFO: renamed from: sb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2012j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputAmountActivity f42167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputAmountActivity f42168c;

    public /* synthetic */ C2012j(InputAmountActivity inputAmountActivity, InputAmountActivity inputAmountActivity2, int i7) {
        this.f42166a = i7;
        this.f42167b = inputAmountActivity;
        this.f42168c = inputAmountActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        switch (this.f42166a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                InputAmountActivity inputAmountActivity = this.f42167b;
                if (z3) {
                    inputAmountActivity.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    inputAmountActivity.showLoadingDialog(false, true);
                    BalanceAndLimitResp balanceAndLimitResp = (BalanceAndLimitResp) ((p) it).f27360a;
                    boolean zIsSuccess = balanceAndLimitResp.isSuccess();
                    InputAmountActivity inputAmountActivity2 = this.f42168c;
                    if (zIsSuccess) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = balanceAndLimitResp.data;
                        if (balanceAndLimitData != null) {
                            inputAmountActivity2.f28676L = balanceAndLimitData;
                            Object value = inputAmountActivity2.f28684j.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((TextView) value).setText("Available Balance : " + r0.B(balanceAndLimitData.balanceAmount, false));
                            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(r0.B(balanceAndLimitData.minAmount, false) + "-" + r0.B(balanceAndLimitData.maxAmount, false)).setFontSize(18, true).create();
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                            inputAmountActivity2.p().setHint(spannableStringBuilderCreate);
                            inputAmountActivity2.p().setCurrency(BaseApplication.getCurrencySymbol());
                            if (balanceAndLimitData.stampDutySwitch) {
                                Object value2 = inputAmountActivity2.f28685o.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                                TextView textView = (TextView) value2;
                                if (textView != null) {
                                    textView.setText(balanceAndLimitData.stampDutyMinAmountPpTip);
                                }
                            }
                        }
                    } else {
                        h.x(inputAmountActivity2, balanceAndLimitResp.getRespMsg());
                    }
                } else if (it instanceof m) {
                    inputAmountActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    inputAmountActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof o;
                InputAmountActivity inputAmountActivity3 = this.f42167b;
                if (z8) {
                    inputAmountActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    inputAmountActivity3.showLoadingDialog(false, true);
                    ParseInstalmentsQrcodeRsp parseInstalmentsQrcodeRsp = (ParseInstalmentsQrcodeRsp) ((p) it2).f27360a;
                    boolean zIsSuccess2 = parseInstalmentsQrcodeRsp.isSuccess();
                    InputAmountActivity inputAmountActivity4 = this.f42168c;
                    if (zIsSuccess2) {
                        ParseInstalmentsQrcodeRsp.DataBean dataBean = parseInstalmentsQrcodeRsp.data;
                        if (dataBean != null) {
                            inputAmountActivity4.f28673B = dataBean;
                            Object value3 = inputAmountActivity4.f28672A.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            r0.u1((ImageView) value3, dataBean.merchantUrl, r.cv_default_merchant_avatar);
                            Object value4 = inputAmountActivity4.f28688w.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((TextView) value4).setText(dataBean.merchantName);
                            int i7 = dataBean.type;
                            if (i7 == 1) {
                                string = inputAmountActivity4.getString(g.cs_merchant_id_s, r0.T1(inputAmountActivity4.f28674C));
                            } else if (i7 != 2) {
                                string = "";
                            } else {
                                int i10 = g.cs_account_number_s;
                                String str = inputAmountActivity4.f28674C;
                                string = inputAmountActivity4.getString(i10, str != null ? r0.w(str) : null);
                            }
                            Object value5 = inputAmountActivity4.f28687v.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            G.y("(", string, ")", (TextView) value5);
                            if (dataBean.soNoType == BindStatusEnum.CAN_PARTICIPATE.getStatusCode()) {
                                t tVar = inputAmountActivity4.t;
                                Object value6 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                                h.C((ImageView) value6);
                                Object value7 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                                r0.l1(dataBean.pictureUrl, (ImageView) value7);
                                Object value8 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                                h.l(new ViewOnClickListenerC1968k(dataBean, 2), (ImageView) value8);
                            }
                        }
                    } else {
                        h.x(inputAmountActivity4, parseInstalmentsQrcodeRsp.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    inputAmountActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    inputAmountActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}

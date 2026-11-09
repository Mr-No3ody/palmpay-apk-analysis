package p054dd;

import Pa.r0;
import Pd.f;
import Rd.C0606w;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.V;
import com.adjust.sdk.network.ErrorCodes;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.R2CUssdDialNoResp;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashResultActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashResultActivity f35899b;

    public /* synthetic */ p(Recharge2CashResultActivity recharge2CashResultActivity, Recharge2CashResultActivity recharge2CashResultActivity2, int i7) {
        this.f35898a = i7;
        this.f35899b = recharge2CashResultActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0606w c0606w;
        Drawable drawableSuccessIcon$default;
        String string;
        switch (this.f35898a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
                    Recharge2CashResultActivity recharge2CashResultActivity = this.f35899b;
                    if (z3) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            R2COrderDetailResp r2COrderDetailResp = (R2COrderDetailResp) commonBeanResult.data;
                            if (r2COrderDetailResp != null) {
                                recharge2CashResultActivity.f33134f = r2COrderDetailResp;
                                C0606w c0606w2 = (C0606w) recharge2CashResultActivity.f27334c;
                                if (c0606w2 != null) {
                                    c0606w2.f8534c.removeAllViews();
                                }
                                C0606w c0606w3 = (C0606w) recharge2CashResultActivity.f27334c;
                                if (c0606w3 != null) {
                                    c0606w3.f8536e.c(r0.B(r2COrderDetailResp.receivedAmount, false));
                                }
                                C0606w c0606w4 = (C0606w) recharge2CashResultActivity.f27334c;
                                if (c0606w4 != null) {
                                    TransactionResultHeaderModel transactionResultHeaderModel = c0606w4.f8536e;
                                    int i7 = r2COrderDetailResp.orderStatus;
                                    if (i7 != 1) {
                                        string = i7 != 2 ? recharge2CashResultActivity.getString(k.core_processing) : recharge2CashResultActivity.getString(k.core_failed);
                                    } else {
                                        string = recharge2CashResultActivity.getString(k.core_successful);
                                    }
                                    transactionResultHeaderModel.e(string);
                                }
                                C0606w c0606w5 = (C0606w) recharge2CashResultActivity.f27334c;
                                if (c0606w5 != null) {
                                    TransactionResultHeaderModel transactionResultHeaderModel2 = c0606w5.f8536e;
                                    int i10 = r2COrderDetailResp.orderStatus;
                                    if (i10 != 1) {
                                        drawableSuccessIcon$default = i10 != 2 ? TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, recharge2CashResultActivity, 0.0f, 2, null) : TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, recharge2CashResultActivity, 0.0f, 2, null);
                                    } else {
                                        drawableSuccessIcon$default = TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, recharge2CashResultActivity, 0.0f, 2, null);
                                    }
                                    transactionResultHeaderModel2.g(drawableSuccessIcon$default);
                                }
                                if (!TextUtils.isEmpty(r2COrderDetailResp.errorMsg) && (c0606w = (C0606w) recharge2CashResultActivity.f27334c) != null) {
                                    c0606w.f8536e.h(r2COrderDetailResp.errorMsg);
                                }
                                recharge2CashResultActivity.n(r0.B(r2COrderDetailResp.sharedAmount, false), 1002, "Sell Amount");
                                recharge2CashResultActivity.n(r0.B(r2COrderDetailResp.convenienceFee, false), 1002, "Fee");
                                recharge2CashResultActivity.n(r0.w0(r2COrderDetailResp.senderPhoneNo), 1002, "Mobile Number");
                                recharge2CashResultActivity.n(r2COrderDetailResp.orderNo, ErrorCodes.MALFORMED_URL_EXCEPTION, "Transaction ID");
                                int i11 = r2COrderDetailResp.orderStatus;
                                if (i11 == 1) {
                                    C0606w c0606w6 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w6 != null) {
                                        c0606w6.f8539i.setText("Complete");
                                    }
                                    C0606w c0606w7 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w7 != null) {
                                        c0606w7.f8537f.setText("Sell Again");
                                    }
                                    C0606w c0606w8 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w8 != null) {
                                        h.c(c0606w8.f8538g);
                                    }
                                    C0606w c0606w9 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w9 != null) {
                                        c0606w9.f8533b.setSlotId(recharge2CashResultActivity.getString(f.ad_r2c_result_success_banner_slot_id));
                                    }
                                    String string2 = recharge2CashResultActivity.getString(f.ad_r2c_result_success_pop_slot_id);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    InterstitialAdView interstitialAdView = new InterstitialAdView(string2, null);
                                    interstitialAdView.setInterstitialListener(new Ab.k(19));
                                    Intrinsics.checkNotNullParameter(recharge2CashResultActivity, "<this>");
                                    InterstitialAdView.show$default(interstitialAdView, recharge2CashResultActivity, null, 2, null);
                                } else if (i11 != 2) {
                                    C0606w c0606w10 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w10 != null) {
                                        c0606w10.f8539i.setText("Complete");
                                    }
                                    C0606w c0606w11 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w11 != null) {
                                        c0606w11.f8537f.setText("Customer Service");
                                    }
                                    C0606w c0606w12 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w12 != null) {
                                        h.c(c0606w12.f8538g);
                                    }
                                    AbstractC0780y.m(V.f(recharge2CashResultActivity), null, null, new o(recharge2CashResultActivity, null), 3);
                                } else {
                                    C0606w c0606w13 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w13 != null) {
                                        c0606w13.f8539i.setText("Complete");
                                    }
                                    C0606w c0606w14 = (C0606w) recharge2CashResultActivity.f27334c;
                                    if (c0606w14 != null) {
                                        c0606w14.f8537f.setText("Customer Service");
                                    }
                                    if (TextUtils.isEmpty(r2COrderDetailResp.errorButton)) {
                                        C0606w c0606w15 = (C0606w) recharge2CashResultActivity.f27334c;
                                        if (c0606w15 != null) {
                                            h.c(c0606w15.f8538g);
                                        }
                                    } else {
                                        C0606w c0606w16 = (C0606w) recharge2CashResultActivity.f27334c;
                                        if (c0606w16 != null) {
                                            h.C(c0606w16.f8538g);
                                        }
                                        C0606w c0606w17 = (C0606w) recharge2CashResultActivity.f27334c;
                                        if (c0606w17 != null) {
                                            c0606w17.f8538g.setText(r2COrderDetailResp.errorButton);
                                        }
                                        C0606w c0606w18 = (C0606w) recharge2CashResultActivity.f27334c;
                                        if (c0606w18 != null) {
                                            c0606w18.f8538g.setOnClickListener(new n(0, r2COrderDetailResp, recharge2CashResultActivity));
                                        }
                                    }
                                }
                            }
                        } else {
                            h.x(recharge2CashResultActivity, commonBeanResult.getRespMsg());
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        h.x(recharge2CashResultActivity, ((n) it).f27358a);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.p;
                    Recharge2CashResultActivity recharge2CashResultActivity2 = this.f35899b;
                    if (z8) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            R2CUssdDialNoResp r2CUssdDialNoResp = (R2CUssdDialNoResp) commonBeanResult2.data;
                            if (r2CUssdDialNoResp != null) {
                                String str = r2CUssdDialNoResp.phone;
                                Intent intent = new Intent("android.intent.action.DIAL");
                                if (!TextUtils.isEmpty(str)) {
                                    Uri uri = Uri.parse("tel:" + Uri.encode(str));
                                    Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                                    intent.setData(uri);
                                }
                                intent.addFlags(268435456);
                                recharge2CashResultActivity2.startActivity(intent);
                            }
                        } else {
                            h.x(recharge2CashResultActivity2, commonBeanResult2.getRespMsg());
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        h.x(recharge2CashResultActivity2, ((n) it2).f27358a);
                    }
                }
                return Unit.f38893a;
        }
    }
}

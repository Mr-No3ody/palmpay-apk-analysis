package p327vd;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.TransferLimitSettingResp;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferLimitSettingsActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p159kd.h;
import p223od.e;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferLimitSettingsActivity f43157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferLimitSettingsActivity f43158c;

    public /* synthetic */ b(TransferLimitSettingsActivity transferLimitSettingsActivity, TransferLimitSettingsActivity transferLimitSettingsActivity2, int i7) {
        this.f43156a = i7;
        this.f43157b = transferLimitSettingsActivity;
        this.f43158c = transferLimitSettingsActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String respMsg;
        TransferLimitSettingsActivity transferLimitSettingsActivity = this.f43158c;
        TransferLimitSettingsActivity transferLimitSettingsActivity2 = this.f43157b;
        switch (this.f43156a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    transferLimitSettingsActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    transferLimitSettingsActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    TransferLimitSettingResp transferLimitSettingResp = (TransferLimitSettingResp) commonBeanResult.data;
                    if (commonBeanResult.isSuccess()) {
                        int i7 = TransferLimitSettingsActivity.f33418i;
                        if ((transferLimitSettingResp != null ? transferLimitSettingResp.getSingleLimit() : null) == null || transferLimitSettingResp.getDailyLimit() == null || transferLimitSettingResp.getDailyLimitMin() == null || transferLimitSettingResp.getDailyLimitMax() == null || transferLimitSettingResp.getSingleLimitMin() == null) {
                            respMsg = commonBeanResult.getRespMsg();
                            if (respMsg.length() == 0) {
                                respMsg = transferLimitSettingsActivity.getString(h.sm_transfer_limit_invalid_data);
                            }
                            ToastUtils.showLong(respMsg, new Object[0]);
                        } else {
                            transferLimitSettingsActivity.f33419d = transferLimitSettingResp;
                            transferLimitSettingsActivity.f33420e = transferLimitSettingResp.getDailyLimit();
                            transferLimitSettingsActivity.f33421f = transferLimitSettingResp.getSingleLimit();
                            transferLimitSettingsActivity.f33422g = true;
                            e eVar = (e) transferLimitSettingsActivity.f27334c;
                            if (eVar != null) {
                                EditText editText = eVar.f40329e;
                                Long dailyLimit = transferLimitSettingResp.getDailyLimit();
                                if (dailyLimit == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                editText.setText(TransferLimitSettingsActivity.o(dailyLimit.longValue()));
                            }
                            e eVar2 = (e) transferLimitSettingsActivity.f27334c;
                            if (eVar2 != null) {
                                EditText editText2 = eVar2.t;
                                Long singleLimit = transferLimitSettingResp.getSingleLimit();
                                if (singleLimit == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                editText2.setText(TransferLimitSettingsActivity.o(singleLimit.longValue()));
                            }
                            transferLimitSettingsActivity.f33422g = false;
                            Long dailyLimitMax = transferLimitSettingResp.getDailyLimitMax();
                            if (dailyLimitMax == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String strO = TransferLimitSettingsActivity.o(dailyLimitMax.longValue());
                            String string = transferLimitSettingsActivity.getString(h.sm_limit_settings_kyc_desc, strO);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            e eVar3 = (e) transferLimitSettingsActivity.f27334c;
                            if (eVar3 != null) {
                                TextView textView = eVar3.f40331g;
                                SpannableString spannableString = new SpannableString(string);
                                int iG = StringsKt.G(string, 6, strO);
                                if (iG >= 0) {
                                    spannableString.setSpan(new ForegroundColorSpan(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, transferLimitSettingsActivity)), iG, strO.length() + iG, 33);
                                }
                                textView.setText(spannableString);
                            }
                            transferLimitSettingsActivity.r();
                        }
                    } else {
                        respMsg = commonBeanResult.getRespMsg();
                        if (respMsg.length() == 0) {
                            respMsg = transferLimitSettingsActivity.getString(h.sm_transfer_limit_invalid_data);
                        }
                        ToastUtils.showLong(respMsg, new Object[0]);
                    }
                } else if (it instanceof m) {
                    transferLimitSettingsActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    transferLimitSettingsActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    transferLimitSettingsActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    transferLimitSettingsActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((p) it2).f27360a;
                    if (commonResult.isSuccess()) {
                        int i10 = TransferLimitSettingsActivity.f33418i;
                        e eVar4 = (e) transferLimitSettingsActivity.f27334c;
                        transferLimitSettingsActivity.f33420e = TransferLimitSettingsActivity.p(eVar4 != null ? eVar4.f40329e.getText() : null);
                        e eVar5 = (e) transferLimitSettingsActivity.f27334c;
                        transferLimitSettingsActivity.f33421f = TransferLimitSettingsActivity.p(eVar5 != null ? eVar5.t.getText() : null);
                        transferLimitSettingsActivity.r();
                        ToastUtils.showLong(transferLimitSettingsActivity.getString(h.sm_transfer_limit_save_success), new Object[0]);
                    } else {
                        ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
                    }
                } else if (it2 instanceof m) {
                    transferLimitSettingsActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    transferLimitSettingsActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}

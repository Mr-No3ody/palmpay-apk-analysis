package p051d9;

import Bc.q;
import D6.f;
import D6.m;
import J3.a;
import L6.b;
import Rd.J;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.bean.req.ChangePhoneNoTokenReq;
import com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.rsp.AnalysisCouponQrCodeRsp;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView;
import com.transsnet.palmpay.send_money.ui.activity.topp.InputMobileActivity;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeTransactionResultActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p072eg.e;
import p173ld.x;
import p173ld.y;
import p173ld.z;
import p232p6.p;
import p255qd.s;
import p320v6.d;

/* JADX INFO: renamed from: d9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1605b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35596c;

    public /* synthetic */ C1605b(int i7, Object obj, Object obj2) {
        this.f35594a = i7;
        this.f35596c = obj;
        this.f35595b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView orderStatusTv;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor2;
        TextView orderStatusTv2;
        Object obj2 = this.f35595b;
        Object obj3 = this.f35596c;
        switch (this.f35594a) {
            case 0:
                SmsActionRsp it = (SmsActionRsp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C1612i c1612i = (C1612i) obj2;
                if (it.isSuccess()) {
                    ChangePhoneNoTokenReq changePhoneNoTokenReq = (ChangePhoneNoTokenReq) obj3;
                    if (changePhoneNoTokenReq != null) {
                        changePhoneNoTokenReq.newOtpToken = it.data.getSmsToken();
                    }
                    a.D(c1612i, (ChangeMobileContract.View) c1612i.f27351a, new C1607d(changePhoneNoTokenReq, null), new C1604a(c1612i, 3), new C1604a(c1612i, 4), false, false);
                } else {
                    ChangeMobileContract.View view = (ChangeMobileContract.View) c1612i.f27351a;
                    if (view != null) {
                        view.showLoadingView(false);
                    }
                    ChangeMobileContract.View view2 = (ChangeMobileContract.View) c1612i.f27351a;
                    if (view2 != null) {
                        view2.handCheckSmsResult(false, it.getRespMsg());
                    }
                }
                return Unit.f38893a;
            case 1:
                CommonResult it2 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ChangeMobileContract.View view3 = (ChangeMobileContract.View) ((C1612i) obj2).f27351a;
                if (view3 != null) {
                    view3.handleCheckNumberResult(it2, (String) obj3);
                }
                return Unit.f38893a;
            case 2:
                SendSmsNewV2Rsp it3 = (SendSmsNewV2Rsp) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                LoginContract.View view4 = (LoginContract.View) ((C1623u) obj3).f27351a;
                if (view4 != null) {
                    view4.handleSendSmsResult((SmsActionReq) obj2, it3);
                }
                return Unit.f38893a;
            case 3:
                CommonBeanResult<Tier3ApplyStatusRsp> it4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                C1628z c1628z = (C1628z) obj3;
                if (it4.isSuccess()) {
                    Tier3ApplyStatusRsp tier3ApplyStatusRsp = it4.data;
                    c1628z.getClass();
                    if (tier3ApplyStatusRsp != null) {
                        ApplyForTier3Req applyForTier3Req = (ApplyForTier3Req) obj2;
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.stateCode)) {
                            tier3ApplyStatusRsp.stateCode = applyForTier3Req.stateCode;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.stateName)) {
                            tier3ApplyStatusRsp.stateName = applyForTier3Req.stateName;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.areaCode)) {
                            tier3ApplyStatusRsp.areaCode = applyForTier3Req.areaCode;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.areaName)) {
                            tier3ApplyStatusRsp.areaName = applyForTier3Req.areaName;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.lgaCode)) {
                            tier3ApplyStatusRsp.lgaCode = applyForTier3Req.lgaCode;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.lgaName)) {
                            tier3ApplyStatusRsp.lgaName = applyForTier3Req.lgaName;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.street)) {
                            tier3ApplyStatusRsp.street = applyForTier3Req.street;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.homeAddress)) {
                            tier3ApplyStatusRsp.homeAddress = applyForTier3Req.street;
                        }
                        if (TextUtils.isEmpty(tier3ApplyStatusRsp.homeAddressImg)) {
                            tier3ApplyStatusRsp.homeAddressImg = applyForTier3Req.homeAddressImg;
                        }
                    }
                }
                PalmPayLevelUpTier3Contract.View view5 = (PalmPayLevelUpTier3Contract.View) c1628z.f27351a;
                if (view5 != null) {
                    view5.handleApplicationResult(it4);
                }
                return Unit.f38893a;
            case 4:
                SendSmsNewV2Rsp it5 = (SendSmsNewV2Rsp) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                ResetPinContract.View view6 = (ResetPinContract.View) ((D) obj3).f27351a;
                if (view6 != null) {
                    view6.handleSendSmsResult((SmsActionReq) obj2, it5);
                }
                return Unit.f38893a;
            case 5:
                SendSmsNewV2Rsp it6 = (SendSmsNewV2Rsp) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                SignUpStepOtcContract.View view7 = (SignUpStepOtcContract.View) ((i0) obj3).f27351a;
                if (view7 != null) {
                    view7.handleSendSmsRsp((SmsActionReq) obj2, it6);
                }
                return Unit.f38893a;
            case 6:
                SendSmsNewV2Rsp it7 = (SendSmsNewV2Rsp) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                VerifyAccountContract.View view8 = (VerifyAccountContract.View) ((n0) obj3).f27351a;
                if (view8 != null) {
                    view8.handleSendSmsRsp((SmsActionReq) obj2, it7);
                }
                return Unit.f38893a;
            case 7:
                ((e) obj3).unlock(((p072eg.a) obj2).f36296b);
                return Unit.f38893a;
            case 8:
                long jLongValue = ((Long) obj).longValue();
                int i7 = TopupResultActivityV2.f26521k0;
                TopupResultActivityV2 topupResultActivityV2 = (TopupResultActivityV2) obj3;
                J j6 = (J) topupResultActivityV2.f27334c;
                if (j6 != null && (orderStatusTv = j6.f8083b.getOrderStatusTv()) != null) {
                    orderStatusTv.setText((jLongValue / ((long) 1000)) + "S");
                }
                J j10 = (J) topupResultActivityV2.f27334c;
                if (j10 != null) {
                    j10.f8083b.h((String) obj2);
                }
                return Unit.f38893a;
            case 9:
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 24);
                x xVar = (x) obj2;
                D3.a.F(apply, ((RecipientListResp.RecipientBean) obj3).favorite ? CommonViewExtKt.colorInt(b.ppColorPrimary, xVar.getContext()) : CommonViewExtKt.colorInt(b.ppColorTextPrimary, xVar.getContext()));
                return Unit.f38893a;
            case 10:
                IconicsDrawable apply2 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply2, "$this$apply");
                p118hf.a.I(apply2, 24);
                y yVar = (y) obj2;
                D3.a.F(apply2, Intrinsics.c(((RecipientBeanV2) obj3).getFavorite(), Boolean.TRUE) ? CommonViewExtKt.colorInt(b.ppColorPrimary, yVar.getContext()) : CommonViewExtKt.colorInt(b.ppColorTextPrimary, yVar.getContext()));
                return Unit.f38893a;
            case 11:
                IconicsDrawable apply3 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply3, "$this$apply");
                p118hf.a.I(apply3, 24);
                z zVar = (z) obj2;
                D3.a.F(apply3, Intrinsics.c(((RecipientBeanV2) obj3).getFavorite(), Boolean.TRUE) ? CommonViewExtKt.colorInt(b.ppColorPrimary, zVar.getContext()) : CommonViewExtKt.colorInt(b.ppColorTextPrimary, zVar.getContext()));
                return Unit.f38893a;
            case 12:
                ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) obj;
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    int i10 = p292t6.a.f42345a;
                    p292t6.a.a("Face Detection is available : " + moduleAvailabilityResponse.areModulesAvailable());
                    ((D6.a) obj2).invoke(Boolean.valueOf(moduleAvailabilityResponse.areModulesAvailable()));
                }
                return Unit.f38893a;
            case 13:
                Throwable e10 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                AuthenticationRequest authenticationRequest = (AuthenticationRequest) obj3;
                LiveID$ILiveIDListener liveID$ILiveIDListener = (LiveID$ILiveIDListener) obj2;
                if (e10 instanceof LiveIDException) {
                    r6.a aVar = p.f41237d;
                    if (aVar != null && (liveID$ILiveIDMonitor2 = aVar.f41573e) != null) {
                        d dVar = p320v6.e.f43079g;
                        String str = dVar.f43071a;
                        Pair pair = new Pair("event_desc", dVar.f43072b);
                        Integer scene = authenticationRequest.getScene();
                        Pair pair2 = new Pair("scene", Integer.valueOf(scene != null ? scene.intValue() : -1));
                        LiveIDException liveIDException = (LiveIDException) e10;
                        Pair pair3 = new Pair("code", liveIDException.getCode());
                        String detail = liveIDException.getDetail();
                        if (detail == null) {
                            detail = liveIDException.getMsg();
                        }
                        Pair pair4 = new Pair("msg", detail);
                        String str2 = p.f41241h;
                        if (str2 == null) {
                            str2 = "";
                        }
                        Pair pair5 = new Pair("transactionId", str2);
                        String str3 = p.f41242i;
                        liveID$ILiveIDMonitor2.report(str, G.h(pair, pair2, pair3, pair4, pair5, new Pair("uuid", str3 != null ? str3 : "")));
                    }
                    LiveIDException liveIDException2 = (LiveIDException) e10;
                    liveID$ILiveIDListener.onInterrupted(liveIDException2.getCode(), liveIDException2.getMsg(), null);
                } else {
                    r6.a aVar2 = p.f41237d;
                    if (aVar2 != null && (liveID$ILiveIDMonitor = aVar2.f41573e) != null) {
                        d dVar2 = p320v6.e.f43079g;
                        String str4 = dVar2.f43071a;
                        Pair pair6 = new Pair("event_desc", dVar2.f43072b);
                        Integer scene2 = authenticationRequest.getScene();
                        Pair pair7 = new Pair("scene", Integer.valueOf(scene2 != null ? scene2.intValue() : -1));
                        Pair pair8 = new Pair("code", "-99");
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "Unknown";
                        }
                        Pair pair9 = new Pair("msg", message);
                        String str5 = p.f41241h;
                        if (str5 == null) {
                            str5 = "";
                        }
                        Pair pair10 = new Pair("transactionId", str5);
                        String str6 = p.f41242i;
                        liveID$ILiveIDMonitor.report(str4, G.h(pair6, pair7, pair8, pair9, pair10, new Pair("uuid", str6 != null ? str6 : "")));
                    }
                    f fVar = f.f1629j;
                    liveID$ILiveIDListener.onInterrupted(fVar.f1633a, fVar.f1634b, null);
                }
                return Unit.f38893a;
            case 14:
                long jLongValue2 = ((Long) obj).longValue();
                PayCodeTransactionResultActivity payCodeTransactionResultActivity = (PayCodeTransactionResultActivity) obj3;
                q qVar = payCodeTransactionResultActivity.f34802v;
                if (qVar != null && (orderStatusTv2 = ((TransactionResultHeaderModel) qVar.f823o).getOrderStatusTv()) != null) {
                    orderStatusTv2.setText((jLongValue2 / ((long) 1000)) + "S");
                }
                q qVar2 = payCodeTransactionResultActivity.f34802v;
                if (qVar2 != null) {
                    ((TransactionResultHeaderModel) qVar2.f823o).h((String) obj2);
                }
                return Unit.f38893a;
            case 15:
                AnalysisCouponQrCodeRsp it8 = (AnalysisCouponQrCodeRsp) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                QrcodeScanContract$IView qrcodeScanContract$IView = (QrcodeScanContract$IView) ((s) obj3).f27351a;
                if (qrcodeScanContract$IView != null) {
                    qrcodeScanContract$IView.showCouponQrcodeData(it8, (String) obj2);
                }
                return Unit.f38893a;
            case 16:
                long jLongValue3 = ((Long) obj).longValue();
                int i11 = PayShopPaymentResultActivity.f28737Q;
                PayShopPaymentResultActivity payShopPaymentResultActivity = (PayShopPaymentResultActivity) obj3;
                payShopPaymentResultActivity.p().getOrderStatusTv().setText((jLongValue3 / ((long) 1000)) + "S");
                payShopPaymentResultActivity.p().h(((PayByOrderResp.DataBean) obj2).pendingCountdownAcTips);
                return Unit.f38893a;
            case 17:
                int i12 = SelfieCaptureActivity.f23859v;
                Intrinsics.checkNotNullParameter((File) obj, "it");
                SelfieCaptureActivity selfieCaptureActivity = (SelfieCaptureActivity) obj3;
                m mVarH = selfieCaptureActivity.h();
                String str7 = selfieCaptureActivity.f23867i;
                if (str7 == null) {
                    Intrinsics.n("uploadUrl");
                    throw null;
                }
                String str8 = selfieCaptureActivity.f23866g;
                if (str8 != null) {
                    mVarH.f(str7, str8, selfieCaptureActivity.f23868j, (File) obj2, selfieCaptureActivity.f23869o);
                    return Unit.f38893a;
                }
                Intrinsics.n("transactionId");
                throw null;
            case 18:
                List list = (List) obj;
                InputMobileActivity inputMobileActivity = (InputMobileActivity) obj3;
                inputMobileActivity.f33543X.clear();
                if (list != null && !list.isEmpty()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(list);
                    ArrayList arrayList = (ArrayList) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
                    Intrinsics.checkNotNullExpressionValue(arrayList, "deepCopy(...)");
                    inputMobileActivity.f33543X = arrayList;
                }
                inputMobileActivity.r((String) obj2);
                return Unit.f38893a;
            default:
                CommonResult response = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                p383zc.y yVar2 = (p383zc.y) obj3;
                ReferEarnResolveContract.View view9 = (ReferEarnResolveContract.View) yVar2.f27351a;
                if (view9 == null) {
                    return Unit.f38893a;
                }
                if (response.isSuccess()) {
                    yVar2.referEarnWithDrawCreate((String) obj2);
                } else if ("Order_Disable".equals(response.getRespCode()) || "Order_Confirm".equals(response.getRespCode())) {
                    view9.showLoadingView(false);
                    if ("Order_Disable".equals(response.getRespCode())) {
                        view9.showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_ENABLE_ORDER_DISABLE(), response.getRespMsg(), "", "");
                    } else if ("Order_Confirm".equals(response.getRespCode())) {
                        view9.showRichDialog(ReferEarnRichDialog.INSTANCE.getRE_TYPE_ENALBE_ORDER_CONFIRM(), response.getRespMsg(), "", "");
                    }
                } else {
                    view9.showLoadingView(false);
                    view9.showToastDialog(response.getRespMsg());
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ C1605b(C1612i c1612i, String str) {
        this.f35594a = 1;
        this.f35595b = c1612i;
        this.f35596c = str;
    }
}

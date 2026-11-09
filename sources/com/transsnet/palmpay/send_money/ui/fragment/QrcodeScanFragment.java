package com.transsnet.palmpay.send_money.ui.fragment;

import Ab.D;
import B6.RunnableC0085g;
import Cd.k;
import Cd.m;
import L6.b;
import Pa.F;
import Pa.i0;
import Pa.r0;
import S6.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import com.palmpay.lib.scanplus.view.ScanView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.AnalysisPartnerInForCashOutReq;
import com.transsnet.palmpay.core.bean.req.AnalysisBlankQrCodeReq;
import com.transsnet.palmpay.core.bean.req.AnalysisPartnerInCodeReq;
import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.core.bean.rsp.AnalysisBlankQrCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisCouponQrCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInRsp;
import com.transsnet.palmpay.core.bean.rsp.MemberQRCodeScanResp;
import com.transsnet.palmpay.core.bean.rsp.QueryShopNameByQrCodeResp;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.AnalysisCodeSendMoneyReq;
import com.transsnet.palmpay.send_money.bean.QrcodeParseResp;
import com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView;
import com.transsnet.palmpay.send_money.ui.activity.QrcodeScanActivity;
import com.transsnet.palmpay.send_money.ui.activity.SetAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.SetAmountActivity1;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p038ca.d;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p255qd.s;
import p324va.c;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
public class QrcodeScanFragment extends BaseMVPFragment<s> implements QrcodeScanContract$IView, OnScanListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f33682A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PpTitleBar f33683B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f33685H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f33686L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public AnalysisBlankQrCodeRsp.DataBean f33687M;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f33689X;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33690j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ScanView f33691o;
    public View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f33693v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f33694w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33692p = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f33684C = false;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final d f33688Q = new d(this);

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        AbstractC1205o lifecycle = getLifecycle();
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        return V.e(lifecycle);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_qrcode_scan_fragment;
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void handleAnalysisBlankQrCodeResult(AnalysisBlankQrCodeRsp analysisBlankQrCodeRsp) {
        AnalysisBlankQrCodeRsp.DataBean dataBean;
        if (analysisBlankQrCodeRsp == null || (dataBean = analysisBlankQrCodeRsp.data) == null) {
            F6.d.c(this.f27317a, "handleAnalysisBlankQrCodeResult() rsp == null or rsp.data == null");
            return;
        }
        this.f33687M = dataBean;
        if (!analysisBlankQrCodeRsp.isSuccess()) {
            showQrcodeDataError(analysisBlankQrCodeRsp.getRespMsg());
            return;
        }
        if ("0".equals(analysisBlankQrCodeRsp.data.bindStatus)) {
            ToastUtils.showLong("Not supported");
            return;
        }
        if (BaseApplication.getInstance().getUser().getMemberId().equals(analysisBlankQrCodeRsp.data.memberId)) {
            w("It looks like you scanned your own QR code. Please try another one.", false);
            return;
        }
        if ("1".equals(analysisBlankQrCodeRsp.data.codeType)) {
            Intent intent = new Intent(getActivity(), (Class<?>) SetAmountActivity.class);
            intent.putExtra("key_show_what_its_for", false);
            startActivityForResult(intent, 49);
            return;
        }
        long jU = u(this.f33686L);
        if (jU > 0) {
            ((s) this.f27328i).analysisPartnerInCode(new AnalysisPartnerInCodeReq(r0.f(jU), this.f33686L));
            return;
        }
        String str = this.f33686L;
        String queryParameter = Uri.parse(str).getQueryParameter("shopName");
        if (TextUtils.isEmpty(queryParameter)) {
            int iIndexOf = str.indexOf("&shopName=");
            if (-1 == iIndexOf) {
                queryParameter = "";
            } else {
                String strSubstring = str.substring(iIndexOf + 1, str.length());
                int iIndexOf2 = strSubstring.indexOf("&");
                int iIndexOf3 = strSubstring.indexOf("=");
                queryParameter = iIndexOf2 != -1 ? strSubstring.substring(iIndexOf3 + 1, iIndexOf2) : strSubstring.substring(iIndexOf3 + 1, strSubstring.length());
            }
        }
        if (TextUtils.isEmpty(queryParameter)) {
            ((s) this.f27328i).getShopNameByQrCode(this.f33686L);
            return;
        }
        Intent intent2 = new Intent(getActivity(), (Class<?>) SetAmountActivity1.class);
        intent2.putExtra("key_shop_name", queryParameter);
        startActivityForResult(intent2, 49);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        if (l.o(this.f27319c, "android.permission.CAMERA")) {
            return;
        }
        this.f33688Q.f("android.permission.CAMERA", new k(this, 0), new k(this, 1), new k(this, 2));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f33694w = (LinearLayout) this.f27318b.findViewById(e.qrcard_number_item);
        this.f33682A = (LinearLayout) this.f27318b.findViewById(e.qrcard_code_item);
        this.f33693v = this.f27318b.findViewById(e.merchant_id_item);
        ScanView scanView = (ScanView) this.f27318b.findViewById(e.scanView);
        this.f33691o = scanView;
        scanView.setOnScanListener(this);
        if (l.o(this.f27319c, "android.permission.CAMERA")) {
            this.f33691o.setCamera(true);
            this.f33684C = true;
        }
        this.t = this.f27318b.findViewById(e.fillStatusBarView);
        int i7 = 0;
        this.f33693v.setOnClickListener(new Cd.l(this, i7));
        this.f33694w.setOnClickListener(new Cd.l(this, i7));
        this.f33682A.setOnClickListener(new Cd.l(this, i7));
        PpTitleBar ppTitleBar = (PpTitleBar) this.f27318b.findViewById(e.titleBar);
        this.f33683B = ppTitleBar;
        ppTitleBar.c(a.pay_ArrowLeft, getContext().getColor(b.ppColorBackgroundLight));
        this.f33683B.setRightImageView2ClickListener(new Cd.l(this, 1));
        this.f33683B.setBackButtonClickListener(new Cd.l(this, 2));
        ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
        layoutParams.height = BarUtils.getStatusBarHeight();
        this.t.setLayoutParams(layoutParams);
        this.f33690j = ((QrcodeScanActivity) getActivity()).f33186c.intValue();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f33694w.setVisibility(((QrcodeScanActivity) getActivity()).f33186c.intValue() == 92 ? 8 : 0);
        this.f33693v.setVisibility(((QrcodeScanActivity) getActivity()).f33186c.intValue() == 92 ? 8 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        AnalysisBlankQrCodeRsp.DataBean dataBean;
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1) {
            if (i7 == 10) {
                String path = intent.getData().getPath();
                if (TextUtils.isEmpty(path)) {
                    return;
                }
                ((s) this.f27328i).syncDecodeQRCode(path);
                return;
            }
            if (i7 == 49) {
                super.showLoadingDialog(true);
                try {
                    String stringExtra = intent.getStringExtra("extra_amount");
                    if (this.f33686L.startsWith("partner://cashout")) {
                        ((s) this.f27328i).analysisPartnerInCodeForCashOut(new AnalysisPartnerInForCashOutReq(r0.g(stringExtra), this.f33686L));
                        return;
                    }
                    if (this.f33686L.startsWith("partner://in//") && (dataBean = this.f33687M) != null) {
                        if (!"1".equals(dataBean.codeType)) {
                            ((s) this.f27328i).analysisPartnerInCode(new AnalysisPartnerInCodeReq(r0.g(stringExtra), this.f33686L));
                            return;
                        }
                        Postcard postcardWithLong = ARouter.getInstance().build("/app/pay_money_to_palmpay_business_preview_page").withString("QRCODE_STRING", this.f33686L).withLong("extra_amount", r0.g(stringExtra));
                        AnalysisBlankQrCodeRsp.DataBean dataBean2 = this.f33687M;
                        postcardWithLong.withString("receiver_info", i0.k(dataBean2.memberName, dataBean2.phone)).navigation();
                        getActivity().finish();
                    }
                } catch (NumberFormatException unused) {
                    F6.d.c(this.f27317a, "onActivityResult, SET_AMOUNT_REQUEST_CODE, NumberFormatException");
                }
            }
        }
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public final void onCancel() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ScanView scanView = this.f33691o;
        if (scanView != null) {
            scanView.i();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z3) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ScanView scanView = this.f33691o;
        if (scanView != null) {
            scanView.f(true);
        }
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public final void onPointClick(CodeBean codeBean) {
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public final boolean onResult(List list) {
        if (list.size() <= 0) {
            return false;
        }
        j().post(new RunnableC0085g(2, this, list));
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ScanView scanView;
        super.onResume();
        if (!l.o(this.f27319c, "android.permission.CAMERA") || (scanView = this.f33691o) == null) {
            return;
        }
        scanView.f(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        super.showLoadingDialog(false);
        if (this.f33685H) {
            this.f33691o.d();
            this.f33683B.getRightImageView2().setImageResource(r.cv_close_light_icon);
        }
        this.f33685H = !this.f33685H;
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void queryShopNameSuccess(QueryShopNameByQrCodeResp queryShopNameByQrCodeResp) {
        if (!queryShopNameByQrCodeResp.isSuccess()) {
            w(queryShopNameByQrCodeResp.getRespMsg(), true);
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) SetAmountActivity1.class);
        intent.putExtra("key_shop_name", queryShopNameByQrCodeResp.data);
        startActivityForResult(intent, 49);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void showAnalysisPartnerInQrcodeData(AnalysisPartnerInCodeRsp analysisPartnerInCodeRsp) {
        if (!analysisPartnerInCodeRsp.isSuccess() || analysisPartnerInCodeRsp.getData() == null) {
            showQrcodeDataError(analysisPartnerInCodeRsp.getRespMsg());
            super.showLoadingDialog(false);
        } else {
            ARouter.getInstance().build("/main/scan_partner_pay_money_preview_page").withLong("extra_amount", analysisPartnerInCodeRsp.getData().getPalmpayToPartnerPayInfo().amount).withString("QRCODE_STRING", this.f33686L).navigation();
            getActivity().finish();
        }
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void showAnalysisPartnerInQrcodeDataForCashOut(AnalysisPartnerInRsp analysisPartnerInRsp) {
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void showCouponQrcodeData(AnalysisCouponQrCodeRsp analysisCouponQrCodeRsp, String str) {
        super.showLoadingDialog(false);
        if (analysisCouponQrCodeRsp == null) {
            return;
        }
        if (!analysisCouponQrCodeRsp.isSuccess()) {
            w(analysisCouponQrCodeRsp.getRespMsg(), true);
            return;
        }
        AnalysisCouponQrCodeRsp.DataBean dataBean = analysisCouponQrCodeRsp.data;
        if (dataBean == null || TextUtils.isEmpty(dataBean.actCouponUrl)) {
            ToastUtils.showLong(p025ba.k.core_fail);
        } else {
            i0.c0(analysisCouponQrCodeRsp.data.actCouponUrl);
            this.f27319c.finish();
        }
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void showMemberQrcodeData(MemberQRCodeScanResp memberQRCodeScanResp) {
        super.showLoadingDialog(false);
        if (!memberQRCodeScanResp.isSuccess()) {
            w(memberQRCodeScanResp.getRespMsg(), true);
            return;
        }
        if (memberQRCodeScanResp.getData() == null) {
            w("No result", true);
            return;
        }
        if (memberQRCodeScanResp.getData().isFriend()) {
            ARouter.getInstance().build("/contact/profile").withSerializable("contact", memberQRCodeScanResp.getData()).navigation(this.f27319c);
        } else {
            memberQRCodeScanResp.getData().setRequestSource("1");
            ARouter.getInstance().build("/contact/search_san_result").withSerializable("contact", memberQRCodeScanResp.getData()).navigation(this.f27319c);
        }
        this.f27319c.finish();
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void showQrcodeData(QrcodeParseResp qrcodeParseResp) {
        super.showLoadingDialog(false);
        if (!qrcodeParseResp.isSuccess()) {
            w(qrcodeParseResp.getRespMsg(), true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MEMBER_ID", qrcodeParseResp.data.recipientMemberId);
        bundle.putString("core_order_source_type", this.f33689X);
        if (!TextUtils.isEmpty(qrcodeParseResp.data.ppAccountNo)) {
            bundle.putString("extra_data", qrcodeParseResp.data.ppAccountNo);
        }
        r0.O0("03", 2, "", bundle);
        this.f27319c.finish();
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void showQrcodeDataError(String str) {
        super.showLoadingDialog(false);
        w(str, true);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView
    public final void showQrcodeResult(String str) {
        Vibrator vibrator = (Vibrator) this.f27319c.getApplicationContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (TextUtils.isEmpty(str)) {
            ToastUtils.showShort(h.sm_no_detect_qrcode);
        } else {
            if (!str.startsWith("palmpay://in/")) {
                w(str, false);
                return;
            }
            super.showLoadingDialog(true);
            ((s) this.f27328i).parseQrcodeData(new AnalysisCodeSendMoneyReq(u(str), str));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new s();
    }

    public final long u(String str) {
        try {
            return Long.parseLong(Uri.parse(str).getQueryParameter("amount"));
        } catch (NumberFormatException e10) {
            F6.d.c(this.f27317a, "getAmount: ", e10);
            return 0L;
        }
    }

    public final void v(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33690j = ((QrcodeScanActivity) getActivity()).f33186c.intValue();
        if (!str.startsWith("partner://cashout") && this.f33690j == 91) {
            w(getActivity().getString(p025ba.k.core_qr_code_not_recognized), true);
            return;
        }
        if (!str.startsWith("https://qr.palmpay.app?c=") && this.f33690j == 92) {
            w(getActivity().getString(p025ba.k.core_qr_code_not_recognized), true);
            return;
        }
        F6.d.h(this.f27317a, 3, "onScanQRCodeSuccess: result:".concat(str));
        this.f33686L = str;
        Vibrator vibrator = (Vibrator) this.f27319c.getApplicationContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (str.startsWith("palmpay://in/")) {
            super.showLoadingDialog(true);
            ((s) this.f27328i).parseQrcodeData(new AnalysisCodeSendMoneyReq(u(str), str));
            return;
        }
        if (str.startsWith("http://palmpay.co")) {
            super.showLoadingDialog(true);
            ((s) this.f27328i).parseMemberQrcodeData(str);
            return;
        }
        if (str.startsWith("palmpay://coupon")) {
            ((s) this.f27328i).parseCouponQrcodeData(str);
            return;
        }
        if ((!str.startsWith("http://") && !str.startsWith("https://")) || !RegexUtils.isURL(str)) {
            if (!str.startsWith("partner://cashout")) {
                if (str.startsWith("partner://in//")) {
                    ((s) this.f27328i).analysisBlankQrCode(new AnalysisBlankQrCodeReq(this.f33686L));
                    return;
                } else {
                    w(getString(p025ba.k.core_scan_fail_try_again), false);
                    return;
                }
            }
            long jU = u(str);
            if (jU <= 0) {
                startActivityForResult(new Intent(getActivity(), (Class<?>) SetAmountActivity1.class), 49);
                return;
            } else {
                super.showLoadingDialog(true);
                ((s) this.f27328i).analysisPartnerInCodeForCashOut(new AnalysisPartnerInForCashOutReq(jU, str));
                return;
            }
        }
        if (!BaseApplication.hasLogin() && str.startsWith("https://h5.palmpay.app")) {
            i0.K(null, null);
            return;
        }
        if (!str.startsWith("https://h5.palmpay.app") || !str.contains("jumpT=1")) {
            i0.c0(str);
            return;
        }
        try {
            HashMap mapI = F.i(str.substring(str.indexOf("?") + 1));
            String str2 = (String) mapI.get("a");
            String str3 = (String) mapI.get("t");
            super.showLoadingDialog(true);
            ((AccountApiService) c.f43141a.f14623d).queryShareAccountDetail(new ShareAccountDetailReq(str3, str2)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 4));
        } catch (Exception e10) {
            e10.printStackTrace();
            i0.c0(str);
        }
    }

    public final void w(String str, boolean z3) {
        O6.c cVar = new O6.c(this.f27319c);
        cVar.e(z3 ? p025ba.k.core_title_attention : h.sm_qrcode_scan_info_title);
        cVar.f6598d = str;
        cVar.f6605k = true;
        String string = getString(h.sm_send_money_confirm);
        m mVar = new m(this, 0);
        cVar.f6600f = string;
        cVar.f6602h = mVar;
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.show();
    }

    public final void x(boolean z3, p038ca.a aVar) {
        if (!z3) {
            O6.c cVar = new O6.c(getActivity());
            cVar.f6596b = O6.d.f("Camera Permission Required");
            cVar.f6598d = "Camera permission is required for scanning QR codes. Please go to Settings and grant camera permission manually.";
            cVar.d(p025ba.k.core_go_settings, new A8.b(aVar, 27));
            cVar.c(p025ba.k.core_cancel, new m(this, 1));
            cVar.g();
            return;
        }
        O6.c cVar2 = new O6.c(getActivity());
        cVar2.f6596b = O6.d.f("Camera Permission Required");
        cVar2.f6598d = "Camera permission is required for scanning QR codes. Please grant camera permission to scan.";
        cVar2.c(p025ba.k.core_cancel, new Cd.l(this, 3));
        Cd.l lVar = new Cd.l(this, 4);
        cVar2.f6600f = "Grant";
        cVar2.f6602h = lVar;
        cVar2.g();
    }
}

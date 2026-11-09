package p143jb;

import C0.G;
import C9.ViewOnClickListenerC0150q;
import L6.i;
import O6.c;
import O6.d;
import Pa.C0525w;
import Ya.g;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.resp.CLH5BorrowUrlData;
import com.transsnet.palmpay.credit.bean.resp.CLH5BorrowUrlResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentRaiseAmountRsp;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusData;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusResp;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f38508g;

    public /* synthetic */ e(g gVar, int i7) {
        this.f38507f = i7;
        this.f38508g = gVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f38507f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                g.a(this.f38508g, d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f38507f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f38508g.k(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f38508g.k(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f38508g.k(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f38508g.k(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        String h5BorrowUrl;
        Intent openUrlIntent;
        Integer type;
        E activity;
        PackageManager packageManager;
        switch (this.f38507f) {
            case 0:
                CLH5BorrowUrlResp cLH5BorrowUrlResp = (CLH5BorrowUrlResp) obj;
                g gVar = this.f38508g;
                gVar.k(false);
                if (cLH5BorrowUrlResp != null && cLH5BorrowUrlResp.isSuccess()) {
                    CLH5BorrowUrlData data = cLH5BorrowUrlResp.getData();
                    if (!TextUtils.isEmpty(data != null ? data.getH5BorrowUrl() : null)) {
                        if (SPUtils.getInstance().getBoolean("show_h5_borrow_dialog", true)) {
                            CLH5BorrowUrlData data2 = cLH5BorrowUrlResp.getData();
                            String h5BorrowUrl2 = data2 != null ? data2.getH5BorrowUrl() : null;
                            BaseFragment baseFragment = gVar.f38521i;
                            c cVar = new c(baseFragment != null ? baseFragment.getContext() : null);
                            cVar.f6615v = i.ppFlexiCashDialogTheme;
                            cVar.f6605k = false;
                            BaseFragment baseFragment2 = gVar.f38521i;
                            cVar.f6596b = d.f(baseFragment2 != null ? baseFragment2.getString(g.cs_cl_h5_borrow_dialog_title) : null);
                            BaseFragment baseFragment3 = gVar.f38521i;
                            cVar.f6598d = baseFragment3 != null ? baseFragment3.getString(g.cs_cl_h5_borrow_dialog_content) : null;
                            BaseFragment baseFragment4 = gVar.f38521i;
                            String string = baseFragment4 != null ? baseFragment4.getString(k.core_got_it) : null;
                            ViewOnClickListenerC0150q viewOnClickListenerC0150q = new ViewOnClickListenerC0150q(h5BorrowUrl2, 7);
                            cVar.f6600f = string;
                            cVar.f6602h = viewOnClickListenerC0150q;
                            cVar.a().show();
                            SPUtils.getInstance().put("show_h5_borrow_dialog", false);
                            break;
                        } else {
                            CLH5BorrowUrlData data3 = cLH5BorrowUrlResp.getData();
                            if (data3 != null && (h5BorrowUrl = data3.getH5BorrowUrl()) != null && (openUrlIntent = IntentUtils.getOpenUrlIntent(h5BorrowUrl, true)) != null) {
                                ActivityUtils.startActivity(openUrlIntent);
                                break;
                            }
                        }
                    }
                }
                ToastUtils.showShort(cLH5BorrowUrlResp != null ? cLH5BorrowUrlResp.getRespMsg() : null, new Object[0]);
                break;
            case 1:
                CLOpenAccountResp cLOpenAccountResp = (CLOpenAccountResp) obj;
                this.f38508g.k(false);
                if (cLOpenAccountResp == null || !cLOpenAccountResp.isSuccess() || cLOpenAccountResp.getData() == null) {
                    ToastUtils.showShort(cLOpenAccountResp != null ? cLOpenAccountResp.getRespMsg() : null, new Object[0]);
                } else {
                    ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(cLOpenAccountResp.getData())).navigation();
                }
                break;
            case 2:
                OcSignStatusResp ocSignStatusResp = (OcSignStatusResp) obj;
                g gVar2 = this.f38508g;
                int size = 0;
                gVar2.k(false);
                installedPackages = null;
                installedPackages = null;
                List<PackageInfo> installedPackages = null;
                if (ocSignStatusResp == null || !ocSignStatusResp.isSuccess() || ocSignStatusResp.getData() == null) {
                    ToastUtils.showShort(ocSignStatusResp != null ? ocSignStatusResp.getRespMsg() : null, new Object[0]);
                } else {
                    OcSignStatusData data4 = ocSignStatusResp.getData();
                    if (data4 == null || (type = data4.getType()) == null || type.intValue() != 0) {
                        gVar2.i("/credit_score/cl_last_protocol_activity");
                    } else {
                        try {
                            BaseFragment baseFragment5 = gVar2.f38521i;
                            if (baseFragment5 != null && (activity = baseFragment5.getActivity()) != null && (packageManager = activity.getPackageManager()) != null) {
                                installedPackages = packageManager.getInstalledPackages(0);
                            }
                            List<PackageInfo> list = installedPackages;
                            if (list != null && !list.isEmpty()) {
                                size = installedPackages.size();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        G.h(p221ob.c.f40268a).openCashLoan(new CLOpenAccountReq(gVar2.f38513a, gVar2.f38516d, "", Integer.valueOf(size), false, false, gVar2.f38517e, gVar2.f38514b, null, null, null, null, null, null, null, null, 65280, null)).k(f.f42629b).i(b.a()).subscribe(new e(gVar2, 1));
                    }
                }
                break;
            case 3:
                OcInstallmentRaiseAmountRsp ocInstallmentRaiseAmountRsp = (OcInstallmentRaiseAmountRsp) obj;
                this.f38508g.k(false);
                if (ocInstallmentRaiseAmountRsp == null || !ocInstallmentRaiseAmountRsp.isSuccess() || ocInstallmentRaiseAmountRsp.data == null) {
                    ToastUtils.showShort(ocInstallmentRaiseAmountRsp != null ? ocInstallmentRaiseAmountRsp.getRespMsg() : null, new Object[0]);
                } else {
                    ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(ocInstallmentRaiseAmountRsp.data)).navigation();
                }
                break;
            case 4:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult == null || !commonResult.isSuccess()) {
                    ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
                }
                break;
            case 5:
                CommonResult commonResult2 = (CommonResult) obj;
                if (commonResult2 == null || !commonResult2.isSuccess()) {
                    ToastUtils.showShort(commonResult2 != null ? commonResult2.getRespMsg() : null, new Object[0]);
                }
                break;
            case 6:
                CommonResult commonResult3 = (CommonResult) obj;
                if (commonResult3 == null || !commonResult3.isSuccess()) {
                    ToastUtils.showShort(commonResult3 != null ? commonResult3.getRespMsg() : null, new Object[0]);
                }
                break;
            default:
                break;
        }
    }

    private final void R(String str) {
    }
}

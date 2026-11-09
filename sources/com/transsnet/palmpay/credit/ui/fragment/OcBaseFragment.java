package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p116hb.e;
import p221ob.c;
import p298tf.f;
import p382zb.C2168k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcBaseFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class OcBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OkCardMainPageRspData f30369o;
    public CLMainData t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30367i = "0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f30368j = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f30370p = "1";

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final LoadingDialog i() {
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(context);
        nVar.f31290d = Integer.valueOf(e.cs_cash_loading);
        return nVar.a();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int o() {
        String string;
        String string2;
        String str = "1";
        String str2 = "0";
        if (getArguments() == null) {
            this.f30367i = "0";
            this.f30370p = "1";
        } else {
            Bundle arguments = getArguments();
            if (arguments != null && (string2 = arguments.getString("oc_login_type", "0")) != null) {
                str2 = string2;
            }
            this.f30367i = str2;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string = arguments2.getString("oc_show_proto_dialog_type", "1")) != null) {
                str = string;
            }
            this.f30370p = str;
        }
        Bundle arguments3 = getArguments();
        this.f30368j = arguments3 != null ? Integer.valueOf(arguments3.getInt("oc_apply_source", 2)) : null;
        return 0;
    }

    public final void t() {
        OkCardMainPageRspData okCardMainPageRspData;
        Integer applyStatus;
        Integer applyStatus2;
        Integer applyStatus3;
        Integer accountStatus;
        OkCardMainPageRspData okCardMainPageRspData2 = this.f30369o;
        if (okCardMainPageRspData2 == null || (applyStatus3 = okCardMainPageRspData2.getApplyStatus()) == null || applyStatus3.intValue() != 1) {
            OkCardMainPageRspData okCardMainPageRspData3 = this.f30369o;
            if ((okCardMainPageRspData3 == null || (applyStatus2 = okCardMainPageRspData3.getApplyStatus()) == null || applyStatus2.intValue() != -1) && ((okCardMainPageRspData = this.f30369o) == null || (applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 2)) {
                return;
            }
            ARouter.getInstance().build("/credit_score/oc_protocol_activity").withString("oc_apply_enter_point", "HOME").navigation(getContext());
            return;
        }
        OkCardMainPageRspData okCardMainPageRspData4 = this.f30369o;
        if (okCardMainPageRspData4 != null && (accountStatus = okCardMainPageRspData4.getAccountStatus()) != null && accountStatus.intValue() == 5) {
            ARouter.getInstance().build("/credit_score/oc_protocol_activity").withString("oc_apply_enter_point", "HOME").navigation(getContext());
            return;
        }
        Context context = getContext();
        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
        OkCardMainPageRspData okCardMainPageRspData5 = this.f30369o;
        postcardBuild.withString("oc_card_no", okCardMainPageRspData5 != null ? okCardMainPageRspData5.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation(context);
    }

    public final void u() {
        G.h(c.f40268a).okCardMainPage(this.f30367i).k(f.f42629b).i(b.a()).subscribe(new C2168k(this, 3));
    }

    public void v() {
    }
}

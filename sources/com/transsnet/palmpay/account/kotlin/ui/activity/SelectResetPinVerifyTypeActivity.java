package com.transsnet.palmpay.account.kotlin.ui.activity;

import Ab.D;
import Ab.ViewOnClickListenerC0053e;
import Bc.k;
import F8.d;
import F8.e;
import F8.h;
import J8.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.ResetPinVerifyListRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/select_reset_pin_verify_type")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/kotlin/ui/activity/SelectResetPinVerifyTypeActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "J8/b", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SelectResetPinVerifyTypeActivity extends BaseActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f25791g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GetSecurityFlowRsp f25794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f25796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f25797f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @Nullable String str, @Nullable String str2) {
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) SelectResetPinVerifyTypeActivity.class);
                intent.putExtra("extra_data_1", str);
                intent.putExtra("extra_data_2", str2);
                context.startActivity(intent);
            }
        }

        private a() {
        }

        public final void launch(@Nullable Context context, @Nullable GetSecurityFlowRsp getSecurityFlowRsp) {
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) SelectResetPinVerifyTypeActivity.class);
                intent.putExtra("_security_flow_info", getSecurityFlowRsp);
                context.startActivity(intent);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        TextView textView;
        k kVar = this.f25797f;
        if (kVar == null || (textView = (TextView) kVar.f749c) == null) {
            return;
        }
        textView.setOnClickListener(new ViewOnClickListenerC0053e(27));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_select_reset_pin_verify_type, (ViewGroup) null, false);
        int i7 = d.titleBar;
        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
        if (ppTitleBar != null) {
            i7 = d.tvContactUs;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.tvTitle;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = d.typeList;
                    RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                    if (recyclerView != null) {
                        k kVar = new k((ConstraintLayout) viewInflate, ppTitleBar, textView, textView2, (ViewGroup) recyclerView, 8);
                        this.f25797f = kVar;
                        return kVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        df.d<CommonBeanResult<ResetPinVerifyListRsp>> resetPinVerifyList = G8.a.t().getResetPinVerifyList(this.f25793b);
        if (this.f25794c != null) {
            IApiAccountService iApiAccountServiceT = G8.a.t();
            String str = this.f25793b;
            GetSecurityFlowRsp getSecurityFlowRsp = this.f25794c;
            resetPinVerifyList = iApiAccountServiceT.getResetPinVerifyListV2(str, getSecurityFlowRsp != null ? getSecurityFlowRsp.flowId : null);
        }
        resetPinVerifyList.k(f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 11));
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        PpTitleBar ppTitleBar;
        k kVar = this.f25797f;
        if (kVar == null || (ppTitleBar = (PpTitleBar) kVar.f750d) == null) {
            return;
        }
        ppTitleBar.setTitle(charSequence);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7;
        ARouter.getInstance().inject(this);
        GetSecurityFlowRsp getSecurityFlowRsp = this.f25794c;
        if (getSecurityFlowRsp != null) {
            this.f25793b = getSecurityFlowRsp.mobile;
            this.f25792a = getSecurityFlowRsp.smsToken;
            int i10 = getSecurityFlowRsp.action;
            if (i10 == 14) {
                i7 = h.ac_change_mobile_number;
            } else {
                i7 = i10 == 12 ? h.ac_reset_pin : h.ac_reset_pin;
            }
            setTitle(CommonViewExtKt.string(i7, this));
        } else {
            setTitle(h.ac_reset_pin);
        }
        this.f25796e = new b(this);
        k kVar = this.f25797f;
        if (kVar != null) {
            ((RecyclerView) kVar.f752f).setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        k kVar2 = this.f25797f;
        if (kVar2 != null) {
            ((RecyclerView) kVar2.f752f).setAdapter(this.f25796e);
        }
        b bVar = this.f25796e;
        if (bVar != null) {
            bVar.f4986c = new Dg.a(this, 22);
        }
    }
}

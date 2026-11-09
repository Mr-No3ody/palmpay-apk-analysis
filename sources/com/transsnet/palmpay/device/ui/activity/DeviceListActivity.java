package com.transsnet.palmpay.device.ui.activity;

import F8.e;
import F8.h;
import L6.b;
import O6.c;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.perf.util.Constants;
import com.horcrux.svg.d0;
import com.microsoft.codepush.react.CodePushConstants;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.rsp.DeviceActionRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.RiskControlResult;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.dialog.t;
import com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p141j9.C1798f;
import p158kc.d;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/account/device/list")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/device/ui/activity/DeviceListActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Llc/c;", "Lcom/transsnet/palmpay/device/ui/mvp/contract/DeviceListContract$View;", "Lcom/transsnet/palmpay/custom_view/adapter/BaseRecyclerViewAdapter$ItemViewOnClickListener;", "Lcom/transsnet/palmpay/account/bean/rsp/QueryDeviceRsp;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceListActivity extends i implements DeviceListContract.View, BaseRecyclerViewAdapter$ItemViewOnClickListener<QueryDeviceRsp> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f31817g = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f31818i = 807;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f31819j = 808;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f31820o = 809;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f31821p = 810;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f31822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PpButton f31823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PpButton f31824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f31825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public QueryDeviceRsp f31826f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getREQUEST_DELETE_AUTHENTICATION() {
            return DeviceListActivity.f31818i;
        }

        private a() {
        }
    }

    public static final void m(DeviceListActivity deviceListActivity, QueryDeviceRsp queryDeviceRsp, boolean z3) {
        int i7 = h.ac_msg_deactivate_device;
        if (z3) {
            i7 = h.ac_msg_activate_device;
        }
        c cVar = new c(deviceListActivity);
        cVar.e(k.core_title_attention);
        cVar.b(i7);
        String string = deviceListActivity.getString(h.ac_ok);
        Fb.k kVar = new Fb.k(deviceListActivity, queryDeviceRsp, z3);
        cVar.f6600f = string;
        cVar.f6602h = kVar;
        cVar.c(h.ac_cancel, new p144jc.a(deviceListActivity, 3));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, QueryDeviceRsp queryDeviceRsp, RecyclerView.ViewHolder viewHolder) {
        boolean zC;
        QueryDeviceRsp data = queryDeviceRsp;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (data.getImei() != null) {
            zC = Intrinsics.c(data.getImei(), PhoneUtils.getUniqueId());
        } else {
            zC = viewHolder.getLayoutPosition() == 0;
        }
        ARouter.getInstance().build("/account/device/detail").withString("name", data.getNickName()).withString("imei", data.getImei()).withString("memberId", data.getMemberId()).withString("type", getString(data.getMasterFlag() == 1 ? h.ac_master : h.ac_slave)).withString(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, TimeUtils.millis2String(data.getLastLoggedOnTime(), new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"))).withString("deviceModel", data.getDeviceModel()).withBoolean("isCurrent", zC).navigation(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_device_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new p172lc.c();
    }

    public final void n() {
        ((p172lc.c) this.f27350a).loadDeviceList();
    }

    public final void o() {
        PpButton ppButton = this.f31823c;
        if (ppButton != null) {
            ppButton.setVisibility(0);
        }
        PpButton ppButton2 = this.f31824d;
        if (ppButton2 != null) {
            ppButton2.setVisibility(8);
        }
        d dVar = this.f31825e;
        if (dVar != null) {
            int state_normal = d.f38741i.getSTATE_NORMAL();
            if (state_normal != dVar.f38744e) {
                dVar.f38745f = dVar.getItemCount();
            } else {
                dVar.f38745f = 0;
            }
            dVar.f38744e = state_normal;
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == f31818i) {
            if (i10 != -1) {
                n();
                return;
            }
            QueryDeviceRsp queryDeviceRsp = this.f31826f;
            if (queryDeviceRsp != null) {
                ((p172lc.c) this.f27350a).deleteDevice(queryDeviceRsp);
                return;
            }
            return;
        }
        int i11 = f31820o;
        int i12 = f31819j;
        if (i7 == i11 || i7 == i12) {
            if (i10 != -1) {
                n();
                return;
            }
            QueryDeviceRsp queryDeviceRsp2 = this.f31826f;
            if (queryDeviceRsp2 != null) {
                if (i7 == i12) {
                    ((p172lc.c) this.f27350a).activateDevice(queryDeviceRsp2);
                    return;
                } else {
                    ((p172lc.c) this.f27350a).deActivateDevice(queryDeviceRsp2);
                    return;
                }
            }
            return;
        }
        if (i7 == f31821p) {
            if (i10 != -1) {
                n();
                return;
            }
            Intrinsics.e(intent);
            String stringExtra = intent.getStringExtra("extra_data");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            showDeviceActionResultView((DeviceActionRsp) d0.l(DeviceActionRsp.class, stringExtra));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        n();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        d dVar = this.f31825e;
        if (dVar != null) {
            dVar.f38746g = new Oe.a(this, 21);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f31822b = (RecyclerView) findViewById(F8.d.deviceList);
        PpButton ppButton = (PpButton) findViewById(F8.d.textViewEdit);
        this.f31823c = ppButton;
        if (ppButton != null) {
            ppButton.setOnClickListener(new p144jc.a(this, 1));
        }
        PpButton ppButton2 = (PpButton) findViewById(F8.d.textViewComplete);
        this.f31824d = ppButton2;
        if (ppButton2 != null) {
            ppButton2.setOnClickListener(new p144jc.a(this, 2));
        }
        d dVar = new d(this);
        dVar.f38744e = d.f38742j;
        this.f31825e = dVar;
        RecyclerView recyclerView = this.f31822b;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        RecyclerView recyclerView2 = this.f31822b;
        if (recyclerView2 != null) {
            recyclerView2.setItemViewCacheSize(4);
        }
        RecyclerView recyclerView3 = this.f31822b;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f31825e);
        }
        d dVar2 = this.f31825e;
        if (dVar2 != null) {
            dVar2.f4986c = this;
        }
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 5));
    }

    @Override // com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract.View
    public final void showCommandResultView(CommonResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String respMsg = result.getRespMsg();
        if (result.isSuccess()) {
            t tVar = new t(this);
            tVar.b();
            tVar.f31304c = respMsg;
            tVar.d(Constants.MAX_URL_LENGTH);
            return;
        }
        if ("CFRONT_700004".equalsIgnoreCase(result.getRespCode())) {
            ToastUtils.showLong(result.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        } else {
            t tVar2 = new t(this);
            tVar2.a();
            tVar2.f31304c = respMsg;
            tVar2.d(Constants.MAX_URL_LENGTH);
        }
    }

    @Override // com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract.View
    public final void showDeviceActionResultView(DeviceActionRsp deviceActionRsp) {
        if (deviceActionRsp == null) {
            return;
        }
        String respMsg = deviceActionRsp.getRespMsg();
        if (deviceActionRsp.isSuccess()) {
            DeviceActionRsp.DataBean dataBean = deviceActionRsp.data;
            RiskControlResult riskControlResult = new RiskControlResult(dataBean != null ? dataBean.businessRiskType : null, dataBean != null ? dataBean.disposal : null, dataBean != null ? dataBean.flowId : null);
            if (riskControlResult.isNeedAction()) {
                ARouter.getInstance().build("/coreImpl/risk_control_verify").withParcelable("extra_data", riskControlResult).navigation(this, f31821p);
                return;
            } else {
                t tVar = new t(this);
                tVar.b();
                tVar.e(true);
            }
        } else if ("CFRONT_700004".equalsIgnoreCase(deviceActionRsp.getRespCode())) {
            ToastUtils.showLong(deviceActionRsp.getRespMsg(), new Object[0]);
            Unit unit = Unit.f38893a;
        } else {
            t tVar2 = new t(this);
            tVar2.a();
            tVar2.f31304c = respMsg;
            tVar2.e(true);
        }
        n();
    }

    @Override // com.transsnet.palmpay.device.ui.mvp.contract.DeviceListContract.View
    public final void showDeviceList(List list) {
        if (list == null) {
            return;
        }
        d dVar = this.f31825e;
        if (dVar != null) {
            dVar.f4985b = list;
        }
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }
}

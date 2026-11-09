package com.transsnet.palmpay.device.ui.activity;

import Bc.i;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import O6.c;
import V9.C0714c;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.DeviceActionReq;
import com.transsnet.palmpay.core.base.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p052da.ViewOnClickListenerC1649v;
import p059e1.a;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/account/device/detail")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/device/ui/activity/DeviceDetail2Activity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceDetail2Activity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31808j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31815g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f31816i;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewM2;
        View viewM3;
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_device_detail, (ViewGroup) null, false);
        int i7 = d.line1;
        View viewM4 = a.m(i7, viewInflate);
        if (viewM4 != null && (viewM = a.m((i7 = d.line2), viewInflate)) != null && (viewM2 = a.m((i7 = d.line3), viewInflate)) != null && (viewM3 = a.m((i7 = d.line4), viewInflate)) != null) {
            i7 = d.textViewComplete;
            TextView textView = (TextView) a.m(i7, viewInflate);
            if (textView != null) {
                i7 = d.titleBar;
                if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                    i7 = d.tvRemark;
                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i iVar = new i((LinearLayout) viewInflate, viewM4, viewM, viewM2, viewM3, textView, textView2);
                        this.f31816i = iVar;
                        return iVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 != DeviceListActivity.f31817g.getREQUEST_DELETE_AUTHENTICATION() || i10 != -1 || this.f31814f == null || this.f31810b == null) {
            return;
        }
        showLoadingDialog(true);
        G8.a.t().deleteDevice(new DeviceActionReq(this.f31810b, this.f31814f)).i(p071ef.b.a()).k(f.f42629b).subscribe(new C0714c(this, 12));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        c cVar = new c(this);
        cVar.e(h.ac_remove);
        cVar.b(h.ac_confirm_remove);
        String string = getString(h.ac_confirm);
        ViewOnClickListenerC1649v viewOnClickListenerC1649v = new ViewOnClickListenerC1649v(this, 19);
        cVar.f6600f = string;
        cVar.f6602h = viewOnClickListenerC1649v;
        cVar.c(h.ac_cancel, new p054dd.d(21));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        ARouter.getInstance().inject(this);
        i iVar = this.f31816i;
        if (iVar != null && (textView3 = (TextView) iVar.f728f) != null) {
            textView3.setOnClickListener(this);
        }
        View view = findViewById(d.line1);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        String line1 = getString(h.ac_device_name);
        Intrinsics.checkNotNullExpressionValue(line1, "getString(...)");
        String str = this.f31809a;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(line1, "line1");
        View viewFindViewById = view.findViewById(d.textViewLine1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = view.findViewById(d.textViewLine2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((TextView) viewFindViewById).setText(line1);
        ((TextView) viewFindViewById2).setText(str);
        View view2 = findViewById(d.line2);
        Intrinsics.checkNotNullExpressionValue(view2, "findViewById(...)");
        String line2 = getString(h.ac_device_Type);
        Intrinsics.checkNotNullExpressionValue(line2, "getString(...)");
        String str2 = this.f31812d;
        Intrinsics.checkNotNullParameter(view2, "view");
        Intrinsics.checkNotNullParameter(line2, "line1");
        View viewFindViewById3 = view2.findViewById(d.textViewLine1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = view2.findViewById(d.textViewLine2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ((TextView) viewFindViewById3).setText(line2);
        ((TextView) viewFindViewById4).setText(str2);
        View viewFindViewById5 = view2.findViewById(d.v_line);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setVisibility(0);
        }
        View view3 = findViewById(d.line4);
        Intrinsics.checkNotNullExpressionValue(view3, "findViewById(...)");
        String line3 = getString(h.ac_last_used_time);
        Intrinsics.checkNotNullExpressionValue(line3, "getString(...)");
        String str3 = this.f31811c;
        Intrinsics.checkNotNullParameter(view3, "view");
        Intrinsics.checkNotNullParameter(line3, "line1");
        View viewFindViewById6 = view3.findViewById(d.textViewLine1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        View viewFindViewById7 = view3.findViewById(d.textViewLine2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ((TextView) viewFindViewById6).setText(line3);
        ((TextView) viewFindViewById7).setText(str3);
        if (this.f31815g) {
            return;
        }
        i iVar2 = this.f31816i;
        if (iVar2 != null && (textView2 = (TextView) iVar2.f729g) != null) {
            textView2.setVisibility(0);
        }
        i iVar3 = this.f31816i;
        if (iVar3 == null || (textView = (TextView) iVar3.f728f) == null) {
            return;
        }
        textView.setVisibility(0);
    }
}

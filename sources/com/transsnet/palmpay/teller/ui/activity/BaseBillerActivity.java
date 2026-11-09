package com.transsnet.palmpay.teller.ui.activity;

import Wd.C0728b;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.P0;
import androidx.lifecycle.b0;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p086fe.S0;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "<init>", "()V", "Landroid/view/View;", "d", "Landroid/view/View;", "getNetworkNotConnectView", "()Landroid/view/View;", "setNetworkNotConnectView", "(Landroid/view/View;)V", "networkNotConnectView", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseBillerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBillerActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,85:1\n75#2,13:86\n*S KotlinDebug\n*F\n+ 1 BaseBillerActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity\n*L\n21#1:86,13\n*E\n"})
public abstract class BaseBillerActivity<VM extends BaseViewModel, B extends ViewBinding> extends BaseMvvmVBActivity<VM, B> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public View networkNotConnectView;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f34145e = new b0(G.a(S0.class), new C0728b(this, 1), new C0728b(this, 0), new C0728b(this, 2));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P0 f34146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f34147g;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getNetworkCheckAvailable() {
        return NQEManager.INSTANCE.getNetworkState() == 1 ? 0 : 1;
    }

    public P0 n() {
        return null;
    }

    public final void o() {
        Function0 function0;
        P0 p3;
        ViewGroup viewGroup;
        try {
            if (this.f34146f == null) {
                this.f34146f = n();
            }
            if (NQEManager.INSTANCE.getNetworkState() != 1 || (p3 = this.f34146f) == null) {
                View view = this.networkNotConnectView;
                if (view != null) {
                    h.s(view, false);
                    P0 p0N = n();
                    if (p0N == null || (function0 = (Function0) p0N.f13247b) == null) {
                        return;
                    }
                    function0.invoke();
                    return;
                }
                return;
            }
            View view2 = this.networkNotConnectView;
            if (view2 != null) {
                h.s(view2, true);
                return;
            }
            View viewC = p3.c();
            this.networkNotConnectView = viewC;
            viewC.setClickable(true);
            View view3 = this.networkNotConnectView;
            if (view3 != null) {
                view3.setFocusable(true);
            }
            P0 p10 = this.f34146f;
            if (p10 == null || (viewGroup = (ViewGroup) p10.f13251f) == null) {
                return;
            }
            viewGroup.addView(this.networkNotConnectView, new ViewGroup.LayoutParams(-1, -1));
        } catch (Throwable unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void onNetworkStateChanged(int i7, int i10, NQEQualityBean nQEQualityBean) {
        super.onNetworkStateChanged(i7, i10, nQEQualityBean);
        Integer num = this.f34147g;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f34147g = Integer.valueOf(i10);
        S0 s3 = (S0) this.f34145e.getValue();
        s3.f36574d.k(Integer.valueOf(i10));
        s3.f36576f.k(nQEQualityBean);
        o();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f34147g = Integer.valueOf(NQEManager.INSTANCE.getNetworkState());
        o();
    }

    public final void setNetworkNotConnectView(@Nullable View view) {
        this.networkNotConnectView = view;
    }
}

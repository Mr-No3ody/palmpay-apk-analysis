package com.transsnet.palmpay.teller.ui.fragment;

import N8.C0463g;
import T8.f;
import Zd.C0796a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.P0;
import androidx.lifecycle.b0;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p002a.a;
import p086fe.S0;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseBillerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBillerFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BaseBillerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,80:1\n172#2,9:81\n*S KotlinDebug\n*F\n+ 1 BaseBillerFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BaseBillerFragment\n*L\n21#1:81,9\n*E\n"})
public abstract class BaseBillerFragment<VM extends BaseViewModel, B extends ViewBinding> extends BaseMvvmVBFragment<VM, B> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f34250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f34251p = a.h(this, G.a(S0.class), new C0796a(this, 0), new C0796a(this, 1), new C0796a(this, 2));
    public P0 t;

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        v();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((S0) this.f34251p.getValue()).f36575e.e(getViewLifecycleOwner(), new f(new C0463g(this, 27)));
    }

    public P0 u() {
        return null;
    }

    public final void v() {
        Function0 function0;
        try {
            if (this.t == null) {
                this.t = u();
            }
            if (NQEManager.INSTANCE.getNetworkState() == 1) {
                P0 p3 = this.t;
                if ((p3 != null ? (ViewGroup) p3.f13251f : null) != null) {
                    if (this.f34250o == null) {
                        View viewC = p3 != null ? p3.c() : null;
                        this.f34250o = viewC;
                        if (viewC != null) {
                            viewC.setClickable(true);
                        }
                        View view = this.f34250o;
                        if (view != null) {
                            view.setFocusable(true);
                        }
                    }
                    P0 p10 = this.t;
                    ViewGroup viewGroup = p10 != null ? (ViewGroup) p10.f13251f : null;
                    if (viewGroup != null) {
                        View view2 = this.f34250o;
                        if ((view2 != null ? view2.getParent() : null) == null) {
                            viewGroup.addView(this.f34250o, new ViewGroup.LayoutParams(-1, -1));
                            return;
                        }
                        View view3 = this.f34250o;
                        if (view3 != null) {
                            h.s(view3, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            View view4 = this.f34250o;
            if (view4 == null || view4.getParent() == null) {
                return;
            }
            View view5 = this.f34250o;
            if (view5 != null) {
                h.s(view5, false);
            }
            P0 p11 = this.t;
            if (p11 == null || (function0 = (Function0) p11.f13247b) == null) {
                return;
            }
            function0.invoke();
        } catch (Throwable unused) {
        }
    }
}

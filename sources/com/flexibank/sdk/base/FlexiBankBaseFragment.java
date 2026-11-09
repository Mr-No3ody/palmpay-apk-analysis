package com.flexibank.sdk.base;

import Ae.n;
import L6.g;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.internal.c;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.base.FlexiBankBaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/flexibank/sdk/base/FlexiBankBaseFragment;", "Lcom/flexibank/sdk/base/FlexiBankBaseViewModel;", "VM", "Landroidx/viewbinding/ViewBinding;", "VB", "Landroidx/fragment/app/Fragment;", "Lcom/flexibank/sdk/base/FlexiBankLoadingDialogHost;", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankBaseFragment.kt\ncom/flexibank/sdk/base/FlexiBankBaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class FlexiBankBaseFragment<VM extends FlexiBankBaseViewModel, VB extends ViewBinding> extends Fragment implements FlexiBankLoadingDialogHost {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f21938j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f21941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P6.a f21942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlexiBankBaseViewModel f21943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewBinding f21944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f21945g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f21946i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public FlexiBankBaseFragment() {
        this(null);
    }

    public int f() {
        return 0;
    }

    public final View g() {
        View view = this.f21941c;
        if (view != null) {
            return view;
        }
        Intrinsics.n("mParentView");
        throw null;
    }

    public final FlexiBankBaseViewModel h() {
        FlexiBankBaseViewModel flexiBankBaseViewModel = this.f21943e;
        if (flexiBankBaseViewModel != null) {
            return flexiBankBaseViewModel;
        }
        Intrinsics.n("mViewModel");
        throw null;
    }

    public ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return null;
    }

    public int j() {
        return 0;
    }

    public void k() {
    }

    public int l() {
        return 0;
    }

    public final void m(boolean z3, boolean z8, String str) {
        Intrinsics.checkNotNullParameter("", "message");
        E activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        n nVar = this.f21946i;
        if (!z3) {
            Handler handler = this.f21945g;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.f21945g = handler;
            }
            handler.postDelayed(nVar, 100L);
            return;
        }
        Handler handler2 = this.f21945g;
        if (handler2 != null) {
            handler2.removeCallbacks(nVar);
        }
        P6.a aVar = this.f21942d;
        if (aVar == null || !aVar.isShowing()) {
            P6.a aVar2 = new P6.a(activity, g.lib_ui_lottie_loading);
            aVar2.f6999e = 1;
            aVar2.f6998d = "";
            aVar2.show();
            this.f21942d = aVar2;
            aVar2.setCanceledOnTouchOutside(false);
            P6.a aVar3 = this.f21942d;
            if (aVar3 != null) {
                aVar3.setCancelable(z8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int iF = f();
        if (iF > 0) {
            View viewInflate = inflater.inflate(iF, viewGroup, false);
            Intrinsics.checkNotNullParameter(viewInflate, "<set-?>");
            this.f21941c = viewInflate;
        } else {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            ViewBinding viewBindingI = i(inflater, viewGroup);
            this.f21944f = viewBindingI;
            if (viewBindingI == null) {
                Intrinsics.checkNotNullParameter(inflater, "inflater");
                throw new IllegalArgumentException("Required value was null.");
            }
            View root = viewBindingI.getRoot();
            Intrinsics.checkNotNullParameter(root, "<set-?>");
            this.f21941c = root;
        }
        return g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        P6.a aVar = this.f21942d;
        if (aVar != null) {
            if (!aVar.isShowing()) {
                aVar = null;
            }
            if (aVar != null) {
                aVar.dismiss();
                aVar.setOnCancelListener(null);
            }
        }
        this.f21942d = null;
        Handler handler = this.f21945g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f21945g = null;
        this.f21944f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Class cls = this.f21939a;
        if (cls != null) {
            this.f21943e = (FlexiBankBaseViewModel) new c(this).h(cls);
            getLifecycle().a(h());
        }
        l();
        j();
        k();
    }

    @Override // com.flexibank.sdk.base.FlexiBankLoadingDialogHost
    public final void showLoadingDialog(boolean z3) {
        m(z3, true, "");
    }

    public FlexiBankBaseFragment(Class cls) {
        this.f21939a = cls;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.f21940b = simpleName;
        this.f21946i = new n(this, 25);
    }

    @Override // com.flexibank.sdk.base.FlexiBankLoadingDialogHost
    public final void showLoadingDialog(boolean z3, boolean z8) {
        m(z3, z8, "");
    }
}

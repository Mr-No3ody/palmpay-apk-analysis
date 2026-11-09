package com.transsnet.palmpay.core.base;

import Pa.i0;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.util.statistic.AutoTrackHelper;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseFragment extends Fragment implements IBaseView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f27318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f27319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.transsnet.palmpay.custom_view.dialog.b f27320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p103gf.a f27321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f27322f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27317a = getClass().getSimpleName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.customview.widget.e f27323g = new androidx.customview.widget.e(this, 20);

    public final void f(Disposable disposable) {
        if (this.f27321e == null) {
            this.f27321e = new p103gf.a();
        }
        this.f27321e.add(disposable);
    }

    public void g(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewBinding viewBindingL = l(layoutInflater, viewGroup);
        if (viewBindingL != null) {
            this.f27318b = viewBindingL.getRoot();
        }
    }

    public abstract int h();

    public LoadingDialog i() {
        com.transsnet.palmpay.custom_view.dialog.n nVar = new com.transsnet.palmpay.custom_view.dialog.n(getActivity());
        nVar.f31288b = "";
        return nVar.a();
    }

    public final Handler j() {
        if (this.f27322f == null) {
            this.f27322f = new Handler(Looper.getMainLooper());
        }
        return this.f27322f;
    }

    public abstract int k();

    public ViewBinding l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final boolean m() {
        E e10 = this.f27319c;
        if (e10 != null && (e10 instanceof BaseActivity)) {
            return ((BaseActivity) e10).isDarkMode();
        }
        return false;
    }

    public abstract void n();

    public abstract int o();

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f27319c = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iH = h();
        if (iH > 0) {
            this.f27318b = layoutInflater.inflate(iH, viewGroup, false);
        } else {
            g(layoutInflater, viewGroup, bundle);
        }
        return this.f27318b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AutoTrackHelper.trackFragmentDestroy(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.transsnet.palmpay.custom_view.dialog.b bVar = this.f27320d;
        if (bVar != null && bVar.isShowing()) {
            this.f27320d.dismiss();
            this.f27320d.setOnCancelListener(null);
            this.f27320d = null;
        }
        Handler handler = this.f27322f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f27322f = null;
        }
        p103gf.a aVar = this.f27321e;
        if (aVar != null) {
            aVar.dispose();
            this.f27321e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f27319c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z3) {
        super.onHiddenChanged(z3);
        AutoTrackHelper.trackOnHiddenChanged(this, z3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AutoTrackHelper.trackFragmentResume(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AutoTrackHelper.onFragmentViewCreated(this, view, bundle);
        o();
        k();
        n();
    }

    public final void p(String str) {
        q(str, getResources().getString(p025ba.k.core_confirm), null);
    }

    public final void q(String str, String str2, String str3) {
        O6.c cVar = new O6.c(this.f27319c);
        cVar.e(p025ba.k.core_title_error_info);
        cVar.f6598d = str;
        if (!TextUtils.isEmpty(str2)) {
            cVar.f6600f = str2;
            cVar.f6602h = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            cVar.f6601g = str3;
            cVar.f6603i = null;
        }
        cVar.g();
    }

    public final void r(String str, String str2, String str3, View.OnClickListener onClickListener) {
        O6.c cVar = new O6.c(this.f27319c);
        cVar.f6596b = O6.d.f(str);
        cVar.f6598d = str2;
        cVar.f6600f = str3;
        cVar.f6602h = null;
        cVar.g();
    }

    public void s(boolean z3, boolean z8, String str) {
        E activity = getActivity();
        if (i0.W(activity) && !activity.isDestroyed()) {
            androidx.customview.widget.e eVar = this.f27323g;
            if (!z3) {
                if (this.f27322f == null) {
                    this.f27322f = new Handler(Looper.getMainLooper());
                }
                this.f27322f.postDelayed(eVar, 100L);
                return;
            }
            Handler handler = this.f27322f;
            if (handler != null) {
                handler.removeCallbacks(eVar);
            }
            com.transsnet.palmpay.custom_view.dialog.b bVar = this.f27320d;
            if (bVar == null || !bVar.isShowing()) {
                LoadingDialog loadingDialogI = i();
                this.f27320d = loadingDialogI;
                loadingDialogI.show();
                this.f27320d.setCanceledOnTouchOutside(false);
                this.f27320d.setCancelable(z8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z3) {
        super.setUserVisibleHint(z3);
        AutoTrackHelper.trackFragmentSetUserVisibleHint(this, z3);
    }

    public void showLoading(boolean z3) {
        showLoadingDialog(z3);
    }

    public void showLoadingDialog(boolean z3) {
        s(z3, true, "");
    }

    public void showLoadingView(boolean z3) {
        showLoadingDialog(z3);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final void showLoadingDialog(boolean z3, boolean z8) {
        s(z3, z8, "");
    }
}

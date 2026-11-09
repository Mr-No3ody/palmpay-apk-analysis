package com.palmpay.lib.live;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.internal.c;
import androidx.lifecycle.LifecycleOwner;
import com.palmpay.lib.live.BaseViewModel;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import p217o6.a;
import p217o6.b;
import p217o6.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LiveFragment<VM extends BaseViewModel> extends BaseFragment implements IView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseViewModel f23815a;

    public View f(ViewGroup viewGroup) {
        return null;
    }

    public Class g() {
        return null;
    }

    @Override // com.palmpay.lib.live.IView
    public void initData(Bundle bundle) {
    }

    @Override // com.palmpay.lib.live.IView
    public final void initViewObservable() {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23815a = g() == null ? (BaseViewModel) new c(this).h((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]) : (BaseViewModel) new c(this).h(g());
        getLifecycle().a(this.f23815a);
        WeakReference weakReference = this.f23815a.f23813f;
        if ((weakReference == null ? null : (LifecycleOwner) weakReference.get()) == null) {
            BaseViewModel baseViewModel = this.f23815a;
            baseViewModel.getClass();
            baseViewModel.f23813f = new WeakReference(this);
        }
        return f(viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().b(this.f23815a);
        this.f23815a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a aVarD = this.f23815a.d();
        e eVarL = a.l(aVarD.f40053m);
        aVarD.f40053m = eVarL;
        eVarL.e(getViewLifecycleOwner(), new b(this, 0));
        a aVarD2 = this.f23815a.d();
        e eVarL2 = a.l(aVarD2.f40057q);
        aVarD2.f40057q = eVarL2;
        eVarL2.e(getViewLifecycleOwner(), new b(this, 1));
        a aVarD3 = this.f23815a.d();
        e eVarL3 = a.l(aVarD3.f40054n);
        aVarD3.f40054n = eVarL3;
        eVarL3.e(this, new b(this, 2));
        a aVarD4 = this.f23815a.d();
        e eVarL4 = a.l(aVarD4.f40055o);
        aVarD4.f40055o = eVarL4;
        eVarL4.e(getViewLifecycleOwner(), new b(this, 3));
        a aVarD5 = this.f23815a.d();
        e eVarL5 = a.l(aVarD5.f40056p);
        aVarD5.f40056p = eVarL5;
        eVarL5.e(getViewLifecycleOwner(), new b(this, 4));
        a aVarD6 = this.f23815a.d();
        e eVarL6 = a.l(aVarD6.f40058r);
        aVarD6.f40058r = eVarL6;
        eVarL6.e(getViewLifecycleOwner(), new b());
        a aVarD7 = this.f23815a.d();
        e eVarL7 = a.l(aVarD7.f40059s);
        aVarD7.f40059s = eVarL7;
        eVarL7.e(getViewLifecycleOwner(), new p217o6.c(this, 0));
        a aVarD8 = this.f23815a.d();
        e eVarL8 = a.l(aVarD8.t);
        aVarD8.t = eVarL8;
        eVarL8.e(getViewLifecycleOwner(), new p217o6.c(this, 1));
        initData(getArguments());
    }
}

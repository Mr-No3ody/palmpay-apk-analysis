package com.palmpay.lib.live;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.live.BaseViewModel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseBindingFragment<VM extends BaseViewModel, VB extends ViewBinding> extends LiveFragment<VM> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewBinding f23811b;

    @Override // com.palmpay.lib.live.LiveFragment
    public final View f(ViewGroup viewGroup) {
        ViewBinding viewBindingH = h(viewGroup);
        this.f23811b = viewBindingH;
        if (viewBindingH == null) {
            ViewBinding viewBinding = null;
            try {
                Type genericSuperclass = getClass().getGenericSuperclass();
                if (genericSuperclass != null) {
                    viewBinding = (ViewBinding) ((Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]).getDeclaredMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE).invoke(null, getLayoutInflater(), viewGroup, Boolean.FALSE);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
            this.f23811b = viewBinding;
        }
        return this.f23811b.getRoot();
    }

    public ViewBinding h(ViewGroup viewGroup) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f23811b = null;
    }
}

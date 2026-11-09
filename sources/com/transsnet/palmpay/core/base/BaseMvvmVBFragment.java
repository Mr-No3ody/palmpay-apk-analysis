package com.transsnet.palmpay.core.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseMvvmVBFragment<VM extends BaseViewModel, B extends ViewBinding> extends BaseMvvmFragment<VM> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewBinding f27335j;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void g(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            ViewBinding viewBindingT = t(layoutInflater, viewGroup);
            this.f27335j = viewBindingT;
            this.f27318b = viewBindingT.getRoot();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27335j = null;
    }

    public abstract ViewBinding t(LayoutInflater layoutInflater, ViewGroup viewGroup);
}

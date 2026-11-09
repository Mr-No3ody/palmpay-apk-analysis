package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;

/* JADX INFO: loaded from: classes.dex */
public final class D extends K implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, FragmentOnAttachListener, MenuHost {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0837o f16972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractActivityC0837o abstractActivityC0837o) {
        super(abstractActivityC0837o);
        this.f16972e = abstractActivityC0837o;
    }

    @Override // androidx.fragment.app.H
    public final View a(int i7) {
        return this.f16972e.findViewById(i7);
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider) {
        this.f16972e.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer consumer) {
        this.f16972e.addOnConfigurationChangedListener(consumer);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer consumer) {
        this.f16972e.addOnMultiWindowModeChangedListener(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer consumer) {
        this.f16972e.addOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer consumer) {
        this.f16972e.addOnTrimMemoryListener(consumer);
    }

    @Override // androidx.fragment.app.H
    public final boolean b() {
        Window window = this.f16972e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final androidx.activity.result.h getActivityResultRegistry() {
        return this.f16972e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final AbstractC1205o getLifecycle() {
        return this.f16972e.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.I getOnBackPressedDispatcher() {
        return this.f16972e.getOnBackPressedDispatcher();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final L0.d getSavedStateRegistry() {
        return this.f16972e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final androidx.lifecycle.i0 getViewModelStore() {
        return this.f16972e.getViewModelStore();
    }

    @Override // androidx.core.view.MenuHost
    public final void invalidateMenu() {
        this.f16972e.invalidateMenu();
    }

    @Override // androidx.fragment.app.FragmentOnAttachListener
    public final void onAttachFragment(Z z3, Fragment fragment) {
        this.f16972e.onAttachFragment(fragment);
    }

    @Override // androidx.core.view.MenuHost
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.f16972e.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer consumer) {
        this.f16972e.removeOnConfigurationChangedListener(consumer);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer consumer) {
        this.f16972e.removeOnMultiWindowModeChangedListener(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer consumer) {
        this.f16972e.removeOnPictureInPictureModeChangedListener(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer consumer) {
        this.f16972e.removeOnTrimMemoryListener(consumer);
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.f16972e.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, EnumC1204n enumC1204n) {
        this.f16972e.addMenuProvider(menuProvider, lifecycleOwner, enumC1204n);
    }
}

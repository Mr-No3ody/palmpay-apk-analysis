package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class n extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner, SavedStateRegistryOwner {

    @Nullable
    private C1212w _lifecycleRegistry;

    @NotNull
    private final I onBackPressedDispatcher;

    @NotNull
    private final L0.f savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, int i7) {
        super(context, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = L0.f.f5522d.create(this);
        this.onBackPressedDispatcher = new I(new W8.o(this, 10));
    }

    public static void a(n this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public AbstractC1205o getLifecycle() {
        C1212w c1212w = this._lifecycleRegistry;
        if (c1212w != null) {
            return c1212w;
        }
        C1212w c1212w2 = new C1212w(this);
        this._lifecycleRegistry = c1212w2;
        return c1212w2;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NotNull
    public final I getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public L0.d getSavedStateRegistry() {
        return this.savedStateRegistryController.f5524b;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.e(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(p358y0.a.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        Intrinsics.e(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(J.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.e(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(L0.a.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onBackPressed() {
        this.onBackPressedDispatcher.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            I i7 = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            i7.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            i7.f12002e = invoker;
            i7.e(i7.f12004g);
        }
        this.savedStateRegistryController.b(bundle);
        C1212w c1212w = this._lifecycleRegistry;
        if (c1212w == null) {
            c1212w = new C1212w(this);
            this._lifecycleRegistry = c1212w;
        }
        c1212w.e(EnumC1203m.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C1212w c1212w = this._lifecycleRegistry;
        if (c1212w == null) {
            c1212w = new C1212w(this);
            this._lifecycleRegistry = c1212w;
        }
        c1212w.e(EnumC1203m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1212w c1212w = this._lifecycleRegistry;
        if (c1212w == null) {
            c1212w = new C1212w(this);
            this._lifecycleRegistry = c1212w;
        }
        c1212w.e(EnumC1203m.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        initializeViewTreeOwners();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}

package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ReportFragment;
import com.alibaba.android.arouter.facade.Postcard;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.core.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1040i extends Activity implements LifecycleOwner, KeyEventDispatcher$Component {

    @NotNull
    private final M.n extraDataMap = new M.n(0);

    @NotNull
    private final C1212w lifecycleRegistry = new C1212w(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (com.facebook.imagepipeline.nativecode.b.j(decorView, event)) {
            return true;
        }
        return com.facebook.imagepipeline.nativecode.b.k(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (com.facebook.imagepipeline.nativecode.b.j(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public void finishNow() {
        finish();
    }

    @Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    @RestrictTo({p192n.c.f39802c})
    @Nullable
    public <T extends AbstractC1039h> T getExtraData(@NotNull Class<T> extraDataClass) {
        Intrinsics.checkNotNullParameter(extraDataClass, "extraDataClass");
        if (this.extraDataMap.get(extraDataClass) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public AbstractC1205o getLifecycle() {
        return this.lifecycleRegistry;
    }

    public void onArrival(Postcard postcard) {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.f17398b.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.g(EnumC1204n.f17462c);
        super.onSaveInstanceState(outState);
    }

    @Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    @RestrictTo({p192n.c.f39802c})
    public void putExtraData(@NotNull AbstractC1039h extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean shouldDumpInternalState(@Nullable String[] strArr) {
        boolean z3 = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z3 = true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z3 = true;
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z3 = true;
                        }
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        z3 = true;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        z3 = true;
                    }
                    break;
            }
        }
        return !z3;
    }

    @Override // androidx.core.view.KeyEventDispatcher$Component
    @RestrictTo({p192n.c.f39802c})
    public boolean superDispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }
}

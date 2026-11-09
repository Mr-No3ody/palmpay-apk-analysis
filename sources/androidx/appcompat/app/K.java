package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.core.view.KeyEventDispatcher$Component;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class K extends androidx.activity.n implements AppCompatCallback {
    private AbstractC0841t mDelegate;
    private final KeyEventDispatcher$Component mKeyDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Context context, boolean z3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mKeyDispatcher = new KeyEventDispatcher$Component() { // from class: androidx.appcompat.app.J
            @Override // androidx.core.view.KeyEventDispatcher$Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f12158a.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z3);
        setOnCancelListener(onCancelListener);
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        I i7 = (I) getDelegate();
        i7.x();
        ((ViewGroup) i7.f12146q0.findViewById(R.id.content)).addView(view, layoutParams);
        i7.f12151v.a(i7.t.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.facebook.imagepipeline.nativecode.b.k(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i7) {
        I i10 = (I) getDelegate();
        i10.x();
        return (T) i10.t.findViewById(i7);
    }

    @NonNull
    public AbstractC0841t getDelegate() {
        if (this.mDelegate == null) {
            r rVar = AbstractC0841t.f12314a;
            this.mDelegate = new I(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public AbstractC0824b getSupportActionBar() {
        I i7 = (I) getDelegate();
        i7.C();
        return i7.f12110A;
    }

    @Override // android.app.Dialog
    @RestrictTo({p192n.c.f39802c})
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void onCreate(Bundle bundle) {
        I i7 = (I) getDelegate();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(i7.f12144p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(i7);
        } else {
            boolean z3 = layoutInflaterFrom.getFactory2() instanceof I;
        }
        super.onCreate(bundle);
        getDelegate().d();
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void onStop() {
        super.onStop();
        I i7 = (I) getDelegate();
        i7.C();
        AbstractC0824b abstractC0824b = i7.f12110A;
        if (abstractC0824b != null) {
            abstractC0824b.t(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public p343x.a onWindowStartingSupportActionMode(ActionMode$Callback actionMode$Callback) {
        return null;
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void setContentView(int i7) {
        initializeViewTreeOwners();
        getDelegate().h(i7);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().m(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i7) {
        return getDelegate().g(i7);
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().i(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i7) {
        super.setTitle(i7);
        getDelegate().m(getContext().getString(i7));
    }

    @Override // androidx.activity.n, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().j(view, layoutParams);
    }

    public K(Context context, int i7) {
        int i10;
        if (i7 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(p241q.a.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i7;
        }
        super(context, i10);
        this.mKeyDispatcher = new KeyEventDispatcher$Component() { // from class: androidx.appcompat.app.J
            @Override // androidx.core.view.KeyEventDispatcher$Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f12158a.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC0841t delegate = getDelegate();
        if (i7 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(p241q.a.dialogTheme, typedValue2, true);
            i7 = typedValue2.resourceId;
        }
        ((I) delegate).f12123J0 = i7;
        delegate.d();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(p343x.a aVar) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(p343x.a aVar) {
    }
}

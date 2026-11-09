package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zaad;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;

    @Nullable
    private View.OnClickListener zad;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(@NonNull Context context) {
        this(context, null);
    }

    private final void zaa(Context context) {
        View view = this.zac;
        if (view != null) {
            removeView(view);
        }
        try {
            this.zac = zaac.zaa(context, this.zaa, this.zab);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i7 = this.zaa;
            int i10 = this.zab;
            zaad zaadVar = new zaad(context, null);
            zaadVar.zaa(context.getResources(), i7, i10);
            this.zac = zaadVar;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.zad;
        if (onClickListener == null || view != this.zac) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i7) {
        setStyle(this.zaa, i7);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.zac.setEnabled(z3);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        View view = this.zac;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i7) {
        setStyle(i7, this.zab);
    }

    public void setStyle(int i7, int i10) {
        this.zaa = i7;
        this.zab = i10;
        zaa(getContext());
    }

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setStyle(int i7, int i10, @NonNull Scope[] scopeArr) {
        setStyle(i7, i10);
    }

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.zad = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.SignInButton, 0, 0);
        try {
            this.zaa = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
            this.zab = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.zaa, this.zab);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

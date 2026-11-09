package com.google.android.material.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p192n.c;
import p300u.a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class ScaledDrawableWrapper extends a {
    private boolean mutated;
    private ScaledDrawableWrapperState state;

    public ScaledDrawableWrapper(@NonNull Drawable drawable, int i7, int i10) {
        super(drawable);
        this.state = new ScaledDrawableWrapperState(getConstantStateFrom(drawable), i7, i10);
    }

    @Nullable
    private Drawable.ConstantState getConstantStateFrom(@Nullable Drawable drawable) {
        if (drawable != null) {
            return drawable.getConstantState();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        if (this.state.canConstantState()) {
            return this.state;
        }
        return null;
    }

    @Override // p300u.a, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.state.height;
    }

    @Override // p300u.a, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.state.width;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.mutated && super.mutate() == this) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.mutate();
            }
            this.state = new ScaledDrawableWrapperState(getConstantStateFrom(drawable), this.state.width, this.state.height);
            this.mutated = true;
        }
        return this;
    }

    @Override // p300u.a
    public void setDrawable(@Nullable Drawable drawable) {
        super.setDrawable(drawable);
        ScaledDrawableWrapperState scaledDrawableWrapperState = this.state;
        if (scaledDrawableWrapperState != null) {
            scaledDrawableWrapperState.wrappedDrawableState = getConstantStateFrom(drawable);
            this.mutated = false;
        }
    }

    public static final class ScaledDrawableWrapperState extends Drawable.ConstantState {
        private final int height;
        private final int width;
        private Drawable.ConstantState wrappedDrawableState;

        public ScaledDrawableWrapperState(@Nullable Drawable.ConstantState constantState, int i7, int i10) {
            this.wrappedDrawableState = constantState;
            this.width = i7;
            this.height = i10;
        }

        public boolean canConstantState() {
            return this.wrappedDrawableState != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.wrappedDrawableState;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new ScaledDrawableWrapper(this.wrappedDrawableState.newDrawable(), this.width, this.height);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new ScaledDrawableWrapper(this.wrappedDrawableState.newDrawable(resources), this.width, this.height);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(@Nullable Resources resources, @Nullable Resources.Theme theme) {
            return new ScaledDrawableWrapper(this.wrappedDrawableState.newDrawable(resources, theme), this.width, this.height);
        }
    }
}

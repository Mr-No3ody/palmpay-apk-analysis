package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {
    private final C0885u mBackgroundTintHelper;

    @NonNull
    private A mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Nullable
    private Future<androidx.core.text.d> mPrecomputedTextFuture;

    @Nullable
    private SuperCaller mSuperCaller;
    private final P mTextClassifierHelper;
    private final V mTextHelper;

    public interface SuperCaller {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        TextClassifier getTextClassifier();

        void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7);

        void setAutoSizeTextTypeWithDefaults(int i7);

        void setFirstBaselineToTopHeight(@Px int i7);

        void setLastBaselineToBottomHeight(@Px int i7);

        void setLineHeight(int i7, @FloatRange(from = 0.0d) float f10);

        void setTextClassifier(@Nullable TextClassifier textClassifier);
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private A getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new A(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public final void a() {
        Future<androidx.core.text.d> future = this.mPrecomputedTextFuture;
        if (future == null) {
            return;
        }
        try {
            this.mPrecomputedTextFuture = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            p377z5.l.m(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.a();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeMaxTextSize() {
        if (p1.f12997c) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return Math.round(v3.f12840i.f12883e);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeMinTextSize() {
        if (p1.f12997c) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return Math.round(v3.f12840i.f12882d);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeStepGranularity() {
        if (p1.f12997c) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return Math.round(v3.f12840i.f12881c);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int[] getAutoSizeTextAvailableSizes() {
        if (p1.f12997c) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        V v3 = this.mTextHelper;
        return v3 != null ? v3.f12840i.f12884f : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeTextType() {
        if (p1.f12997c) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return v3.f12840i.f12879a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p377z5.l.P(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @RequiresApi(api = 26)
    @UiThread
    public SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                this.mSuperCaller = new Y(this);
            } else if (i7 >= 28) {
                this.mSuperCaller = new X(this);
            } else if (i7 >= 26) {
                this.mSuperCaller = new W(this);
            }
        }
        return this.mSuperCaller;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportBackgroundTintList() {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            return c0885u.b();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            return c0885u.c();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        a();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        P p3;
        if (Build.VERSION.SDK_INT >= 28 || (p3 = this.mTextClassifierHelper) == null) {
            return getSuperCaller().getTextClassifier();
        }
        TextClassifier textClassifier = p3.f12738b;
        return textClassifier == null ? O.a(p3.f12737a) : textClassifier;
    }

    @NonNull
    public androidx.core.text.c getTextMetricsParamsCompat() {
        return p377z5.l.m(this);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        V.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        androidx.camera.core.impl.utils.executor.g.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        V v3 = this.mTextHelper;
        if (v3 == null || p1.f12997c) {
            return;
        }
        v3.f12840i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        a();
        super.onMeasure(i7, i10);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        V v3 = this.mTextHelper;
        if (v3 == null || p1.f12997c || !v3.f12840i.f()) {
            return;
        }
        this.mTextHelper.f12840i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) throws IllegalArgumentException {
        if (p1.f12997c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.i(i7, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i7) throws IllegalArgumentException {
        if (p1.f12997c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.j(iArr, i7);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (p1.f12997c) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.k(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        super.setBackgroundResource(i7);
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.f(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p377z5.l.Q(callback, this));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = 0) @Px int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().setFirstBaselineToTopHeight(i7);
        } else {
            p377z5.l.E(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = 0) @Px int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().setLastBaselineToBottomHeight(i7);
        } else {
            p377z5.l.F(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange(from = 0) @Px int i7) {
        p377z5.l.G(this, i7);
    }

    public void setPrecomputedText(@NonNull androidx.core.text.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        p377z5.l.m(this);
        throw null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.h(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.l(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.m(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.g(i7, context);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        P p3;
        if (Build.VERSION.SDK_INT >= 28 || (p3 = this.mTextClassifierHelper) == null) {
            getSuperCaller().setTextClassifier(textClassifier);
        } else {
            p3.f12738b = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<androidx.core.text.d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull androidx.core.text.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f16149b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(cVar.f16148a);
        setBreakStrategy(cVar.f16150c);
        setHyphenationFrequency(cVar.f16151d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f10) {
        boolean z3 = p1.f12997c;
        if (z3) {
            super.setTextSize(i7, f10);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 == null || z3) {
            return;
        }
        C0853d0 c0853d0 = v3.f12840i;
        if (c0853d0.f()) {
            return;
        }
        c0853d0.g(i7, f10);
    }

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i7) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i7 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            androidx.core.graphics.o oVar = androidx.core.graphics.h.f16065a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i7);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7, @FloatRange(from = 0.0d) float f10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().setLineHeight(i7, f10);
        } else if (i10 >= 34) {
            androidx.camera.core.imagecapture.i.l(this, i7, f10);
        } else {
            p377z5.l.G(this, Math.round(TypedValue.applyDimension(i7, f10, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        W0.a(this, getContext());
        C0885u c0885u = new C0885u(this);
        this.mBackgroundTintHelper = c0885u;
        c0885u.d(attributeSet, i7);
        V v3 = new V(this);
        this.mTextHelper = v3;
        v3.f(attributeSet, i7);
        v3.b();
        P p3 = new P();
        p3.f12737a = this;
        this.mTextClassifierHelper = p3;
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? p264r5.a.q(i7, context) : null, i10 != 0 ? p264r5.a.q(i10, context) : null, i11 != 0 ? p264r5.a.q(i11, context) : null, i12 != 0 ? p264r5.a.q(i12, context) : null);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? p264r5.a.q(i7, context) : null, i10 != 0 ? p264r5.a.q(i10, context) : null, i11 != 0 ? p264r5.a.q(i11, context) : null, i12 != 0 ? p264r5.a.q(i12, context) : null);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }
}

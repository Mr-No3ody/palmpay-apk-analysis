package com.palmpay.lib.ui.button;

import L6.c;
import L6.d;
import L6.f;
import L6.g;
import L6.j;
import M6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class PpButton extends FrameLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f24055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressBar f24056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f24057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnClickListener f24058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24061g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f24062i;

    public PpButton(@NonNull Context context) {
        this(context, null);
    }

    private ProgressBar getLoadingView() {
        if (this.f24056b == null) {
            try {
                ViewStub viewStub = (ViewStub) findViewById(f.loadingStub);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                ProgressBar progressBar = (ProgressBar) findViewById(f.button_loading);
                this.f24056b = progressBar;
                if (progressBar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) progressBar.getLayoutParams();
                    int i7 = this.f24060f;
                    layoutParams.width = i7;
                    layoutParams.height = i7;
                    this.f24056b.setLayoutParams(layoutParams);
                    this.f24056b.setIndeterminateTintList(ColorStateList.valueOf(this.f24061g));
                }
            } catch (Exception unused) {
            }
        }
        return this.f24056b;
    }

    public final boolean a() {
        int i7 = this.f24059e;
        return i7 == 2 || i7 == 1;
    }

    public final void b(boolean z3) {
        AppCompatTextView appCompatTextView = this.f24055a;
        if (!z3) {
            this.f24059e = 0;
            appCompatTextView.setText(this.f24057c);
            ProgressBar progressBar = this.f24056b;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                return;
            }
            return;
        }
        if (isEnabled()) {
            this.f24059e = 1;
        } else {
            this.f24059e = 2;
        }
        appCompatTextView.setText("");
        ProgressBar loadingView = getLoadingView();
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
    }

    public final void c(long j6) {
        d();
        AppCompatTextView appCompatTextView = this.f24055a;
        if (appCompatTextView != null) {
            if (j6 <= 0) {
                j6 = 5;
            } else if (j6 > 60) {
                j6 = 60;
            }
            appCompatTextView.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            View.OnClickListener onClickListener = this.f24058d;
            a aVar = new a();
            aVar.f5773c = new WeakReference(appCompatTextView);
            aVar.f5775e = appCompatTextView.getText();
            aVar.f5772b = j6 * 1000;
            if (onClickListener != null) {
                aVar.f5774d = new WeakReference(onClickListener);
            }
            this.f24062i = aVar;
            appCompatTextView.post(aVar);
        }
    }

    public final void d() {
        a aVar = this.f24062i;
        if (aVar != null) {
            AppCompatTextView appCompatTextView = this.f24055a;
            appCompatTextView.removeCallbacks(aVar);
            appCompatTextView.setText((CharSequence) this.f24062i.f5775e);
            this.f24062i = null;
        }
    }

    public TextView getTextView() {
        return this.f24055a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        if (motionEvent.getAction() == 1) {
            setPressed(false);
            if (!a() && (onClickListener = this.f24058d) != null) {
                onClickListener.onClick(view);
            }
        } else if (motionEvent.getAction() == 0) {
            setPressed(true);
        } else if (motionEvent.getAction() == 3) {
            setPressed(false);
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams.height == -2 && getHeight() == 0) {
            layoutParams.height = getContext().getResources().getDimensionPixelSize(c.ppButtonHeight);
        }
        super.setLayoutParams(layoutParams);
    }

    public void setMaxLines(int i7) {
        this.f24055a.setMaxLines(i7);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f24058d = onClickListener;
    }

    public void setText(CharSequence charSequence) {
        this.f24057c = charSequence;
        this.f24055a.setText(charSequence);
    }

    public void setTextColor(int i7) {
        this.f24055a.setTextColor(i7);
    }

    public PpButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PpButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f24059e = 0;
        View.inflate(context, g.lib_ui_layout_button, this);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(f.tv_text);
        this.f24055a = appCompatTextView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ppButton);
        appCompatTextView.setCompoundDrawablePadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppButton_android_drawablePadding, context.getResources().getDimensionPixelSize(c.ppButtonVerticalPadding)));
        Typeface typefaceCreate = null;
        appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getDrawable(j.ppButton_android_drawableLeft), (Drawable) null, typedArrayObtainStyledAttributes.getDrawable(j.ppButton_android_drawableRight), (Drawable) null);
        CharSequence text = typedArrayObtainStyledAttributes.getText(j.ppButton_android_text);
        this.f24057c = text;
        appCompatTextView.setText(text);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppButton_android_textSize, context.getResources().getDimensionPixelSize(c.ppButtonTextSize));
        appCompatTextView.setTextSize(0, dimensionPixelSize);
        if (typedArrayObtainStyledAttributes.getBoolean(j.ppButton_autoSizeText, false)) {
            try {
                appCompatTextView.setAutoSizeTextTypeWithDefaults(1);
                appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(Math.min(context.getResources().getDimensionPixelSize(c.ppButtonMinTextSize), dimensionPixelSize), dimensionPixelSize, context.getResources().getDimensionPixelSize(c.ppButtonStepTextSize), 0);
            } catch (Exception unused) {
            }
        }
        this.f24060f = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppButton_loading_size, context.getResources().getDimensionPixelSize(c.ppButtonLoadingSize));
        if (typedArrayObtainStyledAttributes.hasValue(j.ppButton_android_textColor)) {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(j.ppButton_android_textColor);
            if (colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        } else {
            appCompatTextView.setTextColor(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.ppButton_android_fontFamily)) {
            try {
                typefaceCreate = Typeface.create(typedArrayObtainStyledAttributes.getString(j.ppButton_android_fontFamily), 0);
            } catch (Exception unused2) {
            }
        }
        if (typefaceCreate != null) {
            appCompatTextView.setTypeface(typefaceCreate);
        }
        this.f24061g = typedArrayObtainStyledAttributes.getColor(j.ppButton_loading_color, -1);
        appCompatTextView.setIncludeFontPadding(typedArrayObtainStyledAttributes.getBoolean(j.ppButton_android_includeFontPadding, true));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(j.ppButton_android_enabled, true));
        if (!typedArrayObtainStyledAttributes.hasValue(j.ppButton_android_background)) {
            setBackgroundResource(d.lib_ui_button_bg_corner_primary);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.ppButton_android_maxLines)) {
            appCompatTextView.setMaxLines(typedArrayObtainStyledAttributes.getInt(j.ppButton_android_maxLines, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(this);
    }
}

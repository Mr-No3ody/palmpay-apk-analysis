package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    private static void updateTopBottomPadding(@NonNull View view, int i7, int i10) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i7, view.getPaddingEnd(), i10);
        } else {
            view.setPadding(view.getPaddingLeft(), i7, view.getPaddingRight(), i10);
        }
    }

    private boolean updateViewsWithinLayout(int i7, int i10, int i11) {
        boolean z3;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.messageView.getPaddingTop() == i10 && this.messageView.getPaddingBottom() == i11) {
            return z3;
        }
        updateTopBottomPadding(this.messageView, i10, i11);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i7, int i10) {
        this.messageView.setAlpha(0.0f);
        long j6 = i10;
        long j10 = i7;
        this.messageView.animate().alpha(1.0f).setDuration(j6).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j6).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i7, int i10) {
        this.messageView.setAlpha(1.0f);
        long j6 = i10;
        long j10 = i7;
        this.messageView.animate().alpha(0.0f).setDuration(j6).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j6).setInterpolator(this.contentInterpolator).setStartDelay(j10).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(R.id.snackbar_text);
        this.actionView = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.messageView.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.maxInlineActionWidth <= 0 || this.actionView.getMeasuredWidth() <= this.maxInlineActionWidth) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i7, i10);
    }

    public void setMaxInlineActionWidth(int i7) {
        this.maxInlineActionWidth = i7;
    }

    public void updateActionTextColorAlphaIfNeeded(float f10) {
        if (f10 != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface), this.actionView.getCurrentTextColor(), f10));
        }
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}

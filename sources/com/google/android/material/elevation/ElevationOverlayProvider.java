package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.d;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes2.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@ColorInt int i7) {
        return d.e(i7, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f10) {
        return Math.round(calculateOverlayAlphaFraction(f10) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f10) {
        float f11 = this.displayDensity;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i7, float f10, @NonNull View view) {
        return compositeOverlay(i7, getParentAbsoluteElevation(view) + f10);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i7, float f10, @NonNull View view) {
        return compositeOverlayIfNeeded(i7, getParentAbsoluteElevation(view) + f10);
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f10);
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i7, float f10) {
        int i10;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f10);
        int iAlpha = Color.alpha(i7);
        int iLayer = MaterialColors.layer(d.e(i7, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i10 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, d.e(i10, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return d.e(iLayer, iAlpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i7, float f10) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i7)) ? compositeOverlay(i7, f10) : i7;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10) {
        return compositeOverlayIfNeeded(this.colorSurface, f10);
    }

    public ElevationOverlayProvider(boolean z3, @ColorInt int i7, @ColorInt int i10, @ColorInt int i11, float f10) {
        this.elevationOverlayEnabled = z3;
        this.elevationOverlayColor = i7;
        this.elevationOverlayAccentColor = i10;
        this.colorSurface = i11;
        this.displayDensity = f10;
    }
}

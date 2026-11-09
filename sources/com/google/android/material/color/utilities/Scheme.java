package com.google.android.material.color.utilities;

import N8.q0;
import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
@RestrictTo({p192n.c.f39801b})
@Deprecated
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
    }

    public static Scheme dark(int i7) {
        return darkFromCorePalette(CorePalette.of(i7));
    }

    public static Scheme darkContent(int i7) {
        return darkFromCorePalette(CorePalette.contentOf(i7));
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f22497a1.tone(80)).withOnPrimary(corePalette.f22497a1.tone(20)).withPrimaryContainer(corePalette.f22497a1.tone(30)).withOnPrimaryContainer(corePalette.f22497a1.tone(90)).withSecondary(corePalette.f22498a2.tone(80)).withOnSecondary(corePalette.f22498a2.tone(20)).withSecondaryContainer(corePalette.f22498a2.tone(30)).withOnSecondaryContainer(corePalette.f22498a2.tone(90)).withTertiary(corePalette.a3.tone(80)).withOnTertiary(corePalette.a3.tone(20)).withTertiaryContainer(corePalette.a3.tone(30)).withOnTertiaryContainer(corePalette.a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f22499n1.tone(10)).withOnBackground(corePalette.f22499n1.tone(90)).withSurface(corePalette.f22499n1.tone(10)).withOnSurface(corePalette.f22499n1.tone(90)).withSurfaceVariant(corePalette.f22500n2.tone(30)).withOnSurfaceVariant(corePalette.f22500n2.tone(80)).withOutline(corePalette.f22500n2.tone(60)).withOutlineVariant(corePalette.f22500n2.tone(30)).withShadow(corePalette.f22499n1.tone(0)).withScrim(corePalette.f22499n1.tone(0)).withInverseSurface(corePalette.f22499n1.tone(90)).withInverseOnSurface(corePalette.f22499n1.tone(20)).withInversePrimary(corePalette.f22497a1.tone(40));
    }

    public static Scheme light(int i7) {
        return lightFromCorePalette(CorePalette.of(i7));
    }

    public static Scheme lightContent(int i7) {
        return lightFromCorePalette(CorePalette.contentOf(i7));
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f22497a1.tone(40)).withOnPrimary(corePalette.f22497a1.tone(100)).withPrimaryContainer(corePalette.f22497a1.tone(90)).withOnPrimaryContainer(corePalette.f22497a1.tone(10)).withSecondary(corePalette.f22498a2.tone(40)).withOnSecondary(corePalette.f22498a2.tone(100)).withSecondaryContainer(corePalette.f22498a2.tone(90)).withOnSecondaryContainer(corePalette.f22498a2.tone(10)).withTertiary(corePalette.a3.tone(40)).withOnTertiary(corePalette.a3.tone(100)).withTertiaryContainer(corePalette.a3.tone(90)).withOnTertiaryContainer(corePalette.a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f22499n1.tone(99)).withOnBackground(corePalette.f22499n1.tone(10)).withSurface(corePalette.f22499n1.tone(99)).withOnSurface(corePalette.f22499n1.tone(10)).withSurfaceVariant(corePalette.f22500n2.tone(90)).withOnSurfaceVariant(corePalette.f22500n2.tone(30)).withOutline(corePalette.f22500n2.tone(50)).withOutlineVariant(corePalette.f22500n2.tone(80)).withShadow(corePalette.f22499n1.tone(0)).withScrim(corePalette.f22499n1.tone(0)).withInverseSurface(corePalette.f22499n1.tone(20)).withInverseOnSurface(corePalette.f22499n1.tone(95)).withInversePrimary(corePalette.f22497a1.tone(80));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        return this.primary == scheme.primary && this.onPrimary == scheme.onPrimary && this.primaryContainer == scheme.primaryContainer && this.onPrimaryContainer == scheme.onPrimaryContainer && this.secondary == scheme.secondary && this.onSecondary == scheme.onSecondary && this.secondaryContainer == scheme.secondaryContainer && this.onSecondaryContainer == scheme.onSecondaryContainer && this.tertiary == scheme.tertiary && this.onTertiary == scheme.onTertiary && this.tertiaryContainer == scheme.tertiaryContainer && this.onTertiaryContainer == scheme.onTertiaryContainer && this.error == scheme.error && this.onError == scheme.onError && this.errorContainer == scheme.errorContainer && this.onErrorContainer == scheme.onErrorContainer && this.background == scheme.background && this.onBackground == scheme.onBackground && this.surface == scheme.surface && this.onSurface == scheme.onSurface && this.surfaceVariant == scheme.surfaceVariant && this.onSurfaceVariant == scheme.onSurfaceVariant && this.outline == scheme.outline && this.outlineVariant == scheme.outlineVariant && this.shadow == scheme.shadow && this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary;
    }

    public int getBackground() {
        return this.background;
    }

    public int getError() {
        return this.error;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public int getOnError() {
        return this.onError;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public int getOutline() {
        return this.outline;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public int getPrimary() {
        return this.primary;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public int getScrim() {
        return this.scrim;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public int getShadow() {
        return this.shadow;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((System.identityHashCode(this) * 31) + this.primary) * 31) + this.onPrimary) * 31) + this.primaryContainer) * 31) + this.onPrimaryContainer) * 31) + this.secondary) * 31) + this.onSecondary) * 31) + this.secondaryContainer) * 31) + this.onSecondaryContainer) * 31) + this.tertiary) * 31) + this.onTertiary) * 31) + this.tertiaryContainer) * 31) + this.onTertiaryContainer) * 31) + this.error) * 31) + this.onError) * 31) + this.errorContainer) * 31) + this.onErrorContainer) * 31) + this.background) * 31) + this.onBackground) * 31) + this.surface) * 31) + this.onSurface) * 31) + this.surfaceVariant) * 31) + this.onSurfaceVariant) * 31) + this.outline) * 31) + this.outlineVariant) * 31) + this.shadow) * 31) + this.scrim) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
    }

    public void setBackground(int i7) {
        this.background = i7;
    }

    public void setError(int i7) {
        this.error = i7;
    }

    public void setErrorContainer(int i7) {
        this.errorContainer = i7;
    }

    public void setInverseOnSurface(int i7) {
        this.inverseOnSurface = i7;
    }

    public void setInversePrimary(int i7) {
        this.inversePrimary = i7;
    }

    public void setInverseSurface(int i7) {
        this.inverseSurface = i7;
    }

    public void setOnBackground(int i7) {
        this.onBackground = i7;
    }

    public void setOnError(int i7) {
        this.onError = i7;
    }

    public void setOnErrorContainer(int i7) {
        this.onErrorContainer = i7;
    }

    public void setOnPrimary(int i7) {
        this.onPrimary = i7;
    }

    public void setOnPrimaryContainer(int i7) {
        this.onPrimaryContainer = i7;
    }

    public void setOnSecondary(int i7) {
        this.onSecondary = i7;
    }

    public void setOnSecondaryContainer(int i7) {
        this.onSecondaryContainer = i7;
    }

    public void setOnSurface(int i7) {
        this.onSurface = i7;
    }

    public void setOnSurfaceVariant(int i7) {
        this.onSurfaceVariant = i7;
    }

    public void setOnTertiary(int i7) {
        this.onTertiary = i7;
    }

    public void setOnTertiaryContainer(int i7) {
        this.onTertiaryContainer = i7;
    }

    public void setOutline(int i7) {
        this.outline = i7;
    }

    public void setOutlineVariant(int i7) {
        this.outlineVariant = i7;
    }

    public void setPrimary(int i7) {
        this.primary = i7;
    }

    public void setPrimaryContainer(int i7) {
        this.primaryContainer = i7;
    }

    public void setScrim(int i7) {
        this.scrim = i7;
    }

    public void setSecondary(int i7) {
        this.secondary = i7;
    }

    public void setSecondaryContainer(int i7) {
        this.secondaryContainer = i7;
    }

    public void setShadow(int i7) {
        this.shadow = i7;
    }

    public void setSurface(int i7) {
        this.surface = i7;
    }

    public void setSurfaceVariant(int i7) {
        this.surfaceVariant = i7;
    }

    public void setTertiary(int i7) {
        this.tertiary = i7;
    }

    public void setTertiaryContainer(int i7) {
        this.tertiaryContainer = i7;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Scheme{primary=");
        sb2.append(this.primary);
        sb2.append(", onPrimary=");
        sb2.append(this.onPrimary);
        sb2.append(", primaryContainer=");
        sb2.append(this.primaryContainer);
        sb2.append(", onPrimaryContainer=");
        sb2.append(this.onPrimaryContainer);
        sb2.append(", secondary=");
        sb2.append(this.secondary);
        sb2.append(", onSecondary=");
        sb2.append(this.onSecondary);
        sb2.append(", secondaryContainer=");
        sb2.append(this.secondaryContainer);
        sb2.append(", onSecondaryContainer=");
        sb2.append(this.onSecondaryContainer);
        sb2.append(", tertiary=");
        sb2.append(this.tertiary);
        sb2.append(", onTertiary=");
        sb2.append(this.onTertiary);
        sb2.append(", tertiaryContainer=");
        sb2.append(this.tertiaryContainer);
        sb2.append(", onTertiaryContainer=");
        sb2.append(this.onTertiaryContainer);
        sb2.append(", error=");
        sb2.append(this.error);
        sb2.append(", onError=");
        sb2.append(this.onError);
        sb2.append(", errorContainer=");
        sb2.append(this.errorContainer);
        sb2.append(", onErrorContainer=");
        sb2.append(this.onErrorContainer);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", onBackground=");
        sb2.append(this.onBackground);
        sb2.append(", surface=");
        sb2.append(this.surface);
        sb2.append(", onSurface=");
        sb2.append(this.onSurface);
        sb2.append(", surfaceVariant=");
        sb2.append(this.surfaceVariant);
        sb2.append(", onSurfaceVariant=");
        sb2.append(this.onSurfaceVariant);
        sb2.append(", outline=");
        sb2.append(this.outline);
        sb2.append(", outlineVariant=");
        sb2.append(this.outlineVariant);
        sb2.append(", shadow=");
        sb2.append(this.shadow);
        sb2.append(", scrim=");
        sb2.append(this.scrim);
        sb2.append(", inverseSurface=");
        sb2.append(this.inverseSurface);
        sb2.append(", inverseOnSurface=");
        sb2.append(this.inverseOnSurface);
        sb2.append(", inversePrimary=");
        return q0.m(sb2, this.inversePrimary, '}');
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i7) {
        this.background = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i7) {
        this.error = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i7) {
        this.errorContainer = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i7) {
        this.inverseOnSurface = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i7) {
        this.inversePrimary = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i7) {
        this.inverseSurface = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i7) {
        this.onBackground = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i7) {
        this.onError = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i7) {
        this.onErrorContainer = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i7) {
        this.onPrimary = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i7) {
        this.onPrimaryContainer = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i7) {
        this.onSecondary = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i7) {
        this.onSecondaryContainer = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i7) {
        this.onSurface = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i7) {
        this.onSurfaceVariant = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i7) {
        this.onTertiary = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i7) {
        this.onTertiaryContainer = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i7) {
        this.outline = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i7) {
        this.outlineVariant = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i7) {
        this.primary = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i7) {
        this.primaryContainer = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i7) {
        this.scrim = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i7) {
        this.secondary = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i7) {
        this.secondaryContainer = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i7) {
        this.shadow = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i7) {
        this.surface = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i7) {
        this.surfaceVariant = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i7) {
        this.tertiary = i7;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i7) {
        this.tertiaryContainer = i7;
        return this;
    }

    public Scheme(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37) {
        this.primary = i7;
        this.onPrimary = i10;
        this.primaryContainer = i11;
        this.onPrimaryContainer = i12;
        this.secondary = i13;
        this.onSecondary = i14;
        this.secondaryContainer = i15;
        this.onSecondaryContainer = i16;
        this.tertiary = i17;
        this.onTertiary = i18;
        this.tertiaryContainer = i19;
        this.onTertiaryContainer = i20;
        this.error = i21;
        this.onError = i22;
        this.errorContainer = i23;
        this.onErrorContainer = i24;
        this.background = i25;
        this.onBackground = i26;
        this.surface = i27;
        this.onSurface = i28;
        this.surfaceVariant = i29;
        this.onSurfaceVariant = i30;
        this.outline = i31;
        this.outlineVariant = i32;
        this.shadow = i33;
        this.scrim = i34;
        this.inverseSurface = i35;
        this.inverseOnSurface = i36;
        this.inversePrimary = i37;
    }
}

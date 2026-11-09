package com.google.android.material.color.utilities;

import com.google.api.Service;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22517a;

    public /* synthetic */ f(int i7) {
        this.f22517a = i7;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f22517a) {
            case 0:
                return MaterialDynamicColors.lambda$secondaryFixed$118(dynamicScheme);
            case 1:
                return dynamicScheme.primaryPalette;
            case 2:
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$114(dynamicScheme);
            case 3:
                return dynamicScheme.tertiaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135(dynamicScheme);
            case 5:
                return dynamicScheme.errorPalette;
            case 6:
                return MaterialDynamicColors.lambda$onError$95(dynamicScheme);
            case 7:
                return dynamicScheme.neutralPalette;
            case 8:
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157(dynamicScheme);
            case 9:
                return dynamicScheme.primaryPalette;
            case 10:
                return dynamicScheme.secondaryPalette;
            case 11:
                return MaterialDynamicColors.lambda$secondaryFixedDim$121(dynamicScheme);
            case 12:
                return dynamicScheme.neutralPalette;
            case 13:
                return dynamicScheme.neutralVariantPalette;
            case 14:
                return MaterialDynamicColors.lambda$surfaceVariant$34(dynamicScheme);
            case 15:
                return dynamicScheme.neutralVariantPalette;
            case 16:
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9(dynamicScheme);
            case 17:
                return dynamicScheme.neutralPalette;
            case 18:
                return MaterialDynamicColors.lambda$textHintInverse$161(dynamicScheme);
            case 19:
                return dynamicScheme.neutralPalette;
            case 20:
                return MaterialDynamicColors.lambda$shadow$47(dynamicScheme);
            case 21:
                return dynamicScheme.neutralPalette;
            case 22:
                return MaterialDynamicColors.lambda$onSurface$32(dynamicScheme);
            case 23:
                return MaterialDynamicColors.lambda$surfaceContainerHighest$30(dynamicScheme);
            case 24:
                return dynamicScheme.primaryPalette;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return MaterialDynamicColors.lambda$primaryFixed$104(dynamicScheme);
            case 26:
                return dynamicScheme.primaryPalette;
            case 27:
                return MaterialDynamicColors.lambda$primaryFixedDim$107(dynamicScheme);
            default:
                return dynamicScheme.tertiaryPalette;
        }
    }
}

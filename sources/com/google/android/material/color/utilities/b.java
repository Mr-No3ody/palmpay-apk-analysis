package com.google.android.material.color.utilities;

import com.google.api.Service;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22512a;

    public /* synthetic */ b(int i7) {
        this.f22512a = i7;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f22512a) {
            case 0:
                return dynamicScheme.neutralPalette;
            case 1:
                return dynamicScheme.secondaryPalette;
            case 2:
                return MaterialDynamicColors.lambda$onSecondary$71(dynamicScheme);
            case 3:
                return dynamicScheme.secondaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$secondary$68(dynamicScheme);
            case 5:
                return dynamicScheme.neutralPalette;
            case 6:
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22(dynamicScheme);
            case 7:
                return dynamicScheme.neutralVariantPalette;
            case 8:
                return MaterialDynamicColors.lambda$outline$43(dynamicScheme);
            case 9:
                return dynamicScheme.neutralPalette;
            case 10:
                return dynamicScheme.primaryPalette;
            case 11:
                return MaterialDynamicColors.lambda$surfaceTint$51(dynamicScheme);
            case 12:
                return dynamicScheme.secondaryPalette;
            case 13:
                return MaterialDynamicColors.lambda$onSecondaryFixed$124(dynamicScheme);
            case 14:
                return dynamicScheme.neutralPalette;
            case 15:
                return MaterialDynamicColors.lambda$inverseOnSurface$40(dynamicScheme);
            case 16:
                return dynamicScheme.tertiaryPalette;
            case 17:
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7(dynamicScheme);
            case 18:
                return dynamicScheme.secondaryPalette;
            case 19:
                return dynamicScheme.primaryPalette;
            case 20:
                return MaterialDynamicColors.lambda$onPrimaryFixed$110(dynamicScheme);
            case 21:
                return dynamicScheme.errorPalette;
            case 22:
                return dynamicScheme.neutralPalette;
            case 23:
                return MaterialDynamicColors.lambda$error$92(dynamicScheme);
            case 24:
                return dynamicScheme.neutralPalette;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return MaterialDynamicColors.lambda$textPrimaryInverse$153(dynamicScheme);
            case 26:
                return dynamicScheme.neutralPalette;
            case 27:
                return MaterialDynamicColors.lambda$surfaceContainer$26(dynamicScheme);
            case 28:
                return dynamicScheme.neutralVariantPalette;
            default:
                return MaterialDynamicColors.lambda$onSurfaceVariant$36(dynamicScheme);
        }
    }
}

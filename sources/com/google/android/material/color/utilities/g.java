package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f22519b;

    public /* synthetic */ g(MaterialDynamicColors materialDynamicColors, int i7) {
        this.f22518a = i7;
        this.f22519b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f22518a) {
            case 0:
                return this.f22519b.lambda$secondaryFixed$119((DynamicScheme) obj);
            case 1:
                return this.f22519b.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
            case 2:
                return this.f22519b.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
            case 3:
                return this.f22519b.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
            case 4:
                return this.f22519b.lambda$onTertiary$84((DynamicScheme) obj);
            case 5:
                return this.f22519b.lambda$onError$96((DynamicScheme) obj);
            case 6:
                return this.f22519b.lambda$onPrimaryContainer$62((DynamicScheme) obj);
            case 7:
                return this.f22519b.lambda$onPrimaryContainer$63((DynamicScheme) obj);
            case 8:
                return this.f22519b.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            case 9:
                return this.f22519b.lambda$primaryFixed$105((DynamicScheme) obj);
            case 10:
                return this.f22519b.lambda$primaryFixedDim$108((DynamicScheme) obj);
            case 11:
                return this.f22519b.lambda$tertiaryContainer$86((DynamicScheme) obj);
            case 12:
                return this.f22519b.lambda$tertiaryContainer$87((DynamicScheme) obj);
            default:
                return this.f22519b.highestSurface((DynamicScheme) obj);
        }
    }
}

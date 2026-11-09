package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22511b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f22510a = i7;
        this.f22511b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f22510a) {
            case 0:
                return DynamicColor.lambda$fromArgb$0((TonalPalette) this.f22511b, (DynamicScheme) obj);
            case 1:
                return DynamicColor.lambda$fromArgb$1((Hct) this.f22511b, (DynamicScheme) obj);
            default:
                return ((TemperatureCache) this.f22511b).lambda$getHctsByTemp$0((Hct) obj);
        }
    }
}

package com.adjust.sdk.sig;

import C0.G;
import com.google.maps.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19479c;

    public l1(boolean z3, boolean z8, int i7) {
        this.f19477a = z3;
        this.f19478b = z8;
        this.f19479c = i7;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb2.append(this.f19477a);
        sb2.append(", ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=");
        sb2.append(this.f19478b);
        sb2.append(", prettyPrintIndent='    ', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='type', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        int i7 = this.f19479c;
        if (i7 == 1) {
            str = "NONE";
        } else if (i7 != 2) {
            str = i7 != 3 ? BuildConfig.TRAVIS : "POLYMORPHIC";
        } else {
            str = "ALL_JSON_OBJECTS";
        }
        return G.r(sb2, str, ", exceptionsWithDebugInfo=true)");
    }
}

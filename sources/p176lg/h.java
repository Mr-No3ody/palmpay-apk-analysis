package p176lg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f39383e;

    public h() {
        a classDiscriminatorMode = a.f39367a;
        Intrinsics.checkNotNullParameter("    ", "prettyPrintIndent");
        Intrinsics.checkNotNullParameter("type", "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f39379a = true;
        this.f39380b = "    ";
        this.f39381c = "type";
        this.f39382d = true;
        this.f39383e = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f39379a + ", prettyPrintIndent='" + this.f39380b + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f39381c + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f39382d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f39383e + ')';
    }
}

package com.flexibank.sdk;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.palmpay.lib.bridgewrapper.photo.upload.a f21931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.transsnet.palmpay.core.init.a f21932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexiBankReauthorizationListener f21933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f21934f;

    public a(String countryCode, b environment, com.palmpay.lib.bridgewrapper.photo.upload.a aVar, com.transsnet.palmpay.core.init.a aVar2, FlexiBankReauthorizationListener flexiBankReauthorizationListener, c cVar) {
        Intrinsics.checkNotNullParameter("P260617092568177297851", RemoteConfigConstants.RequestFieldKey.APP_ID);
        Intrinsics.checkNotNullParameter("FLEXIBANK", "tntCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter("0", "appSource");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.f21929a = countryCode;
        this.f21930b = environment;
        this.f21931c = aVar;
        this.f21932d = aVar2;
        this.f21933e = flexiBankReauthorizationListener;
        this.f21934f = cVar;
        if (StringsKt.F("P260617092568177297851")) {
            throw new IllegalArgumentException("appId must not be blank");
        }
        if (StringsKt.F("FLEXIBANK")) {
            throw new IllegalArgumentException("tntCode must not be blank");
        }
        if (StringsKt.F(countryCode)) {
            throw new IllegalArgumentException("countryCode must not be blank");
        }
        if (StringsKt.F("0")) {
            throw new IllegalArgumentException("appSource must not be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f21929a.equals(aVar.f21929a) && this.f21930b == aVar.f21930b && this.f21931c.equals(aVar.f21931c) && equals(aVar.f21932d) && this.f21933e.equals(aVar.f21933e) && Intrinsics.c(this.f21934f, aVar.f21934f);
    }

    public final int hashCode() {
        int iHashCode = (this.f21933e.hashCode() + ((hashCode() + ((this.f21931c.hashCode() + ((this.f21930b.hashCode() + ((((this.f21929a.hashCode() - 539605285) * 31) + 48) * 31)) * 961)) * 31)) * 31)) * 31;
        c cVar = this.f21934f;
        return Boolean.hashCode(false) + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public final String toString() {
        return "FlexiBankConfig(appId=P260617092568177297851, tntCode=FLEXIBANK, countryCode=" + this.f21929a + ", appSource=0, environment=" + this.f21930b + ", customBaseUrl=null, tongDunBlackBoxCallback=" + this.f21931c + ", faceVerificationCallback=" + this.f21932d + ", reauthorizationListener=" + this.f21933e + ", deviceInfo=" + this.f21934f + ", isUseDarkMode=false)";
    }
}

package com.flexibank.sdk;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22331d;

    public l(String token, String str, String str2, String countryCode) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f22328a = token;
        this.f22329b = str;
        this.f22330c = str2;
        this.f22331d = countryCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.c(this.f22328a, lVar.f22328a) && Intrinsics.c(this.f22329b, lVar.f22329b) && Intrinsics.c(this.f22330c, lVar.f22330c) && Intrinsics.c(this.f22331d, lVar.f22331d);
    }

    public final int hashCode() {
        int iHashCode = this.f22328a.hashCode() * 31;
        String str = this.f22329b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22330c;
        return this.f22331d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexiBankSession(token=");
        sb2.append(this.f22328a);
        sb2.append(", memberId=");
        sb2.append(this.f22329b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f22330c);
        sb2.append(", countryCode=");
        return G.r(sb2, this.f22331d, ")");
    }
}

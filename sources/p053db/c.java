package p053db;

import C0.G;
import androidx.camera.video.u;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f35847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f35848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f35849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f35850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f35851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f35852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f35853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f35854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f35855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f35856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f35857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f35858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f35859s;

    public c(String deviceId, String deviceUuid, String imei, String deviceBrand, String deviceModel, String appVersion, String versionCode, String appPackageName, String osVersion, String latitude, String longitude, int i7, String str, String str2, String str3, Integer num, String str4, String str5, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceUuid, "deviceUuid");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(deviceBrand, "deviceBrand");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        this.f35841a = deviceId;
        this.f35842b = deviceUuid;
        this.f35843c = imei;
        this.f35844d = deviceBrand;
        this.f35845e = deviceModel;
        this.f35846f = appVersion;
        this.f35847g = versionCode;
        this.f35848h = appPackageName;
        this.f35849i = osVersion;
        this.f35850j = latitude;
        this.f35851k = longitude;
        this.f35852l = i7;
        this.f35853m = str;
        this.f35854n = str2;
        this.f35855o = str3;
        this.f35856p = num;
        this.f35857q = str4;
        this.f35858r = str5;
        this.f35859s = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return this.f35841a.equals(cVar.f35841a) && Intrinsics.c(this.f35842b, cVar.f35842b) && this.f35843c.equals(cVar.f35843c) && this.f35844d.equals(cVar.f35844d) && this.f35845e.equals(cVar.f35845e) && this.f35846f.equals(cVar.f35846f) && this.f35847g.equals(cVar.f35847g) && this.f35848h.equals(cVar.f35848h) && Intrinsics.c(this.f35849i, cVar.f35849i) && Intrinsics.c(this.f35850j, cVar.f35850j) && Intrinsics.c(this.f35851k, cVar.f35851k) && this.f35852l == cVar.f35852l && Intrinsics.c(this.f35853m, cVar.f35853m) && Intrinsics.c(this.f35854n, cVar.f35854n) && Intrinsics.c(this.f35855o, cVar.f35855o) && this.f35856p.equals(cVar.f35856p) && Intrinsics.c(this.f35857q, cVar.f35857q) && Intrinsics.c(this.f35858r, cVar.f35858r) && Intrinsics.c(this.f35859s, cVar.f35859s);
    }

    public final int hashCode() {
        int iB = u.b(this.f35852l, G.c(G.c(G.c(G.c(G.c(G.c(G.c(G.c(G.c(G.c(G.c(Integer.hashCode(1) * 31, 31, this.f35841a), 31, this.f35842b), 31, this.f35843c), 31, this.f35844d), 31, this.f35845e), 31, this.f35846f), 31, this.f35847g), 31, this.f35848h), 31, this.f35849i), 31, this.f35850j), 31, this.f35851k), 31);
        String str = this.f35853m;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f35854n;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35855o;
        int iHashCode3 = (this.f35856p.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f35857q;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f35858r;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ArrayList arrayList = this.f35859s;
        return iHashCode5 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "StandardDeviceInfo(deviceType=1, deviceId=" + this.f35841a + ", deviceUuid=" + this.f35842b + ", imei=" + this.f35843c + ", deviceBrand=" + this.f35844d + ", deviceModel=" + this.f35845e + ", appVersion=" + this.f35846f + ", versionCode=" + this.f35847g + ", appPackageName=" + this.f35848h + ", osVersion=" + this.f35849i + ", latitude=" + this.f35850j + ", longitude=" + this.f35851k + ", networkType=" + this.f35852l + ", appSignatures=" + this.f35853m + ", ethIp=" + this.f35854n + ", ip=" + this.f35855o + ", isRooted=" + this.f35856p + ", wifiName=" + this.f35857q + ", wifiMac=" + this.f35858r + ", appList=" + this.f35859s + ")";
    }
}

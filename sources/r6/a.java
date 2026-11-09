package r6;

import android.util.Size;
import androidx.camera.video.u;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.transsnet.palmpay.core.init.LivenessTask$Companion$initLiveness$1$1$1$config$1;
import com.transsnet.palmpay.core.init.LivenessTask$Companion$initLiveness$1$1$1$config$2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.U;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f41570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f41572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LiveID$ILiveIDMonitor f41573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LivenessTask$Companion$initLiveness$1$1$1$config$1 f41574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f41575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f41576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f41577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f41578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Float f41579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Float f41580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Size f41581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f41582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f41583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f41584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f41585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f41586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ExtendFeature f41587s;

    public a(U u6, boolean z3, LivenessTask$Companion$initLiveness$1$1$1$config$2 livenessTask$Companion$initLiveness$1$1$1$config$2, LivenessTask$Companion$initLiveness$1$1$1$config$1 livenessTask$Companion$initLiveness$1$1$1$config$1, Integer num) {
        Boolean bool = Boolean.TRUE;
        Float fValueOf = Float.valueOf(0.8f);
        Float fValueOf2 = Float.valueOf(0.5f);
        Size size = new Size(640, 640);
        Intrinsics.checkNotNullParameter("https://ng-m.palmpay.app", "baseUrl");
        this.f41569a = "https://ng-m.palmpay.app";
        this.f41570b = u6;
        this.f41571c = z3;
        this.f41572d = bool;
        this.f41573e = livenessTask$Companion$initLiveness$1$1$1$config$2;
        this.f41574f = livenessTask$Companion$initLiveness$1$1$1$config$1;
        this.f41575g = 0;
        this.f41576h = num;
        this.f41577i = 1;
        this.f41578j = null;
        this.f41579k = fValueOf;
        this.f41580l = fValueOf2;
        this.f41581m = size;
        this.f41582n = 1;
        this.f41583o = 3000L;
        this.f41584p = 1;
        this.f41585q = 9;
        this.f41586r = null;
        this.f41587s = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f41569a, aVar.f41569a) && Intrinsics.c(this.f41570b, aVar.f41570b) && this.f41571c == aVar.f41571c && Intrinsics.c(this.f41572d, aVar.f41572d) && Intrinsics.c(this.f41573e, aVar.f41573e) && Intrinsics.c(this.f41574f, aVar.f41574f) && Intrinsics.c(this.f41575g, aVar.f41575g) && Intrinsics.c(this.f41576h, aVar.f41576h) && Intrinsics.c(this.f41577i, aVar.f41577i) && Intrinsics.c(this.f41578j, aVar.f41578j) && Intrinsics.c(this.f41579k, aVar.f41579k) && Intrinsics.c(this.f41580l, aVar.f41580l) && Intrinsics.c(this.f41581m, aVar.f41581m) && Intrinsics.c(this.f41582n, aVar.f41582n) && Intrinsics.c(this.f41583o, aVar.f41583o) && Intrinsics.c(this.f41584p, aVar.f41584p) && Intrinsics.c(this.f41585q, aVar.f41585q) && Intrinsics.c(this.f41586r, aVar.f41586r) && Intrinsics.c(this.f41587s, aVar.f41587s);
    }

    public final int hashCode() {
        int iHashCode = this.f41569a.hashCode() * 29791;
        U u6 = this.f41570b;
        int iD = u.d((iHashCode + (u6 == null ? 0 : u6.hashCode())) * 31, 29791, this.f41571c);
        Boolean bool = this.f41572d;
        int iHashCode2 = (iD + (bool == null ? 0 : bool.hashCode())) * 961;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor = this.f41573e;
        int iHashCode3 = (iHashCode2 + (liveID$ILiveIDMonitor == null ? 0 : liveID$ILiveIDMonitor.hashCode())) * 961;
        LivenessTask$Companion$initLiveness$1$1$1$config$1 livenessTask$Companion$initLiveness$1$1$1$config$1 = this.f41574f;
        int iHashCode4 = (iHashCode3 + (livenessTask$Companion$initLiveness$1$1$1$config$1 == null ? 0 : livenessTask$Companion$initLiveness$1$1$1$config$1.hashCode())) * 31;
        Integer num = this.f41575g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f41576h;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f41577i;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f10 = this.f41578j;
        int iHashCode8 = (iHashCode7 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f41579k;
        int iHashCode9 = (iHashCode8 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f41580l;
        int iHashCode10 = (iHashCode9 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Size size = this.f41581m;
        int iHashCode11 = (iHashCode10 + (size == null ? 0 : size.hashCode())) * 31;
        Integer num4 = this.f41582n;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l5 = this.f41583o;
        int iHashCode13 = (iHashCode12 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num5 = this.f41584p;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f41585q;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List list = this.f41586r;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        ExtendFeature extendFeature = this.f41587s;
        return iHashCode16 + (extendFeature != null ? extendFeature.hashCode() : 0);
    }

    public final String toString() {
        return "Config(baseUrl=" + this.f41569a + ", authPath=null, checkPath=null, okHttpClient=" + this.f41570b + ", dns=" + this.f41571c + ", locale=null, countryCode=null, showLicenseLogo=" + this.f41572d + ", uploadOkHttpClient=null, monitor=" + this.f41573e + ", storeResult=null, fingerHandler=" + this.f41574f + ", reveal=" + this.f41575g + ", uploadVideo=" + this.f41576h + ", seq=" + this.f41577i + ", facialRecognitionAccuracy=" + this.f41578j + ", smileScore=" + this.f41579k + ", blinkScore=" + this.f41580l + ", photoResolution=" + this.f41581m + ", livenessPhotosNumber=" + this.f41582n + ", livenessTimeOut=" + this.f41583o + ", serviceLevel=" + this.f41584p + ", videoFrames=" + this.f41585q + ", actionList=" + this.f41586r + ", extendFeature=" + this.f41587s + ")";
    }
}

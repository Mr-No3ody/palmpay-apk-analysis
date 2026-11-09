package p045d3;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.c;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CacheKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f35487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f35488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f35489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CacheKey f35490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f35492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f35493h;

    public a(String sourceString, g gVar, i rotationOptions, c imageDecodeOptions, CacheKey cacheKey, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.f35486a = sourceString;
        this.f35487b = gVar;
        this.f35488c = rotationOptions;
        this.f35489d = imageDecodeOptions;
        this.f35490e = cacheKey;
        this.f35491f = str;
        this.f35493h = ((((imageDecodeOptions.hashCode() + ((rotationOptions.hashCode() + (((sourceString.hashCode() * 31) + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31) + (cacheKey != null ? cacheKey.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean containsUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.A(this.f35486a, string, false);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        a aVar = (a) obj;
        return Intrinsics.c(this.f35486a, aVar.f35486a) && Intrinsics.c(this.f35487b, aVar.f35487b) && Intrinsics.c(this.f35488c, aVar.f35488c) && Intrinsics.c(this.f35489d, aVar.f35489d) && Intrinsics.c(this.f35490e, aVar.f35490e) && Intrinsics.c(this.f35491f, aVar.f35491f);
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String getUriString() {
        return this.f35486a;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final int hashCode() {
        return this.f35493h;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final boolean isResourceIdForDebugging() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f35486a + ", resizeOptions=" + this.f35487b + ", rotationOptions=" + this.f35488c + ", imageDecodeOptions=" + this.f35489d + ", postprocessorCacheKey=" + this.f35490e + ", postprocessorName=" + this.f35491f + ")";
    }
}

package p214o3;

import Y.j;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.imagepipeline.common.c;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.QualityInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p109h3.d;
import p109h3.e;
import p333w2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f40020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f40021b;

    static {
        new a(null);
    }

    public b(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f40020a = resources;
        this.f40021b = new ConcurrentHashMap();
    }

    public final int a(String str) {
        Integer intOrNull;
        ConcurrentHashMap concurrentHashMap = this.f40021b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            if (!"res".equals(a.b(uri)) && !"android.resource".equals(a.b(uri))) {
                throw new IllegalStateException(("Unsupported uri " + uri).toString());
            }
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            String str2 = (String) CollectionsKt.L(pathSegments);
            if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
                throw new IllegalStateException(("Unable to read resource ID from " + uri.getPath()).toString());
            }
            concurrentHashMap.put(str, intOrNull);
            obj = intOrNull;
        }
        return ((Number) obj).intValue();
    }

    @Override // com.facebook.imagepipeline.decoder.ImageDecoder
    public final CloseableImage decode(e encodedImage, int i7, QualityInfo qualityInfo, c options) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(qualityInfo, "qualityInfo");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            String str = encodedImage.f37284p;
            if (str == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            int iA = a(str);
            Resources resources = this.f40020a;
            ThreadLocal threadLocal = j.f11254a;
            Drawable drawable = resources.getDrawable(iA, null);
            if (drawable != null) {
                d dVar = new d();
                dVar.f37272d = drawable;
                return dVar;
            }
            return null;
        } catch (Throwable th) {
            p229p2.a.i("XmlFormatDecoder", "Cannot decode xml", th);
        }
    }
}

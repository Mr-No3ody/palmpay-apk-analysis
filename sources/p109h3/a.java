package p109h3;

import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements CloseableImage {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f37261c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f37262a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f37263b;

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str) {
        return getExtra(str, null);
    }

    @Override // com.facebook.imagepipeline.image.HasImageMetadata, com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.f37262a;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public final ImageInfo getImageInfo() {
        if (this.f37263b == null) {
            this.f37263b = new f(getWidth(), getHeight(), getSizeInBytes(), getQualityInfo(), this.f37262a);
        }
        return this.f37263b;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public QualityInfo getQualityInfo() {
        return g.f37290d;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public final boolean isStateful() {
        return false;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtra(String str, Object obj) {
        if (f37261c.contains(str)) {
            this.f37262a.put(str, obj);
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtras(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f37261c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f37262a.put(str, obj);
            }
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.f37262a.get(str);
        return obj2 == null ? obj : obj2;
    }
}

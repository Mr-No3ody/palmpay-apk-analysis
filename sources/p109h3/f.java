package p109h3;

import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ImageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final QualityInfo f37288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f37289e;

    public f(int i7, int i10, int i11, QualityInfo qualityInfo, HashMap map) {
        this.f37285a = i7;
        this.f37286b = i10;
        this.f37287c = i11;
        this.f37288d = qualityInfo;
        this.f37289e = map;
    }

    @Override // com.facebook.imagepipeline.image.HasImageMetadata, com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.f37289e;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public final int getHeight() {
        return this.f37286b;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public final QualityInfo getQualityInfo() {
        return this.f37288d;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public final int getSizeInBytes() {
        return this.f37287c;
    }

    @Override // com.facebook.imagepipeline.image.ImageInfo
    public final int getWidth() {
        return this.f37285a;
    }
}

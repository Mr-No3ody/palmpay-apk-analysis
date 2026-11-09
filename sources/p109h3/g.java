package p109h3;

import com.facebook.imagepipeline.image.QualityInfo;

/* JADX INFO: loaded from: classes.dex */
public final class g implements QualityInfo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f37290d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37293c;

    static {
        g gVar = new g();
        gVar.f37291a = Integer.MAX_VALUE;
        gVar.f37292b = true;
        gVar.f37293c = true;
        f37290d = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f37291a == gVar.f37291a && this.f37292b == gVar.f37292b && this.f37293c == gVar.f37293c;
    }

    @Override // com.facebook.imagepipeline.image.QualityInfo
    public final int getQuality() {
        return this.f37291a;
    }

    public final int hashCode() {
        return ((this.f37292b ? 4194304 : 0) ^ this.f37291a) ^ (this.f37293c ? 8388608 : 0);
    }

    @Override // com.facebook.imagepipeline.image.QualityInfo
    public final boolean isOfFullQuality() {
        return this.f37293c;
    }

    @Override // com.facebook.imagepipeline.image.QualityInfo
    public final boolean isOfGoodEnoughQuality() {
        return this.f37292b;
    }
}

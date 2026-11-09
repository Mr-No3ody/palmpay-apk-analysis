package androidx.camera.video.internal;

import androidx.camera.core.impl.C0973d;
import androidx.camera.core.impl.C0977f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0973d f14615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0977f f14616f;

    public a(int i7, int i10, List list, List list2, C0973d c0973d, C0977f c0977f) {
        this.f14611a = i7;
        this.f14612b = i10;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f14613c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f14614d = list2;
        this.f14615e = c0973d;
        if (c0977f == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f14616f = c0977f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f14611a == ((a) dVar).f14611a) {
                a aVar = (a) dVar;
                if (this.f14612b == aVar.f14612b && this.f14613c.equals(aVar.f14613c) && this.f14614d.equals(aVar.f14614d)) {
                    C0973d c0973d = aVar.f14615e;
                    C0973d c0973d2 = this.f14615e;
                    if (c0973d2 != null ? c0973d2.equals(c0973d) : c0973d == null) {
                        if (this.f14616f.equals(aVar.f14616f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getAudioProfiles() {
        return this.f14613c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.f14611a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.f14612b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getVideoProfiles() {
        return this.f14614d;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f14611a ^ 1000003) * 1000003) ^ this.f14612b) * 1000003) ^ this.f14613c.hashCode()) * 1000003) ^ this.f14614d.hashCode()) * 1000003;
        C0973d c0973d = this.f14615e;
        return ((iHashCode ^ (c0973d == null ? 0 : c0973d.hashCode())) * 1000003) ^ this.f14616f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f14611a + ", recommendedFileFormat=" + this.f14612b + ", audioProfiles=" + this.f14613c + ", videoProfiles=" + this.f14614d + ", defaultAudioProfile=" + this.f14615e + ", defaultVideoProfile=" + this.f14616f + "}";
    }
}

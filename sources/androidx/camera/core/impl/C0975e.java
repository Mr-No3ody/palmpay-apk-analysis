package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.core.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975e implements EncoderProfilesProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14046d;

    public C0975e(int i7, int i10, List list, List list2) {
        this.f14043a = i7;
        this.f14044b = i10;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f14045c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f14046d = list2;
    }

    public static C0975e a(int i7, int i10, List list, List list2) {
        return new C0975e(i7, i10, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0975e) {
            C0975e c0975e = (C0975e) obj;
            if (this.f14043a == c0975e.f14043a && this.f14044b == c0975e.f14044b && this.f14045c.equals(c0975e.f14045c) && this.f14046d.equals(c0975e.f14046d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getAudioProfiles() {
        return this.f14045c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.f14043a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.f14044b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List getVideoProfiles() {
        return this.f14046d;
    }

    public final int hashCode() {
        return ((((((this.f14043a ^ 1000003) * 1000003) ^ this.f14044b) * 1000003) ^ this.f14045c.hashCode()) * 1000003) ^ this.f14046d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb2.append(this.f14043a);
        sb2.append(", recommendedFileFormat=");
        sb2.append(this.f14044b);
        sb2.append(", audioProfiles=");
        sb2.append(this.f14045c);
        sb2.append(", videoProfiles=");
        return N8.q0.o(sb2, this.f14046d, "}");
    }
}

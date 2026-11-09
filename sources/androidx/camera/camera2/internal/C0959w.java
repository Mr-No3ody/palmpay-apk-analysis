package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0959w implements CamcorderProfileHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13665a;

    @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
    public final CamcorderProfile get(int i7, int i10) {
        switch (this.f13665a) {
            case 0:
                break;
        }
        return CamcorderProfile.get(i7, i10);
    }

    @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
    public final boolean hasProfile(int i7, int i10) {
        switch (this.f13665a) {
            case 0:
                break;
        }
        return CamcorderProfile.hasProfile(i7, i10);
    }
}

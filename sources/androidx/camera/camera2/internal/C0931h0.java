package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.impl.C0973d;
import androidx.camera.core.impl.C0975e;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0931h0 implements EncoderProfilesProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f13544d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.y0 f13545e;

    public C0931h0(String str, androidx.camera.core.impl.y0 y0Var) {
        boolean z3;
        int i7;
        this.f13542b = str;
        try {
            i7 = Integer.parseInt(str);
            z3 = true;
        } catch (NumberFormatException unused) {
            p140j8.f.G("Camera2EncoderProfilesProvider");
            z3 = false;
            i7 = -1;
        }
        this.f13541a = z3;
        this.f13543c = i7;
        this.f13545e = y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy getAll(int i7) {
        CamcorderProfile camcorderProfile;
        C0975e c0975eA;
        boolean zContains;
        EncoderProfilesProxy all;
        EncoderProfilesProxy encoderProfilesProxy = null;
        if (!this.f13541a || !CamcorderProfile.hasProfile(this.f13543c, i7)) {
            return null;
        }
        if (this.f13544d.containsKey(Integer.valueOf(i7))) {
            return (EncoderProfilesProxy) this.f13544d.get(Integer.valueOf(i7));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            try {
                camcorderProfile = CamcorderProfile.get(this.f13543c, i7);
            } catch (RuntimeException unused) {
                p140j8.f.G("Camera2EncoderProfilesProvider");
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    p140j8.f.G("EncoderProfilesProxyCompat");
                }
                int i11 = camcorderProfile.duration;
                int i12 = camcorderProfile.fileFormat;
                ArrayList arrayList = new ArrayList();
                int i13 = camcorderProfile.audioCodec;
                arrayList.add(new C0973d(i13, EncoderProfilesProxy.getAudioCodecMimeType(i13), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
                ArrayList arrayList2 = new ArrayList();
                int i14 = camcorderProfile.videoCodec;
                arrayList2.add(new C0977f(i14, EncoderProfilesProxy.getVideoCodecMimeType(i14), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                c0975eA = C0975e.a(i11, i12, arrayList, arrayList2);
            } else {
                c0975eA = null;
            }
        } else {
            EncoderProfiles encoderProfilesB = F.a.b(i7, this.f13542b);
            if (encoderProfilesB != null) {
                if (androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(InvalidVideoProfilesQuirk.class) != null) {
                    p140j8.f.G("Camera2EncoderProfilesProvider");
                } else {
                    try {
                        if (i10 >= 33) {
                            c0975eA = F.b.a(encoderProfilesB);
                        } else {
                            if (i10 < 31) {
                                throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i10 + ". Version 31 or higher required.");
                            }
                            c0975eA = F.a.a(encoderProfilesB);
                        }
                    } catch (NullPointerException unused2) {
                        p140j8.f.G("Camera2EncoderProfilesProvider");
                        camcorderProfile = CamcorderProfile.get(this.f13543c, i7);
                        if (camcorderProfile != null) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                p140j8.f.G("EncoderProfilesProxyCompat");
                            }
                            int i15 = camcorderProfile.duration;
                            int i16 = camcorderProfile.fileFormat;
                            ArrayList arrayList3 = new ArrayList();
                            int i17 = camcorderProfile.audioCodec;
                            arrayList3.add(new C0973d(i17, EncoderProfilesProxy.getAudioCodecMimeType(i17), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
                            ArrayList arrayList4 = new ArrayList();
                            int i18 = camcorderProfile.videoCodec;
                            arrayList4.add(new C0977f(i18, EncoderProfilesProxy.getVideoCodecMimeType(i18), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                            c0975eA = C0975e.a(i15, i16, arrayList3, arrayList4);
                        } else {
                            c0975eA = null;
                        }
                    }
                }
                camcorderProfile = CamcorderProfile.get(this.f13543c, i7);
                if (camcorderProfile != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        p140j8.f.G("EncoderProfilesProxyCompat");
                    }
                    int i19 = camcorderProfile.duration;
                    int i110 = camcorderProfile.fileFormat;
                    ArrayList arrayList5 = new ArrayList();
                    int i111 = camcorderProfile.audioCodec;
                    arrayList5.add(new C0973d(i111, EncoderProfilesProxy.getAudioCodecMimeType(i111), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
                    ArrayList arrayList6 = new ArrayList();
                    int i112 = camcorderProfile.videoCodec;
                    arrayList6.add(new C0977f(i112, EncoderProfilesProxy.getVideoCodecMimeType(i112), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    c0975eA = C0975e.a(i19, i110, arrayList5, arrayList6);
                } else {
                    c0975eA = null;
                }
            } else {
                c0975eA = null;
            }
        }
        if (c0975eA == null) {
            encoderProfilesProxy = c0975eA;
        } else {
            CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f13545e.b(CamcorderProfileResolutionQuirk.class);
            if (camcorderProfileResolutionQuirk == null) {
                zContains = true;
            } else {
                List list = c0975eA.f14046d;
                if (list.isEmpty()) {
                    zContains = true;
                } else {
                    C0977f c0977f = (C0977f) list.get(0);
                    if (camcorderProfileResolutionQuirk.f13447b == null) {
                        Size[] sizeArrF = camcorderProfileResolutionQuirk.f13446a.f(34);
                        List listAsList = sizeArrF != null ? Arrays.asList((Size[]) sizeArrF.clone()) : Collections.EMPTY_LIST;
                        camcorderProfileResolutionQuirk.f13447b = listAsList;
                        Objects.toString(listAsList);
                        p140j8.f.G("CamcorderProfileResolutionQuirk");
                    }
                    zContains = new ArrayList(camcorderProfileResolutionQuirk.f13447b).contains(new Size(c0977f.f14052e, c0977f.f14053f));
                }
            }
            if (zContains) {
                encoderProfilesProxy = c0975eA;
            } else if (i7 == 1) {
                Iterator it = EncoderProfilesProvider.f13858q.iterator();
                while (it.hasNext()) {
                    all = getAll(((Integer) it.next()).intValue());
                    if (all != null) {
                        encoderProfilesProxy = all;
                        break;
                    }
                }
            } else if (i7 == 0) {
                for (int size = EncoderProfilesProvider.f13858q.size() - 1; size >= 0; size--) {
                    all = getAll(size);
                    if (all != null) {
                        encoderProfilesProxy = all;
                        break;
                    }
                }
            }
        }
        this.f13544d.put(Integer.valueOf(i7), encoderProfilesProxy);
        return encoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int i7) {
        return this.f13541a && getAll(i7) != null;
    }
}

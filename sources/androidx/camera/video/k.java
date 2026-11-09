package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.impl.C0973d;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14789a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f14790b = new TreeMap(new androidx.camera.core.impl.utils.d(false));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.video.internal.d f14791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.video.internal.d f14792d;

    public k(androidx.camera.video.internal.c cVar) {
        C1018g c1018g = l.f14793a;
        Iterator it = new ArrayList(l.f14801i).iterator();
        while (true) {
            androidx.camera.video.internal.a aVar = null;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            p118hf.a.k(lVar instanceof C1018g, "Currently only support ConstantQuality");
            EncoderProfilesProxy encoderProfilesProxyK = cVar.k(((C1018g) lVar).f14595j);
            if (encoderProfilesProxyK != null) {
                encoderProfilesProxyK.toString();
                p140j8.f.G("CapabilitiesByQuality");
                if (!encoderProfilesProxyK.getVideoProfiles().isEmpty()) {
                    int defaultDurationSeconds = encoderProfilesProxyK.getDefaultDurationSeconds();
                    int recommendedFileFormat = encoderProfilesProxyK.getRecommendedFileFormat();
                    List<C0973d> audioProfiles = encoderProfilesProxyK.getAudioProfiles();
                    List<C0977f> videoProfiles = encoderProfilesProxyK.getVideoProfiles();
                    p118hf.a.g(!videoProfiles.isEmpty(), "Should contain at least one VideoProfile.");
                    aVar = new androidx.camera.video.internal.a(defaultDurationSeconds, recommendedFileFormat, Collections.unmodifiableList(new ArrayList(audioProfiles)), Collections.unmodifiableList(new ArrayList(videoProfiles)), audioProfiles.isEmpty() ? null : audioProfiles.get(0), videoProfiles.get(0));
                }
                if (aVar == null) {
                    Objects.toString(lVar);
                    p140j8.f.G("CapabilitiesByQuality");
                } else {
                    C0977f c0977f = aVar.f14616f;
                    this.f14790b.put(new Size(c0977f.f14052e, c0977f.f14053f), lVar);
                    this.f14789a.put(lVar, aVar);
                }
            }
        }
        if (this.f14789a.isEmpty()) {
            p140j8.f.g("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f14792d = null;
            this.f14791c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f14789a.values());
            this.f14791c = (androidx.camera.video.internal.d) arrayDeque.peekFirst();
            this.f14792d = (androidx.camera.video.internal.d) arrayDeque.peekLast();
        }
    }

    public final androidx.camera.video.internal.d a(l lVar) {
        p118hf.a.g(l.f14800h.contains(lVar), "Unknown quality: " + lVar);
        if (lVar == l.f14798f) {
            return this.f14791c;
        }
        return lVar == l.f14797e ? this.f14792d : (androidx.camera.video.internal.d) this.f14789a.get(lVar);
    }
}

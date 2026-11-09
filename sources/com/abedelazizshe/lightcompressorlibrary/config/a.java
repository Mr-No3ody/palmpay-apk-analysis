package com.abedelazizshe.lightcompressorlibrary.config;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p091g1.f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f19291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoResizer f19292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19293c;

    public a(VideoResizer videoResizer, ArrayList videoNames) {
        f quality = f.f36835a;
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(videoNames, "videoNames");
        this.f19291a = quality;
        this.f19292b = videoResizer;
        this.f19293c = videoNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19291a == aVar.f19291a && Intrinsics.c(this.f19292b, aVar.f19292b) && Intrinsics.c(this.f19293c, aVar.f19293c);
    }

    public final int hashCode() {
        int iHashCode = this.f19291a.hashCode() * 923521;
        VideoResizer videoResizer = this.f19292b;
        return this.f19293c.hashCode() + ((iHashCode + (videoResizer == null ? 0 : videoResizer.hashCode())) * 31);
    }

    public final String toString() {
        return "Configuration(quality=" + this.f19291a + ", isMinBitrateCheckEnabled=false, videoBitrateInMbps=null, disableAudio=false, resizer=" + this.f19292b + ", videoNames=" + this.f19293c + ')';
    }
}

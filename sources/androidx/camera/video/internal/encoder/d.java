package androidx.camera.video.internal.encoder;

import C0.G;
import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.P0;
import com.google.android.gms.common.Scopes;

/* JADX INFO: loaded from: classes.dex */
public final class d implements EncoderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P0 f14659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f14660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f14662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14665i;

    public d(String str, int i7, P0 p3, Size size, int i10, e eVar, int i11, int i12, int i13) {
        this.f14657a = str;
        this.f14658b = i7;
        this.f14659c = p3;
        this.f14660d = size;
        this.f14661e = i10;
        this.f14662f = eVar;
        this.f14663g = i11;
        this.f14664h = i12;
        this.f14665i = i13;
    }

    public static c a() {
        c cVar = new c();
        cVar.f14649b = -1;
        cVar.f14655h = 1;
        cVar.f14652e = 2130708361;
        cVar.f14653f = e.f14666d;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f14657a.equals(dVar.f14657a) && this.f14658b == dVar.f14658b && this.f14659c.equals(dVar.f14659c) && this.f14660d.equals(dVar.f14660d) && this.f14661e == dVar.f14661e && this.f14662f.equals(dVar.f14662f) && this.f14663g == dVar.f14663g && this.f14664h == dVar.f14664h && this.f14665i == dVar.f14665i) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final P0 getInputTimebase() {
        return this.f14659c;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final String getMimeType() {
        return this.f14657a;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final int getProfile() {
        return this.f14658b;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f14657a.hashCode() ^ 1000003) * 1000003) ^ this.f14658b) * 1000003) ^ this.f14659c.hashCode()) * 1000003) ^ this.f14660d.hashCode()) * 1000003) ^ this.f14661e) * 1000003) ^ this.f14662f.hashCode()) * 1000003) ^ this.f14663g) * 1000003) ^ this.f14664h) * 1000003) ^ this.f14665i;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final MediaFormat toMediaFormat() {
        Size size = this.f14660d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f14657a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.f14661e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f14665i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f14663g);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.f14664h);
        int i7 = this.f14658b;
        if (i7 != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, i7);
        }
        e eVar = this.f14662f;
        int i10 = eVar.f14670a;
        if (i10 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i10);
        }
        int i11 = eVar.f14671b;
        if (i11 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i11);
        }
        int i12 = eVar.f14672c;
        if (i12 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i12);
        }
        return mediaFormatCreateVideoFormat;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb2.append(this.f14657a);
        sb2.append(", profile=");
        sb2.append(this.f14658b);
        sb2.append(", inputTimebase=");
        sb2.append(this.f14659c);
        sb2.append(", resolution=");
        sb2.append(this.f14660d);
        sb2.append(", colorFormat=");
        sb2.append(this.f14661e);
        sb2.append(", dataSpace=");
        sb2.append(this.f14662f);
        sb2.append(", frameRate=");
        sb2.append(this.f14663g);
        sb2.append(", IFrameInterval=");
        sb2.append(this.f14664h);
        sb2.append(", bitrate=");
        return G.n(this.f14665i, "}", sb2);
    }
}

package C6;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.Handler;
import android.view.Surface;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f1188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaMuxer f1190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaCodec f1193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f1194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f1195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public File f1197j;

    static {
        new m(null);
    }

    public static File a() {
        p232p6.p pVar = p232p6.p.f41234a;
        File file = new File(p232p6.p.f().getCacheDir(), "liveness_video");
        if (file.exists()) {
            Kf.o.e(file);
        }
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, System.currentTimeMillis() + ".mp4");
    }
}

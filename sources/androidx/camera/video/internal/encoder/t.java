package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class t extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W0.d f14712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14714c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14715d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14716e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14717f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14718g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14719h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14720i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14721j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f14722k;

    public t(v vVar) {
        this.f14722k = vVar;
        this.f14713b = true;
        if (vVar.f14736c) {
            this.f14712a = new W0.d(vVar.f14750q, vVar.f14749p, (CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.a.f14630a.b(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.f14712a = null;
        }
        if (((CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.a.f14630a.b(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(vVar.f14737d.getString("mime"))) {
            return;
        }
        this.f14713b = false;
    }

    public final void a() {
        v vVar;
        EncoderCallback encoderCallback;
        Executor executor;
        if (this.f14716e) {
            return;
        }
        this.f14716e = true;
        ScheduledFuture scheduledFuture = this.f14722k.f14732C;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f14722k.f14732C = null;
        }
        synchronized (this.f14722k.f14735b) {
            vVar = this.f14722k;
            encoderCallback = vVar.f14751r;
            executor = vVar.f14752s;
        }
        vVar.j(new Da.h(this, 29, executor, encoderCallback));
    }

    public final void b(h hVar, EncoderCallback encoderCallback, Executor executor) {
        v vVar = this.f14722k;
        vVar.f14747n.add(hVar);
        ListenableFuture listenableFutureE = androidx.camera.core.impl.utils.futures.j.e(hVar.f14679e);
        listenableFutureE.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureE, new p279s5.d(this, 24, hVar, false)), vVar.f14741h);
        try {
            executor.execute(new o(6, encoderCallback, hVar));
        } catch (RejectedExecutionException e10) {
            p140j8.f.h(vVar.f14734a, "Unable to post to the supplied executor.", e10);
            hVar.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.f14722k.f14741h.execute(new o(3, this, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        this.f14722k.f14741h.execute(new B3.a(this, i7, 9));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        this.f14722k.f14741h.execute(new m(this, bufferInfo, mediaCodec, i7, 1));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f14722k.f14741h.execute(new o(4, this, mediaFormat));
    }
}

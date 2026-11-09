package C6;

import N8.q0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.luck.picture.lib.config.FileSizeUnit;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f1187a;

    public n(o oVar) {
        this.f1187a = oVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec codec, MediaCodec.CodecException e10) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(e10, "e");
        e10.printStackTrace();
        p pVar = this.f1187a.f1188a;
        if (pVar != null) {
            pVar.invoke(e10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec codec, int i7) {
        Intrinsics.checkNotNullParameter(codec, "codec");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec codec, int i7, MediaCodec.BufferInfo info) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(info, "info");
        int i10 = p292t6.a.f42345a;
        p292t6.a.a("encoder output buffer available: " + i7);
        o oVar = this.f1187a;
        if (oVar.f1191d) {
            if ((info.flags & 4) != 0 || !oVar.f1196i) {
                p292t6.a.a("encoder output eos");
                info.size = 0;
            }
            if (info.size > 0) {
                ByteBuffer outputBuffer = codec.getOutputBuffer(i7);
                if (outputBuffer != null) {
                    outputBuffer.position(info.offset);
                }
                if (outputBuffer != null) {
                    outputBuffer.limit(info.offset + info.size);
                }
                info.presentationTimeUs = androidx.camera.video.u.c(oVar.f1189b, FileSizeUnit.ACCURATE_MB, 24, 132);
                MediaMuxer mediaMuxer = oVar.f1190c;
                if (mediaMuxer != null) {
                    int i11 = oVar.f1192e;
                    Intrinsics.e(outputBuffer);
                    mediaMuxer.writeSampleData(i11, outputBuffer, info);
                }
                int i12 = info.size;
                long j6 = info.presentationTimeUs;
                StringBuilder sbP = q0.p(i7, "encoder output buffer: ", i12, ", size: ", ", pts: ");
                sbP.append(j6);
                p292t6.a.a(sbP.toString());
                codec.releaseOutputBuffer(i7, false);
                oVar.f1189b++;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(format, "format");
        int i7 = p292t6.a.f42345a;
        p292t6.a.a("encoder output format changed: " + format);
        o oVar = this.f1187a;
        MediaMuxer mediaMuxer = oVar.f1190c;
        oVar.f1192e = mediaMuxer != null ? mediaMuxer.addTrack(format) : 0;
        MediaMuxer mediaMuxer2 = oVar.f1190c;
        if (mediaMuxer2 != null) {
            mediaMuxer2.start();
        }
        oVar.f1191d = true;
    }
}

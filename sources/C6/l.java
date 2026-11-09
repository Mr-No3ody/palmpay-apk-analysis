package C6;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import java.io.File;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f1186b;

    public /* synthetic */ l(o oVar, int i7) {
        this.f1185a = i7;
        this.f1186b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f1186b;
        switch (this.f1185a) {
            case 0:
                if (oVar.f1196i) {
                    p292t6.a.b("Encoding already started");
                    return;
                } else {
                    p292t6.a.a("Starting to encode");
                    oVar.f1196i = true;
                    return;
                }
            case 1:
                try {
                    MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", 480, 640);
                    Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                    MediaCodecList mediaCodecList = new MediaCodecList(0);
                    int i7 = p292t6.a.f42345a;
                    p292t6.a.a("find format: " + mediaFormatCreateVideoFormat);
                    String strFindEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormatCreateVideoFormat);
                    p292t6.a.a("find encodeCodecName: " + strFindEncoderForFormat);
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(strFindEncoderForFormat);
                    oVar.f1193f = mediaCodecCreateByCodecName;
                    if (mediaCodecCreateByCodecName == null) {
                        Intrinsics.n("encoder");
                        throw null;
                    }
                    mediaCodecCreateByCodecName.setCallback(new n(oVar));
                    MediaCodec mediaCodec = oVar.f1193f;
                    if (mediaCodec == null) {
                        Intrinsics.n("encoder");
                        throw null;
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType("video/avc");
                    int[] colorFormats = capabilitiesForType.colorFormats;
                    Intrinsics.checkNotNullExpressionValue(colorFormats, "colorFormats");
                    if (C1847n.n(colorFormats, 2130708361)) {
                        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                    } else {
                        mediaFormatCreateVideoFormat.setInteger("color-format", capabilitiesForType.colorFormats[0]);
                    }
                    Integer num = (Integer) capabilitiesForType.getVideoCapabilities().getBitrateRange().getUpper();
                    if (num.intValue() >= 2000000) {
                        num = 2000000;
                    }
                    mediaFormatCreateVideoFormat.setInteger("bitrate", num.intValue());
                    mediaFormatCreateVideoFormat.setInteger("frame-rate", 24);
                    mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
                    p292t6.a.a("format: " + mediaFormatCreateVideoFormat + ", rateFrame: " + num);
                    MediaCodec mediaCodec2 = oVar.f1193f;
                    if (mediaCodec2 == null) {
                        Intrinsics.n("encoder");
                        throw null;
                    }
                    mediaCodec2.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                    MediaCodec mediaCodec3 = oVar.f1193f;
                    if (mediaCodec3 == null) {
                        Intrinsics.n("encoder");
                        throw null;
                    }
                    oVar.f1194g = mediaCodec3.createInputSurface();
                    File fileA = o.a();
                    oVar.f1197j = fileA;
                    oVar.f1190c = new MediaMuxer(fileA.getAbsolutePath(), 0);
                    MediaCodec mediaCodec4 = oVar.f1193f;
                    if (mediaCodec4 != null) {
                        mediaCodec4.start();
                        return;
                    } else {
                        Intrinsics.n("encoder");
                        throw null;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    p pVar = oVar.f1188a;
                    if (pVar != null) {
                        pVar.invoke(e10);
                        return;
                    }
                    return;
                }
            default:
                p292t6.a.a("encoding finished");
                oVar.f1196i = false;
                try {
                    MediaMuxer mediaMuxer = oVar.f1190c;
                    if (mediaMuxer != null) {
                        mediaMuxer.stop();
                    }
                    MediaCodec mediaCodec5 = oVar.f1193f;
                    if (mediaCodec5 == null) {
                        Intrinsics.n("encoder");
                        throw null;
                    }
                    mediaCodec5.stop();
                    MediaCodec mediaCodec6 = oVar.f1193f;
                    if (mediaCodec6 != null) {
                        mediaCodec6.release();
                        return;
                    } else {
                        Intrinsics.n("encoder");
                        throw null;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
        }
    }
}

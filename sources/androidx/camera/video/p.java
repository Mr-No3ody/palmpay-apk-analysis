package androidx.camera.video;

import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.OutputConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements EncoderCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.k f14807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f14808c;

    public p(s sVar, androidx.concurrent.futures.k kVar) {
        this.f14808c = sVar;
        this.f14807b = kVar;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public final void onEncodeError(androidx.camera.video.internal.encoder.f fVar) {
        this.f14807b.d(fVar);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public final void onEncodeStart() {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public final void onEncodeStop() {
        this.f14807b.b(null);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public final void onEncodedData(EncodedData encodedData) {
        boolean z3;
        int i7;
        s sVar = this.f14808c;
        sVar.getClass();
        if (sVar.f14847k) {
            p140j8.f.G("Recorder");
            encodedData.close();
            return;
        }
        EncodedData encodedData2 = sVar.f14858w;
        if (encodedData2 != null) {
            encodedData2.close();
            sVar.f14858w = null;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!encodedData.isKeyFrame()) {
            if (z3) {
                p140j8.f.G("Recorder");
            }
            p140j8.f.G("Recorder");
            sVar.f14855s.requestKeyFrame();
            encodedData.close();
            return;
        }
        sVar.f14858w = encodedData;
        int i10 = sVar.f14836D;
        androidx.camera.core.internal.utils.a aVar = sVar.f14859x;
        if (i10 == 4 && aVar.isEmpty()) {
            if (z3) {
                p140j8.f.G("Recorder");
                return;
            } else {
                p140j8.f.G("Recorder");
                return;
            }
        }
        p140j8.f.G("Recorder");
        if ((sVar.f14836D == 4) && aVar.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        EncodedData encodedData3 = sVar.f14858w;
        if (encodedData3 == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            sVar.f14858w = null;
            long presentationTimeUs = encodedData3.getPresentationTimeUs();
            ArrayList arrayList = new ArrayList();
            while (!aVar.isEmpty()) {
                EncodedData encodedData4 = (EncodedData) aVar.dequeue();
                if (encodedData4.getPresentationTimeUs() >= presentationTimeUs) {
                    arrayList.add(encodedData4);
                }
            }
            encodedData3.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((EncodedData) it.next()).size();
            }
            try {
                if (((C1016e) s.b(sVar.f14854r)).f14592c != -1) {
                    throw null;
                }
                androidx.camera.video.internal.d dVar = sVar.f14848l;
                int i11 = s.f14829I.f14592c;
                if (dVar != null && (i7 = ((androidx.camera.video.internal.a) dVar).f14612b) != 1 && i7 != 2) {
                    throw null;
                }
                throw null;
            } catch (IOException e10) {
                sVar.e(e10);
                encodedData3.close();
            }
        } catch (Throwable th) {
            try {
                encodedData3.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public final void onOutputConfigUpdate(OutputConfig outputConfig) {
        this.f14808c.t = outputConfig;
    }
}

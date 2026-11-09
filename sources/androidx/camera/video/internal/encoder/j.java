package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14684c;

    public /* synthetic */ j(v vVar, long j6, int i7) {
        this.f14682a = i7;
        this.f14683b = vVar;
        this.f14684c = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14682a) {
            case 0:
                v vVar = this.f14683b;
                switch (F.i(vVar.f14733D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j6 = this.f14684c;
                        p118hf.a.G(j6);
                        p140j8.f.G(vVar.f14734a);
                        vVar.f14748o.addLast(Range.create(Long.valueOf(j6), Long.MAX_VALUE));
                        vVar.h(3);
                        return;
                    case 4:
                        vVar.h(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(vVar.f14733D)));
                }
            default:
                v vVar2 = this.f14683b;
                long j10 = this.f14684c;
                switch (F.i(vVar2.f14733D)) {
                    case 0:
                        vVar2.f14755w = null;
                        String str = vVar2.f14734a;
                        p118hf.a.G(j10);
                        p140j8.f.G(str);
                        try {
                            if (vVar2.f14758z) {
                                vVar2.g();
                            }
                            vVar2.t = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                            vVar2.f14738e.start();
                            Encoder.EncoderInput encoderInput = vVar2.f14739f;
                            if (encoderInput instanceof r) {
                                ((r) encoderInput).a(true);
                            }
                            vVar2.h(2);
                            return;
                        } catch (MediaCodec.CodecException e10) {
                            vVar2.b(1, e10.getMessage(), e10);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        vVar2.f14755w = null;
                        Range range = (Range) vVar2.f14748o.removeLast();
                        p118hf.a.k(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                        Long l5 = (Long) range.getLower();
                        long jLongValue = l5.longValue();
                        vVar2.f14748o.addLast(Range.create(l5, Long.valueOf(j10)));
                        String str2 = vVar2.f14734a;
                        p118hf.a.G(j10);
                        p118hf.a.G(j10 - jLongValue);
                        p140j8.f.G(str2);
                        if ((vVar2.f14736c || androidx.camera.video.internal.compat.quirk.a.f14630a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!vVar2.f14736c || androidx.camera.video.internal.compat.quirk.a.f14630a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            vVar2.f14738e.setParameters(bundle);
                            Encoder.EncoderInput encoderInput2 = vVar2.f14739f;
                            if (encoderInput2 instanceof r) {
                                ((r) encoderInput2).a(true);
                            }
                        }
                        if (vVar2.f14736c) {
                            vVar2.f();
                        }
                        vVar2.h(2);
                        return;
                    case 3:
                    case 5:
                        vVar2.h(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(vVar2.f14733D)));
                }
        }
    }
}

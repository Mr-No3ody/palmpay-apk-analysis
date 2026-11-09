package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.P0;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.banner.BannerAdAdapter;
import com.transsnet.palmpay.credit.ui.dialog.C1515l0;
import com.transsnet.palmpay.credit.ui.dialog.CreditApplicationDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.TransferByLoanSheet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14694e;

    public /* synthetic */ m(v vVar, int i7, String str, Throwable th) {
        this.f14690a = 0;
        this.f14692c = vVar;
        this.f14691b = i7;
        this.f14693d = str;
        this.f14694e = th;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:227:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:229:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        EncoderCallback encoderCallback;
        Executor executor;
        boolean z3;
        boolean z8;
        MediaCodec.BufferInfo bufferInfo;
        Executor executor2;
        EncoderCallback encoderCallback2;
        boolean z10;
        P0 p3;
        v vVar;
        switch (this.f14690a) {
            case 0:
                ((v) this.f14692c).d(this.f14691b, (String) this.f14693d, (Throwable) this.f14694e);
                return;
            case 1:
                t tVar = (t) this.f14692c;
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f14693d;
                MediaCodec mediaCodec = (MediaCodec) this.f14694e;
                int i7 = this.f14691b;
                if (tVar.f14721j) {
                    p140j8.f.G(tVar.f14722k.f14734a);
                    return;
                }
                switch (F.i(tVar.f14722k.f14733D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (tVar.f14722k.f14735b) {
                            v vVar2 = tVar.f14722k;
                            encoderCallback = vVar2.f14751r;
                            executor = vVar2.f14752s;
                            break;
                        }
                        if (!tVar.f14714c) {
                            tVar.f14714c = true;
                            try {
                                Objects.requireNonNull(encoderCallback);
                                executor.execute(new s(encoderCallback, 1));
                            } catch (RejectedExecutionException e10) {
                                p140j8.f.h(tVar.f14722k.f14734a, "Unable to post to the supplied executor.", e10);
                            }
                        }
                        try {
                            if (!tVar.f14716e && bufferInfo2.size > 0 && (bufferInfo2.flags & 2) == 0) {
                                W0.d dVar = tVar.f14712a;
                                if (dVar != null) {
                                    long j6 = bufferInfo2.presentationTimeUs;
                                    P0 p10 = (P0) dVar.f10371e;
                                    org.sufficientlysecure.htmltextview.l lVar = (org.sufficientlysecure.htmltextview.l) dVar.f10368b;
                                    if (p10 == null) {
                                        CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) dVar.f10370d;
                                        P0 p11 = (P0) dVar.f10369c;
                                        if (cameraUseInconsistentTimebaseQuirk != null) {
                                            p140j8.f.G("VideoTimebaseConverter");
                                        } else {
                                            z10 = lVar.realtimeUs() - lVar.uptimeUs() > 3000000;
                                            dVar.f10371e = p11;
                                        }
                                        P0 p12 = Math.abs(j6 - lVar.realtimeUs()) < Math.abs(j6 - lVar.uptimeUs()) ? P0.f13944b : P0.f13943a;
                                        if (!z10 || p12 == p11) {
                                            p3 = p12;
                                            p3.toString();
                                            p140j8.f.G("VideoTimebaseConverter");
                                        } else {
                                            int i10 = Build.VERSION.SDK_INT;
                                            p3 = p12;
                                            p140j8.f.g("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i10), i10 >= 31 ? ", SOC: " + Build.SOC_MODEL : "", (P0) dVar.f10369c, p3));
                                        }
                                        p11 = p3;
                                        dVar.f10371e = p11;
                                    }
                                    int iOrdinal = ((P0) dVar.f10371e).ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal != 1) {
                                            throw new AssertionError("Unknown timebase: " + ((P0) dVar.f10371e));
                                        }
                                        if (dVar.f10367a == -1) {
                                            long j10 = Long.MAX_VALUE;
                                            long j11 = 0;
                                            for (int i11 = 0; i11 < 3; i11++) {
                                                long jUptimeUs = lVar.uptimeUs();
                                                long jRealtimeUs = lVar.realtimeUs();
                                                long jUptimeUs2 = lVar.uptimeUs();
                                                long j12 = jUptimeUs2 - jUptimeUs;
                                                if (i11 == 0 || j12 < j10) {
                                                    j11 = jRealtimeUs - ((jUptimeUs + jUptimeUs2) >> 1);
                                                    j10 = j12;
                                                }
                                            }
                                            dVar.f10367a = Math.max(0L, j11);
                                            p140j8.f.G("VideoTimebaseConverter");
                                        }
                                        j6 -= dVar.f10367a;
                                    }
                                    bufferInfo2.presentationTimeUs = j6;
                                }
                                long j13 = bufferInfo2.presentationTimeUs;
                                if (j13 <= tVar.f14717f) {
                                    p140j8.f.G(tVar.f14722k.f14734a);
                                } else {
                                    tVar.f14717f = j13;
                                    if (tVar.f14722k.t.contains(Long.valueOf(j13))) {
                                        v vVar3 = tVar.f14722k;
                                        long j14 = bufferInfo2.presentationTimeUs;
                                        while (true) {
                                            ArrayDeque arrayDeque = vVar3.f14748o;
                                            if (!arrayDeque.isEmpty()) {
                                                Range range = (Range) arrayDeque.getFirst();
                                                if (j14 > ((Long) range.getUpper()).longValue()) {
                                                    arrayDeque.removeFirst();
                                                    long jLongValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + vVar3.f14753u;
                                                    vVar3.f14753u = jLongValue;
                                                    p118hf.a.G(jLongValue);
                                                    p140j8.f.G(vVar3.f14734a);
                                                }
                                            }
                                        }
                                        v vVar4 = tVar.f14722k;
                                        long j15 = bufferInfo2.presentationTimeUs;
                                        Iterator it = vVar4.f14748o.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Range range2 = (Range) it.next();
                                                if (range2.contains(Long.valueOf(j15))) {
                                                    z3 = true;
                                                } else if (j15 < ((Long) range2.getLower()).longValue()) {
                                                }
                                            }
                                            z3 = false;
                                        }
                                        boolean z11 = tVar.f14719h;
                                        if (!z11 && z3) {
                                            p140j8.f.G(tVar.f14722k.f14734a);
                                            tVar.f14719h = true;
                                            synchronized (tVar.f14722k.f14735b) {
                                                v vVar5 = tVar.f14722k;
                                                executor2 = vVar5.f14752s;
                                                encoderCallback2 = vVar5.f14751r;
                                                break;
                                            }
                                            Objects.requireNonNull(encoderCallback2);
                                            executor2.execute(new s(encoderCallback2, 2));
                                            v vVar6 = tVar.f14722k;
                                            if (vVar6.f14733D == 3 && ((vVar6.f14736c || androidx.camera.video.internal.compat.quirk.a.f14630a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!tVar.f14722k.f14736c || androidx.camera.video.internal.compat.quirk.a.f14630a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                                                Encoder.EncoderInput encoderInput = tVar.f14722k.f14739f;
                                                if (encoderInput instanceof r) {
                                                    ((r) encoderInput).a(false);
                                                }
                                                v vVar7 = tVar.f14722k;
                                                vVar7.getClass();
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("drop-input-frames", 1);
                                                vVar7.f14738e.setParameters(bundle);
                                            }
                                            tVar.f14722k.f14755w = Long.valueOf(bufferInfo2.presentationTimeUs);
                                            v vVar8 = tVar.f14722k;
                                            if (vVar8.f14754v) {
                                                ScheduledFuture scheduledFuture = vVar8.f14756x;
                                                if (scheduledFuture != null) {
                                                    scheduledFuture.cancel(true);
                                                }
                                                tVar.f14722k.i();
                                                tVar.f14722k.f14754v = false;
                                            }
                                        } else if (z11 && !z3) {
                                            p140j8.f.G(tVar.f14722k.f14734a);
                                            tVar.f14719h = false;
                                            if (tVar.f14722k.f14736c && (bufferInfo2.flags & 1) == 0) {
                                                tVar.f14720i = true;
                                            }
                                        }
                                        if (tVar.f14719h) {
                                            p140j8.f.G(tVar.f14722k.f14734a);
                                        } else {
                                            v vVar9 = tVar.f14722k;
                                            long j16 = vVar9.f14753u;
                                            if ((j16 > 0 ? bufferInfo2.presentationTimeUs - j16 : bufferInfo2.presentationTimeUs) > tVar.f14718g) {
                                                boolean z12 = true;
                                                boolean z13 = tVar.f14715d;
                                                if (!z13 && !tVar.f14720i && vVar9.f14736c) {
                                                    tVar.f14720i = true;
                                                }
                                                if (!tVar.f14720i) {
                                                    z8 = false;
                                                } else if ((bufferInfo2.flags & 1) != 0) {
                                                    z8 = false;
                                                    tVar.f14720i = false;
                                                    z12 = true;
                                                } else {
                                                    p140j8.f.G(vVar9.f14734a);
                                                    tVar.f14722k.f();
                                                }
                                                if (!z13) {
                                                    tVar.f14715d = z12;
                                                    String str = vVar9.f14734a;
                                                    Objects.toString(vVar9.f14749p);
                                                    SystemClock.uptimeMillis();
                                                    SystemClock.elapsedRealtime();
                                                    p140j8.f.G(str);
                                                }
                                                long j17 = tVar.f14722k.f14753u;
                                                long j18 = j17 > 0 ? bufferInfo2.presentationTimeUs - j17 : bufferInfo2.presentationTimeUs;
                                                if (bufferInfo2.presentationTimeUs == j18) {
                                                    bufferInfo = bufferInfo2;
                                                } else {
                                                    if (j18 > tVar.f14718g) {
                                                        z8 = true;
                                                    }
                                                    p118hf.a.k(z8, null);
                                                    MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
                                                    bufferInfo3.set(bufferInfo2.offset, bufferInfo2.size, j18, bufferInfo2.flags);
                                                    bufferInfo = bufferInfo3;
                                                }
                                                tVar.f14718g = bufferInfo.presentationTimeUs;
                                                try {
                                                    tVar.b(new h(mediaCodec, i7, bufferInfo), encoderCallback, executor);
                                                    if (tVar.f14716e) {
                                                        return;
                                                    }
                                                    if ((bufferInfo2.flags & 4) == 0) {
                                                        if (!tVar.f14713b) {
                                                            return;
                                                        }
                                                        vVar = tVar.f14722k;
                                                        if (vVar.f14731B || bufferInfo2.presentationTimeUs <= ((Long) vVar.t.getUpper()).longValue()) {
                                                            return;
                                                        }
                                                    }
                                                    tVar.a();
                                                    return;
                                                } catch (MediaCodec.CodecException e11) {
                                                    v vVar10 = tVar.f14722k;
                                                    vVar10.getClass();
                                                    vVar10.b(1, e11.getMessage(), e11);
                                                    return;
                                                }
                                            }
                                            p140j8.f.G(vVar9.f14734a);
                                            if (tVar.f14722k.f14736c && (bufferInfo2.flags & 1) != 0) {
                                                tVar.f14720i = true;
                                            }
                                        }
                                    } else {
                                        p140j8.f.G(tVar.f14722k.f14734a);
                                        v vVar11 = tVar.f14722k;
                                        if (vVar11.f14754v && bufferInfo2.presentationTimeUs >= ((Long) vVar11.t.getUpper()).longValue()) {
                                            ScheduledFuture scheduledFuture2 = tVar.f14722k.f14756x;
                                            if (scheduledFuture2 != null) {
                                                scheduledFuture2.cancel(true);
                                            }
                                            tVar.f14722k.f14755w = Long.valueOf(bufferInfo2.presentationTimeUs);
                                            tVar.f14722k.i();
                                            tVar.f14722k.f14754v = false;
                                        }
                                    }
                                }
                            } else {
                                p140j8.f.G(tVar.f14722k.f14734a);
                            }
                            tVar.f14722k.f14738e.releaseOutputBuffer(i7, false);
                            if (tVar.f14716e) {
                                if ((bufferInfo2.flags & 4) == 0) {
                                    if (!tVar.f14713b) {
                                        vVar = tVar.f14722k;
                                        if (vVar.f14731B) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                }
                                tVar.a();
                                return;
                            }
                            return;
                        } catch (MediaCodec.CodecException e12) {
                            v vVar12 = tVar.f14722k;
                            vVar12.getClass();
                            vVar12.b(1, e12.getMessage(), e12);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(tVar.f14722k.f14733D)));
                }
            case 2:
                ((Uploader) this.f14692c).lambda$upload$1((TransportContext) this.f14693d, this.f14691b, (Runnable) this.f14694e);
                return;
            case 3:
                ((BannerAdAdapter) this.f14692c).lambda$bindData$0((ImageView) this.f14693d, (AdEntity) this.f14694e, this.f14691b);
                return;
            case 4:
                CreditApplicationDialogFragment.a aVar = CreditApplicationDialogFragment.f29952L;
                C1515l0 c1515l0 = (C1515l0) this.f14692c;
                int itemCount = c1515l0.getItemCount();
                if (itemCount > 0) {
                    RecyclerView recyclerView = (RecyclerView) this.f14693d;
                    ((int[]) this.f14694e)[0] = ((((recyclerView != null ? recyclerView.getWidth() : 0) - (recyclerView != null ? recyclerView.getPaddingLeft() : 0)) - (recyclerView != null ? recyclerView.getPaddingRight() : 0)) - ((itemCount - 1) * this.f14691b)) / itemCount;
                    c1515l0.notifyDataSetChanged();
                    return;
                }
                return;
            default:
                int i12 = TransferByLoanSheet.f30032q0;
                if (((TransferByLoanSheet) this.f14692c).isAdded()) {
                    LinearLayout linearLayout = (LinearLayout) this.f14693d;
                    int height = linearLayout.getHeight();
                    int i13 = this.f14691b;
                    if (height <= i13) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    layoutParams.height = i13;
                    linearLayout.setLayoutParams(layoutParams);
                    View view = (View) this.f14694e;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    Intrinsics.f(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.height = 0;
                    layoutParams3.weight = 1.0f;
                    view.setLayoutParams(layoutParams3);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f14690a = i10;
        this.f14692c = obj;
        this.f14693d = obj2;
        this.f14691b = i7;
        this.f14694e = obj3;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f14690a = i10;
        this.f14692c = obj;
        this.f14693d = obj2;
        this.f14694e = obj3;
        this.f14691b = i7;
    }
}

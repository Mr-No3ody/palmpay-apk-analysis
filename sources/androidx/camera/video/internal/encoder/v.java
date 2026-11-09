package androidx.camera.video.internal.encoder;

import E.AbstractC0198c;
import Me.AbstractC0456a;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.biometric.RunnableC0903g;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.P0;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Encoder {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Range f14729E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ScheduledFuture f14732C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14733D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14734a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaFormat f14737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCodec f14738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Encoder.EncoderInput f14739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0456a f14740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f14741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ListenableFuture f14742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.concurrent.futures.k f14743j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final P0 f14749p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14735b = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayDeque f14744k = new ArrayDeque();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f14745l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f14746m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashSet f14747n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f14748o = new ArrayDeque();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final org.sufficientlysecure.htmltextview.l f14750q = new org.sufficientlysecure.htmltextview.l(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EncoderCallback f14751r = EncoderCallback.f14646a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Executor f14752s = org.chromium.support_lib_boundary.util.b.u();
    public Range t = f14729E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14753u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14754v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f14755w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ScheduledFuture f14756x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t f14757y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14758z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14730A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14731B = false;

    public v(Executor executor, EncoderConfig encoderConfig) throws x {
        executor.getClass();
        encoderConfig.getClass();
        LruCache lruCache = androidx.camera.video.internal.utils.a.f14768a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(encoderConfig.getMimeType());
            this.f14738e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.f14741h = new androidx.camera.core.impl.utils.executor.i(executor);
            MediaFormat mediaFormat = encoderConfig.toMediaFormat();
            this.f14737d = mediaFormat;
            P0 inputTimebase = encoderConfig.getInputTimebase();
            this.f14749p = inputTimebase;
            if (encoderConfig instanceof b) {
                this.f14734a = "AudioEncoder";
                this.f14736c = false;
                this.f14739f = new r(this);
                this.f14740g = new C1019a(codecInfo, encoderConfig.getMimeType());
            } else {
                if (!(encoderConfig instanceof d)) {
                    throw new x("Unknown encoder config type");
                }
                this.f14734a = "VideoEncoder";
                this.f14736c = true;
                this.f14739f = new u(this);
                A a3 = new A(codecInfo, encoderConfig.getMimeType());
                if (mediaFormat.containsKey("bitrate")) {
                    int integer = mediaFormat.getInteger("bitrate");
                    int iIntValue = ((Integer) a3.f14645c.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormat.setInteger("bitrate", iIntValue);
                        p140j8.f.G("VideoEncoder");
                    }
                }
                this.f14740g = a3;
            }
            String str = this.f14734a;
            Objects.toString(inputTimebase);
            p140j8.f.G(str);
            String str2 = this.f14734a;
            Objects.toString(mediaFormat);
            p140j8.f.G(str2);
            try {
                g();
                AtomicReference atomicReference = new AtomicReference();
                this.f14742i = androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new g(atomicReference, 2)));
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) atomicReference.get();
                kVar.getClass();
                this.f14743j = kVar;
                h(1);
            } catch (MediaCodec.CodecException e10) {
                throw new x(e10);
            }
        } catch (IOException | IllegalArgumentException e11) {
            throw new x(e11);
        }
    }

    public final ListenableFuture a() {
        switch (F.i(this.f14733D)) {
            case 0:
                return new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Encoder is not started yet."), 1);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new g(atomicReference, 1));
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) atomicReference.get();
                kVar.getClass();
                this.f14745l.offer(kVar);
                kVar.a(new RunnableC0903g(29, this, kVar), this.f14741h);
                c();
                return mVarY;
            case 7:
                return new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Encoder is in error state."), 1);
            case 8:
                return new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Encoder is released."), 1);
            default:
                throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(this.f14733D)));
        }
    }

    public final void b(int i7, String str, Throwable th) {
        switch (F.i(this.f14733D)) {
            case 0:
                d(i7, str, th);
                g();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                h(8);
                j(new m(this, i7, str, th));
                break;
            case 7:
                p140j8.f.G(this.f14734a);
                break;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.f14745l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f14744k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) arrayDeque.poll();
            Objects.requireNonNull(kVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                w wVar = new w(this.f14738e, num.intValue());
                if (kVar.b(wVar)) {
                    this.f14746m.add(wVar);
                    androidx.camera.core.impl.utils.futures.j.e(wVar.f14762d).addListener(new RunnableC0903g(27, this, wVar), this.f14741h);
                } else {
                    wVar.cancel();
                }
            } catch (MediaCodec.CodecException e10) {
                b(1, e10.getMessage(), e10);
                return;
            }
        }
    }

    public final void d(int i7, String str, Throwable th) {
        EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.f14735b) {
            encoderCallback = this.f14751r;
            executor = this.f14752s;
        }
        try {
            executor.execute(new Da.h(encoderCallback, i7, str, th));
        } catch (RejectedExecutionException e10) {
            p140j8.f.h(this.f14734a, "Unable to post to the supplied executor.", e10);
        }
    }

    public final void e() {
        Surface surface;
        HashSet hashSet;
        if (this.f14758z) {
            this.f14738e.stop();
            this.f14758z = false;
        }
        this.f14738e.release();
        Encoder.EncoderInput encoderInput = this.f14739f;
        if (encoderInput instanceof u) {
            u uVar = (u) encoderInput;
            synchronized (uVar.f14723a) {
                surface = uVar.f14724b;
                uVar.f14724b = null;
                hashSet = new HashSet(uVar.f14725c);
                uVar.f14725c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        h(9);
        this.f14743j.b(null);
    }

    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f14738e.setParameters(bundle);
    }

    public final void g() {
        Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener;
        Executor executor;
        this.t = f14729E;
        this.f14753u = 0L;
        this.f14748o.clear();
        this.f14744k.clear();
        Iterator it = this.f14745l.iterator();
        while (it.hasNext()) {
            ((androidx.concurrent.futures.k) it.next()).c();
        }
        this.f14745l.clear();
        this.f14738e.reset();
        this.f14758z = false;
        this.f14730A = false;
        this.f14731B = false;
        this.f14754v = false;
        ScheduledFuture scheduledFuture = this.f14756x;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f14756x = null;
        }
        ScheduledFuture scheduledFuture2 = this.f14732C;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f14732C = null;
        }
        t tVar = this.f14757y;
        if (tVar != null) {
            tVar.f14721j = true;
        }
        t tVar2 = new t(this);
        this.f14757y = tVar2;
        this.f14738e.setCallback(tVar2);
        this.f14738e.configure(this.f14737d, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.f14739f;
        if (encoderInput instanceof u) {
            u uVar = (u) encoderInput;
            uVar.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) androidx.camera.video.internal.compat.quirk.a.f14630a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (uVar.f14723a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (uVar.f14724b == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            uVar.f14724b = surfaceCreateInputSurface;
                        }
                        uVar.f14728f.f14738e.setInputSurface(uVar.f14724b);
                    } else {
                        Surface surface = uVar.f14724b;
                        if (surface != null) {
                            uVar.f14725c.add(surface);
                        }
                        surfaceCreateInputSurface = uVar.f14728f.f14738e.createInputSurface();
                        uVar.f14724b = surfaceCreateInputSurface;
                    }
                    onSurfaceUpdateListener = uVar.f14726d;
                    executor = uVar.f14727e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || onSurfaceUpdateListener == null || executor == null) {
                return;
            }
            try {
                executor.execute(new o(7, onSurfaceUpdateListener, surfaceCreateInputSurface));
            } catch (RejectedExecutionException e10) {
                p140j8.f.h(uVar.f14728f.f14734a, "Unable to post to the supplied executor.", e10);
            }
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final int getConfiguredBitrate() {
        MediaFormat mediaFormat = this.f14737d;
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final EncoderInfo getEncoderInfo() {
        return this.f14740g;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final Encoder.EncoderInput getInput() {
        return this.f14739f;
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final ListenableFuture getReleasedFuture() {
        return this.f14742i;
    }

    public final void h(int i7) {
        if (this.f14733D == i7) {
            return;
        }
        p140j8.f.G(this.f14734a);
        this.f14733D = i7;
    }

    public final void i() {
        p140j8.f.G(this.f14734a);
        Encoder.EncoderInput encoderInput = this.f14739f;
        if (encoderInput instanceof r) {
            ((r) encoderInput).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f14746m.iterator();
            while (it.hasNext()) {
                arrayList.add(((InputBuffer) it.next()).getTerminationFuture());
            }
            androidx.camera.core.impl.utils.futures.j.h(arrayList).addListener(new k(this, 1), this.f14741h);
            return;
        }
        if (encoderInput instanceof u) {
            try {
                if (androidx.camera.video.internal.compat.quirk.a.f14630a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    t tVar = this.f14757y;
                    androidx.camera.core.impl.utils.executor.i iVar = this.f14741h;
                    ScheduledFuture scheduledFuture = this.f14732C;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f14732C = org.chromium.support_lib_boundary.util.b.S().schedule(new RunnableC0903g(28, iVar, tVar), 1000L, TimeUnit.MILLISECONDS);
                }
                this.f14738e.signalEndOfInputStream();
                this.f14731B = true;
            } catch (MediaCodec.CodecException e10) {
                b(1, e10.getMessage(), e10);
            }
        }
    }

    public final void j(Runnable runnable) {
        String str = this.f14734a;
        p140j8.f.G(str);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f14747n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.core.impl.utils.futures.j.e(((h) it.next()).f14679e));
        }
        HashSet hashSet2 = this.f14746m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InputBuffer) it2.next()).getTerminationFuture());
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
            p140j8.f.G(str);
        }
        androidx.camera.core.impl.utils.futures.j.h(arrayList).addListener(new Da.h(this, 26, arrayList, runnable), this.f14741h);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void pause() {
        this.f14741h.execute(new j(this, this.f14750q.uptimeUs(), 0));
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void release() {
        this.f14741h.execute(new k(this, 2));
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void requestKeyFrame() {
        this.f14741h.execute(new k(this, 3));
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void setEncoderCallback(EncoderCallback encoderCallback, Executor executor) {
        synchronized (this.f14735b) {
            this.f14751r = encoderCallback;
            this.f14752s = executor;
        }
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void start() {
        this.f14741h.execute(new j(this, this.f14750q.uptimeUs(), 1));
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void stop() {
        stop(-1L);
    }

    @Override // androidx.camera.video.internal.encoder.Encoder
    public final void stop(final long j6) {
        final long jUptimeUs = this.f14750q.uptimeUs();
        this.f14741h.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.l
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f14687a;
                switch (F.i(vVar.f14733D)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i7 = vVar.f14733D;
                        vVar.h(4);
                        Long l5 = (Long) vVar.t.getLower();
                        long jLongValue = l5.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j10 = j6;
                        String str = vVar.f14734a;
                        if (j10 == -1) {
                            j10 = jUptimeUs;
                        } else if (j10 < jLongValue) {
                            p140j8.f.G(str);
                            j10 = jUptimeUs;
                        }
                        if (j10 < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        vVar.t = Range.create(l5, Long.valueOf(j10));
                        p118hf.a.G(j10);
                        p140j8.f.G(str);
                        if (i7 == 3 && vVar.f14755w != null) {
                            vVar.i();
                            return;
                        } else {
                            vVar.f14754v = true;
                            vVar.f14756x = org.chromium.support_lib_boundary.util.b.S().schedule(new k(vVar, 5), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        vVar.h(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(androidx.camera.video.u.A(vVar.f14733D)));
                }
            }
        });
    }
}

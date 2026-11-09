package S4;

import com.google.api.Service;
import com.palmpay.lib.webview.container.WebProgress;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final HashMap f8669U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final HashMap f8670V;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8671A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f8672B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f8673C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f8674D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f8675E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f8676F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f8677G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f8678H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f8679I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f8680J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f8681K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f8682L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f8683M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f8684N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f8685O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f8686P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f8687Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f8688R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f8689S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f8690T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f8691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8701n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8702o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8706s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8707u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8708v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8710x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8711y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8712z;

    static {
        HashMap map = new HashMap();
        f8669U = map;
        HashMap map2 = new HashMap();
        f8670V = map2;
        map.put(0, 96000);
        map.put(1, 88200);
        map.put(2, 64000);
        map.put(3, 48000);
        map.put(4, 44100);
        map.put(5, 32000);
        map.put(6, 24000);
        map.put(7, 22050);
        map.put(8, 16000);
        map.put(9, 12000);
        map.put(10, 11025);
        map.put(11, Integer.valueOf(WebProgress.MAX_UNIFORM_SPEED_DURATION));
        map2.put(1, "AAC main");
        map2.put(2, "AAC LC");
        map2.put(3, "AAC SSR");
        map2.put(4, "AAC LTP");
        map2.put(5, "SBR");
        map2.put(6, "AAC Scalable");
        map2.put(7, "TwinVQ");
        map2.put(8, "CELP");
        map2.put(9, "HVXC");
        map2.put(10, "(reserved)");
        map2.put(11, "(reserved)");
        map2.put(12, "TTSI");
        map2.put(13, "Main synthetic");
        map2.put(14, "Wavetable synthesis");
        map2.put(15, "General MIDI");
        map2.put(16, "Algorithmic Synthesis and Audio FX");
        map2.put(17, "ER AAC LC");
        map2.put(18, "(reserved)");
        map2.put(19, "ER AAC LTP");
        map2.put(20, "ER AAC Scalable");
        map2.put(21, "ER TwinVQ");
        map2.put(22, "ER BSAC");
        map2.put(23, "ER AAC LD");
        map2.put(24, "ER CELP");
        map2.put(25, "ER HVXC");
        map2.put(26, "ER HILN");
        map2.put(27, "ER Parametric");
        map2.put(28, "SSC");
        map2.put(29, "PS");
        map2.put(30, "MPEG Surround");
        map2.put(31, "(escape)");
        map2.put(32, "Layer-1");
        map2.put(33, "Layer-2");
        map2.put(34, "Layer-3");
        map2.put(35, "DST");
        map2.put(36, "ALS");
        map2.put(37, "SLS");
        map2.put(38, "SLS non-core");
        map2.put(39, "ER AAC ELD");
        map2.put(40, "SMR Simple");
        map2.put(41, "SMR Main");
    }

    public static int c(c cVar) {
        int iA = cVar.a(5);
        return iA == 31 ? cVar.a(6) + 32 : iA;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0262  */
    @Override // S4.b
    public final void b(ByteBuffer byteBuffer) {
        int iA;
        int iA2;
        int i7;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f8714b);
        byteBuffer.position(byteBuffer.position() + this.f8714b);
        byte[] bArr = new byte[this.f8714b];
        this.f8691d = bArr;
        byteBufferSlice.get(bArr);
        byteBufferSlice.rewind();
        c cVar = new c(byteBufferSlice, 0);
        this.f8692e = c(cVar);
        int iA3 = cVar.a(4);
        this.f8693f = iA3;
        int i10 = 15;
        if (iA3 == 15) {
            this.f8694g = cVar.a(24);
        }
        this.f8695h = cVar.a(4);
        int i11 = this.f8692e;
        if (i11 == 5 || i11 == 29) {
            this.f8696i = 5;
            this.f8697j = true;
            if (i11 == 29) {
                this.f8698k = true;
            }
            int iA4 = cVar.a(4);
            this.f8699l = iA4;
            if (iA4 == 15) {
                this.f8700m = cVar.a(24);
            }
            int iC = c(cVar);
            this.f8692e = iC;
            if (iC == 22) {
                this.f8701n = cVar.a(4);
            }
        } else {
            this.f8696i = 0;
        }
        int i12 = this.f8692e;
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                int i13 = this.f8695h;
                this.t = cVar.a(1);
                int iA5 = cVar.a(1);
                this.f8707u = iA5;
                if (iA5 == 1) {
                    this.f8708v = cVar.a(14);
                }
                this.f8709w = cVar.a(1);
                if (i13 == 0) {
                    throw new UnsupportedOperationException("can't parse program_config_element yet");
                }
                if (i12 == 6 || i12 == 20) {
                    this.f8710x = cVar.a(3);
                }
                if (this.f8709w == 1) {
                    if (i12 == 22) {
                        this.f8711y = cVar.a(5);
                        this.f8712z = cVar.a(11);
                    }
                    if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                        this.f8671A = cVar.b();
                        this.f8672B = cVar.b();
                        this.f8673C = cVar.b();
                    }
                    this.f8674D = cVar.a(1);
                }
                this.f8675E = true;
                break;
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                int iA6 = cVar.a(1);
                this.f8676F = iA6;
                if (iA6 == 1) {
                    int iA7 = cVar.a(2);
                    this.f8677G = iA7;
                    if (iA7 != 1) {
                        this.f8679I = cVar.a(1);
                        this.f8680J = cVar.a(2);
                        int iA8 = cVar.a(1);
                        this.f8681K = iA8;
                        if (iA8 == 1) {
                            this.f8682L = cVar.a(1);
                        }
                    }
                    if (this.f8677G != 0) {
                        this.f8683M = cVar.a(1);
                        this.f8684N = cVar.a(8);
                        this.f8685O = cVar.a(4);
                        this.f8686P = cVar.a(12);
                        this.f8687Q = cVar.a(2);
                    }
                    this.f8678H = cVar.a(1);
                    this.f8690T = true;
                } else {
                    int iA9 = cVar.a(1);
                    this.f8688R = iA9;
                    if (iA9 == 1) {
                        this.f8689S = cVar.a(2);
                    }
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                this.f8702o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f8703p = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                int i14 = this.f8695h;
                cVar.b();
                cVar.b();
                cVar.b();
                cVar.b();
                if (cVar.b()) {
                    cVar.b();
                    cVar.b();
                    switch (i14) {
                        case 1:
                        case 2:
                            i7 = 1;
                            break;
                        case 3:
                            i7 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i7 = 3;
                            break;
                        case 7:
                            i7 = 4;
                            break;
                        default:
                            i7 = 0;
                            break;
                    }
                    for (int i15 = 0; i15 < i7; i15++) {
                        cVar.b();
                        cVar.a(4);
                        cVar.a(4);
                        cVar.a(3);
                        cVar.a(2);
                        boolean zB = cVar.b();
                        boolean zB2 = cVar.b();
                        if (zB) {
                            cVar.a(2);
                            cVar.b();
                            cVar.a(2);
                        }
                        if (zB2) {
                            cVar.a(2);
                            cVar.a(2);
                            cVar.b();
                        }
                        cVar.b();
                    }
                }
                while (cVar.a(4) != 0) {
                    int iA10 = cVar.a(4);
                    if (iA10 == i10) {
                        iA2 = cVar.a(8);
                        iA10 += iA2;
                    } else {
                        iA2 = 0;
                    }
                    if (iA2 == 255) {
                        iA10 += cVar.a(16);
                    }
                    for (int i16 = 0; i16 < iA10; i16++) {
                        cVar.a(8);
                    }
                    i10 = 15;
                }
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i17 = this.f8692e;
        if (i17 != 17 && i17 != 39) {
            switch (i17) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                case 27:
                    iA = cVar.a(2);
                    this.f8704q = iA;
                    if (iA != 2) {
                    }
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
        }
        iA = cVar.a(2);
        this.f8704q = iA;
        if (iA != 2 || iA == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (iA == 3) {
            int iA11 = cVar.a(1);
            this.f8705r = iA11;
            if (iA11 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f8696i == 5 || (cVar.f8716a.limit() * 8) - cVar.f8718c < 16) {
            return;
        }
        int iA12 = cVar.a(11);
        this.f8706s = iA12;
        if (iA12 == 695) {
            int iC2 = c(cVar);
            this.f8696i = iC2;
            if (iC2 == 5) {
                boolean zB3 = cVar.b();
                this.f8697j = zB3;
                if (zB3) {
                    int iA13 = cVar.a(4);
                    this.f8699l = iA13;
                    if (iA13 == 15) {
                        this.f8700m = cVar.a(24);
                    }
                    if ((cVar.f8716a.limit() * 8) - cVar.f8718c >= 12) {
                        int iA14 = cVar.a(11);
                        this.f8706s = iA14;
                        if (iA14 == 1352) {
                            this.f8698k = cVar.b();
                        }
                    }
                }
            }
            if (this.f8696i == 22) {
                boolean zB4 = cVar.b();
                this.f8697j = zB4;
                if (zB4) {
                    int iA15 = cVar.a(4);
                    this.f8699l = iA15;
                    if (iA15 == 15) {
                        this.f8700m = cVar.a(24);
                    }
                }
                this.f8701n = cVar.a(4);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8672B == aVar.f8672B && this.f8671A == aVar.f8671A && this.f8673C == aVar.f8673C && this.f8692e == aVar.f8692e && this.f8695h == aVar.f8695h && this.f8708v == aVar.f8708v && this.f8707u == aVar.f8707u && this.f8705r == aVar.f8705r && this.f8704q == aVar.f8704q && this.f8681K == aVar.f8681K && this.f8696i == aVar.f8696i && this.f8701n == aVar.f8701n && this.f8709w == aVar.f8709w && this.f8674D == aVar.f8674D && this.f8700m == aVar.f8700m && this.f8699l == aVar.f8699l && this.f8703p == aVar.f8703p && this.t == aVar.t && this.f8675E == aVar.f8675E && this.f8687Q == aVar.f8687Q && this.f8688R == aVar.f8688R && this.f8689S == aVar.f8689S && this.f8686P == aVar.f8686P && this.f8684N == aVar.f8684N && this.f8683M == aVar.f8683M && this.f8685O == aVar.f8685O && this.f8680J == aVar.f8680J && this.f8679I == aVar.f8679I && this.f8676F == aVar.f8676F && this.f8710x == aVar.f8710x && this.f8712z == aVar.f8712z && this.f8711y == aVar.f8711y && this.f8678H == aVar.f8678H && this.f8677G == aVar.f8677G && this.f8690T == aVar.f8690T && this.f8698k == aVar.f8698k && this.f8702o == aVar.f8702o && this.f8694g == aVar.f8694g && this.f8693f == aVar.f8693f && this.f8697j == aVar.f8697j && this.f8706s == aVar.f8706s && this.f8682L == aVar.f8682L && Arrays.equals(this.f8691d, aVar.f8691d);
    }

    public final int hashCode() {
        byte[] bArr = this.f8691d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f8692e) * 31) + this.f8693f) * 31) + this.f8694g) * 31) + this.f8695h) * 31) + this.f8696i) * 31) + (this.f8697j ? 1 : 0)) * 31) + (this.f8698k ? 1 : 0)) * 31) + this.f8699l) * 31) + this.f8700m) * 31) + this.f8701n) * 31) + this.f8702o) * 31) + this.f8703p) * 31) + this.f8704q) * 31) + this.f8705r) * 31) + this.f8706s) * 31) + this.t) * 31) + this.f8707u) * 31) + this.f8708v) * 31) + this.f8709w) * 31) + this.f8710x) * 31) + this.f8711y) * 31) + this.f8712z) * 31) + (this.f8671A ? 1 : 0)) * 31) + (this.f8672B ? 1 : 0)) * 31) + (this.f8673C ? 1 : 0)) * 31) + this.f8674D) * 31) + (this.f8675E ? 1 : 0)) * 31) + this.f8676F) * 31) + this.f8677G) * 31) + this.f8678H) * 31) + this.f8679I) * 31) + this.f8680J) * 31) + this.f8681K) * 31) + this.f8682L) * 31) + this.f8683M) * 31) + this.f8684N) * 31) + this.f8685O) * 31) + this.f8686P) * 31) + this.f8687Q) * 31) + this.f8688R) * 31) + this.f8689S) * 31) + (this.f8690T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb2.append(V1.a.c(0, this.f8691d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f8692e);
        sb2.append(" (");
        HashMap map = f8670V;
        sb2.append((String) map.get(Integer.valueOf(this.f8692e)));
        sb2.append("), samplingFrequencyIndex=");
        sb2.append(this.f8693f);
        sb2.append(" (");
        HashMap map2 = f8669U;
        sb2.append(map2.get(Integer.valueOf(this.f8693f)));
        sb2.append("), samplingFrequency=");
        sb2.append(this.f8694g);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f8695h);
        if (this.f8696i > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f8696i);
            sb2.append(" (");
            sb2.append((String) map.get(Integer.valueOf(this.f8696i)));
            sb2.append("), sbrPresentFlag=");
            sb2.append(this.f8697j);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f8698k);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f8699l);
            sb2.append(" (");
            sb2.append(map2.get(Integer.valueOf(this.f8699l)));
            sb2.append("), extensionSamplingFrequency=");
            sb2.append(this.f8700m);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f8701n);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f8706s);
        if (this.f8675E) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.t);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f8707u);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f8708v);
            sb2.append(", extensionFlag=");
            sb2.append(this.f8709w);
            sb2.append(", layerNr=");
            sb2.append(this.f8710x);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f8711y);
            sb2.append(", layer_length=");
            sb2.append(this.f8712z);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.f8671A);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.f8672B);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.f8673C);
            sb2.append(", extensionFlag3=");
            sb2.append(this.f8674D);
        }
        if (this.f8690T) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.f8676F);
            sb2.append(", paraMode=");
            sb2.append(this.f8677G);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.f8678H);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.f8679I);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.f8680J);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.f8681K);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.f8682L);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.f8683M);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.f8684N);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.f8685O);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.f8686P);
            sb2.append(", hilnContMode=");
            sb2.append(this.f8687Q);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.f8688R);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.f8689S);
        }
        sb2.append('}');
        return sb2.toString();
    }
}

package com.google.android.gms.internal.measurement;

import C0.G;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzaff<T> implements zzafp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzagg.zzp();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzafc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzafz zzm;
    private final zzadg zzn;

    private zzaff(int[] iArr, Object[] objArr, int i7, int i10, zzafc zzafcVar, boolean z3, int[] iArr2, int i11, int i12, zzafh zzafhVar, zzaeo zzaeoVar, zzafz zzafzVar, zzadg zzadgVar, zzaex zzaexVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        this.zzi = zzafcVar instanceof zzadu;
        boolean z8 = false;
        if (zzadgVar != null && (zzafcVar instanceof zzadr)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzm = zzafzVar;
        this.zzn = zzadgVar;
        this.zzg = zzafcVar;
    }

    private final int zzA(int i7) {
        return this.zzc[i7 + 1];
    }

    private final int zzB(int i7) {
        return this.zzc[i7 + 2];
    }

    private static int zzC(int i7) {
        return (i7 >>> 20) & 255;
    }

    private static boolean zzD(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzadu) {
            return ((zzadu) obj).zzch();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int zzG(Object obj, long j6) {
        return ((Integer) zzagg.zzm(obj, j6)).intValue();
    }

    private static long zzH(Object obj, long j6) {
        return ((Long) zzagg.zzm(obj, j6)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i7) {
        return zzK(obj, i7) == zzK(obj2, i7);
    }

    private final boolean zzJ(Object obj, int i7, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzK(obj, i7);
        }
        return (i11 & i12) != 0;
    }

    private final boolean zzK(Object obj, int i7) {
        int iZzB = zzB(i7);
        long j6 = iZzB & 1048575;
        if (j6 != 1048575) {
            return (zzagg.zzc(obj, j6) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i7);
        long j10 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzagg.zzk(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzagg.zzi(obj, j10)) != 0;
            case 2:
                return zzagg.zze(obj, j10) != 0;
            case 3:
                return zzagg.zze(obj, j10) != 0;
            case 4:
                return zzagg.zzc(obj, j10) != 0;
            case 5:
                return zzagg.zze(obj, j10) != 0;
            case 6:
                return zzagg.zzc(obj, j10) != 0;
            case 7:
                return zzagg.zzg(obj, j10);
            case 8:
                Object objZzm = zzagg.zzm(obj, j10);
                if (objZzm instanceof String) {
                    return !((String) objZzm).isEmpty();
                }
                if (objZzm instanceof zzacr) {
                    return !zzacr.zza.equals(objZzm);
                }
                return zzR();
            case 9:
                return zzagg.zzm(obj, j10) != null;
            case 10:
                return !zzacr.zza.equals(zzagg.zzm(obj, j10));
            case 11:
                return zzagg.zzc(obj, j10) != 0;
            case 12:
                return zzagg.zzc(obj, j10) != 0;
            case 13:
                return zzagg.zzc(obj, j10) != 0;
            case 14:
                return zzagg.zze(obj, j10) != 0;
            case 15:
                return zzagg.zzc(obj, j10) != 0;
            case 16:
                return zzagg.zze(obj, j10) != 0;
            case 17:
                return zzagg.zzm(obj, j10) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i7) {
        int iZzB = zzB(i7);
        long j6 = 1048575 & iZzB;
        if (j6 == 1048575) {
            return;
        }
        zzagg.zzd(obj, j6, (1 << (iZzB >>> 20)) | zzagg.zzc(obj, j6));
    }

    private final boolean zzM(Object obj, int i7, int i10) {
        return zzagg.zzc(obj, (long) (zzB(i10) & 1048575)) == i7;
    }

    private final boolean zzN(Object obj, Object obj2, int i7) {
        long jZzB = zzB(i7) & 1048575;
        return zzagg.zzc(obj, jZzB) == zzagg.zzc(obj2, jZzB);
    }

    private final void zzO(Object obj, int i7, int i10) {
        zzagg.zzd(obj, zzB(i10) & 1048575, i7);
    }

    private final int zzP(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzQ(i7, 0);
    }

    private final int zzQ(int i7, int i10) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i7 == i13) {
                return i12;
            }
            if (i7 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final int zzS(byte[] bArr, int i7, int i10, zzagm zzagmVar, Class cls, zzacg zzacgVar) throws IOException {
        zzagm zzagmVar2 = zzagm.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                int i11 = i7 + 8;
                zzacgVar.zzc = Double.valueOf(Double.longBitsToDouble(zzach.zze(bArr, i7)));
                return i11;
            case 1:
                int i12 = i7 + 4;
                zzacgVar.zzc = Float.valueOf(Float.intBitsToFloat(zzach.zzd(bArr, i7)));
                return i12;
            case 2:
            case 3:
                int iZzc = zzach.zzc(bArr, i7, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacgVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzach.zza(bArr, i7, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacgVar.zza);
                return iZza;
            case 5:
            case 15:
                int i13 = i7 + 8;
                zzacgVar.zzc = Long.valueOf(zzach.zze(bArr, i7));
                return i13;
            case 6:
            case 14:
                int i14 = i7 + 4;
                zzacgVar.zzc = Integer.valueOf(zzach.zzd(bArr, i7));
                return i14;
            case 7:
                int iZzc2 = zzach.zzc(bArr, i7, zzacgVar);
                zzacgVar.zzc = Boolean.valueOf(zzacgVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzach.zzf(bArr, i7, zzacgVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzach.zzh(zzafl.zza().zzb(cls), bArr, i7, i10, zzacgVar);
            case 11:
                return zzach.zzg(bArr, i7, zzacgVar);
            case 16:
                int iZza2 = zzach.zza(bArr, i7, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacv.zzR(zzacgVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzach.zzc(bArr, i7, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacv.zzS(zzacgVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzT(int i7, Object obj, zzago zzagoVar) throws IOException {
        if (obj instanceof String) {
            zzagoVar.zzm(i7, (String) obj);
        } else {
            zzagoVar.zzn(i7, (zzacr) obj);
        }
    }

    public static zzaga zzh(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.zza()) {
            return zzagaVar;
        }
        zzaga zzagaVarZzb = zzaga.zzb();
        zzaduVar.zzc = zzagaVarZzb;
        return zzagaVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    /* JADX WARN: Code duplicated, block: B:130:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:171:0x0347  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:194:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c3  */
    public static zzaff zzm(Class cls, zzaez zzaezVar, zzafh zzafhVar, zzaeo zzaeoVar, zzafz zzafzVar, zzadg zzadgVar, zzaex zzaexVar) {
        int i7;
        int iCharAt;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int i28;
        char c6;
        int i29;
        int i30;
        int i31;
        int i32;
        Field fieldZzn;
        int iObjectFieldOffset2;
        int i33;
        char cCharAt8;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        Object obj;
        Field fieldZzn2;
        int i43;
        Object obj2;
        Field fieldZzn3;
        int i44;
        char cCharAt9;
        int i45;
        char cCharAt10;
        int i46;
        char cCharAt11;
        int i47;
        char cCharAt12;
        if (!(zzaezVar instanceof zzafn)) {
            throw null;
        }
        zzafn zzafnVar = (zzafn) zzaezVar;
        String strZzd = zzafnVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i48 = 1;
            while (true) {
                i7 = i48 + 1;
                if (strZzd.charAt(i48) < 55296) {
                    break;
                }
                i48 = i7;
            }
        } else {
            i7 = 1;
        }
        int i49 = i7 + 1;
        int iCharAt2 = strZzd.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i50 = iCharAt2 & 8191;
            int i51 = 13;
            while (true) {
                i47 = i49 + 1;
                cCharAt12 = strZzd.charAt(i49);
                if (cCharAt12 < 55296) {
                    break;
                }
                i50 |= (cCharAt12 & 8191) << i51;
                i51 += 13;
                i49 = i47;
            }
            iCharAt2 = i50 | (cCharAt12 << i51);
            i49 = i47;
        }
        if (iCharAt2 == 0) {
            i14 = 0;
            i12 = 0;
            iCharAt = 0;
            i13 = 0;
            i11 = 0;
            i15 = 0;
            iArr = zza;
            i10 = 0;
        } else {
            int i52 = i49 + 1;
            int iCharAt3 = strZzd.charAt(i49);
            if (iCharAt3 >= 55296) {
                int i53 = iCharAt3 & 8191;
                int i54 = 13;
                while (true) {
                    i23 = i52 + 1;
                    cCharAt7 = strZzd.charAt(i52);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i23;
                }
                iCharAt3 = i53 | (cCharAt7 << i54);
                i52 = i23;
            }
            int i55 = i52 + 1;
            int iCharAt4 = strZzd.charAt(i52);
            if (iCharAt4 >= 55296) {
                int i56 = iCharAt4 & 8191;
                int i57 = 13;
                while (true) {
                    i22 = i55 + 1;
                    cCharAt6 = strZzd.charAt(i55);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i22;
                }
                iCharAt4 = i56 | (cCharAt6 << i57);
                i55 = i22;
            }
            int i58 = i55 + 1;
            int iCharAt5 = strZzd.charAt(i55);
            if (iCharAt5 >= 55296) {
                int i59 = iCharAt5 & 8191;
                int i60 = 13;
                while (true) {
                    i21 = i58 + 1;
                    cCharAt5 = strZzd.charAt(i58);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i21;
                }
                iCharAt5 = i59 | (cCharAt5 << i60);
                i58 = i21;
            }
            int i61 = i58 + 1;
            int iCharAt6 = strZzd.charAt(i58);
            if (iCharAt6 >= 55296) {
                int i62 = iCharAt6 & 8191;
                int i63 = 13;
                while (true) {
                    i20 = i61 + 1;
                    cCharAt4 = strZzd.charAt(i61);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i20;
                }
                iCharAt6 = i62 | (cCharAt4 << i63);
                i61 = i20;
            }
            int i64 = i61 + 1;
            iCharAt = strZzd.charAt(i61);
            if (iCharAt >= 55296) {
                int i65 = iCharAt & 8191;
                int i66 = 13;
                while (true) {
                    i19 = i64 + 1;
                    cCharAt3 = strZzd.charAt(i64);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i19;
                }
                iCharAt = i65 | (cCharAt3 << i66);
                i64 = i19;
            }
            int i67 = i64 + 1;
            int iCharAt7 = strZzd.charAt(i64);
            if (iCharAt7 >= 55296) {
                int i68 = iCharAt7 & 8191;
                int i69 = 13;
                while (true) {
                    i18 = i67 + 1;
                    cCharAt2 = strZzd.charAt(i67);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i18;
                }
                iCharAt7 = i68 | (cCharAt2 << i69);
                i67 = i18;
            }
            int i70 = i67 + 1;
            if (strZzd.charAt(i67) >= 55296) {
                while (true) {
                    i17 = i70 + 1;
                    if (strZzd.charAt(i70) < 55296) {
                        break;
                    }
                    i70 = i17;
                }
                i70 = i17;
            }
            int i71 = i70 + 1;
            int iCharAt8 = strZzd.charAt(i70);
            if (iCharAt8 >= 55296) {
                int i72 = iCharAt8 & 8191;
                int i73 = 13;
                while (true) {
                    i16 = i71 + 1;
                    cCharAt = strZzd.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i72 |= (cCharAt & 8191) << i73;
                    i73 += 13;
                    i71 = i16;
                }
                iCharAt8 = i72 | (cCharAt << i73);
                i71 = i16;
            }
            int i74 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            i10 = iCharAt3;
            i49 = i71;
            i11 = iCharAt6;
            i12 = i74;
            iArr = iArr2;
            int i75 = iCharAt7;
            i13 = iCharAt5;
            i14 = i75;
            i15 = iCharAt8;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzafnVar.zze();
        Class<?> cls2 = zzafnVar.zzb().getClass();
        int i76 = i15 + i14;
        int i77 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i77];
        int i78 = i15;
        int i79 = i76;
        int i80 = 0;
        int i81 = 0;
        while (i49 < length) {
            int i82 = i49 + 1;
            int iCharAt9 = strZzd.charAt(i49);
            if (iCharAt9 >= c10) {
                int i83 = iCharAt9 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i46 = i84 + 1;
                    cCharAt11 = strZzd.charAt(i84);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i83 |= (cCharAt11 & 8191) << i85;
                    i85 += 13;
                    i84 = i46;
                }
                iCharAt9 = i83 | (cCharAt11 << i85);
                i24 = i46;
            } else {
                i24 = i82;
            }
            int i86 = i24 + 1;
            int iCharAt10 = strZzd.charAt(i24);
            if (iCharAt10 >= c10) {
                int i87 = iCharAt10 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i45 = i88 + 1;
                    cCharAt10 = strZzd.charAt(i88);
                    if (cCharAt10 < c10) {
                        break;
                    }
                    i87 |= (cCharAt10 & 8191) << i89;
                    i89 += 13;
                    i88 = i45;
                }
                iCharAt10 = i87 | (cCharAt10 << i89);
                i25 = i45;
            } else {
                i25 = i86;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i80] = i81;
                i80++;
            }
            int i90 = iCharAt10 & 255;
            zzafn zzafnVar2 = zzafnVar;
            int i91 = iCharAt10 & 2048;
            if (i90 >= 51) {
                int i92 = i25 + 1;
                int iCharAt11 = strZzd.charAt(i25);
                char c11 = 55296;
                if (iCharAt11 >= 55296) {
                    int i93 = iCharAt11 & 8191;
                    int i94 = i92;
                    int i95 = 13;
                    while (true) {
                        i44 = i94 + 1;
                        cCharAt9 = strZzd.charAt(i94);
                        if (cCharAt9 < c11) {
                            break;
                        }
                        i93 |= (cCharAt9 & 8191) << i95;
                        i95 += 13;
                        i94 = i44;
                        c11 = 55296;
                    }
                    iCharAt11 = i93 | (cCharAt9 << i95);
                    i39 = i44;
                } else {
                    i39 = i92;
                }
                i29 = i39;
                int i96 = i90 - 51;
                i26 = length;
                if (i96 == 9 || i96 == 17) {
                    i40 = i12 + 1;
                    int i97 = i81 / 3;
                    objArr[i97 + i97 + 1] = objArrZze[i12];
                } else {
                    if (i96 != 12) {
                        i41 = i91;
                    } else if (zzafnVar2.zzc() == 1 || i91 != 0) {
                        i40 = i12 + 1;
                        int i98 = i81 / 3;
                        objArr[i98 + i98 + 1] = objArrZze[i12];
                    } else {
                        i41 = 0;
                    }
                    i42 = iCharAt11 + iCharAt11;
                    obj = objArrZze[i42];
                    i91 = i41;
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i42] = fieldZzn2;
                        iArr[i79] = i81;
                        i79++;
                    }
                    int i99 = i10;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i43 = i42 + 1;
                    obj2 = objArrZze[i43];
                    i27 = i99;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i43] = fieldZzn3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    strZzd = strZzd;
                    i31 = iObjectFieldOffset3;
                    i32 = 0;
                    c6 = 55296;
                }
                i12 = i40;
                i41 = i91;
                i42 = iCharAt11 + iCharAt11;
                obj = objArrZze[i42];
                i91 = i41;
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i42] = fieldZzn2;
                    iArr[i79] = i81;
                    i79++;
                }
                int i910 = i10;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzn2);
                i43 = i42 + 1;
                obj2 = objArrZze[i43];
                i27 = i910;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i43] = fieldZzn3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i31 = iObjectFieldOffset4;
                i32 = 0;
                c6 = 55296;
            } else {
                i26 = length;
                i27 = i10;
                int i100 = i12 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i12]);
                if (i90 == 9 || i90 == 17) {
                    int i101 = i81 / 3;
                    objArr[i101 + i101 + 1] = fieldZzn4.getType();
                } else {
                    if (i90 != 27) {
                        if (i90 == 49) {
                            i12 += 2;
                            i34 = 1;
                        } else if (i90 == 12 || i90 == 30 || i90 == 44) {
                            if (zzafnVar2.zzc() == 1 || i91 != 0) {
                                i12 += 2;
                                int i102 = i81 / 3;
                                objArr[i102 + i102 + 1] = objArrZze[i100];
                            } else {
                                i12 = i100;
                                i91 = 0;
                            }
                        } else if (i90 == 50) {
                            int i103 = i12 + 2;
                            int i104 = i78 + 1;
                            iArr[i78] = i81;
                            int i105 = i81 / 3;
                            int i106 = i105 + i105;
                            objArr[i106] = objArrZze[i100];
                            if (i91 != 0) {
                                objArr[i106 + 1] = objArrZze[i103];
                                i12 += 3;
                                i78 = i104;
                            } else {
                                i12 = i103;
                                i78 = i104;
                                i91 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                        i28 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i90 > 17) {
                            c6 = 55296;
                            i29 = i25;
                            i30 = i91;
                            i31 = iObjectFieldOffset;
                            i32 = 0;
                        } else {
                            int i107 = i25 + 1;
                            int iCharAt12 = strZzd.charAt(i25);
                            if (iCharAt12 >= 55296) {
                                int i108 = iCharAt12 & 8191;
                                int i109 = 13;
                                while (true) {
                                    i33 = i107 + 1;
                                    cCharAt8 = strZzd.charAt(i107);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i108 |= (cCharAt8 & 8191) << i109;
                                    i109 += 13;
                                    i107 = i33;
                                }
                                iCharAt12 = i108 | (cCharAt8 << i109);
                                i107 = i33;
                            }
                            int i110 = (iCharAt12 / 32) + i27 + i27;
                            Object obj3 = objArrZze[i110];
                            int i111 = i107;
                            if (obj3 instanceof Field) {
                                fieldZzn = (Field) obj3;
                            } else {
                                fieldZzn = zzn(cls2, (String) obj3);
                                objArrZze[i110] = fieldZzn;
                            }
                            int i112 = iCharAt12;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn);
                            int i113 = i112 % 32;
                            i31 = iObjectFieldOffset;
                            i29 = i111;
                            c6 = 55296;
                            i32 = i113;
                        }
                        int i114 = i81 + 1;
                        iArr3[i81] = iCharAt9;
                        int i115 = i81 + 2;
                        i35 = i30;
                        if ((iCharAt10 & 512) != 0) {
                            i36 = 536870912;
                        } else {
                            i36 = 0;
                        }
                        if ((iCharAt10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                            i37 = 268435456;
                        } else {
                            i37 = 0;
                        }
                        if (i35 != 0) {
                            i38 = Integer.MIN_VALUE;
                        } else {
                            i38 = 0;
                        }
                        iArr3[i114] = i36 | i37 | i38 | (i90 << 20) | i31;
                        i81 += 3;
                        iArr3[i115] = (i32 << 20) | i28;
                        strZzd = strZzd;
                        c10 = c6;
                        zzafnVar = zzafnVar2;
                        i49 = i29;
                        length = i26;
                        i10 = i27;
                    } else {
                        i34 = 1;
                        i12 += 2;
                    }
                    int i116 = i81 / 3;
                    objArr[i116 + i116 + i34] = objArrZze[i100];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    i28 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    c6 = 55296;
                    i29 = i25;
                    i30 = i91;
                    i31 = iObjectFieldOffset;
                    i32 = 0;
                    int i117 = i81 + 1;
                    iArr3[i81] = iCharAt9;
                    int i118 = i81 + 2;
                    i35 = i30;
                    if ((iCharAt10 & 512) != 0) {
                        i36 = 536870912;
                    } else {
                        i36 = 0;
                    }
                    if ((iCharAt10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                        i37 = 268435456;
                    } else {
                        i37 = 0;
                    }
                    if (i35 != 0) {
                        i38 = Integer.MIN_VALUE;
                    } else {
                        i38 = 0;
                    }
                    iArr3[i117] = i36 | i37 | i38 | (i90 << 20) | i31;
                    i81 += 3;
                    iArr3[i118] = (i32 << 20) | i28;
                    strZzd = strZzd;
                    c10 = c6;
                    zzafnVar = zzafnVar2;
                    i49 = i29;
                    length = i26;
                    i10 = i27;
                }
                i12 = i100;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                i28 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                }
                c6 = 55296;
                i29 = i25;
                i30 = i91;
                i31 = iObjectFieldOffset;
                i32 = 0;
                int i119 = i81 + 1;
                iArr3[i81] = iCharAt9;
                int i1110 = i81 + 2;
                i35 = i30;
                if ((iCharAt10 & 512) != 0) {
                    i36 = 536870912;
                } else {
                    i36 = 0;
                }
                if ((iCharAt10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                    i37 = 268435456;
                } else {
                    i37 = 0;
                }
                if (i35 != 0) {
                    i38 = Integer.MIN_VALUE;
                } else {
                    i38 = 0;
                }
                iArr3[i119] = i36 | i37 | i38 | (i90 << 20) | i31;
                i81 += 3;
                iArr3[i1110] = (i32 << 20) | i28;
                strZzd = strZzd;
                c10 = c6;
                zzafnVar = zzafnVar2;
                i49 = i29;
                length = i26;
                i10 = i27;
            }
            i28 = iObjectFieldOffset2;
            i30 = i91;
            int i1111 = i81 + 1;
            iArr3[i81] = iCharAt9;
            int i1112 = i81 + 2;
            i35 = i30;
            if ((iCharAt10 & 512) != 0) {
                i36 = 536870912;
            } else {
                i36 = 0;
            }
            if ((iCharAt10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                i37 = 268435456;
            } else {
                i37 = 0;
            }
            if (i35 != 0) {
                i38 = Integer.MIN_VALUE;
            } else {
                i38 = 0;
            }
            iArr3[i1111] = i36 | i37 | i38 | (i90 << 20) | i31;
            i81 += 3;
            iArr3[i1112] = (i32 << 20) | i28;
            strZzd = strZzd;
            c10 = c6;
            zzafnVar = zzafnVar2;
            i49 = i29;
            length = i26;
            i10 = i27;
        }
        return new zzaff(iArr3, objArr, i13, i11, zzafnVar.zzb(), false, iArr, i15, i76, zzafhVar, zzaeoVar, zzafzVar, zzadgVar, zzaexVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(d.c(11, str) + name.length() + 29 + String.valueOf(string).length());
            u.x(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(G.r(sb2, " not found. Known fields are ", string), e10);
        }
    }

    private final void zzo(Object obj, Object obj2, int i7) {
        if (zzK(obj2, i7)) {
            int iZzA = zzA(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j6 = iZzA;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i10 = this.zzc[i7];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i10);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzafp zzafpVarZzq = zzq(i7);
            if (!zzK(obj, i7)) {
                if (zzE(object)) {
                    Object objZza = zzafpVarZzq.zza();
                    zzafpVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j6, objZza);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                zzL(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!zzE(object2)) {
                Object objZza2 = zzafpVarZzq.zza();
                zzafpVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j6, objZza2);
                object2 = objZza2;
            }
            zzafpVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i7) {
        int[] iArr = this.zzc;
        int i10 = iArr[i7];
        if (zzM(obj2, i10, i7)) {
            int iZzA = zzA(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j6 = iZzA;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                int i11 = iArr[i7];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzafp zzafpVarZzq = zzq(i7);
            if (!zzM(obj, i10, i7)) {
                if (zzE(object)) {
                    Object objZza = zzafpVarZzq.zza();
                    zzafpVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j6, objZza);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                zzO(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!zzE(object2)) {
                Object objZza2 = zzafpVarZzq.zza();
                zzafpVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j6, objZza2);
                object2 = objZza2;
            }
            zzafpVarZzq.zzd(object2, object);
        }
    }

    private final zzafp zzq(int i7) {
        Object[] objArr = this.zzd;
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        zzafp zzafpVar = (zzafp) objArr[i11];
        if (zzafpVar != null) {
            return zzafpVar;
        }
        zzafp zzafpVarZzb = zzafl.zza().zzb((Class) objArr[i11 + 1]);
        objArr[i11] = zzafpVarZzb;
        return zzafpVarZzb;
    }

    private final Object zzr(int i7) {
        int i10 = i7 / 3;
        return this.zzd[i10 + i10];
    }

    private final zzadz zzs(int i7) {
        int i10 = i7 / 3;
        return (zzadz) this.zzd[i10 + i10 + 1];
    }

    private final Object zzt(Object obj, int i7) {
        zzafp zzafpVarZzq = zzq(i7);
        int iZzA = zzA(i7) & 1048575;
        if (!zzK(obj, i7)) {
            return zzafpVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzafpVarZzq.zza();
        if (object != null) {
            zzafpVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzA(i7) & 1048575, obj2);
        zzL(obj, i7);
    }

    private final Object zzv(Object obj, int i7, int i10) {
        zzafp zzafpVarZzq = zzq(i10);
        if (!zzM(obj, i7, i10)) {
            return zzafpVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i10) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzafpVarZzq.zza();
        if (object != null) {
            zzafpVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i7, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzO(obj, i7, i10);
    }

    private final Object zzx(Object obj, int i7, Object obj2, zzafz zzafzVar, Object obj3) {
        zzadz zzadzVarZzs;
        int i10 = this.zzc[i7];
        Object objZzm = zzagg.zzm(obj, zzA(i7) & 1048575);
        if (objZzm == null || (zzadzVarZzs = zzs(i7)) == null) {
            return obj2;
        }
        zzaeu zzaeuVarZze = ((zzaev) zzr(i7)).zze();
        Iterator it = ((zzaew) objZzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzadzVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzafzVar.zzh(obj3);
                }
                int iZzc = zzaev.zzc(zzaeuVarZze, entry.getKey(), entry.getValue());
                zzacr zzacrVar = zzacr.zza;
                byte[] bArr = new byte[iZzc];
                int i11 = zzada.zzb;
                zzacx zzacxVar = new zzacx(bArr, 0, iZzc);
                try {
                    zzaev.zzb(zzacxVar, zzaeuVarZze, entry.getKey(), entry.getValue());
                    zzafzVar.zzd(obj2, i10, zzaco.zza(zzacxVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i7, zzafp zzafpVar) {
        return zzafpVar.zzl(zzagg.zzm(obj, i7 & 1048575));
    }

    private final void zzz(Object obj, int i7, zzafo zzafoVar) throws IOException {
        long j6 = i7 & 1048575;
        if (zzD(i7)) {
            zzagg.zzn(obj, j6, zzafoVar.zzn());
        } else if (this.zzi) {
            zzagg.zzn(obj, j6, zzafoVar.zzm());
        } else {
            zzagg.zzn(obj, j6, zzafoVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final Object zza() {
        return ((zzadu) this.zzg).zzck();
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzC;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzA = zzA(i7);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j6 = iZzA & 1048575;
                switch (iZzC) {
                    case 0:
                        if (!zzI(obj, obj2, i7) || Double.doubleToLongBits(zzagg.zzk(obj, j6)) != Double.doubleToLongBits(zzagg.zzk(obj2, j6))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzI(obj, obj2, i7) || Float.floatToIntBits(zzagg.zzi(obj, j6)) != Float.floatToIntBits(zzagg.zzi(obj2, j6))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzI(obj, obj2, i7) || zzagg.zze(obj, j6) != zzagg.zze(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzI(obj, obj2, i7) || zzagg.zze(obj, j6) != zzagg.zze(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzI(obj, obj2, i7) || zzagg.zzc(obj, j6) != zzagg.zzc(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzI(obj, obj2, i7) || zzagg.zze(obj, j6) != zzagg.zze(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzI(obj, obj2, i7) || zzagg.zzc(obj, j6) != zzagg.zzc(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzI(obj, obj2, i7) || zzagg.zzg(obj, j6) != zzagg.zzg(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzI(obj, obj2, i7) || !zzafq.zzC(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzI(obj, obj2, i7) || !zzafq.zzC(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzI(obj, obj2, i7) || !zzafq.zzC(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzI(obj, obj2, i7) || zzagg.zzc(obj, j6) != zzagg.zzc(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzI(obj, obj2, i7) || zzagg.zzc(obj, j6) != zzagg.zzc(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzI(obj, obj2, i7) || zzagg.zzc(obj, j6) != zzagg.zzc(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzI(obj, obj2, i7) || zzagg.zze(obj, j6) != zzagg.zze(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzI(obj, obj2, i7) || zzagg.zzc(obj, j6) != zzagg.zzc(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzI(obj, obj2, i7) || zzagg.zze(obj, j6) != zzagg.zze(obj2, j6)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzI(obj, obj2, i7) || !zzafq.zzC(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6))) {
                            return false;
                        }
                        continue;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    case 39:
                    case 40:
                    case 41:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    case 48:
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        zZzC = zzafq.zzC(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6));
                        break;
                    case 50:
                        zZzC = zzafq.zzC(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    case 64:
                    case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    case 67:
                    case 68:
                        if (!zzN(obj, obj2, i7) || !zzafq.zzC(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzC) {
                    return false;
                }
            }
        }
        int i10 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i10 >= iArr.length) {
                if (!((zzadu) obj).zzc.equals(((zzadu) obj2).zzc)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzadr) obj).zzb.equals(((zzadr) obj2).zzb);
                }
                return true;
            }
            int i11 = iArr[i10];
            if (!zzN(obj, obj2, i11)) {
                return false;
            }
            if (!zzM(obj, 0, i11)) {
                long jZzA = zzA(i11) & 1048575;
                if (!zzafq.zzC(zzagg.zzm(obj, jZzA), zzagg.zzm(obj2, jZzA))) {
                    return false;
                }
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zzc(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzA = zzA(i12);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j6 = iZzA & 1048575;
                int iHashCode2 = 37;
                switch (iZzC) {
                    case 0:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzagg.zzk(obj, j6));
                        byte[] bArr = zzaed.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + iZzc;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzagg.zzi(obj, j6));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j6);
                        byte[] bArr2 = zzaed.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + iZzc;
                        break;
                    case 3:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j6);
                        byte[] bArr3 = zzaed.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + iZzc;
                        break;
                    case 4:
                        i7 = iHashCode * 53;
                        iZzc = zzagg.zzc(obj, j6);
                        iHashCode = i7 + iZzc;
                        break;
                    case 5:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j6);
                        byte[] bArr4 = zzaed.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + iZzc;
                        break;
                    case 6:
                        i7 = iHashCode * 53;
                        iZzc = zzagg.zzc(obj, j6);
                        iHashCode = i7 + iZzc;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzaed.zza(zzagg.zzg(obj, j6));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzagg.zzm(obj, j6)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzm = zzagg.zzm(obj, j6);
                        if (objZzm != null) {
                            iHashCode2 = objZzm.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j6).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i7 = iHashCode * 53;
                        iZzc = zzagg.zzc(obj, j6);
                        iHashCode = i7 + iZzc;
                        break;
                    case 12:
                        i7 = iHashCode * 53;
                        iZzc = zzagg.zzc(obj, j6);
                        iHashCode = i7 + iZzc;
                        break;
                    case 13:
                        i7 = iHashCode * 53;
                        iZzc = zzagg.zzc(obj, j6);
                        iHashCode = i7 + iZzc;
                        break;
                    case 14:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j6);
                        byte[] bArr5 = zzaed.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + iZzc;
                        break;
                    case 15:
                        i7 = iHashCode * 53;
                        iZzc = zzagg.zzc(obj, j6);
                        iHashCode = i7 + iZzc;
                        break;
                    case 16:
                        i7 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j6);
                        byte[] bArr6 = zzaed.zza;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i7 + iZzc;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzm2 = zzagg.zzm(obj, j6);
                        if (objZzm2 != null) {
                            iHashCode2 = objZzm2.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    case 39:
                    case 40:
                    case 41:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    case 48:
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j6).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j6).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i13 >= iArr.length) {
                int iHashCode3 = ((zzadu) obj).zzc.hashCode() + (iHashCode * 53);
                return this.zzh ? (iHashCode3 * 53) + ((zzadr) obj).zzb.zza.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!zzM(obj, 0, i14)) {
                iHashCode = zzagg.zzm(obj, zzA(i14) & 1048575).hashCode() + (iHashCode * 53);
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i7 >= iArr.length) {
                zzafq.zzE(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzafq.zzD(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i7);
            int i10 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i11 = iArr[i7];
            long j6 = i10;
            switch (iZzC) {
                case 0:
                    if (zzK(obj2, i7)) {
                        zzagg.zzl(obj, j6, zzagg.zzk(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 1:
                    if (zzK(obj2, i7)) {
                        zzagg.zzj(obj, j6, zzagg.zzi(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 2:
                    if (zzK(obj2, i7)) {
                        zzagg.zzf(obj, j6, zzagg.zze(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 3:
                    if (zzK(obj2, i7)) {
                        zzagg.zzf(obj, j6, zzagg.zze(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 4:
                    if (zzK(obj2, i7)) {
                        zzagg.zzd(obj, j6, zzagg.zzc(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 5:
                    if (zzK(obj2, i7)) {
                        zzagg.zzf(obj, j6, zzagg.zze(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 6:
                    if (zzK(obj2, i7)) {
                        zzagg.zzd(obj, j6, zzagg.zzc(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 7:
                    if (zzK(obj2, i7)) {
                        zzagg.zzh(obj, j6, zzagg.zzg(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 8:
                    if (zzK(obj2, i7)) {
                        zzagg.zzn(obj, j6, zzagg.zzm(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i7);
                    break;
                case 10:
                    if (zzK(obj2, i7)) {
                        zzagg.zzn(obj, j6, zzagg.zzm(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 11:
                    if (zzK(obj2, i7)) {
                        zzagg.zzd(obj, j6, zzagg.zzc(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 12:
                    if (zzK(obj2, i7)) {
                        zzagg.zzd(obj, j6, zzagg.zzc(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 13:
                    if (zzK(obj2, i7)) {
                        zzagg.zzd(obj, j6, zzagg.zzc(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 14:
                    if (zzK(obj2, i7)) {
                        zzagg.zzf(obj, j6, zzagg.zze(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 15:
                    if (zzK(obj2, i7)) {
                        zzagg.zzd(obj, j6, zzagg.zzc(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 16:
                    if (zzK(obj2, i7)) {
                        zzagg.zzf(obj, j6, zzagg.zze(obj2, j6));
                        zzL(obj, i7);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                case 39:
                case 40:
                case 41:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                case 48:
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    zzaef zzaefVarZzg = (zzaef) zzagg.zzm(obj, j6);
                    zzaef zzaefVar = (zzaef) zzagg.zzm(obj2, j6);
                    int size = zzaefVarZzg.size();
                    int size2 = zzaefVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzaefVarZzg.zza()) {
                            zzaefVarZzg = zzaefVarZzg.zzg(size2 + size);
                        }
                        zzaefVarZzg.addAll(zzaefVar);
                    }
                    if (size > 0) {
                        zzaefVar = zzaefVarZzg;
                    }
                    zzagg.zzn(obj, j6, zzaefVar);
                    break;
                case 50:
                    int i12 = zzafq.zza;
                    zzagg.zzn(obj, j6, zzaex.zzb(zzagg.zzm(obj, j6), zzagg.zzm(obj2, j6)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i11, i7)) {
                        zzagg.zzn(obj, j6, zzagg.zzm(obj2, j6));
                        zzO(obj, i11, i7);
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    zzp(obj, obj2, i7);
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                case 64:
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                case 67:
                    if (zzM(obj2, i11, i7)) {
                        zzagg.zzn(obj, j6, zzagg.zzm(obj2, j6));
                        zzO(obj, i11, i7);
                    }
                    break;
                case 68:
                    zzp(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zze(Object obj) {
        int i7;
        int iZzE;
        int iZzF;
        int iZzz;
        int iZzE2;
        int size;
        int iZzp;
        int iZzE3;
        int iZzE4;
        int iZzE5;
        int iZzA;
        int iZzE6;
        int iZzF2;
        zzaff<T> zzaffVar = this;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int iA = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = zzaffVar.zzc;
            if (i11 >= iArr.length) {
                int iZzi = ((zzadu) obj).zzc.zzi() + iA;
                if (!zzaffVar.zzh) {
                    return iZzi;
                }
                zzafv zzafvVar = ((zzadr) obj).zzb.zza;
                int iZzc = zzafvVar.zzc();
                int iZzj = 0;
                for (int i14 = 0; i14 < iZzc; i14++) {
                    Map.Entry entryZzd = zzafvVar.zzd(i14);
                    iZzj += zzadk.zzj((zzadj) ((zzafs) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzafvVar.zze()) {
                    iZzj += zzadk.zzj((zzadj) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA2 = zzaffVar.zzA(i11);
            int iZzC = zzC(iZzA2);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & i10;
            if (iZzC <= 17) {
                if (i17 != i13) {
                    i12 = i17 == i10 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i7 = 1 << (i16 >>> 20);
            } else {
                i7 = 0;
            }
            int i18 = iZzA2 & i10;
            if (iZzC >= zzadl.zzJ.zza()) {
                zzadl.zzW.zza();
            }
            long j6 = i18;
            switch (iZzC) {
                case 0:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(i15 << 3, 8, iA);
                    }
                    break;
                case 1:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(i15 << 3, 4, iA);
                    }
                    zzaffVar = this;
                    break;
                case 2:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        long j10 = unsafe.getLong(obj, j6);
                        iZzE = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j10);
                        iA += iZzF + iZzE;
                    }
                    zzaffVar = this;
                    break;
                case 3:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        long j11 = unsafe.getLong(obj, j6);
                        iZzE = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j11);
                        iA += iZzF + iZzE;
                    }
                    zzaffVar = this;
                    break;
                case 4:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        long j12 = unsafe.getInt(obj, j6);
                        iZzE = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j12);
                        iA += iZzF + iZzE;
                    }
                    zzaffVar = this;
                    break;
                case 5:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(i15 << 3, 8, iA);
                    }
                    zzaffVar = this;
                    break;
                case 6:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(i15 << 3, 4, iA);
                    }
                    zzaffVar = this;
                    break;
                case 7:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(i15 << 3, 1, iA);
                    }
                    zzaffVar = this;
                    break;
                case 8:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof zzacr) {
                            int iZzE7 = zzada.zzE(i19);
                            int iZzb = ((zzacr) object).zzb();
                            iA = d.b(iZzb, iZzb, iZzE7, iA);
                        } else {
                            int iZzE8 = zzada.zzE(i19);
                            int iZzb2 = zzagl.zzb((String) object);
                            iA = d.b(iZzb2, iZzb2, iZzE8, iA);
                        }
                    }
                    zzaffVar = this;
                    break;
                case 9:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iZzz = zzafq.zzz(i15, unsafe.getObject(obj, j6), zzaffVar.zzq(i11));
                        iA += iZzz;
                    }
                    break;
                case 10:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(obj, j6);
                        int iZzE9 = zzada.zzE(i15 << 3);
                        int iZzb3 = zzacrVar.zzb();
                        iA = d.b(iZzb3, iZzb3, iZzE9, iA);
                    }
                    zzaffVar = this;
                    break;
                case 11:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(unsafe.getInt(obj, j6), zzada.zzE(i15 << 3), iA);
                    }
                    zzaffVar = this;
                    break;
                case 12:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        long j13 = unsafe.getInt(obj, j6);
                        iZzE = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j13);
                        iA += iZzF + iZzE;
                    }
                    zzaffVar = this;
                    break;
                case 13:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(i15 << 3, 4, iA);
                    }
                    zzaffVar = this;
                    break;
                case 14:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iA = d.a(i15 << 3, 8, iA);
                    }
                    zzaffVar = this;
                    break;
                case 15:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        int i20 = unsafe.getInt(obj, j6);
                        iA = d.a((i20 >> 31) ^ (i20 + i20), zzada.zzE(i15 << 3), iA);
                    }
                    zzaffVar = this;
                    break;
                case 16:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        long j14 = unsafe.getLong(obj, j6);
                        iZzE = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF((j14 >> 63) ^ (j14 + j14));
                        iA += iZzF + iZzE;
                    }
                    zzaffVar = this;
                    break;
                case 17:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i7)) {
                        iZzz = zzafq.zzA(i15, (zzafc) unsafe.getObject(obj, j6), zzaffVar.zzq(i11));
                        iA += iZzz;
                    }
                    break;
                case 18:
                    iZzz = zzafq.zzy(i15, (List) unsafe.getObject(obj, j6), false);
                    iA += iZzz;
                    break;
                case 19:
                    iZzz = zzafq.zzw(i15, (List) unsafe.getObject(obj, j6), false);
                    iA += iZzz;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j6);
                    int i21 = zzafq.zza;
                    if (list.size() == 0) {
                        iZzE2 = 0;
                    } else {
                        iZzE2 = (zzada.zzE(i15 << 3) * list.size()) + zzafq.zzo(list);
                    }
                    iA += iZzE2;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j6);
                    int i22 = zzafq.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzp = zzafq.zzp(list2);
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = (iZzE3 * size) + iZzp;
                    }
                    iA += iZzE4;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j6);
                    int i23 = zzafq.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzp = zzafq.zzs(list3);
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = (iZzE3 * size) + iZzp;
                    }
                    iA += iZzE4;
                    break;
                case 23:
                    iZzz = zzafq.zzy(i15, (List) unsafe.getObject(obj, j6), false);
                    iA += iZzz;
                    break;
                case 24:
                    iZzz = zzafq.zzw(i15, (List) unsafe.getObject(obj, j6), false);
                    iA += iZzz;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(obj, j6);
                    int i24 = zzafq.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzE2 = 0;
                    } else {
                        iZzE2 = (zzada.zzE(i15 << 3) + 1) * size2;
                    }
                    iA += iZzE2;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j6);
                    int i25 = zzafq.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzE4 = zzada.zzE(i15 << 3) * size3;
                        if (list5 instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object objZzc = zzaenVar.zzc();
                                if (objZzc instanceof zzacr) {
                                    int iZzb4 = ((zzacr) objZzc).zzb();
                                    iZzE4 = d.a(iZzb4, iZzb4, iZzE4);
                                } else {
                                    int iZzb5 = zzagl.zzb((String) objZzc);
                                    iZzE4 = d.a(iZzb5, iZzb5, iZzE4);
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzacr) {
                                    int iZzb6 = ((zzacr) obj2).zzb();
                                    iZzE4 = d.a(iZzb6, iZzb6, iZzE4);
                                } else {
                                    int iZzb7 = zzagl.zzb((String) obj2);
                                    iZzE4 = d.a(iZzb7, iZzb7, iZzE4);
                                }
                            }
                        }
                    }
                    iA += iZzE4;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j6);
                    zzafp zzafpVarZzq = zzaffVar.zzq(i11);
                    int i28 = zzafq.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzE5 = 0;
                    } else {
                        iZzE5 = zzada.zzE(i15 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj3 = list6.get(i29);
                            if (obj3 instanceof zzaem) {
                                int iZzb8 = ((zzaem) obj3).zzb();
                                iZzE5 = d.a(iZzb8, iZzb8, iZzE5);
                            } else {
                                int iZzcf = ((zzacb) obj3).zzcf(zzafpVarZzq);
                                iZzE5 = d.a(iZzcf, iZzcf, iZzE5);
                            }
                        }
                    }
                    iA += iZzE5;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j6);
                    int i30 = zzafq.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzE4 = zzada.zzE(i15 << 3) * size5;
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int iZzb9 = ((zzacr) list7.get(i31)).zzb();
                            iZzE4 = d.a(iZzb9, iZzb9, iZzE4);
                        }
                    }
                    iA += iZzE4;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j6);
                    int i32 = zzafq.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzp = zzafq.zzt(list8);
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = (iZzE3 * size) + iZzp;
                    }
                    iA += iZzE4;
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    List list9 = (List) unsafe.getObject(obj, j6);
                    int i33 = zzafq.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzp = zzafq.zzr(list9);
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = (iZzE3 * size) + iZzp;
                    }
                    iA += iZzE4;
                    break;
                case 31:
                    iZzz = zzafq.zzw(i15, (List) unsafe.getObject(obj, j6), false);
                    iA += iZzz;
                    break;
                case 32:
                    iZzz = zzafq.zzy(i15, (List) unsafe.getObject(obj, j6), false);
                    iA += iZzz;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j6);
                    int i34 = zzafq.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzp = zzafq.zzu(list10);
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = (iZzE3 * size) + iZzp;
                    }
                    iA += iZzE4;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j6);
                    int i35 = zzafq.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzE4 = 0;
                    } else {
                        iZzp = zzafq.zzq(list11);
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = (iZzE3 * size) + iZzp;
                    }
                    iA += iZzE4;
                    break;
                case 35:
                    int iZzx = zzafq.zzx((List) unsafe.getObject(obj, j6));
                    if (iZzx > 0) {
                        iA = d.b(iZzx, zzada.zzE(i15 << 3), iZzx, iA);
                    }
                    break;
                case 36:
                    int iZzv = zzafq.zzv((List) unsafe.getObject(obj, j6));
                    if (iZzv > 0) {
                        iA = d.b(iZzv, zzada.zzE(i15 << 3), iZzv, iA);
                    }
                    break;
                case 37:
                    int iZzo = zzafq.zzo((List) unsafe.getObject(obj, j6));
                    if (iZzo > 0) {
                        iA = d.b(iZzo, zzada.zzE(i15 << 3), iZzo, iA);
                    }
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    int iZzp2 = zzafq.zzp((List) unsafe.getObject(obj, j6));
                    if (iZzp2 > 0) {
                        iA = d.b(iZzp2, zzada.zzE(i15 << 3), iZzp2, iA);
                    }
                    break;
                case 39:
                    int iZzs = zzafq.zzs((List) unsafe.getObject(obj, j6));
                    if (iZzs > 0) {
                        iA = d.b(iZzs, zzada.zzE(i15 << 3), iZzs, iA);
                    }
                    break;
                case 40:
                    int iZzx2 = zzafq.zzx((List) unsafe.getObject(obj, j6));
                    if (iZzx2 > 0) {
                        iA = d.b(iZzx2, zzada.zzE(i15 << 3), iZzx2, iA);
                    }
                    break;
                case 41:
                    int iZzv2 = zzafq.zzv((List) unsafe.getObject(obj, j6));
                    if (iZzv2 > 0) {
                        iA = d.b(iZzv2, zzada.zzE(i15 << 3), iZzv2, iA);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j6);
                    int i36 = zzafq.zza;
                    int size6 = list12.size();
                    if (size6 > 0) {
                        iA = d.b(size6, zzada.zzE(i15 << 3), size6, iA);
                    }
                    break;
                case 43:
                    int iZzt = zzafq.zzt((List) unsafe.getObject(obj, j6));
                    if (iZzt > 0) {
                        iA = d.b(iZzt, zzada.zzE(i15 << 3), iZzt, iA);
                    }
                    break;
                case 44:
                    int iZzr = zzafq.zzr((List) unsafe.getObject(obj, j6));
                    if (iZzr > 0) {
                        iA = d.b(iZzr, zzada.zzE(i15 << 3), iZzr, iA);
                    }
                    break;
                case 45:
                    int iZzv3 = zzafq.zzv((List) unsafe.getObject(obj, j6));
                    if (iZzv3 > 0) {
                        iA = d.b(iZzv3, zzada.zzE(i15 << 3), iZzv3, iA);
                    }
                    break;
                case 46:
                    int iZzx3 = zzafq.zzx((List) unsafe.getObject(obj, j6));
                    if (iZzx3 > 0) {
                        iA = d.b(iZzx3, zzada.zzE(i15 << 3), iZzx3, iA);
                    }
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    int iZzu = zzafq.zzu((List) unsafe.getObject(obj, j6));
                    if (iZzu > 0) {
                        iA = d.b(iZzu, zzada.zzE(i15 << 3), iZzu, iA);
                    }
                    break;
                case 48:
                    int iZzq = zzafq.zzq((List) unsafe.getObject(obj, j6));
                    if (iZzq > 0) {
                        iA = d.b(iZzq, zzada.zzE(i15 << 3), iZzq, iA);
                    }
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    List list13 = (List) unsafe.getObject(obj, j6);
                    zzafp zzafpVarZzq2 = zzaffVar.zzq(i11);
                    int i37 = zzafq.zza;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        iZzA = 0;
                    } else {
                        iZzA = 0;
                        for (int i38 = 0; i38 < size7; i38++) {
                            iZzA += zzafq.zzA(i15, (zzafc) list13.get(i38), zzafpVarZzq2);
                        }
                    }
                    iA += iZzA;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(obj, j6);
                    zzaev zzaevVar = (zzaev) zzaffVar.zzr(i11);
                    if (zzaewVar.isEmpty()) {
                        iZzE4 = 0;
                    } else {
                        iZzE4 = 0;
                        for (Map.Entry entry2 : zzaewVar.entrySet()) {
                            iZzE4 += zzaevVar.zzd(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iA += iZzE4;
                    break;
                case 51:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(i15 << 3, 8, iA);
                    }
                    break;
                case 52:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(i15 << 3, 4, iA);
                    }
                    break;
                case 53:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzH = zzH(obj, j6);
                        iZzE6 = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzH);
                        iA += iZzF2 + iZzE6;
                    }
                    break;
                case 54:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzH2 = zzH(obj, j6);
                        iZzE6 = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzH2);
                        iA += iZzF2 + iZzE6;
                    }
                    break;
                case 55:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzG = zzG(obj, j6);
                        iZzE6 = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzG);
                        iA += iZzF2 + iZzE6;
                    }
                    break;
                case 56:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(i15 << 3, 8, iA);
                    }
                    break;
                case 57:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(i15 << 3, 4, iA);
                    }
                    break;
                case 58:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(i15 << 3, 1, iA);
                    }
                    break;
                case 59:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        int i39 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j6);
                        if (object2 instanceof zzacr) {
                            int iZzE10 = zzada.zzE(i39);
                            int iZzb10 = ((zzacr) object2).zzb();
                            iA = d.b(iZzb10, iZzb10, iZzE10, iA);
                        } else {
                            int iZzE11 = zzada.zzE(i39);
                            int iZzb11 = zzagl.zzb((String) object2);
                            iA = d.b(iZzb11, iZzb11, iZzE11, iA);
                        }
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzz = zzafq.zzz(i15, unsafe.getObject(obj, j6), zzaffVar.zzq(i11));
                        iA += iZzz;
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(obj, j6);
                        int iZzE12 = zzada.zzE(i15 << 3);
                        int iZzb12 = zzacrVar2.zzb();
                        iA = d.b(iZzb12, iZzb12, iZzE12, iA);
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(zzG(obj, j6), zzada.zzE(i15 << 3), iA);
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzG2 = zzG(obj, j6);
                        iZzE6 = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzG2);
                        iA += iZzF2 + iZzE6;
                    }
                    break;
                case 64:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(i15 << 3, 4, iA);
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iA = d.a(i15 << 3, 8, iA);
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        int iZzG = zzG(obj, j6);
                        iA = d.a((iZzG >> 31) ^ (iZzG + iZzG), zzada.zzE(i15 << 3), iA);
                    }
                    break;
                case 67:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzH3 = zzH(obj, j6);
                        iZzE6 = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF((jZzH3 >> 63) ^ (jZzH3 + jZzH3));
                        iA += iZzF2 + iZzE6;
                    }
                    break;
                case 68:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzz = zzafq.zzA(i15, (zzafc) unsafe.getObject(obj, j6), zzaffVar.zzq(i11));
                        iA += iZzz;
                    }
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzf(Object obj, zzago zzagoVar) throws IOException {
        Map.Entry entry;
        int i7;
        zzaff<T> zzaffVar = this;
        if (zzaffVar.zzh) {
            zzadk zzadkVar = ((zzadr) obj).zzb;
            if (zzadkVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzadkVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzaffVar.zzc;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < iArr.length) {
            int iZzA = zzaffVar.zzA(i12);
            int iZzC = zzC(iZzA);
            int i14 = iArr[i12];
            if (iZzC <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i7 = 1 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j6 = iZzA & i10;
            switch (iZzC) {
                case 0:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzf(i14, zzagg.zzk(obj, j6));
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 1:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zze(i14, zzagg.zzi(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 2:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzc(i14, unsafe.getLong(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 3:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzh(i14, unsafe.getLong(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 4:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzi(i14, unsafe.getInt(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 5:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzj(i14, unsafe.getLong(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 6:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzk(i14, unsafe.getInt(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 7:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzl(i14, zzagg.zzg(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 8:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzT(i14, unsafe.getObject(obj, j6), zzagoVar);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 9:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzr(i14, unsafe.getObject(obj, j6), zzaffVar.zzq(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 10:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzn(i14, (zzacr) unsafe.getObject(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 11:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzo(i14, unsafe.getInt(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 12:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzg(i14, unsafe.getInt(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 13:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzb(i14, unsafe.getInt(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 14:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzd(i14, unsafe.getLong(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 15:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzp(i14, unsafe.getInt(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 16:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzq(i14, unsafe.getLong(obj, j6));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 17:
                    if (zzaffVar.zzJ(obj, i12, i11, i13, i7)) {
                        zzagoVar.zzs(i14, unsafe.getObject(obj, j6), zzaffVar.zzq(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 18:
                    zzafq.zza(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 19:
                    zzafq.zzb(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 20:
                    zzafq.zzc(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 21:
                    zzafq.zzd(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 22:
                    zzafq.zzh(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 23:
                    zzafq.zzf(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 24:
                    zzafq.zzk(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    zzafq.zzn(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 26:
                    int i17 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j6);
                    int i18 = zzafq.zza;
                    if (list != null && !list.isEmpty()) {
                        zzagoVar.zzF(i17, list);
                    }
                    break;
                case 27:
                    int i19 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    zzafp zzafpVarZzq = zzaffVar.zzq(i12);
                    int i20 = zzafq.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            ((zzadb) zzagoVar).zzr(i19, list2.get(i21), zzafpVarZzq);
                        }
                    }
                    break;
                case 28:
                    int i22 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    int i23 = zzafq.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzagoVar.zzG(i22, list3);
                    }
                    break;
                case 29:
                    zzafq.zzi(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    zzafq.zzm(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 31:
                    zzafq.zzl(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 32:
                    zzafq.zzg(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 33:
                    zzafq.zzj(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 34:
                    zzafq.zze(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzaffVar = this;
                    break;
                case 35:
                    zzafq.zza(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 36:
                    zzafq.zzb(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 37:
                    zzafq.zzc(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    zzafq.zzd(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 39:
                    zzafq.zzh(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 40:
                    zzafq.zzf(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 41:
                    zzafq.zzk(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    zzafq.zzn(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 43:
                    zzafq.zzi(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 44:
                    zzafq.zzm(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 45:
                    zzafq.zzl(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 46:
                    zzafq.zzg(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    zzafq.zzj(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case 48:
                    zzafq.zze(iArr[i12], (List) unsafe.getObject(obj, j6), zzagoVar, true);
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    int i24 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    zzafp zzafpVarZzq2 = zzaffVar.zzq(i12);
                    int i25 = zzafq.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            ((zzadb) zzagoVar).zzs(i24, list4.get(i26), zzafpVarZzq2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j6);
                    if (object != null) {
                        zzagoVar.zzM(i14, ((zzaev) zzaffVar.zzr(i12)).zze(), (zzaew) object);
                    }
                    break;
                case 51:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzf(i14, ((Double) zzagg.zzm(obj, j6)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zze(i14, ((Float) zzagg.zzm(obj, j6)).floatValue());
                    }
                    break;
                case 53:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzc(i14, zzH(obj, j6));
                    }
                    break;
                case 54:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzh(i14, zzH(obj, j6));
                    }
                    break;
                case 55:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzi(i14, zzG(obj, j6));
                    }
                    break;
                case 56:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzj(i14, zzH(obj, j6));
                    }
                    break;
                case 57:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzk(i14, zzG(obj, j6));
                    }
                    break;
                case 58:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzl(i14, ((Boolean) zzagg.zzm(obj, j6)).booleanValue());
                    }
                    break;
                case 59:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzT(i14, unsafe.getObject(obj, j6), zzagoVar);
                    }
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzr(i14, unsafe.getObject(obj, j6), zzaffVar.zzq(i12));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzn(i14, (zzacr) unsafe.getObject(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzo(i14, zzG(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzg(i14, zzG(obj, j6));
                    }
                    break;
                case 64:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzb(i14, zzG(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzd(i14, zzH(obj, j6));
                    }
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzp(i14, zzG(obj, j6));
                    }
                    break;
                case 67:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzq(i14, zzH(obj, j6));
                    }
                    break;
                case 68:
                    if (zzaffVar.zzM(obj, i14, i12)) {
                        zzagoVar.zzs(i14, unsafe.getObject(obj, j6), zzaffVar.zzq(i12));
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
            zzaffVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzadu) obj).zzc.zzg(zzagoVar);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0581 A[LOOP:2: B:180:0x057d->B:182:0x0581, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0593  */
    /* JADX WARN: Code duplicated, block: B:187:0x0597  */
    /* JADX WARN: Code duplicated, block: B:198:0x05ad A[LOOP:1: B:196:0x05a9->B:198:0x05ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:214:0x0569 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzg(Object obj, zzafo zzafoVar, zzadf zzadfVar) throws Throwable {
        zzaff<T> zzaffVar;
        Object obj2;
        Throwable th;
        int i7;
        Object objZzx;
        zzafz zzafzVar;
        Object objZzx2;
        Object obj3;
        zzaff<T> zzaffVar2;
        int i10;
        zzadfVar.getClass();
        zzF(obj);
        zzafz zzafzVar2 = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzafoVar.zzb();
                int iZzP = zzP(iZzb);
                if (iZzP >= 0) {
                    obj3 = obj;
                    zzaffVar2 = this;
                    try {
                        int iZzA = zzA(iZzP);
                        try {
                            try {
                                switch (zzC(iZzA)) {
                                    case 0:
                                        obj2 = obj3;
                                        zzagg.zzl(obj2, iZzA & 1048575, zzafoVar.zze());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        zzagg.zzj(obj2, iZzA & 1048575, zzafoVar.zzf());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzh());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzg());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzi());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzj());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzk());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        zzagg.zzh(obj2, iZzA & 1048575, zzafoVar.zzl());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        zzz(obj2, iZzA, zzafoVar);
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        zzafc zzafcVar = (zzafc) zzt(obj2, iZzP);
                                        zzafoVar.zzo(zzafcVar, zzq(iZzP), zzadfVar);
                                        zzu(obj2, iZzP, zzafcVar);
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        zzagg.zzn(obj2, iZzA & 1048575, zzafoVar.zzq());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzr());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZzs = zzafoVar.zzs();
                                        zzadz zzadzVarZzs = zzs(iZzP);
                                        if (zzadzVarZzs == null || zzadzVarZzs.zza(iZzs)) {
                                            zzagg.zzd(obj2, iZzA & 1048575, iZzs);
                                            zzL(obj2, iZzP);
                                        } else {
                                            objZzh = zzafq.zzG(obj2, iZzb, iZzs, objZzh, zzafzVar2);
                                        }
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzt());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzu());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzv());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzw());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        zzafc zzafcVar2 = (zzafc) zzt(obj2, iZzP);
                                        zzafoVar.zzp(zzafcVar2, zzq(iZzP), zzadfVar);
                                        zzu(obj2, iZzP, zzafcVar2);
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        zzafoVar.zzx(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        zzafoVar.zzy(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        zzafoVar.zzA(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 21:
                                        obj2 = obj3;
                                        zzafoVar.zzz(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        zzafoVar.zzB(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        zzafoVar.zzC(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        zzafoVar.zzD(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                        obj2 = obj3;
                                        zzafoVar.zzE(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        if (zzD(iZzA)) {
                                            ((zzacw) zzafoVar).zzF(zzaeo.zza(obj2, iZzA & 1048575), true);
                                        } else {
                                            ((zzacw) zzafoVar).zzF(zzaeo.zza(obj2, iZzA & 1048575), false);
                                        }
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        zzafoVar.zzG(zzaeo.zza(obj2, iZzA & 1048575), zzq(iZzP), zzadfVar);
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        zzafoVar.zzI(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        zzafoVar.zzJ(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                                        List listZza = zzaeo.zza(obj3, iZzA & 1048575);
                                        zzafoVar.zzK(listZza);
                                        objZzh = zzafq.zzF(obj3, iZzb, listZza, zzs(iZzP), objZzh, zzafzVar2);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        zzafoVar.zzL(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        zzafoVar.zzM(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        zzafoVar.zzN(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        zzafoVar.zzO(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        zzafoVar.zzx(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        zzafoVar.zzy(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        zzafoVar.zzA(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                                        obj2 = obj3;
                                        zzafoVar.zzz(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        zzafoVar.zzB(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        zzafoVar.zzC(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        zzafoVar.zzD(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        obj2 = obj3;
                                        zzafoVar.zzE(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            zzafoVar.zzJ(zzaeo.zza(obj2, iZzA & 1048575));
                                            break;
                                        } catch (zzaeg unused) {
                                            if (objZzh == null) {
                                                try {
                                                    objZzh = zzafzVar2.zzh(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    zzaffVar = zzaffVar2;
                                                    i7 = zzaffVar.zzk;
                                                    objZzx = objZzh;
                                                    while (i7 < zzaffVar.zzl) {
                                                        zzafz zzafzVar3 = zzafzVar2;
                                                        objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar3, obj2);
                                                        i7++;
                                                        zzaffVar = this;
                                                        zzafzVar2 = zzafzVar3;
                                                    }
                                                    zzafzVar = zzafzVar2;
                                                    if (objZzx != null) {
                                                        throw th;
                                                    }
                                                    zzafzVar.zzi(obj2, objZzx);
                                                    throw th;
                                                }
                                            }
                                            try {
                                                if (!zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                                                    objZzx2 = objZzh;
                                                    for (i10 = zzaffVar2.zzk; i10 < zzaffVar2.zzl; i10++) {
                                                        zzafz zzafzVar4 = zzafzVar2;
                                                        objZzx2 = zzaffVar2.zzx(obj2, zzaffVar2.zzj[i10], objZzx2, zzafzVar4, obj2);
                                                        zzafzVar2 = zzafzVar4;
                                                    }
                                                    if (objZzx2 != null) {
                                                        zzafzVar2.zzi(obj2, objZzx2);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzaffVar = zzaffVar2;
                                                th = th;
                                                i7 = zzaffVar.zzk;
                                                objZzx = objZzh;
                                                while (i7 < zzaffVar.zzl) {
                                                    zzafz zzafzVar5 = zzafzVar2;
                                                    objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar5, obj2);
                                                    i7++;
                                                    zzaffVar = this;
                                                    zzafzVar2 = zzafzVar5;
                                                }
                                                zzafzVar = zzafzVar2;
                                                if (objZzx != null) {
                                                    throw th;
                                                }
                                                zzafzVar.zzi(obj2, objZzx);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            zzaffVar = zzaffVar2;
                                            i7 = zzaffVar.zzk;
                                            objZzx = objZzh;
                                            while (i7 < zzaffVar.zzl) {
                                                zzafz zzafzVar6 = zzafzVar2;
                                                objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar6, obj2);
                                                i7++;
                                                zzaffVar = this;
                                                zzafzVar2 = zzafzVar6;
                                            }
                                            zzafzVar = zzafzVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzafzVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listZza2 = zzaeo.zza(obj3, iZzA & 1048575);
                                        zzafoVar.zzK(listZza2);
                                        try {
                                            objZzh = zzafq.zzF(obj3, iZzb, listZza2, zzs(iZzP), objZzh, zzafzVar2);
                                            obj2 = obj3;
                                        } catch (zzaeg unused2) {
                                            obj2 = obj3;
                                            if (objZzh == null) {
                                                objZzh = zzafzVar2.zzh(obj2);
                                            }
                                            if (!zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                                                objZzx2 = objZzh;
                                                while (i10 < zzaffVar2.zzl) {
                                                    zzafz zzafzVar7 = zzafzVar2;
                                                    objZzx2 = zzaffVar2.zzx(obj2, zzaffVar2.zzj[i10], objZzx2, zzafzVar7, obj2);
                                                    zzafzVar2 = zzafzVar7;
                                                }
                                                if (objZzx2 != null) {
                                                    zzafzVar2.zzi(obj2, objZzx2);
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = obj3;
                                            th = th;
                                            zzaffVar = zzaffVar2;
                                            i7 = zzaffVar.zzk;
                                            objZzx = objZzh;
                                            while (i7 < zzaffVar.zzl) {
                                                zzafz zzafzVar8 = zzafzVar2;
                                                objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar8, obj2);
                                                i7++;
                                                zzaffVar = this;
                                                zzafzVar2 = zzafzVar8;
                                            }
                                            zzafzVar = zzafzVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzafzVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                        break;
                                    case 45:
                                        zzafoVar.zzL(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 46:
                                        zzafoVar.zzM(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                                        zzafoVar.zzN(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        zzafoVar.zzO(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                        zzafoVar.zzH(zzaeo.zza(obj3, iZzA & 1048575), zzq(iZzP), zzadfVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objZzr = zzr(iZzP);
                                        long jZzA = zzA(iZzP) & 1048575;
                                        Object objZzm = zzagg.zzm(obj3, jZzA);
                                        if (objZzm == null) {
                                            objZzm = zzaew.zza().zzc();
                                            zzagg.zzn(obj3, jZzA, objZzm);
                                        } else if (zzaex.zza(objZzm)) {
                                            Object objZzc = zzaew.zza().zzc();
                                            zzaex.zzb(objZzc, objZzm);
                                            zzagg.zzn(obj3, jZzA, objZzc);
                                            objZzm = objZzc;
                                        }
                                        zzafoVar.zzP((zzaew) objZzm, ((zzaev) objZzr).zze(), zzadfVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 51:
                                        zzagg.zzn(obj3, iZzA & 1048575, Double.valueOf(zzafoVar.zze()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 52:
                                        zzagg.zzn(obj3, iZzA & 1048575, Float.valueOf(zzafoVar.zzf()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzh()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 54:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzg()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 55:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzi()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 56:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzj()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 57:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzk()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 58:
                                        zzagg.zzn(obj3, iZzA & 1048575, Boolean.valueOf(zzafoVar.zzl()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 59:
                                        zzz(obj3, iZzA, zzafoVar);
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                                        zzafc zzafcVar3 = (zzafc) zzv(obj3, iZzb, iZzP);
                                        zzafoVar.zzo(zzafcVar3, zzq(iZzP), zzadfVar);
                                        zzw(obj3, iZzb, iZzP, zzafcVar3);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                                        zzagg.zzn(obj3, iZzA & 1048575, zzafoVar.zzq());
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzr()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                                        int iZzs2 = zzafoVar.zzs();
                                        zzadz zzadzVarZzs2 = zzs(iZzP);
                                        if (zzadzVarZzs2 != null && !zzadzVarZzs2.zza(iZzs2)) {
                                            objZzh = zzafq.zzG(obj3, iZzb, iZzs2, objZzh, zzafzVar2);
                                            obj = obj3;
                                        }
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(iZzs2));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzt()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzu()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzv()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 67:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzw()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 68:
                                        zzafc zzafcVar4 = (zzafc) zzv(obj3, iZzb, iZzP);
                                        zzafoVar.zzp(zzafcVar4, zzq(iZzP), zzadfVar);
                                        zzw(obj3, iZzb, iZzP, zzafcVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objZzh == null) {
                                            try {
                                                objZzh = zzafzVar2.zzh(obj3);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th = th;
                                                zzaffVar = zzaffVar2;
                                                obj2 = obj3;
                                                i7 = zzaffVar.zzk;
                                                objZzx = objZzh;
                                                while (i7 < zzaffVar.zzl) {
                                                    zzafz zzafzVar9 = zzafzVar2;
                                                    objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar9, obj2);
                                                    i7++;
                                                    zzaffVar = this;
                                                    zzafzVar2 = zzafzVar9;
                                                }
                                                zzafzVar = zzafzVar2;
                                                if (objZzx != null) {
                                                    throw th;
                                                }
                                                zzafzVar.zzi(obj2, objZzx);
                                                throw th;
                                            }
                                        }
                                        if (!zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                                            objZzx2 = objZzh;
                                            for (int i11 = zzaffVar2.zzk; i11 < zzaffVar2.zzl; i11++) {
                                                zzafz zzafzVar10 = zzafzVar2;
                                                Object obj4 = obj3;
                                                objZzx2 = zzaffVar2.zzx(obj4, zzaffVar2.zzj[i11], objZzx2, zzafzVar10, obj3);
                                                obj3 = obj4;
                                                zzafzVar2 = zzafzVar10;
                                            }
                                            obj2 = obj3;
                                        }
                                        obj = obj3;
                                        break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj2 = obj3;
                            }
                        } catch (zzaeg unused3) {
                            obj2 = obj3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzaffVar = zzaffVar2;
                        obj2 = obj3;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx2 = objZzh;
                    for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                        zzafz zzafzVar11 = zzafzVar2;
                        objZzx2 = zzx(obj, this.zzj[i12], objZzx2, zzafzVar11, obj);
                        zzafzVar2 = zzafzVar11;
                    }
                    obj2 = obj;
                } else {
                    zzaffVar = this;
                    try {
                        if ((!zzaffVar.zzh ? null : zzadfVar.zzc(zzaffVar.zzg, iZzb)) != null) {
                            obj3 = obj;
                            zzaffVar2 = zzaffVar;
                            throw null;
                        }
                        if (objZzh == null) {
                            try {
                                objZzh = zzafzVar2.zzh(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                i7 = zzaffVar.zzk;
                                objZzx = objZzh;
                                while (i7 < zzaffVar.zzl) {
                                    zzafz zzafzVar12 = zzafzVar2;
                                    objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar12, obj2);
                                    i7++;
                                    zzaffVar = this;
                                    zzafzVar2 = zzafzVar12;
                                }
                                zzafzVar = zzafzVar2;
                                if (objZzx != null) {
                                    throw th;
                                }
                                zzafzVar.zzi(obj2, objZzx);
                                throw th;
                            }
                        }
                        try {
                            if (zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                                obj3 = obj;
                                obj = obj3;
                            } else {
                                int i13 = zzaffVar.zzk;
                                objZzx2 = objZzh;
                                while (i13 < zzaffVar.zzl) {
                                    zzafz zzafzVar13 = zzafzVar2;
                                    Object obj5 = obj;
                                    objZzx2 = zzaffVar.zzx(obj5, zzaffVar.zzj[i13], objZzx2, zzafzVar13, obj);
                                    zzafzVar2 = zzafzVar13;
                                    i13++;
                                    obj = obj5;
                                }
                                obj3 = obj;
                                obj2 = obj3;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj3 = obj;
                            zzaffVar2 = zzaffVar;
                            th = th;
                            zzaffVar = zzaffVar2;
                            obj2 = obj3;
                            i7 = zzaffVar.zzk;
                            objZzx = objZzh;
                            while (i7 < zzaffVar.zzl) {
                                zzafz zzafzVar14 = zzafzVar2;
                                objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar14, obj2);
                                i7++;
                                zzaffVar = this;
                                zzafzVar2 = zzafzVar14;
                            }
                            zzafzVar = zzafzVar2;
                            if (objZzx != null) {
                                throw th;
                            }
                            zzafzVar.zzi(obj2, objZzx);
                            throw th;
                        }
                    } catch (Throwable th11) {
                        obj3 = obj;
                        th = th11;
                        obj2 = obj3;
                        i7 = zzaffVar.zzk;
                        objZzx = objZzh;
                        while (i7 < zzaffVar.zzl) {
                            zzafz zzafzVar15 = zzafzVar2;
                            objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i7], objZzx, zzafzVar15, obj2);
                            i7++;
                            zzaffVar = this;
                            zzafzVar2 = zzafzVar15;
                        }
                        zzafzVar = zzafzVar2;
                        if (objZzx != null) {
                            throw th;
                        }
                        zzafzVar.zzi(obj2, objZzx);
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                zzaffVar = this;
                obj2 = obj;
            }
        }
        if (objZzx2 != null) {
            zzafzVar2.zzi(obj2, objZzx2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzi(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.measurement.zzacg r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaff.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzacg):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzj(Object obj, byte[] bArr, int i7, int i10, zzacg zzacgVar) throws IOException {
        zzi(obj, bArr, i7, i10, 0, zzacgVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzadu) {
                zzadu zzaduVar = (zzadu) obj;
                zzaduVar.zzcp(Integer.MAX_VALUE);
                zzaduVar.zza = 0;
                zzaduVar.zzci();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int iZzA = zzA(i7);
                int i10 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j6 = i10;
                if (iZzC != 9) {
                    if (iZzC != 60 && iZzC != 68) {
                        switch (iZzC) {
                            case 17:
                                if (zzK(obj, i7)) {
                                    zzq(i7).zzk(zzb.getObject(obj, j6));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                            case 48:
                            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                ((zzaef) zzagg.zzm(obj, j6)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j6);
                                if (object != null) {
                                    ((zzaew) object).zzd();
                                    unsafe.putObject(obj, j6, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i7], i7)) {
                        zzq(i7).zzk(zzb.getObject(obj, j6));
                    }
                } else if (zzK(obj, i7)) {
                    zzq(i7).zzk(zzb.getObject(obj, j6));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[LOOP:2: B:52:0x00d2->B:57:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzl(Object obj) {
        int i7;
        int i10;
        List list;
        zzafp zzafpVarZzq;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.zzk) {
            int i15 = this.zzj[i12];
            int iZzA = zzA(i15);
            int[] iArr = this.zzc;
            int i16 = iArr[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i14) {
                if (i17 != 1048575) {
                    i13 = zzb.getInt(obj, i17);
                }
                i10 = i13;
                i7 = i17;
            } else {
                i7 = i14;
                i10 = i13;
            }
            Object obj2 = obj;
            if ((268435456 & iZzA) != 0 && !zzJ(obj2, i15, i7, i10, i18)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzJ(obj2, i15, i7, i10, i18) && !zzy(obj2, iZzA, zzq(i15))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zzagg.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzafpVarZzq = zzq(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!zzafpVarZzq.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzM(obj2, iArr[i15], i15) && !zzy(obj2, iZzA, zzq(i15))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzagg.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzafpVarZzq = zzq(i15);
                    while (i11 < list.size()) {
                        if (!zzafpVarZzq.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzaew zzaewVar = (zzaew) zzagg.zzm(obj2, iZzA & 1048575);
                if (!zzaewVar.isEmpty() && ((zzaev) zzr(i15)).zze().zzc.zza() == zzagn.MESSAGE) {
                    zzafp zzafpVarZzb = null;
                    for (Object obj3 : zzaewVar.values()) {
                        if (zzafpVarZzb == null) {
                            zzafpVarZzb = zzafl.zza().zzb(obj3.getClass());
                        }
                        if (!zzafpVarZzb.zzl(obj3)) {
                            return false;
                        }
                    }
                }
            }
            i12++;
            obj = obj2;
            i14 = i7;
            i13 = i10;
        }
        return !this.zzh || ((zzadr) obj).zzb.zze();
    }
}

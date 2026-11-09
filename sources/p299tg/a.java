package p299tg;

import Kf.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import net.lingala.zip4j.crypto.Encrypter;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Encrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p315ug.a f42631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final net.lingala.zip4j.crypto.PBKDF2.a f42632b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42634d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f42637g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f42638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f42639j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f42640o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f42633c = new SecureRandom();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42635e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42636f = 0;

    public a(char[] cArr, int i7) throws d {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        int i14 = 0;
        if (cArr == null || cArr.length == 0) {
            throw new d("input password is empty or null");
        }
        if (i7 != 1 && i7 != 3) {
            throw new d("Invalid AES key strength");
        }
        this.f42634d = false;
        this.f42638i = new byte[16];
        this.f42637g = new byte[16];
        if (i7 == 1) {
            i10 = 8;
        } else if (i7 == 2) {
            i10 = 12;
        } else {
            if (i7 != 3) {
                throw null;
            }
            i10 = 16;
        }
        if (i10 != 8 && i10 != 16) {
            throw new d("invalid salt size, cannot generate salt");
        }
        int i15 = i10 == 8 ? 2 : 4;
        byte[] bArr = new byte[i10];
        int i16 = 0;
        while (i16 < i15) {
            int iNextInt = this.f42633c.nextInt();
            int i17 = i16 * 4;
            bArr[i17] = (byte) (iNextInt >> 24);
            bArr[i17 + 1] = (byte) (iNextInt >> 16);
            bArr[i17 + 2] = (byte) (iNextInt >> 8);
            bArr[i17 + 3] = (byte) iNextInt;
            i16++;
            i13 = i13;
        }
        int i18 = i13;
        this.f42640o = bArr;
        if (i7 == 1) {
            i11 = 16;
        } else if (i7 == 2) {
            i11 = 24;
        } else {
            if (i7 != 3) {
                throw null;
            }
            i11 = 32;
        }
        if (i7 == 1) {
            i12 = 16;
        } else if (i7 == 2) {
            i12 = 24;
        } else {
            if (i7 != 3) {
                throw null;
            }
            i12 = 32;
        }
        int i19 = i11 + i12;
        int i20 = i19 + 2;
        byte[] bArrA = Ag.a.a(cArr);
        net.lingala.zip4j.crypto.PBKDF2.a aVar = new net.lingala.zip4j.crypto.PBKDF2.a();
        aVar.init(bArrA);
        int i21 = i20 == 0 ? aVar.f39952b : i20;
        int i22 = aVar.f39952b;
        int i23 = (i21 / i22) + (i21 % i22 > 0 ? i18 : 0);
        int i24 = i21 - ((i23 - 1) * i22);
        byte[] bArr2 = new byte[i23 * i22];
        int i25 = 0;
        int i26 = i18;
        while (i26 <= i23) {
            int i27 = aVar.f39952b;
            byte[] bArr3 = new byte[i27];
            int i28 = i23;
            byte[] bArrDoFinal = new byte[bArr.length + 4];
            int i29 = i12;
            int i30 = i11;
            System.arraycopy(bArr, 0, bArrDoFinal, 0, bArr.length);
            int length = bArr.length;
            bArrDoFinal[length] = (byte) (i26 / PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
            bArrDoFinal[length + 1] = (byte) (i26 / 65536);
            bArrDoFinal[length + 2] = (byte) (i26 / IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            bArrDoFinal[length + 3] = (byte) i26;
            int i31 = 0;
            while (i31 < 1000) {
                bArrDoFinal = aVar.doFinal(bArrDoFinal);
                int i32 = 0;
                while (i32 < i27) {
                    bArr3[i32] = (byte) (bArr3[i32] ^ bArrDoFinal[i32]);
                    i32++;
                    i31 = i31;
                }
                i31++;
            }
            System.arraycopy(bArr3, 0, bArr2, i25, i27);
            i25 += i22;
            i26++;
            i23 = i28;
            i12 = i29;
            i14 = 0;
            i11 = i30;
        }
        int i33 = i12;
        int i34 = i11;
        int i35 = i14;
        if (i24 < i22) {
            byte[] bArr4 = new byte[i21];
            System.arraycopy(bArr2, i35, bArr4, i35, i21);
            bArr2 = bArr4;
        }
        if (bArr2.length != i20) {
            throw new d(String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", Integer.valueOf(i34), Integer.valueOf(i33)));
        }
        byte[] bArr5 = new byte[2];
        System.arraycopy(bArr2, i19, bArr5, i35, 2);
        this.f42639j = bArr5;
        byte[] bArr6 = new byte[i34];
        System.arraycopy(bArr2, i35, bArr6, i35, i34);
        p315ug.a aVar2 = new p315ug.a();
        aVar2.f43011b = null;
        int i36 = i34 / 4;
        if ((i36 != 4 && i36 != 6 && i36 != 8) || i36 * 4 != i34) {
            throw new d("invalid key length (not 128/192/256)");
        }
        aVar2.f43010a = i36 + 6;
        int[] iArr = new int[2];
        iArr[i18] = 4;
        iArr[0] = i36 + 7;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr);
        int i37 = 0;
        int i38 = 0;
        while (i37 < i34) {
            iArr2[i38 >> 2][i38 & 3] = (bArr6[i37] & UnsignedBytes.MAX_VALUE) | ((bArr6[i37 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr6[i37 + 2] & UnsignedBytes.MAX_VALUE) << 16) | (bArr6[i37 + 3] << Ascii.CAN);
            i37 += 4;
            i38++;
        }
        int i39 = (aVar2.f43010a + 1) << 2;
        for (int i40 = i36; i40 < i39; i40++) {
            int i41 = i40 - 1;
            int iB = iArr2[i41 >> 2][i41 & 3];
            int i42 = i40 % i36;
            if (i42 == 0) {
                iB = p315ug.a.b(p315ug.a.a(iB, 8)) ^ p315ug.a.f43008h[(i40 / i36) - 1];
            } else if (i36 > 6 && i42 == 4) {
                iB = p315ug.a.b(iB);
            }
            int i43 = i40 - i36;
            iArr2[i40 >> 2][i40 & 3] = iB ^ iArr2[i43 >> 2][i43 & 3];
        }
        aVar2.f43011b = iArr2;
        this.f42631a = aVar2;
        byte[] bArr7 = new byte[i33];
        System.arraycopy(bArr2, i34, bArr7, 0, i33);
        net.lingala.zip4j.crypto.PBKDF2.a aVar3 = new net.lingala.zip4j.crypto.PBKDF2.a();
        aVar3.init(bArr7);
        this.f42632b = aVar3;
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public final int encryptData(byte[] bArr) throws d {
        if (bArr == null) {
            throw new d("input bytes are null, cannot perform AES encryption");
        }
        int length = bArr.length;
        encryptData(bArr, 0, length);
        return length;
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public final int encryptData(byte[] bArr, int i7, int i10) throws d {
        int[] iArr;
        int i11;
        if (!this.f42634d) {
            int i12 = 1;
            if (i10 % 16 != 0) {
                this.f42634d = true;
            }
            int i13 = i7;
            while (true) {
                int i14 = i7 + i10;
                if (i13 >= i14) {
                    return i10;
                }
                int i15 = i13 + 16;
                int i16 = 16;
                this.f42636f = i15 <= i14 ? 16 : i14 - i13;
                int i17 = this.f42635e;
                byte[] bArr2 = this.f42637g;
                bArr2[0] = (byte) i17;
                bArr2[i12] = (byte) (i17 >> 8);
                bArr2[2] = (byte) (i17 >> 16);
                int i18 = 24;
                bArr2[3] = (byte) (i17 >> 24);
                for (int i19 = 4; i19 <= 15; i19++) {
                    bArr2[i19] = 0;
                }
                p315ug.a aVar = this.f42631a;
                int[][] iArr2 = aVar.f43011b;
                if (iArr2 != null) {
                    if (16 <= bArr2.length) {
                        byte[] bArr3 = this.f42638i;
                        int i20 = i12;
                        if (16 <= bArr3.length) {
                            int i21 = bArr2[0] & UnsignedBytes.MAX_VALUE;
                            aVar.f43012c = i21;
                            int i22 = 8;
                            int i23 = i21 | ((bArr2[i20] & UnsignedBytes.MAX_VALUE) << 8);
                            aVar.f43012c = i23;
                            int i24 = i23 | ((bArr2[2] & UnsignedBytes.MAX_VALUE) << 16);
                            aVar.f43012c = i24;
                            int i25 = i24 | (bArr2[3] << Ascii.CAN);
                            aVar.f43012c = i25;
                            int i26 = bArr2[4] & UnsignedBytes.MAX_VALUE;
                            aVar.f43013d = i26;
                            int i27 = i26 | ((bArr2[5] & UnsignedBytes.MAX_VALUE) << 8);
                            aVar.f43013d = i27;
                            int i28 = i27 | ((bArr2[6] & UnsignedBytes.MAX_VALUE) << 16);
                            aVar.f43013d = i28;
                            int i29 = i28 | (bArr2[7] << Ascii.CAN);
                            aVar.f43013d = i29;
                            int i30 = bArr2[8] & UnsignedBytes.MAX_VALUE;
                            aVar.f43014e = i30;
                            int i31 = i30 | ((bArr2[9] & UnsignedBytes.MAX_VALUE) << 8);
                            aVar.f43014e = i31;
                            int i32 = i31 | ((bArr2[10] & UnsignedBytes.MAX_VALUE) << 16);
                            aVar.f43014e = i32;
                            int i33 = i32 | (bArr2[11] << Ascii.CAN);
                            aVar.f43014e = i33;
                            int i34 = bArr2[12] & UnsignedBytes.MAX_VALUE;
                            aVar.f43015f = i34;
                            int i35 = i34 | ((bArr2[13] & UnsignedBytes.MAX_VALUE) << 8);
                            aVar.f43015f = i35;
                            int i36 = i35 | ((bArr2[14] & UnsignedBytes.MAX_VALUE) << 16);
                            aVar.f43015f = i36;
                            int i37 = (bArr2[15] << Ascii.CAN) | i36;
                            aVar.f43015f = i37;
                            int[] iArr3 = iArr2[0];
                            aVar.f43012c = i25 ^ iArr3[0];
                            aVar.f43013d = iArr3[i20] ^ i29;
                            aVar.f43014e = iArr3[2] ^ i33;
                            aVar.f43015f = iArr3[3] ^ i37;
                            int i38 = i20;
                            while (true) {
                                int i39 = aVar.f43010a - 1;
                                iArr = p315ug.a.f43009i;
                                if (i38 >= i39) {
                                    break;
                                }
                                int iA = (((iArr[aVar.f43012c & 255] ^ p315ug.a.a(iArr[(aVar.f43013d >> i22) & 255], i18)) ^ p315ug.a.a(iArr[(aVar.f43014e >> i16) & 255], i16)) ^ p315ug.a.a(iArr[(aVar.f43015f >> i18) & 255], i22)) ^ iArr2[i38][0];
                                int iA2 = (((iArr[aVar.f43013d & 255] ^ p315ug.a.a(iArr[(aVar.f43014e >> i22) & 255], i18)) ^ p315ug.a.a(iArr[(aVar.f43015f >> i16) & 255], i16)) ^ p315ug.a.a(iArr[(aVar.f43012c >> i18) & 255], i22)) ^ iArr2[i38][i20];
                                int iA3 = (((iArr[aVar.f43014e & 255] ^ p315ug.a.a(iArr[(aVar.f43015f >> i22) & 255], i18)) ^ p315ug.a.a(iArr[(aVar.f43012c >> i16) & 255], i16)) ^ p315ug.a.a(iArr[(aVar.f43013d >> i18) & 255], i22)) ^ iArr2[i38][2];
                                int iA4 = ((p315ug.a.a(iArr[(aVar.f43012c >> 8) & 255], i18) ^ iArr[aVar.f43015f & 255]) ^ p315ug.a.a(iArr[(aVar.f43013d >> i16) & 255], i16)) ^ p315ug.a.a(iArr[(aVar.f43014e >> i18) & 255], i22);
                                int i40 = i38 + 1;
                                int i41 = iA4 ^ iArr2[i38][3];
                                aVar.f43012c = (((iArr[iA & 255] ^ p315ug.a.a(iArr[(iA2 >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(iA3 >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(i41 >> 24) & 255], 8)) ^ iArr2[i40][0];
                                aVar.f43013d = (((iArr[iA2 & 255] ^ p315ug.a.a(iArr[(iA3 >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(i41 >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(iA >> 24) & 255], 8)) ^ iArr2[i40][i20];
                                aVar.f43014e = (((iArr[iA3 & 255] ^ p315ug.a.a(iArr[(i41 >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(iA >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(iA2 >> 24) & 255], 8)) ^ iArr2[i40][2];
                                aVar.f43015f = (((iArr[i41 & 255] ^ p315ug.a.a(iArr[(iA >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(iA2 >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(iA3 >> 24) & 255], 8)) ^ iArr2[i40][3];
                                i38 += 2;
                                i16 = 16;
                                i18 = 24;
                                i22 = 8;
                            }
                            int i42 = i38;
                            int iA5 = (((iArr[aVar.f43012c & 255] ^ p315ug.a.a(iArr[(aVar.f43013d >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(aVar.f43014e >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(aVar.f43015f >> 24) & 255], 8)) ^ iArr2[i42][0];
                            int iA6 = (((iArr[aVar.f43013d & 255] ^ p315ug.a.a(iArr[(aVar.f43014e >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(aVar.f43015f >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(aVar.f43012c >> 24) & 255], 8)) ^ iArr2[i42][i20];
                            int iA7 = (((iArr[aVar.f43014e & 255] ^ p315ug.a.a(iArr[(aVar.f43015f >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(aVar.f43012c >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(aVar.f43013d >> 24) & 255], 8)) ^ iArr2[i42][2];
                            int iA8 = (((iArr[aVar.f43015f & 255] ^ p315ug.a.a(iArr[(aVar.f43012c >> 8) & 255], 24)) ^ p315ug.a.a(iArr[(aVar.f43013d >> 16) & 255], 16)) ^ p315ug.a.a(iArr[(aVar.f43014e >> 24) & 255], 8)) ^ iArr2[i42][3];
                            byte[] bArr4 = p315ug.a.f43007g;
                            int i43 = (((bArr4[iA5 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iA6 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iA7 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iA8 >> 24) & 255] << Ascii.CAN);
                            int[] iArr4 = iArr2[i42 + 1];
                            int i44 = i43 ^ iArr4[0];
                            aVar.f43012c = i44;
                            int i45 = ((((bArr4[iA6 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iA7 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iA8 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iA5 >> 24) & 255] << Ascii.CAN)) ^ iArr4[i20];
                            aVar.f43013d = i45;
                            int i46 = ((((bArr4[iA7 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr4[(iA8 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr4[(iA5 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iA6 >> 24) & 255] << Ascii.CAN)) ^ iArr4[2];
                            aVar.f43014e = i46;
                            int i47 = (((((bArr4[(iA5 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr4[iA8 & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr4[(iA6 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr4[(iA7 >> 24) & 255] << Ascii.CAN)) ^ iArr4[3];
                            aVar.f43015f = i47;
                            bArr3[0] = (byte) i44;
                            bArr3[i20] = (byte) (i44 >> 8);
                            bArr3[2] = (byte) (i44 >> 16);
                            bArr3[3] = (byte) (i44 >> 24);
                            bArr3[4] = (byte) i45;
                            bArr3[5] = (byte) (i45 >> 8);
                            bArr3[6] = (byte) (i45 >> 16);
                            bArr3[7] = (byte) (i45 >> 24);
                            bArr3[8] = (byte) i46;
                            bArr3[9] = (byte) (i46 >> 8);
                            bArr3[10] = (byte) (i46 >> 16);
                            bArr3[11] = (byte) (i46 >> 24);
                            bArr3[12] = (byte) i47;
                            bArr3[13] = (byte) (i47 >> 8);
                            bArr3[14] = (byte) (i47 >> 16);
                            bArr3[15] = (byte) (i47 >> 24);
                            int i48 = 0;
                            while (true) {
                                i11 = this.f42636f;
                                if (i48 >= i11) {
                                    break;
                                }
                                int i49 = i13 + i48;
                                bArr[i49] = (byte) (bArr[i49] ^ bArr3[i48]);
                                i48++;
                            }
                            net.lingala.zip4j.crypto.PBKDF2.a aVar2 = this.f42632b;
                            ByteArrayOutputStream byteArrayOutputStream = aVar2.f39953c;
                            try {
                                if (byteArrayOutputStream.size() + i11 > 4096) {
                                    aVar2.a();
                                }
                                byteArrayOutputStream.write(bArr, i13, i11);
                                this.f42635e++;
                                i13 = i15;
                                i12 = i20;
                            } catch (IllegalStateException e10) {
                                throw new RuntimeException(e10);
                            }
                        } else {
                            throw new d("output buffer too short");
                        }
                    } else {
                        throw new d("input buffer too short");
                    }
                } else {
                    throw new d("AES engine not initialised");
                }
            }
        } else {
            throw new d("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
    }
}

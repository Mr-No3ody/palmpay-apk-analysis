package Ug;

import Pa.C0505b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f9783a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 12, 16, 12, 12, 20, 12, 16, 24, 28, 12, 12, 32, 12, 36, 12, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 32, 32, 24, 40, 28, 12, 12, 48, 52, 52, 52, 48, 52, 52, 52, 48, 52, 52, 52, 52, 52, 48, 52, 52, 52, 52, 52, 48, 52, 52, 52, 52, 52, 24, 12, 28, 12, 12, 12, 56, 60, 60, 60, 56, 60, 60, 60, 56, 60, 60, 60, 60, 60, 56, 60, 60, 60, 60, 60, 56, 60, 60, 60, 60, 60, 24, 12, 28, 12, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 
    40, 40, 40, 40, 40, 40, 40, 40, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 56, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 18, 18, 18, 18, 19, 19, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 23, 23, 23, 23, 24, 24, 24, 24, 25, 25, 25, 25, 26, 26, 26, 26, 27, 27, 27, 27, 28, 28, 28, 28, 29, 29, 29, 29, 30, 30, 30, 30, 31, 31, 31, 31, 32, 32, 32, 32, 33, 33, 33, 33, 34, 34, 34, 34, 35, 35, 35, 35, 36, 36, 36, 36, 37, 37, 37, 37, 38, 38, 38, 38, 39, 39, 39, 39, 40, 40, 40, 40, 41, 41, 41, 41, 42, 42, 42, 42, 43, 43, 43, 43, 44, 44, 44, 44, 45, 45, 45, 45, 46, 46, 46, 46, 47, 47, 47, 47, 48, 48, 48, 48, 49, 49, 49, 49, 50, 50, 50, 50, 51, 51, 51, 51, 52, 52, 52, 52, 53, 53, 53, 53, 54, 54, 54, 54, 55, 55, 55, 55, 56, 56, 56, 56, 57, 57, 57, 57, 58, 58, 58, 58, 59, 59, 59, 59, 60, 60, 60, 60, 61, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f9784b = {1024, 1536, 1280, 1536, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, ViewUtils.EDGE_TO_EDGE_FLAGS, 512};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f9785c = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f9786d = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f9787e = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f9788f = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f9789g = {0, 0, 0, 0, 0, 4096, 9216, 21504, 35840, 44032, 53248, 63488, 74752, 87040, 93696, 100864, 104704, 106752, 108928, 113536, 115968, 118528, 119872, 121280, 122016};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f9790h = {0, 0, 0, 0, 10, 10, 11, 11, 10, 10, 10, 10, 10, 9, 9, 8, 7, 7, 8, 7, 7, 6, 6, 5, 5};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f9791i = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, MessageEvent.EVENT_CL_OPEN_FAILED, 497, 753, 1265, 2289, 4337, 8433, 16625};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f9792j = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f9793k = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, 2114, 6210, 22594};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f9794l = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f9795m = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, 326, 582, 1094, 2118};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f9796n = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f9797o = {0, 0, 8, 8, 0, 16, 8, 16, 16};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f9798p = {0, 8, 0, 8, 16, 0, 16, 8, 16};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f9799q = new byte[1024];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f9800r = new int[1024];

    public static void a(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        int i12;
        int i13;
        int i14;
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = iArr2[i16];
            iArr4[i17] = iArr4[i17] + 1;
        }
        iArr5[1] = 0;
        int i18 = 1;
        while (i18 < 15) {
            int i19 = i18 + 1;
            iArr5[i19] = iArr5[i18] + iArr4[i18];
            i18 = i19;
        }
        for (int i20 = 0; i20 < i11; i20++) {
            int i21 = iArr2[i20];
            if (i21 != 0) {
                int i22 = iArr5[i21];
                iArr5[i21] = i22 + 1;
                iArr3[i22] = i20;
            }
        }
        int i23 = 1 << i10;
        if (iArr5[15] == 1) {
            for (int i24 = 0; i24 < i23; i24++) {
                iArr[i7 + i24] = iArr3[0];
            }
            return;
        }
        int i25 = 2;
        int i26 = 2;
        int i27 = 0;
        int i28 = 1;
        while (i28 <= i10) {
            while (iArr4[i28] > 0) {
                int i29 = i7 + i27;
                int i30 = i15 + 1;
                int i31 = (i28 << 16) | iArr3[i15];
                int i32 = i23;
                do {
                    i32 -= i26;
                    iArr[i29 + i32] = i31;
                } while (i32 > 0);
                int i33 = 1 << (i28 - 1);
                while ((i27 & i33) != 0) {
                    i33 >>= 1;
                }
                i27 = (i27 & (i33 - 1)) + i33;
                iArr4[i28] = iArr4[i28] - 1;
                i15 = i30;
            }
            i28++;
            i26 <<= 1;
        }
        int i34 = i23 - 1;
        int i35 = i10 + 1;
        int i36 = -1;
        int i37 = i7;
        while (i35 <= 15) {
            while (iArr4[i35] > 0) {
                int i38 = i27 & i34;
                if (i38 != i36) {
                    int i39 = i37 + i23;
                    int i40 = 1 << (i35 - i10);
                    int i41 = i35;
                    while (i41 < 15) {
                        int i42 = i40 - iArr4[i41];
                        if (i42 <= 0) {
                            break;
                        }
                        i41++;
                        i40 = i42 << 1;
                    }
                    int i43 = i41 - i10;
                    iArr[i7 + i38] = ((i43 + i10) << 16) | ((i39 - i7) - i38);
                    i12 = i38;
                    i14 = i39;
                    i13 = 1 << i43;
                } else {
                    i12 = i36;
                    i13 = i23;
                    i14 = i37;
                }
                int i44 = i14 + (i27 >> i10);
                int i45 = i15 + 1;
                int i46 = ((i35 - i10) << 16) | iArr3[i15];
                int i47 = i13;
                do {
                    i47 -= i25;
                    iArr[i44 + i47] = i46;
                } while (i47 > 0);
                int i48 = 1 << (i35 - 1);
                while ((i27 & i48) != 0) {
                    i48 >>= 1;
                }
                i27 = ((i48 - 1) & i27) + i48;
                iArr4[i35] = iArr4[i35] - 1;
                i23 = i13;
                i37 = i14;
                i36 = i12;
                i15 = i45;
            }
            i35++;
            i25 <<= 1;
        }
    }

    public static void b(f fVar, int i7) {
        int i10;
        a aVar = fVar.f9829c;
        int i11 = i7 * 2;
        a.b(aVar);
        int i12 = i7 * 1080;
        int iG = g(fVar.f9831e, i12, aVar);
        a.b(aVar);
        int iG2 = g(fVar.f9832f, i12, aVar);
        fVar.f9840n[i7] = a.d(aVar, f9792j[iG2]) + f9791i[iG2];
        int[] iArr = fVar.f9842p;
        if (iG == 1) {
            i10 = iArr[i11 + 1] + 1;
        } else {
            i10 = iG == 0 ? iArr[i11] : iG - 2;
        }
        int i13 = fVar.f9841o[i7];
        if (i10 >= i13) {
            i10 -= i13;
        }
        int i14 = i11 + 1;
        iArr[i11] = iArr[i14];
        iArr[i14] = i10;
    }

    public static int c(int i7, byte[] bArr, a aVar) {
        int iD;
        a.e(aVar);
        if (a.d(aVar, 1) != 0) {
            int iD2 = a.d(aVar, 3);
            iD = iD2 == 0 ? 1 : a.d(aVar, iD2) + (1 << iD2);
        } else {
            iD = 0;
        }
        int i10 = iD + 1;
        if (i10 == 1) {
            int i11 = 0;
            while (i11 < i7) {
                int iMin = Math.min(i11 + 1024, i7) - i11;
                System.arraycopy(f9799q, 0, bArr, i11, iMin);
                i11 += iMin;
            }
        } else {
            int iD3 = a.d(aVar, 1) == 1 ? a.d(aVar, 4) + 1 : 0;
            int[] iArr = new int[1080];
            f(i10 + iD3, iArr, 0, aVar);
            int i12 = 0;
            while (i12 < i7) {
                a.e(aVar);
                a.b(aVar);
                int iG = g(iArr, 0, aVar);
                if (iG == 0) {
                    bArr[i12] = 0;
                } else if (iG <= iD3) {
                    for (int iD4 = a.d(aVar, iG) + (1 << iG); iD4 != 0; iD4--) {
                        if (i12 >= i7) {
                            throw new c("Corrupted context map");
                        }
                        bArr[i12] = 0;
                        i12++;
                    }
                } else {
                    bArr[i12] = (byte) (iG - iD3);
                }
                i12++;
            }
            if (a.d(aVar, 1) == 1) {
                int[] iArr2 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
                for (int i13 = 0; i13 < 256; i13++) {
                    iArr2[i13] = i13;
                }
                for (int i14 = 0; i14 < i7; i14++) {
                    int i15 = bArr[i14] & UnsignedBytes.MAX_VALUE;
                    int i16 = iArr2[i15];
                    bArr[i14] = (byte) i16;
                    if (i15 != 0) {
                        while (i15 > 0) {
                            iArr2[i15] = iArr2[i15 - 1];
                            i15--;
                        }
                        iArr2[0] = i16;
                    }
                }
            }
        }
        return i10;
    }

    public static void d(f fVar) {
        b(fVar, 0);
        int i7 = fVar.f9842p[1];
        int i10 = i7 << 6;
        fVar.f9802A = i10;
        fVar.f9847v = ((int[]) fVar.f9837k.f7074d)[fVar.f9851z[i10] & UnsignedBytes.MAX_VALUE];
        byte b7 = fVar.f9850y[i7];
        int[] iArr = f9784b;
        fVar.f9804C = iArr[b7];
        fVar.f9805D = iArr[b7 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:154:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:160:0x0402  */
    /* JADX WARN: Code duplicated, block: B:164:0x0440 A[LOOP:7: B:164:0x0440->B:173:0x0489, LOOP_START, PHI: r5
      0x0440: PHI (r5v85 char) = (r5v64 char), (r5v88 char) binds: [B:163:0x043e, B:173:0x0489] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x0446  */
    /* JADX WARN: Code duplicated, block: B:168:0x044d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0489 A[LOOP:7: B:164:0x0440->B:173:0x0489, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x048b  */
    /* JADX WARN: Code duplicated, block: B:177:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:183:0x0502 A[LOOP:8: B:175:0x049d->B:183:0x0502, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x050e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0517  */
    /* JADX WARN: Code duplicated, block: B:190:0x051c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0520  */
    /* JADX WARN: Code duplicated, block: B:194:0x0528  */
    /* JADX WARN: Code duplicated, block: B:197:0x054f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0551  */
    /* JADX WARN: Code duplicated, block: B:201:0x0564  */
    /* JADX WARN: Code duplicated, block: B:204:0x0595  */
    /* JADX WARN: Code duplicated, block: B:205:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:208:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:210:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:213:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:216:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:217:0x05c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:221:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:224:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:233:0x061b  */
    /* JADX WARN: Code duplicated, block: B:238:0x064a  */
    /* JADX WARN: Code duplicated, block: B:256:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:397:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x064f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0638 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:? A[LOOP:6: B:231:0x0615->B:431:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x04f3 A[SYNTHETIC] */
    public static void e(f fVar) {
        char c6;
        int i7;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int iD;
        int i13;
        char c10;
        char c11;
        int i14;
        int i15;
        int iG;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int iG2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34 = fVar.f9827a;
        if (i34 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        char c12 = 11;
        if (i34 == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        int i35 = 1;
        int i36 = fVar.f9817P - 1;
        byte[] bArr = fVar.f9830d;
        while (true) {
            int i37 = fVar.f9827a;
            a aVar = fVar.f9829c;
            if (i37 == 10) {
                if (i37 == 10) {
                    if (fVar.f9833g < 0) {
                        throw new c("Invalid metablock length");
                    }
                    int i38 = (64 - aVar.f9776g) & 7;
                    if (i38 != 0 && a.d(aVar, i38) != 0) {
                        throw new c("Corrupted padding bits");
                    }
                    a.a(aVar, true);
                    return;
                }
                return;
            }
            if (i37 != 12) {
                int i39 = 4;
                int i40 = i35;
                int[] iArr3 = fVar.f9842p;
                C0505b c0505b = fVar.f9839m;
                C0505b c0505b2 = fVar.f9838l;
                C0505b c0505b3 = fVar.f9837k;
                int[] iArr4 = fVar.f9840n;
                switch (i37) {
                    case 1:
                        c6 = 11;
                        if (fVar.f9833g < 0) {
                            throw new c("Invalid metablock length");
                        }
                        if (fVar.f9834h) {
                            fVar.f9828b = 10;
                            fVar.f9825X = fVar.f9844r;
                            fVar.f9824W = 0;
                            fVar.f9827a = 12;
                        } else {
                            c0505b3.f7073c = null;
                            c0505b3.f7074d = null;
                            c0505b2.f7073c = null;
                            c0505b2.f7074d = null;
                            c0505b.f7073c = null;
                            c0505b.f7074d = null;
                            a.e(aVar);
                            boolean z3 = a.d(aVar, 1) == 1;
                            fVar.f9834h = z3;
                            fVar.f9833g = 0;
                            fVar.f9835i = false;
                            fVar.f9836j = false;
                            if (!z3 || a.d(aVar, 1) == 0) {
                                int iD2 = a.d(aVar, 2) + 4;
                                if (iD2 == 7) {
                                    fVar.f9836j = true;
                                    if (a.d(aVar, 1) != 0) {
                                        throw new c("Corrupted reserved bit");
                                    }
                                    int iD3 = a.d(aVar, 2);
                                    if (iD3 == 0) {
                                        i7 = 4;
                                    } else {
                                        for (int i41 = 0; i41 < iD3; i41++) {
                                            int iD4 = a.d(aVar, 8);
                                            if (iD4 == 0 && i41 + 1 == iD3 && iD3 > 1) {
                                                throw new c("Exuberant nibble");
                                            }
                                            fVar.f9833g = (iD4 << (i41 * 8)) | fVar.f9833g;
                                        }
                                    }
                                } else {
                                    for (int i42 = 0; i42 < iD2; i42++) {
                                        int iD5 = a.d(aVar, 4);
                                        if (iD5 == 0 && i42 + 1 == iD2 && iD2 > 4) {
                                            throw new c("Exuberant nibble");
                                        }
                                        fVar.f9833g = (iD5 << (i42 * 4)) | fVar.f9833g;
                                    }
                                }
                                i7 = 4;
                                fVar.f9833g++;
                                if (!fVar.f9834h) {
                                    fVar.f9835i = a.d(aVar, 1) == 1;
                                }
                            } else {
                                i7 = 4;
                            }
                            if (fVar.f9833g != 0 || fVar.f9836j) {
                                if (fVar.f9835i || fVar.f9836j) {
                                    int i43 = (64 - aVar.f9776g) & 7;
                                    if (i43 != 0 && a.d(aVar, i43) != 0) {
                                        throw new c("Corrupted padding bits");
                                    }
                                    fVar.f9827a = fVar.f9836j ? i7 : 5;
                                } else {
                                    fVar.f9827a = 2;
                                }
                                if (!fVar.f9836j) {
                                    long j6 = fVar.f9818Q + ((long) fVar.f9833g);
                                    fVar.f9818Q = j6;
                                    int i44 = fVar.f9817P;
                                    int i45 = fVar.f9816O;
                                    if (i44 < i45) {
                                        if (i45 > j6) {
                                            while (true) {
                                                int i46 = i45 >> 1;
                                                if (i46 > ((int) j6) + fVar.f9819R.length) {
                                                    i45 = i46;
                                                } else if (!fVar.f9834h && i45 < 16384 && fVar.f9816O >= 16384) {
                                                    i45 = 16384;
                                                }
                                            }
                                        }
                                        int i47 = fVar.f9817P;
                                        if (i45 > i47) {
                                            byte[] bArr2 = new byte[i45 + 37];
                                            byte[] bArr3 = fVar.f9830d;
                                            if (bArr3 != null) {
                                                System.arraycopy(bArr3, 0, bArr2, 0, i47);
                                            } else {
                                                byte[] bArr4 = fVar.f9819R;
                                                if (bArr4.length != 0) {
                                                    int length = bArr4.length;
                                                    int i48 = fVar.f9815N;
                                                    if (length > i48) {
                                                        int i49 = length - i48;
                                                        length = i48;
                                                        i10 = i49;
                                                    } else {
                                                        i10 = 0;
                                                    }
                                                    System.arraycopy(bArr4, i10, bArr2, 0, length);
                                                    fVar.f9844r = length;
                                                    fVar.f9820S = length;
                                                }
                                            }
                                            fVar.f9830d = bArr2;
                                            fVar.f9817P = i45;
                                        }
                                    }
                                }
                            }
                        }
                        i36 = fVar.f9817P - 1;
                        bArr = fVar.f9830d;
                        break;
                        break;
                    case 2:
                        int i50 = i40;
                        c6 = 11;
                        int i51 = 0;
                        while (true) {
                            int[] iArr5 = fVar.f9841o;
                            if (i51 >= 3) {
                                a.e(aVar);
                                fVar.f9811J = a.d(aVar, 2);
                                int iD6 = a.d(aVar, 4);
                                int i52 = fVar.f9811J;
                                int i53 = (iD6 << i52) + 16;
                                fVar.f9809H = i53;
                                fVar.f9810I = (1 << i52) - 1;
                                int i54 = i53 + (48 << i52);
                                char c13 = 0;
                                fVar.f9850y = new byte[iArr5[0]];
                                int i55 = 0;
                                while (true) {
                                    int i56 = iArr5[c13];
                                    if (i55 >= i56) {
                                        i11 = i39;
                                        int i57 = i56 << 6;
                                        byte[] bArr5 = new byte[i57];
                                        fVar.f9851z = bArr5;
                                        int iC = c(i57, bArr5, aVar);
                                        fVar.f9846u = true;
                                        int i58 = 0;
                                        while (true) {
                                            if (i58 < (iArr5[0] << 6)) {
                                                iArr = iArr4;
                                                if (fVar.f9851z[i58] != (i58 >> 6)) {
                                                    fVar.f9846u = false;
                                                } else {
                                                    i58++;
                                                    iArr4 = iArr;
                                                }
                                            } else {
                                                iArr = iArr4;
                                            }
                                        }
                                        int i59 = iArr5[2] << 2;
                                        byte[] bArr6 = new byte[i59];
                                        fVar.f9808G = bArr6;
                                        int iC2 = c(i59, bArr6, aVar);
                                        c0505b3.f7072b = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                        c0505b3.f7073c = new int[iC * 1080];
                                        c0505b3.f7074d = new int[iC];
                                        int i60 = iArr5[1];
                                        c0505b2.f7072b = 704;
                                        c0505b2.f7073c = new int[i60 * 1080];
                                        c0505b2.f7074d = new int[i60];
                                        c0505b.f7072b = i54;
                                        c0505b.f7073c = new int[iC2 * 1080];
                                        c0505b.f7074d = new int[iC2];
                                        C0505b.d(c0505b3, aVar);
                                        C0505b.d(c0505b2, aVar);
                                        C0505b.d(c0505b, aVar);
                                        fVar.f9802A = 0;
                                        fVar.f9803B = 0;
                                        int[] iArr6 = f9784b;
                                        byte b7 = fVar.f9850y[0];
                                        fVar.f9804C = iArr6[b7];
                                        i12 = 1;
                                        fVar.f9805D = iArr6[b7 + 1];
                                        fVar.f9847v = ((int[]) c0505b3.f7074d)[0];
                                        fVar.f9806E = ((int[]) c0505b2.f7074d)[0];
                                        iArr3[i11] = 1;
                                        iArr3[2] = 1;
                                        iArr3[0] = 1;
                                        iArr3[5] = 0;
                                        iArr3[3] = 0;
                                        iArr3[1] = 0;
                                        fVar.f9827a = 3;
                                        if (fVar.f9833g <= 0) {
                                            a.e(aVar);
                                            if (iArr[i12] == 0) {
                                                b(fVar, i12);
                                                fVar.f9806E = ((int[]) c0505b2.f7074d)[iArr3[3]];
                                            }
                                            iArr[i12] = iArr[i12] - i12;
                                            a.b(aVar);
                                            int iG3 = g((int[]) c0505b2.f7073c, fVar.f9806E, aVar);
                                            i13 = iG3 >>> 6;
                                            fVar.f9807F = 0;
                                            if (i13 >= 2) {
                                                i13 -= 2;
                                                fVar.f9807F = -1;
                                            }
                                            int i61 = f9797o[i13] + ((iG3 >>> 3) & 7);
                                            int i62 = f9798p[i13] + (iG3 & 7);
                                            fVar.f9849x = a.d(aVar, f9794l[i61]) + f9793k[i61];
                                            fVar.f9813L = a.d(aVar, f9796n[i62]) + f9795m[i62];
                                            c10 = 0;
                                            fVar.f9848w = 0;
                                            fVar.f9827a = 6;
                                            if (!fVar.f9846u) {
                                                int i63 = fVar.f9844r;
                                                i14 = bArr[(i63 - 1) & i36] & UnsignedBytes.MAX_VALUE;
                                                i15 = bArr[(i63 - 2) & i36] & UnsignedBytes.MAX_VALUE;
                                                while (true) {
                                                    if (fVar.f9848w < fVar.f9849x) {
                                                        a.e(aVar);
                                                        if (iArr[0] == 0) {
                                                            d(fVar);
                                                        }
                                                        byte[] bArr7 = fVar.f9851z;
                                                        int i64 = fVar.f9802A;
                                                        int[] iArr7 = f9783a;
                                                        int i65 = bArr7[i64 + (iArr7[fVar.f9805D + i15] | iArr7[fVar.f9804C + i14])] & UnsignedBytes.MAX_VALUE;
                                                        iArr[0] = iArr[0] - 1;
                                                        a.b(aVar);
                                                        iG = g((int[]) c0505b3.f7073c, ((int[]) c0505b3.f7074d)[i65], aVar);
                                                        i16 = fVar.f9844r;
                                                        bArr[i16] = (byte) iG;
                                                        fVar.f9848w++;
                                                        fVar.f9844r = i16 + 1;
                                                        if (i16 == i36) {
                                                            i17 = 6;
                                                            fVar.f9828b = 6;
                                                            fVar.f9825X = fVar.f9817P;
                                                            fVar.f9824W = 0;
                                                            fVar.f9827a = 12;
                                                        } else {
                                                            int i66 = i14;
                                                            i14 = iG;
                                                            i15 = i66;
                                                        }
                                                    }
                                                }
                                                if (fVar.f9827a != i17) {
                                                    i18 = fVar.f9833g - fVar.f9849x;
                                                    fVar.f9833g = i18;
                                                    if (i18 <= 0) {
                                                        if (fVar.f9807F < 0) {
                                                            a.e(aVar);
                                                            if (iArr[2] == 0) {
                                                                b(fVar, 2);
                                                                fVar.f9803B = iArr3[5] << 2;
                                                            }
                                                            iArr[2] = iArr[2] - 1;
                                                            a.b(aVar);
                                                            int[] iArr8 = (int[]) c0505b.f7073c;
                                                            int[] iArr9 = (int[]) c0505b.f7074d;
                                                            byte[] bArr8 = fVar.f9808G;
                                                            int i67 = fVar.f9803B;
                                                            i25 = fVar.f9813L;
                                                            if (i25 > i11) {
                                                                i26 = 3;
                                                            } else {
                                                                i26 = i25 - 2;
                                                            }
                                                            iG2 = g(iArr8, iArr9[bArr8[i67 + i26] & UnsignedBytes.MAX_VALUE], aVar);
                                                            fVar.f9807F = iG2;
                                                            i27 = fVar.f9809H;
                                                            if (iG2 >= i27) {
                                                                int i68 = iG2 - i27;
                                                                int i69 = fVar.f9810I & i68;
                                                                int i70 = i68 >>> fVar.f9811J;
                                                                fVar.f9807F = i70;
                                                                int i71 = (i70 >>> 1) + 1;
                                                                fVar.f9807F = i27 + i69 + ((a.d(aVar, i71) + ((((i70 & 1) + 2) << i71) - 4)) << fVar.f9811J);
                                                            }
                                                        }
                                                        i19 = fVar.f9807F;
                                                        i20 = fVar.t;
                                                        iArr2 = fVar.f9843q;
                                                        if (i19 < 16) {
                                                            i21 = iArr2[(f9786d[i19] + i20) & 3] + f9787e[i19];
                                                        } else {
                                                            i21 = i19 - 15;
                                                        }
                                                        fVar.f9812K = i21;
                                                        if (i21 >= 0) {
                                                            throw new c("Negative distance");
                                                        }
                                                        i22 = fVar.f9845s;
                                                        i23 = fVar.f9815N;
                                                        if (i22 != i23 || (i24 = fVar.f9844r) >= i23) {
                                                            fVar.f9845s = i23;
                                                        } else {
                                                            fVar.f9845s = i24;
                                                        }
                                                        fVar.f9814M = fVar.f9844r;
                                                        if (i21 > fVar.f9845s) {
                                                            if (i19 > 0) {
                                                                iArr2[i20 & 3] = i21;
                                                                fVar.t = i20 + 1;
                                                            }
                                                            if (fVar.f9813L <= fVar.f9833g) {
                                                                throw new c("Invalid backward reference");
                                                            }
                                                            fVar.f9848w = 0;
                                                            fVar.f9827a = 7;
                                                            int i72 = fVar.f9844r;
                                                            i29 = (i72 - fVar.f9812K) & i36;
                                                            i30 = fVar.f9813L - fVar.f9848w;
                                                            if (i29 + i30 < i36 || i72 + i30 >= i36) {
                                                                while (true) {
                                                                    i31 = fVar.f9848w;
                                                                    if (i31 < fVar.f9813L) {
                                                                        i32 = fVar.f9844r;
                                                                        bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                                        fVar.f9833g--;
                                                                        fVar.f9848w = i31 + 1;
                                                                        fVar.f9844r = i32 + 1;
                                                                        if (i32 == i36) {
                                                                            i33 = 7;
                                                                            fVar.f9828b = 7;
                                                                            fVar.f9825X = fVar.f9817P;
                                                                            fVar.f9824W = 0;
                                                                            fVar.f9827a = 12;
                                                                        }
                                                                    }
                                                                }
                                                                if (fVar.f9827a == i33) {
                                                                    fVar.f9827a = 3;
                                                                }
                                                            } else {
                                                                int i73 = 0;
                                                                while (i73 < i30) {
                                                                    bArr[i72] = bArr[i29];
                                                                    i73++;
                                                                    i72++;
                                                                    i29++;
                                                                }
                                                                fVar.f9848w += i30;
                                                                fVar.f9833g -= i30;
                                                                fVar.f9844r += i30;
                                                            }
                                                            i33 = 7;
                                                            if (fVar.f9827a == i33) {
                                                                fVar.f9827a = 3;
                                                            }
                                                        } else {
                                                            fVar.f9827a = 9;
                                                        }
                                                    } else {
                                                        fVar.f9827a = 3;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                                break;
                                            } else {
                                                while (fVar.f9848w < fVar.f9849x) {
                                                    a.e(aVar);
                                                    if (iArr[c10] == 0) {
                                                        d(fVar);
                                                    }
                                                    iArr[c10] = iArr[c10] - 1;
                                                    a.b(aVar);
                                                    bArr[fVar.f9844r] = (byte) g((int[]) c0505b3.f7073c, fVar.f9847v, aVar);
                                                    fVar.f9848w++;
                                                    i28 = fVar.f9844r;
                                                    fVar.f9844r = i28 + 1;
                                                    if (i28 == i36) {
                                                        fVar.f9828b = 6;
                                                        fVar.f9825X = fVar.f9817P;
                                                        fVar.f9824W = 0;
                                                        fVar.f9827a = 12;
                                                    } else {
                                                        c10 = 0;
                                                    }
                                                }
                                            }
                                            i17 = 6;
                                            if (fVar.f9827a != i17) {
                                                i18 = fVar.f9833g - fVar.f9849x;
                                                fVar.f9833g = i18;
                                                if (i18 <= 0) {
                                                    if (fVar.f9807F < 0) {
                                                        a.e(aVar);
                                                        if (iArr[2] == 0) {
                                                            b(fVar, 2);
                                                            fVar.f9803B = iArr3[5] << 2;
                                                        }
                                                        iArr[2] = iArr[2] - 1;
                                                        a.b(aVar);
                                                        int[] iArr10 = (int[]) c0505b.f7073c;
                                                        int[] iArr11 = (int[]) c0505b.f7074d;
                                                        byte[] bArr9 = fVar.f9808G;
                                                        int i610 = fVar.f9803B;
                                                        i25 = fVar.f9813L;
                                                        if (i25 > i11) {
                                                            i26 = 3;
                                                        } else {
                                                            i26 = i25 - 2;
                                                        }
                                                        iG2 = g(iArr10, iArr11[bArr9[i610 + i26] & UnsignedBytes.MAX_VALUE], aVar);
                                                        fVar.f9807F = iG2;
                                                        i27 = fVar.f9809H;
                                                        if (iG2 >= i27) {
                                                            int i611 = iG2 - i27;
                                                            int i612 = fVar.f9810I & i611;
                                                            int i74 = i611 >>> fVar.f9811J;
                                                            fVar.f9807F = i74;
                                                            int i75 = (i74 >>> 1) + 1;
                                                            fVar.f9807F = i27 + i612 + ((a.d(aVar, i75) + ((((i74 & 1) + 2) << i75) - 4)) << fVar.f9811J);
                                                        }
                                                    }
                                                    i19 = fVar.f9807F;
                                                    i20 = fVar.t;
                                                    iArr2 = fVar.f9843q;
                                                    if (i19 < 16) {
                                                        i21 = iArr2[(f9786d[i19] + i20) & 3] + f9787e[i19];
                                                    } else {
                                                        i21 = i19 - 15;
                                                    }
                                                    fVar.f9812K = i21;
                                                    if (i21 >= 0) {
                                                        throw new c("Negative distance");
                                                    }
                                                    i22 = fVar.f9845s;
                                                    i23 = fVar.f9815N;
                                                    if (i22 != i23) {
                                                        fVar.f9845s = i23;
                                                    } else {
                                                        fVar.f9845s = i23;
                                                    }
                                                    fVar.f9814M = fVar.f9844r;
                                                    if (i21 > fVar.f9845s) {
                                                        if (i19 > 0) {
                                                            iArr2[i20 & 3] = i21;
                                                            fVar.t = i20 + 1;
                                                        }
                                                        if (fVar.f9813L <= fVar.f9833g) {
                                                            throw new c("Invalid backward reference");
                                                        }
                                                        fVar.f9848w = 0;
                                                        fVar.f9827a = 7;
                                                        int i76 = fVar.f9844r;
                                                        i29 = (i76 - fVar.f9812K) & i36;
                                                        i30 = fVar.f9813L - fVar.f9848w;
                                                        if (i29 + i30 < i36) {
                                                            while (true) {
                                                                i31 = fVar.f9848w;
                                                                if (i31 < fVar.f9813L) {
                                                                    i32 = fVar.f9844r;
                                                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                                    fVar.f9833g--;
                                                                    fVar.f9848w = i31 + 1;
                                                                    fVar.f9844r = i32 + 1;
                                                                    if (i32 == i36) {
                                                                        i33 = 7;
                                                                        fVar.f9828b = 7;
                                                                        fVar.f9825X = fVar.f9817P;
                                                                        fVar.f9824W = 0;
                                                                        fVar.f9827a = 12;
                                                                    }
                                                                } else {
                                                                    i33 = 7;
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                i31 = fVar.f9848w;
                                                                if (i31 < fVar.f9813L) {
                                                                    i32 = fVar.f9844r;
                                                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                                    fVar.f9833g--;
                                                                    fVar.f9848w = i31 + 1;
                                                                    fVar.f9844r = i32 + 1;
                                                                    if (i32 == i36) {
                                                                        i33 = 7;
                                                                        fVar.f9828b = 7;
                                                                        fVar.f9825X = fVar.f9817P;
                                                                        fVar.f9824W = 0;
                                                                        fVar.f9827a = 12;
                                                                    }
                                                                } else {
                                                                    i33 = 7;
                                                                }
                                                            }
                                                        }
                                                        if (fVar.f9827a == i33) {
                                                            fVar.f9827a = 3;
                                                        }
                                                    } else {
                                                        fVar.f9827a = 9;
                                                    }
                                                } else {
                                                    fVar.f9827a = 3;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            fVar.f9827a = i12;
                                        }
                                    } else {
                                        int iMin = Math.min(i55 + 96, i56);
                                        while (i55 < iMin) {
                                            fVar.f9850y[i55] = (byte) (a.d(aVar, 2) << 1);
                                            i55++;
                                            i39 = i39;
                                        }
                                        a.e(aVar);
                                        c13 = 0;
                                    }
                                }
                            } else {
                                if (a.d(aVar, i50) != 0) {
                                    int iD7 = a.d(aVar, 3);
                                    iD = iD7 == 0 ? i50 : a.d(aVar, iD7) + (i50 << iD7);
                                } else {
                                    iD = 0;
                                }
                                iArr5[i51] = iD + 1;
                                iArr4[i51] = 268435456;
                                int i77 = iArr5[i51];
                                if (i77 > i50) {
                                    int i78 = i51 * 1080;
                                    f(i77 + 2, fVar.f9831e, i78, aVar);
                                    int[] iArr12 = fVar.f9832f;
                                    f(26, iArr12, i78, aVar);
                                    a.b(aVar);
                                    int iG4 = g(iArr12, i78, aVar);
                                    iArr4[i51] = a.d(aVar, f9792j[iG4]) + f9791i[iG4];
                                }
                                i51++;
                                i50 = 1;
                            }
                            break;
                        }
                        break;
                    case 3:
                        c6 = 11;
                        iArr = iArr4;
                        i11 = 4;
                        i12 = i40;
                        if (fVar.f9833g <= 0) {
                            a.e(aVar);
                            if (iArr[i12] == 0) {
                                b(fVar, i12);
                                fVar.f9806E = ((int[]) c0505b2.f7074d)[iArr3[3]];
                            }
                            iArr[i12] = iArr[i12] - i12;
                            a.b(aVar);
                            int iG5 = g((int[]) c0505b2.f7073c, fVar.f9806E, aVar);
                            i13 = iG5 >>> 6;
                            fVar.f9807F = 0;
                            if (i13 >= 2) {
                                i13 -= 2;
                                fVar.f9807F = -1;
                            }
                            int i613 = f9797o[i13] + ((iG5 >>> 3) & 7);
                            int i614 = f9798p[i13] + (iG5 & 7);
                            fVar.f9849x = a.d(aVar, f9794l[i613]) + f9793k[i613];
                            fVar.f9813L = a.d(aVar, f9796n[i614]) + f9795m[i614];
                            c10 = 0;
                            fVar.f9848w = 0;
                            fVar.f9827a = 6;
                            if (!fVar.f9846u) {
                                int i615 = fVar.f9844r;
                                i14 = bArr[(i615 - 1) & i36] & UnsignedBytes.MAX_VALUE;
                                i15 = bArr[(i615 - 2) & i36] & UnsignedBytes.MAX_VALUE;
                                while (true) {
                                    if (fVar.f9848w < fVar.f9849x) {
                                        a.e(aVar);
                                        if (iArr[0] == 0) {
                                            d(fVar);
                                        }
                                        byte[] bArr10 = fVar.f9851z;
                                        int i616 = fVar.f9802A;
                                        int[] iArr13 = f9783a;
                                        int i617 = bArr10[i616 + (iArr13[fVar.f9805D + i15] | iArr13[fVar.f9804C + i14])] & UnsignedBytes.MAX_VALUE;
                                        iArr[0] = iArr[0] - 1;
                                        a.b(aVar);
                                        iG = g((int[]) c0505b3.f7073c, ((int[]) c0505b3.f7074d)[i617], aVar);
                                        i16 = fVar.f9844r;
                                        bArr[i16] = (byte) iG;
                                        fVar.f9848w++;
                                        fVar.f9844r = i16 + 1;
                                        if (i16 == i36) {
                                            i17 = 6;
                                            fVar.f9828b = 6;
                                            fVar.f9825X = fVar.f9817P;
                                            fVar.f9824W = 0;
                                            fVar.f9827a = 12;
                                        } else {
                                            int i618 = i14;
                                            i14 = iG;
                                            i15 = i618;
                                        }
                                    }
                                }
                                if (fVar.f9827a != i17) {
                                    i18 = fVar.f9833g - fVar.f9849x;
                                    fVar.f9833g = i18;
                                    if (i18 <= 0) {
                                        if (fVar.f9807F < 0) {
                                            a.e(aVar);
                                            if (iArr[2] == 0) {
                                                b(fVar, 2);
                                                fVar.f9803B = iArr3[5] << 2;
                                            }
                                            iArr[2] = iArr[2] - 1;
                                            a.b(aVar);
                                            int[] iArr14 = (int[]) c0505b.f7073c;
                                            int[] iArr15 = (int[]) c0505b.f7074d;
                                            byte[] bArr11 = fVar.f9808G;
                                            int i619 = fVar.f9803B;
                                            i25 = fVar.f9813L;
                                            if (i25 > i11) {
                                                i26 = 3;
                                            } else {
                                                i26 = i25 - 2;
                                            }
                                            iG2 = g(iArr14, iArr15[bArr11[i619 + i26] & UnsignedBytes.MAX_VALUE], aVar);
                                            fVar.f9807F = iG2;
                                            i27 = fVar.f9809H;
                                            if (iG2 >= i27) {
                                                int i6110 = iG2 - i27;
                                                int i6111 = fVar.f9810I & i6110;
                                                int i79 = i6110 >>> fVar.f9811J;
                                                fVar.f9807F = i79;
                                                int i710 = (i79 >>> 1) + 1;
                                                fVar.f9807F = i27 + i6111 + ((a.d(aVar, i710) + ((((i79 & 1) + 2) << i710) - 4)) << fVar.f9811J);
                                            }
                                        }
                                        i19 = fVar.f9807F;
                                        i20 = fVar.t;
                                        iArr2 = fVar.f9843q;
                                        if (i19 < 16) {
                                            i21 = iArr2[(f9786d[i19] + i20) & 3] + f9787e[i19];
                                        } else {
                                            i21 = i19 - 15;
                                        }
                                        fVar.f9812K = i21;
                                        if (i21 >= 0) {
                                            throw new c("Negative distance");
                                        }
                                        i22 = fVar.f9845s;
                                        i23 = fVar.f9815N;
                                        if (i22 != i23) {
                                            fVar.f9845s = i23;
                                        } else {
                                            fVar.f9845s = i23;
                                        }
                                        fVar.f9814M = fVar.f9844r;
                                        if (i21 > fVar.f9845s) {
                                            if (i19 > 0) {
                                                iArr2[i20 & 3] = i21;
                                                fVar.t = i20 + 1;
                                            }
                                            if (fVar.f9813L <= fVar.f9833g) {
                                                throw new c("Invalid backward reference");
                                            }
                                            fVar.f9848w = 0;
                                            fVar.f9827a = 7;
                                            int i711 = fVar.f9844r;
                                            i29 = (i711 - fVar.f9812K) & i36;
                                            i30 = fVar.f9813L - fVar.f9848w;
                                            if (i29 + i30 < i36) {
                                                while (true) {
                                                    i31 = fVar.f9848w;
                                                    if (i31 < fVar.f9813L) {
                                                        i32 = fVar.f9844r;
                                                        bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                        fVar.f9833g--;
                                                        fVar.f9848w = i31 + 1;
                                                        fVar.f9844r = i32 + 1;
                                                        if (i32 == i36) {
                                                            i33 = 7;
                                                            fVar.f9828b = 7;
                                                            fVar.f9825X = fVar.f9817P;
                                                            fVar.f9824W = 0;
                                                            fVar.f9827a = 12;
                                                        }
                                                    } else {
                                                        i33 = 7;
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    i31 = fVar.f9848w;
                                                    if (i31 < fVar.f9813L) {
                                                        i32 = fVar.f9844r;
                                                        bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                        fVar.f9833g--;
                                                        fVar.f9848w = i31 + 1;
                                                        fVar.f9844r = i32 + 1;
                                                        if (i32 == i36) {
                                                            i33 = 7;
                                                            fVar.f9828b = 7;
                                                            fVar.f9825X = fVar.f9817P;
                                                            fVar.f9824W = 0;
                                                            fVar.f9827a = 12;
                                                        }
                                                    } else {
                                                        i33 = 7;
                                                    }
                                                }
                                            }
                                            if (fVar.f9827a == i33) {
                                                fVar.f9827a = 3;
                                            }
                                        } else {
                                            fVar.f9827a = 9;
                                        }
                                    } else {
                                        fVar.f9827a = 3;
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            } else {
                                while (fVar.f9848w < fVar.f9849x) {
                                    a.e(aVar);
                                    if (iArr[c10] == 0) {
                                        d(fVar);
                                    }
                                    iArr[c10] = iArr[c10] - 1;
                                    a.b(aVar);
                                    bArr[fVar.f9844r] = (byte) g((int[]) c0505b3.f7073c, fVar.f9847v, aVar);
                                    fVar.f9848w++;
                                    i28 = fVar.f9844r;
                                    fVar.f9844r = i28 + 1;
                                    if (i28 == i36) {
                                        fVar.f9828b = 6;
                                        fVar.f9825X = fVar.f9817P;
                                        fVar.f9824W = 0;
                                        fVar.f9827a = 12;
                                    } else {
                                        c10 = 0;
                                    }
                                }
                            }
                            i17 = 6;
                            if (fVar.f9827a != i17) {
                                i18 = fVar.f9833g - fVar.f9849x;
                                fVar.f9833g = i18;
                                if (i18 <= 0) {
                                    if (fVar.f9807F < 0) {
                                        a.e(aVar);
                                        if (iArr[2] == 0) {
                                            b(fVar, 2);
                                            fVar.f9803B = iArr3[5] << 2;
                                        }
                                        iArr[2] = iArr[2] - 1;
                                        a.b(aVar);
                                        int[] iArr16 = (int[]) c0505b.f7073c;
                                        int[] iArr17 = (int[]) c0505b.f7074d;
                                        byte[] bArr12 = fVar.f9808G;
                                        int i6112 = fVar.f9803B;
                                        i25 = fVar.f9813L;
                                        if (i25 > i11) {
                                            i26 = 3;
                                        } else {
                                            i26 = i25 - 2;
                                        }
                                        iG2 = g(iArr16, iArr17[bArr12[i6112 + i26] & UnsignedBytes.MAX_VALUE], aVar);
                                        fVar.f9807F = iG2;
                                        i27 = fVar.f9809H;
                                        if (iG2 >= i27) {
                                            int i6113 = iG2 - i27;
                                            int i6114 = fVar.f9810I & i6113;
                                            int i712 = i6113 >>> fVar.f9811J;
                                            fVar.f9807F = i712;
                                            int i713 = (i712 >>> 1) + 1;
                                            fVar.f9807F = i27 + i6114 + ((a.d(aVar, i713) + ((((i712 & 1) + 2) << i713) - 4)) << fVar.f9811J);
                                        }
                                    }
                                    i19 = fVar.f9807F;
                                    i20 = fVar.t;
                                    iArr2 = fVar.f9843q;
                                    if (i19 < 16) {
                                        i21 = iArr2[(f9786d[i19] + i20) & 3] + f9787e[i19];
                                    } else {
                                        i21 = i19 - 15;
                                    }
                                    fVar.f9812K = i21;
                                    if (i21 >= 0) {
                                        throw new c("Negative distance");
                                    }
                                    i22 = fVar.f9845s;
                                    i23 = fVar.f9815N;
                                    if (i22 != i23) {
                                        fVar.f9845s = i23;
                                    } else {
                                        fVar.f9845s = i23;
                                    }
                                    fVar.f9814M = fVar.f9844r;
                                    if (i21 > fVar.f9845s) {
                                        if (i19 > 0) {
                                            iArr2[i20 & 3] = i21;
                                            fVar.t = i20 + 1;
                                        }
                                        if (fVar.f9813L <= fVar.f9833g) {
                                            throw new c("Invalid backward reference");
                                        }
                                        fVar.f9848w = 0;
                                        fVar.f9827a = 7;
                                        int i714 = fVar.f9844r;
                                        i29 = (i714 - fVar.f9812K) & i36;
                                        i30 = fVar.f9813L - fVar.f9848w;
                                        if (i29 + i30 < i36) {
                                            while (true) {
                                                i31 = fVar.f9848w;
                                                if (i31 < fVar.f9813L) {
                                                    i32 = fVar.f9844r;
                                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                    fVar.f9833g--;
                                                    fVar.f9848w = i31 + 1;
                                                    fVar.f9844r = i32 + 1;
                                                    if (i32 == i36) {
                                                        i33 = 7;
                                                        fVar.f9828b = 7;
                                                        fVar.f9825X = fVar.f9817P;
                                                        fVar.f9824W = 0;
                                                        fVar.f9827a = 12;
                                                    }
                                                } else {
                                                    i33 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i31 = fVar.f9848w;
                                                if (i31 < fVar.f9813L) {
                                                    i32 = fVar.f9844r;
                                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                    fVar.f9833g--;
                                                    fVar.f9848w = i31 + 1;
                                                    fVar.f9844r = i32 + 1;
                                                    if (i32 == i36) {
                                                        i33 = 7;
                                                        fVar.f9828b = 7;
                                                        fVar.f9825X = fVar.f9817P;
                                                        fVar.f9824W = 0;
                                                        fVar.f9827a = 12;
                                                    }
                                                } else {
                                                    i33 = 7;
                                                }
                                            }
                                        }
                                        if (fVar.f9827a == i33) {
                                            fVar.f9827a = 3;
                                        }
                                    } else {
                                        fVar.f9827a = 9;
                                    }
                                } else {
                                    fVar.f9827a = 3;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            fVar.f9827a = i12;
                        }
                        break;
                    case 4:
                        c11 = 11;
                        while (fVar.f9833g > 0) {
                            a.e(aVar);
                            a.d(aVar, 8);
                            fVar.f9833g--;
                        }
                        fVar.f9827a = 1;
                        c6 = c11;
                        break;
                    case 5:
                        c11 = 11;
                        byte[] bArr13 = fVar.f9830d;
                        int i80 = fVar.f9833g;
                        if (i80 <= 0) {
                            if (aVar.f9776g == 64) {
                                a.e(aVar);
                                a.a(aVar, false);
                                a.b(aVar);
                                a.b(aVar);
                            }
                            fVar.f9827a = i40;
                        } else {
                            int iMin2 = Math.min(fVar.f9817P - fVar.f9844r, i80);
                            int i81 = fVar.f9844r;
                            if ((aVar.f9776g & 7) != 0) {
                                throw new c("Unaligned copyBytes");
                            }
                            int i82 = iMin2;
                            while (true) {
                                int i83 = aVar.f9776g;
                                if (i83 != 64 && i82 != 0) {
                                    bArr13[i81] = (byte) (aVar.f9775f >>> i83);
                                    aVar.f9776g = i83 + 8;
                                    i82--;
                                    i81++;
                                }
                            }
                            if (i82 != 0) {
                                int iMin3 = Math.min(a.c(aVar), i82 >> 2);
                                if (iMin3 > 0) {
                                    int i84 = iMin3 << 2;
                                    System.arraycopy(aVar.f9770a, aVar.f9777h << 2, bArr13, i81, i84);
                                    i81 += i84;
                                    i82 -= i84;
                                    aVar.f9777h += iMin3;
                                }
                                if (i82 != 0) {
                                    if (a.c(aVar) > 0) {
                                        a.b(aVar);
                                        while (i82 != 0) {
                                            long j10 = aVar.f9775f;
                                            int i85 = aVar.f9776g;
                                            bArr13[i81] = (byte) (j10 >>> i85);
                                            aVar.f9776g = i85 + 8;
                                            i82--;
                                            i81++;
                                        }
                                        a.a(aVar, false);
                                    } else {
                                        while (i82 > 0) {
                                            try {
                                                int i86 = aVar.f9773d.read(bArr13, i81, i82);
                                                if (i86 == -1) {
                                                    throw new c("Unexpected end of input");
                                                }
                                                i81 += i86;
                                                i82 -= i86;
                                            } catch (IOException e10) {
                                                throw new c("Failed to read input", e10);
                                            }
                                        }
                                    }
                                }
                            }
                            fVar.f9833g -= iMin2;
                            int i87 = fVar.f9844r + iMin2;
                            fVar.f9844r = i87;
                            int i88 = fVar.f9817P;
                            if (i87 == i88) {
                                fVar.f9828b = 5;
                                fVar.f9825X = i88;
                                fVar.f9824W = 0;
                                fVar.f9827a = 12;
                            } else {
                                if (aVar.f9776g == 64) {
                                    a.e(aVar);
                                    a.a(aVar, false);
                                    a.b(aVar);
                                    a.b(aVar);
                                }
                                fVar.f9827a = 1;
                            }
                        }
                        c6 = c11;
                        break;
                    case 6:
                        iArr = iArr4;
                        i11 = 4;
                        c10 = 0;
                        c6 = 11;
                        if (!fVar.f9846u) {
                            int i6115 = fVar.f9844r;
                            i14 = bArr[(i6115 - 1) & i36] & UnsignedBytes.MAX_VALUE;
                            i15 = bArr[(i6115 - 2) & i36] & UnsignedBytes.MAX_VALUE;
                            while (true) {
                                if (fVar.f9848w < fVar.f9849x) {
                                    a.e(aVar);
                                    if (iArr[0] == 0) {
                                        d(fVar);
                                    }
                                    byte[] bArr14 = fVar.f9851z;
                                    int i6116 = fVar.f9802A;
                                    int[] iArr18 = f9783a;
                                    int i6117 = bArr14[i6116 + (iArr18[fVar.f9805D + i15] | iArr18[fVar.f9804C + i14])] & UnsignedBytes.MAX_VALUE;
                                    iArr[0] = iArr[0] - 1;
                                    a.b(aVar);
                                    iG = g((int[]) c0505b3.f7073c, ((int[]) c0505b3.f7074d)[i6117], aVar);
                                    i16 = fVar.f9844r;
                                    bArr[i16] = (byte) iG;
                                    fVar.f9848w++;
                                    fVar.f9844r = i16 + 1;
                                    if (i16 == i36) {
                                        i17 = 6;
                                        fVar.f9828b = 6;
                                        fVar.f9825X = fVar.f9817P;
                                        fVar.f9824W = 0;
                                        fVar.f9827a = 12;
                                    } else {
                                        int i6118 = i14;
                                        i14 = iG;
                                        i15 = i6118;
                                    }
                                }
                            }
                            if (fVar.f9827a != i17) {
                                i18 = fVar.f9833g - fVar.f9849x;
                                fVar.f9833g = i18;
                                if (i18 <= 0) {
                                    if (fVar.f9807F < 0) {
                                        a.e(aVar);
                                        if (iArr[2] == 0) {
                                            b(fVar, 2);
                                            fVar.f9803B = iArr3[5] << 2;
                                        }
                                        iArr[2] = iArr[2] - 1;
                                        a.b(aVar);
                                        int[] iArr19 = (int[]) c0505b.f7073c;
                                        int[] iArr110 = (int[]) c0505b.f7074d;
                                        byte[] bArr15 = fVar.f9808G;
                                        int i6119 = fVar.f9803B;
                                        i25 = fVar.f9813L;
                                        if (i25 > i11) {
                                            i26 = 3;
                                        } else {
                                            i26 = i25 - 2;
                                        }
                                        iG2 = g(iArr19, iArr110[bArr15[i6119 + i26] & UnsignedBytes.MAX_VALUE], aVar);
                                        fVar.f9807F = iG2;
                                        i27 = fVar.f9809H;
                                        if (iG2 >= i27) {
                                            int i61110 = iG2 - i27;
                                            int i61111 = fVar.f9810I & i61110;
                                            int i715 = i61110 >>> fVar.f9811J;
                                            fVar.f9807F = i715;
                                            int i716 = (i715 >>> 1) + 1;
                                            fVar.f9807F = i27 + i61111 + ((a.d(aVar, i716) + ((((i715 & 1) + 2) << i716) - 4)) << fVar.f9811J);
                                        }
                                    }
                                    i19 = fVar.f9807F;
                                    i20 = fVar.t;
                                    iArr2 = fVar.f9843q;
                                    if (i19 < 16) {
                                        i21 = iArr2[(f9786d[i19] + i20) & 3] + f9787e[i19];
                                    } else {
                                        i21 = i19 - 15;
                                    }
                                    fVar.f9812K = i21;
                                    if (i21 >= 0) {
                                        throw new c("Negative distance");
                                    }
                                    i22 = fVar.f9845s;
                                    i23 = fVar.f9815N;
                                    if (i22 != i23) {
                                        fVar.f9845s = i23;
                                    } else {
                                        fVar.f9845s = i23;
                                    }
                                    fVar.f9814M = fVar.f9844r;
                                    if (i21 > fVar.f9845s) {
                                        if (i19 > 0) {
                                            iArr2[i20 & 3] = i21;
                                            fVar.t = i20 + 1;
                                        }
                                        if (fVar.f9813L <= fVar.f9833g) {
                                            throw new c("Invalid backward reference");
                                        }
                                        fVar.f9848w = 0;
                                        fVar.f9827a = 7;
                                        int i717 = fVar.f9844r;
                                        i29 = (i717 - fVar.f9812K) & i36;
                                        i30 = fVar.f9813L - fVar.f9848w;
                                        if (i29 + i30 < i36) {
                                            while (true) {
                                                i31 = fVar.f9848w;
                                                if (i31 < fVar.f9813L) {
                                                    i32 = fVar.f9844r;
                                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                    fVar.f9833g--;
                                                    fVar.f9848w = i31 + 1;
                                                    fVar.f9844r = i32 + 1;
                                                    if (i32 == i36) {
                                                        i33 = 7;
                                                        fVar.f9828b = 7;
                                                        fVar.f9825X = fVar.f9817P;
                                                        fVar.f9824W = 0;
                                                        fVar.f9827a = 12;
                                                    }
                                                } else {
                                                    i33 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i31 = fVar.f9848w;
                                                if (i31 < fVar.f9813L) {
                                                    i32 = fVar.f9844r;
                                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                    fVar.f9833g--;
                                                    fVar.f9848w = i31 + 1;
                                                    fVar.f9844r = i32 + 1;
                                                    if (i32 == i36) {
                                                        i33 = 7;
                                                        fVar.f9828b = 7;
                                                        fVar.f9825X = fVar.f9817P;
                                                        fVar.f9824W = 0;
                                                        fVar.f9827a = 12;
                                                    }
                                                } else {
                                                    i33 = 7;
                                                }
                                            }
                                        }
                                        if (fVar.f9827a == i33) {
                                            fVar.f9827a = 3;
                                        }
                                    } else {
                                        fVar.f9827a = 9;
                                    }
                                } else {
                                    fVar.f9827a = 3;
                                }
                            } else {
                                continue;
                            }
                            break;
                        } else {
                            while (fVar.f9848w < fVar.f9849x) {
                                a.e(aVar);
                                if (iArr[c10] == 0) {
                                    d(fVar);
                                }
                                iArr[c10] = iArr[c10] - 1;
                                a.b(aVar);
                                bArr[fVar.f9844r] = (byte) g((int[]) c0505b3.f7073c, fVar.f9847v, aVar);
                                fVar.f9848w++;
                                i28 = fVar.f9844r;
                                fVar.f9844r = i28 + 1;
                                if (i28 == i36) {
                                    fVar.f9828b = 6;
                                    fVar.f9825X = fVar.f9817P;
                                    fVar.f9824W = 0;
                                    fVar.f9827a = 12;
                                } else {
                                    c10 = 0;
                                }
                            }
                        }
                        i17 = 6;
                        if (fVar.f9827a != i17) {
                            i18 = fVar.f9833g - fVar.f9849x;
                            fVar.f9833g = i18;
                            if (i18 <= 0) {
                                if (fVar.f9807F < 0) {
                                    a.e(aVar);
                                    if (iArr[2] == 0) {
                                        b(fVar, 2);
                                        fVar.f9803B = iArr3[5] << 2;
                                    }
                                    iArr[2] = iArr[2] - 1;
                                    a.b(aVar);
                                    int[] iArr111 = (int[]) c0505b.f7073c;
                                    int[] iArr112 = (int[]) c0505b.f7074d;
                                    byte[] bArr16 = fVar.f9808G;
                                    int i61112 = fVar.f9803B;
                                    i25 = fVar.f9813L;
                                    if (i25 > i11) {
                                        i26 = 3;
                                    } else {
                                        i26 = i25 - 2;
                                    }
                                    iG2 = g(iArr111, iArr112[bArr16[i61112 + i26] & UnsignedBytes.MAX_VALUE], aVar);
                                    fVar.f9807F = iG2;
                                    i27 = fVar.f9809H;
                                    if (iG2 >= i27) {
                                        int i61113 = iG2 - i27;
                                        int i61114 = fVar.f9810I & i61113;
                                        int i718 = i61113 >>> fVar.f9811J;
                                        fVar.f9807F = i718;
                                        int i719 = (i718 >>> 1) + 1;
                                        fVar.f9807F = i27 + i61114 + ((a.d(aVar, i719) + ((((i718 & 1) + 2) << i719) - 4)) << fVar.f9811J);
                                    }
                                }
                                i19 = fVar.f9807F;
                                i20 = fVar.t;
                                iArr2 = fVar.f9843q;
                                if (i19 < 16) {
                                    i21 = iArr2[(f9786d[i19] + i20) & 3] + f9787e[i19];
                                } else {
                                    i21 = i19 - 15;
                                }
                                fVar.f9812K = i21;
                                if (i21 >= 0) {
                                    throw new c("Negative distance");
                                }
                                i22 = fVar.f9845s;
                                i23 = fVar.f9815N;
                                if (i22 != i23) {
                                    fVar.f9845s = i23;
                                } else {
                                    fVar.f9845s = i23;
                                }
                                fVar.f9814M = fVar.f9844r;
                                if (i21 > fVar.f9845s) {
                                    if (i19 > 0) {
                                        iArr2[i20 & 3] = i21;
                                        fVar.t = i20 + 1;
                                    }
                                    if (fVar.f9813L <= fVar.f9833g) {
                                        throw new c("Invalid backward reference");
                                    }
                                    fVar.f9848w = 0;
                                    fVar.f9827a = 7;
                                    int i7110 = fVar.f9844r;
                                    i29 = (i7110 - fVar.f9812K) & i36;
                                    i30 = fVar.f9813L - fVar.f9848w;
                                    if (i29 + i30 < i36) {
                                        while (true) {
                                            i31 = fVar.f9848w;
                                            if (i31 < fVar.f9813L) {
                                                i32 = fVar.f9844r;
                                                bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                fVar.f9833g--;
                                                fVar.f9848w = i31 + 1;
                                                fVar.f9844r = i32 + 1;
                                                if (i32 == i36) {
                                                    i33 = 7;
                                                    fVar.f9828b = 7;
                                                    fVar.f9825X = fVar.f9817P;
                                                    fVar.f9824W = 0;
                                                    fVar.f9827a = 12;
                                                }
                                            } else {
                                                i33 = 7;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i31 = fVar.f9848w;
                                            if (i31 < fVar.f9813L) {
                                                i32 = fVar.f9844r;
                                                bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                                fVar.f9833g--;
                                                fVar.f9848w = i31 + 1;
                                                fVar.f9844r = i32 + 1;
                                                if (i32 == i36) {
                                                    i33 = 7;
                                                    fVar.f9828b = 7;
                                                    fVar.f9825X = fVar.f9817P;
                                                    fVar.f9824W = 0;
                                                    fVar.f9827a = 12;
                                                }
                                            } else {
                                                i33 = 7;
                                            }
                                        }
                                    }
                                    if (fVar.f9827a == i33) {
                                        fVar.f9827a = 3;
                                    }
                                } else {
                                    fVar.f9827a = 9;
                                }
                            } else {
                                fVar.f9827a = 3;
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 7:
                        c6 = 11;
                        int i7111 = fVar.f9844r;
                        i29 = (i7111 - fVar.f9812K) & i36;
                        i30 = fVar.f9813L - fVar.f9848w;
                        if (i29 + i30 < i36) {
                            while (true) {
                                i31 = fVar.f9848w;
                                if (i31 < fVar.f9813L) {
                                    i32 = fVar.f9844r;
                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                    fVar.f9833g--;
                                    fVar.f9848w = i31 + 1;
                                    fVar.f9844r = i32 + 1;
                                    if (i32 == i36) {
                                        i33 = 7;
                                        fVar.f9828b = 7;
                                        fVar.f9825X = fVar.f9817P;
                                        fVar.f9824W = 0;
                                        fVar.f9827a = 12;
                                    }
                                } else {
                                    i33 = 7;
                                }
                            }
                        } else {
                            while (true) {
                                i31 = fVar.f9848w;
                                if (i31 < fVar.f9813L) {
                                    i32 = fVar.f9844r;
                                    bArr[i32] = bArr[(i32 - fVar.f9812K) & i36];
                                    fVar.f9833g--;
                                    fVar.f9848w = i31 + 1;
                                    fVar.f9844r = i32 + 1;
                                    if (i32 == i36) {
                                        i33 = 7;
                                        fVar.f9828b = 7;
                                        fVar.f9825X = fVar.f9817P;
                                        fVar.f9824W = 0;
                                        fVar.f9827a = 12;
                                    }
                                } else {
                                    i33 = 7;
                                }
                            }
                        }
                        if (fVar.f9827a == i33) {
                            fVar.f9827a = 3;
                        }
                        break;
                    case 8:
                        c11 = 11;
                        int i89 = fVar.f9817P;
                        System.arraycopy(bArr, i89, bArr, 0, fVar.f9814M - i89);
                        fVar.f9827a = 3;
                        c6 = c11;
                        break;
                    case 9:
                        int i90 = fVar.f9813L;
                        if (i90 < 4 || i90 > 24) {
                            throw new c("Invalid backward reference");
                        }
                        int i91 = f9789g[i90];
                        int i92 = (fVar.f9812K - fVar.f9845s) - 1;
                        int i93 = f9790h[i90];
                        int i94 = ((i40 << i93) - 1) & i92;
                        int i95 = i92 >>> i93;
                        int i96 = (i94 * i90) + i91;
                        g[] gVarArr = g.f9852d;
                        if (i95 >= gVarArr.length) {
                            throw new c("Invalid backward reference");
                        }
                        int i97 = fVar.f9814M;
                        byte[] bArr17 = e.f9801a;
                        g gVar = gVarArr[i95];
                        int i98 = i97;
                        for (byte b10 : gVar.f9853a) {
                            bArr[i98] = b10;
                            i98++;
                        }
                        int i99 = gVar.f9854b;
                        int i100 = i99 >= 12 ? i99 - 11 : 0;
                        if (i100 > i90) {
                            i100 = i90;
                        }
                        int i101 = i96 + i100;
                        int i102 = (i90 - i100) - (i99 <= 9 ? i99 : 0);
                        int i103 = i102;
                        while (i103 > 0) {
                            bArr[i98] = bArr17[i101];
                            i103--;
                            i98++;
                            i101++;
                        }
                        c11 = 11;
                        if (i99 == 11 || i99 == 10) {
                            int i104 = i98 - i102;
                            if (i99 == 10) {
                                i102 = i40;
                            }
                            while (i102 > 0) {
                                byte b11 = bArr[i104];
                                int i105 = b11 & UnsignedBytes.MAX_VALUE;
                                if (i105 < 192) {
                                    if (i105 >= 97 && i105 <= 122) {
                                        bArr[i104] = (byte) (b11 ^ 32);
                                    }
                                    i104++;
                                    i102--;
                                } else if (i105 < 224) {
                                    int i106 = i104 + 1;
                                    bArr[i106] = (byte) (bArr[i106] ^ 32);
                                    i104 += 2;
                                    i102 -= 2;
                                } else {
                                    int i107 = i104 + 2;
                                    bArr[i107] = (byte) (bArr[i107] ^ 5);
                                    i104 += 3;
                                    i102 -= 3;
                                }
                            }
                        }
                        byte[] bArr18 = gVar.f9855c;
                        for (byte b12 : bArr18) {
                            bArr[i98] = b12;
                            i98++;
                        }
                        int i108 = i98 - i97;
                        int i109 = fVar.f9814M + i108;
                        fVar.f9814M = i109;
                        fVar.f9844r += i108;
                        fVar.f9833g -= i108;
                        int i110 = fVar.f9817P;
                        if (i109 >= i110) {
                            fVar.f9828b = 8;
                            fVar.f9825X = i110;
                            fVar.f9824W = 0;
                            fVar.f9827a = 12;
                        } else {
                            fVar.f9827a = 3;
                        }
                        c6 = c11;
                        break;
                        break;
                    default:
                        throw new c("Unexpected state " + fVar.f9827a);
                }
            } else {
                c6 = c12;
                int i111 = fVar.f9820S;
                if (i111 != 0) {
                    fVar.f9824W += i111;
                    fVar.f9820S = 0;
                }
                int iMin4 = Math.min(fVar.f9822U - fVar.f9823V, fVar.f9825X - fVar.f9824W);
                if (iMin4 != 0) {
                    System.arraycopy(fVar.f9830d, fVar.f9824W, fVar.f9826Y, fVar.f9821T + fVar.f9823V, iMin4);
                    fVar.f9823V += iMin4;
                    fVar.f9824W += iMin4;
                }
                if (fVar.f9823V >= fVar.f9822U) {
                    return;
                }
                int i112 = fVar.f9844r;
                int i113 = fVar.f9815N;
                if (i112 >= i113) {
                    fVar.f9845s = i113;
                }
                fVar.f9844r = i112 & i36;
                fVar.f9827a = fVar.f9828b;
            }
            c12 = c6;
            i35 = 1;
        }
    }

    public static void f(int i7, int[] iArr, int i10, a aVar) {
        int i11;
        int i12;
        int i13;
        a.e(aVar);
        int[] iArr2 = new int[i7];
        int iD = a.d(aVar, 2);
        char c6 = 3;
        boolean z3 = false;
        boolean z8 = true;
        if (iD == 1) {
            int i14 = i7 - 1;
            int[] iArr3 = new int[4];
            int iD2 = a.d(aVar, 2) + 1;
            int i15 = 0;
            while (i14 != 0) {
                i14 >>= 1;
                i15++;
            }
            for (int i16 = 0; i16 < iD2; i16++) {
                int iD3 = a.d(aVar, i15) % i7;
                iArr3[i16] = iD3;
                iArr2[iD3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (iD2 != 1) {
                if (iD2 == 2) {
                    int i17 = iArr3[0];
                    int i18 = iArr3[1];
                    z3 = i17 != i18;
                    iArr2[i18] = 1;
                } else if (iD2 != 3) {
                    int i19 = iArr3[0];
                    int i20 = iArr3[1];
                    boolean z10 = (i19 == i20 || i19 == (i12 = iArr3[2]) || i19 == (i13 = iArr3[3]) || i20 == i12 || i20 == i13 || i12 == i13) ? false : true;
                    if (a.d(aVar, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z8 = z10;
                } else {
                    int i21 = iArr3[0];
                    int i22 = iArr3[1];
                    if (i21 != i22 && i21 != (i11 = iArr3[2]) && i22 != i11) {
                        z3 = true;
                    }
                }
                z8 = z3;
            }
        } else {
            int[] iArr4 = new int[18];
            int i23 = 0;
            int i24 = 32;
            while (iD < 18 && i24 > 0) {
                int i25 = f9785c[iD];
                a.b(aVar);
                long j6 = aVar.f9775f;
                char c10 = c6;
                int i26 = aVar.f9776g;
                int i27 = f9788f[((int) (j6 >>> i26)) & 15];
                aVar.f9776g = i26 + (i27 >> 16);
                int i28 = i27 & 65535;
                iArr4[i25] = i28;
                if (i28 != 0) {
                    i24 -= 32 >> i28;
                    i23++;
                }
                iD++;
                c6 = c10;
            }
            if (i23 != 1 && i24 != 0) {
                z8 = false;
            }
            int[] iArr5 = new int[32];
            a(0, 5, iArr5, iArr4, 18);
            int i29 = 8;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 32768;
            while (i30 < i7 && i33 > 0) {
                a.e(aVar);
                a.b(aVar);
                long j10 = aVar.f9775f;
                int i34 = aVar.f9776g;
                int i35 = iArr5[((int) (j10 >>> i34)) & 31];
                aVar.f9776g = i34 + (i35 >> 16);
                int i36 = i35 & 65535;
                if (i36 < 16) {
                    int i37 = i30 + 1;
                    iArr2[i30] = i36;
                    if (i36 != 0) {
                        i33 -= 32768 >> i36;
                        i29 = i36;
                    }
                    i30 = i37;
                    i32 = 0;
                } else {
                    int i38 = i36 - 14;
                    int i39 = i36 == 16 ? i29 : 0;
                    if (i31 != i39) {
                        i31 = i39;
                        i32 = 0;
                    }
                    int iD4 = a.d(aVar, i38) + 3 + (i32 > 0 ? (i32 - 2) << i38 : i32);
                    int i40 = iD4 - i32;
                    if (i30 + i40 > i7) {
                        throw new c("symbol + repeatDelta > numSymbols");
                    }
                    int i41 = 0;
                    while (i41 < i40) {
                        iArr2[i30] = i31;
                        i41++;
                        i30++;
                    }
                    if (i31 != 0) {
                        i33 -= i40 << (15 - i31);
                    }
                    i32 = iD4;
                }
            }
            if (i33 != 0) {
                throw new c("Unused space");
            }
            int i42 = i7 - i30;
            int i43 = 0;
            while (i43 < i42) {
                int iMin = Math.min(i43 + 1024, i42) - i43;
                System.arraycopy(f9800r, 0, iArr2, i30 + i43, iMin);
                i43 += iMin;
            }
        }
        if (!z8) {
            throw new c("Can't readHuffmanCode");
        }
        a(i10, 8, iArr, iArr2, i7);
    }

    public static int g(int[] iArr, int i7, a aVar) {
        long j6 = aVar.f9775f;
        int i10 = aVar.f9776g;
        int i11 = (int) (j6 >>> i10);
        int i12 = i7 + (i11 & 255);
        int i13 = iArr[i12];
        int i14 = i13 >> 16;
        int i15 = i13 & 65535;
        if (i14 <= 8) {
            aVar.f9776g = i10 + i14;
            return i15;
        }
        int i16 = iArr[i12 + i15 + ((i11 & ((1 << i14) - 1)) >>> 8)];
        aVar.f9776g = (i16 >> 16) + 8 + i10;
        return i16 & 65535;
    }
}

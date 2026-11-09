package com.google.zxing.datamatrix.encoder;

import C0.G;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{228, 48, 15, HomeDialogState.PRIORITY_HIGHEST_111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, ModuleDescriptor.MODULE_VERSION, 166, 223, 248, 116, 255, HomeDialogState.PRIORITY_HIGHEST, 61}, new int[]{175, 138, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 12, 194, 168, 39, 245, 60, 97, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, JfifUtil.MARKER_SOFn, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, ModuleDescriptor.MODULE_VERSION}, new int[]{83, 195, 100, 39, PictureConfig.CHOOSE_REQUEST, 75, 66, 61, 241, 213, 109, 129, 94, 254, JfifUtil.MARKER_APP1, 48, 90, PictureConfig.CHOOSE_REQUEST}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, PictureConfig.CHOOSE_REQUEST, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, MsgEvent.MSG_EVENT_STOP_FOREGROUND, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, HomeDialogState.PRIORITY_HIGHEST, 213, 141, 136, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, JfifUtil.MARKER_SOS, 130, 250, 162, 181, 102, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, JfifUtil.MARKER_APP1, 98, 81, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, HomeDialogState.PRIORITY_HIGHEST_111, 57, 121, 21, 1, 253, 57, 54, 101, 248, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, PictureConfig.CHOOSE_REQUEST, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 131, 88, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, JfifUtil.MARKER_APP1, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, JfifUtil.MARKER_RST0, 100, 29, 175, 170, 230, JfifUtil.MARKER_SOFn, JfifUtil.MARKER_RST7, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, JfifUtil.MARKER_SOS, 234, 117, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 29, 232, 144, 238, 22, 150, MlKitException.CODE_SCANNER_CANCELLED, 117, 62, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, PictureConfig.CHOOSE_REQUEST, MlKitException.CODE_SCANNER_CANCELLED, 189, 143, 108, 196, 37, ModuleDescriptor.MODULE_VERSION, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, 134, 230, 245, 63, 197, 190, 250, 106, ModuleDescriptor.MODULE_VERSION, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, JfifUtil.MARKER_SOS, 51, 63, 87, 10, 40, 130, PictureConfig.CHOOSE_REQUEST, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, ModuleDescriptor.MODULE_VERSION, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, MsgEvent.MSG_EVENT_STOP_FOREGROUND, 82, 186}};
    private static final int[] LOG = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    private static final int[] ALOG = new int[255];

    static {
        int i7 = 1;
        for (int i10 = 0; i10 < 255; i10++) {
            ALOG[i10] = i7;
            LOG[i7] = i10;
            i7 *= 2;
            if (i7 >= 256) {
                i7 ^= MODULO_VALUE;
            }
        }
    }

    private ErrorCorrection() {
    }

    private static String createECCBlock(CharSequence charSequence, int i7) {
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i12 >= iArr.length) {
                i12 = -1;
                break;
            }
            if (iArr[i12] == i7) {
                break;
            }
            i12++;
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(G.m(i7, "Illegal number of error correction codewords specified: "));
        }
        int[] iArr2 = FACTORS[i12];
        char[] cArr = new char[i7];
        for (int i13 = 0; i13 < i7; i13++) {
            cArr[i13] = 0;
        }
        for (int i14 = 0; i14 < charSequence.length(); i14++) {
            int i15 = i7 - 1;
            int iCharAt = cArr[i15] ^ charSequence.charAt(i14);
            while (i15 > 0) {
                if (iCharAt == 0 || (i11 = iArr2[i15]) == 0) {
                    cArr[i15] = cArr[i15 - 1];
                } else {
                    char c6 = cArr[i15 - 1];
                    int[] iArr3 = ALOG;
                    int[] iArr4 = LOG;
                    cArr[i15] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i11]) % 255] ^ c6);
                }
                i15--;
            }
            if (iCharAt == 0 || (i10 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = ALOG;
                int[] iArr6 = LOG;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i10]) % 255];
            }
        }
        char[] cArr2 = new char[i7];
        for (int i16 = 0; i16 < i7; i16++) {
            cArr2[i16] = cArr[(i7 - i16) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb2 = new StringBuilder(symbolInfo.getErrorCodewords() + symbolInfo.getDataCapacity());
        sb2.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb2.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int i7 = 0;
            while (i7 < interleavedBlockCount) {
                int i10 = i7 + 1;
                iArr[i7] = symbolInfo.getDataLengthForInterleavedBlock(i10);
                iArr2[i7] = symbolInfo.getErrorLengthForInterleavedBlock(i10);
                i7 = i10;
            }
            for (int i11 = 0; i11 < interleavedBlockCount; i11++) {
                StringBuilder sb3 = new StringBuilder(iArr[i11]);
                for (int i12 = i11; i12 < symbolInfo.getDataCapacity(); i12 += interleavedBlockCount) {
                    sb3.append(str.charAt(i12));
                }
                String strCreateECCBlock = createECCBlock(sb3.toString(), iArr2[i11]);
                int i13 = 0;
                int i14 = i11;
                while (i14 < iArr2[i11] * interleavedBlockCount) {
                    sb2.setCharAt(symbolInfo.getDataCapacity() + i14, strCreateECCBlock.charAt(i13));
                    i14 += interleavedBlockCount;
                    i13++;
                }
            }
        }
        return sb2.toString();
    }
}

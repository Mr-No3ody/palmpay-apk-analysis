package com.google.zxing.maxicode.decoder;

import com.google.common.base.Ascii;
import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {
    private static final char ECI = 65530;
    private static final char FS = 28;
    private static final char GS = 29;
    private static final char LATCHA = 65527;
    private static final char LATCHB = 65528;
    private static final char LOCK = 65529;
    private static final char NS = 65531;
    private static final char PAD = 65532;
    private static final char RS = 30;
    private static final char SHIFTA = 65520;
    private static final char SHIFTB = 65521;
    private static final char SHIFTC = 65522;
    private static final char SHIFTD = 65523;
    private static final char SHIFTE = 65524;
    private static final char THREESHIFTA = 65526;
    private static final char TWOSHIFTA = 65525;
    private static final byte[] COUNTRY_BYTES = {53, 54, 43, 44, 45, 46, 47, 48, 37, 38};
    private static final byte[] SERVICE_CLASS_BYTES = {55, 56, 57, 58, 59, 60, 49, 50, 51, 52};
    private static final byte[] POSTCODE_2_LENGTH_BYTES = {39, 40, 41, 42, Ascii.US, 32};
    private static final byte[] POSTCODE_2_BYTES = {33, 34, 35, 36, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 1, 2};
    private static final byte[][] POSTCODE_3_BYTES = {new byte[]{39, 40, 41, 42, Ascii.US, 32}, new byte[]{33, 34, 35, 36, Ascii.EM, Ascii.SUB}, new byte[]{Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, 19, Ascii.DC4}, new byte[]{Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.CR, Ascii.SO}, new byte[]{Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 7, 8}, new byte[]{9, 10, Ascii.VT, Ascii.FF, 1, 2}};
    private static final String[] SETS = {"\rABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001e\ufffbÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"};

    private DecodedBitStreamParser() {
    }

    public static DecoderResult decode(byte[] bArr, int i7) throws FormatException {
        String postCode3;
        StringBuilder sb2 = new StringBuilder(144);
        if (i7 == 2 || i7 == 3) {
            if (i7 == 2) {
                int postCode2 = getPostCode2(bArr);
                int postCode2Length = getPostCode2Length(bArr);
                if (postCode2Length > 10) {
                    throw FormatException.getFormatInstance();
                }
                postCode3 = new DecimalFormat("0000000000".substring(0, postCode2Length)).format(postCode2);
            } else {
                postCode3 = getPostCode3(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(getCountry(bArr));
            String str2 = decimalFormat.format(getServiceClass(bArr));
            sb2.append(getMessage(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, postCode3 + GS + str + GS + str2 + GS);
            } else {
                sb2.insert(0, postCode3 + GS + str + GS + str2 + GS);
            }
        } else if (i7 == 4) {
            sb2.append(getMessage(bArr, 1, 93));
        } else if (i7 == 5) {
            sb2.append(getMessage(bArr, 1, 77));
        }
        return new DecoderResult(bArr, sb2.toString(), null, String.valueOf(i7));
    }

    private static int getBit(int i7, byte[] bArr) {
        int i10 = i7 - 1;
        return ((1 << (5 - (i10 % 6))) & bArr[i10 / 6]) == 0 ? 0 : 1;
    }

    private static int getCountry(byte[] bArr) {
        return getInt(bArr, COUNTRY_BYTES);
    }

    private static int getInt(byte[] bArr, byte[] bArr2) {
        int bit = 0;
        for (int i7 = 0; i7 < bArr2.length; i7++) {
            bit += getBit(bArr2[i7], bArr) << ((bArr2.length - i7) - 1);
        }
        return bit;
    }

    private static String getMessage(byte[] bArr, int i7, int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = i7;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        while (i11 < i7 + i10) {
            char cCharAt = SETS[i13].charAt(bArr[i11]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i14 = i13;
                    i13 = cCharAt - SHIFTA;
                    i12 = 1;
                    break;
                case 65525:
                    i12 = 2;
                    i14 = i13;
                    i13 = 0;
                    break;
                case 65526:
                    i12 = 3;
                    i14 = i13;
                    i13 = 0;
                    break;
                case 65527:
                    i12 = -1;
                    i13 = 0;
                    break;
                case 65528:
                    i12 = -1;
                    i13 = 1;
                    break;
                case 65529:
                    i12 = -1;
                    break;
                case 65530:
                default:
                    sb2.append(cCharAt);
                    break;
                case 65531:
                    int i15 = (bArr[i11 + 1] << Ascii.CAN) + (bArr[i11 + 2] << Ascii.DC2) + (bArr[i11 + 3] << Ascii.FF) + (bArr[i11 + 4] << 6);
                    i11 += 5;
                    sb2.append(new DecimalFormat("000000000").format(i15 + bArr[i11]));
                    break;
            }
            int i16 = i12 - 1;
            if (i12 == 0) {
                i13 = i14;
            }
            i11++;
            i12 = i16;
        }
        while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private static int getPostCode2(byte[] bArr) {
        return getInt(bArr, POSTCODE_2_BYTES);
    }

    private static int getPostCode2Length(byte[] bArr) {
        return getInt(bArr, POSTCODE_2_LENGTH_BYTES);
    }

    private static String getPostCode3(byte[] bArr) {
        byte[][] bArr2 = POSTCODE_3_BYTES;
        StringBuilder sb2 = new StringBuilder(bArr2.length);
        for (byte[] bArr3 : bArr2) {
            sb2.append(SETS[0].charAt(getInt(bArr, bArr3)));
        }
        return sb2.toString();
    }

    private static int getServiceClass(byte[] bArr) {
        return getInt(bArr, SERVICE_CLASS_BYTES);
    }
}

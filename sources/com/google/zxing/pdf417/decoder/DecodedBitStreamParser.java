package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.ECIStringBuilder;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i7 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i7 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i7] = bigIntegerArr2[i7 - 1].multiply(bigIntegerValueOf);
            i7++;
        }
    }

    private DecodedBitStreamParser() {
    }

    private static int byteCompaction(int i7, int[] iArr, int i10, ECIStringBuilder eCIStringBuilder) throws FormatException {
        int i11;
        int i12;
        boolean z3 = false;
        while (i10 < iArr[0] && !z3) {
            while (true) {
                i11 = iArr[0];
                if (i10 >= i11 || iArr[i10] != ECI_CHARSET) {
                    break;
                }
                eCIStringBuilder.appendECI(iArr[i10 + 1]);
                i10 += 2;
            }
            if (i10 >= i11 || iArr[i10] >= TEXT_COMPACTION_MODE_LATCH) {
                z3 = true;
            } else {
                long j6 = 0;
                int i13 = 0;
                while (true) {
                    i12 = i10 + 1;
                    j6 = (j6 * 900) + ((long) iArr[i10]);
                    i13++;
                    if (i13 >= 5 || i12 >= iArr[0] || iArr[i12] >= TEXT_COMPACTION_MODE_LATCH) {
                        break;
                    }
                    i10 = i12;
                }
                if (i13 != 5 || (i7 != BYTE_COMPACTION_MODE_LATCH_6 && (i12 >= iArr[0] || iArr[i12] >= TEXT_COMPACTION_MODE_LATCH))) {
                    i12 -= i13;
                    while (i12 < iArr[0] && !z3) {
                        int i14 = i12 + 1;
                        int i15 = iArr[i12];
                        if (i15 < TEXT_COMPACTION_MODE_LATCH) {
                            eCIStringBuilder.append((byte) i15);
                            i12 = i14;
                        } else if (i15 == ECI_CHARSET) {
                            i12 += 2;
                            eCIStringBuilder.appendECI(iArr[i14]);
                        } else {
                            z3 = true;
                        }
                    }
                } else {
                    for (int i16 = 0; i16 < 6; i16++) {
                        eCIStringBuilder.append((byte) (j6 >> ((5 - i16) * 8)));
                    }
                }
                i10 = i12;
            }
        }
        return i10;
    }

    public static DecoderResult decode(int[] iArr, String str) throws FormatException {
        ECIStringBuilder eCIStringBuilder = new ECIStringBuilder(iArr.length * 2);
        int iTextCompaction = textCompaction(iArr, 1, eCIStringBuilder);
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        while (iTextCompaction < iArr[0]) {
            int i7 = iTextCompaction + 1;
            int i10 = iArr[iTextCompaction];
            if (i10 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                switch (i10) {
                    case TEXT_COMPACTION_MODE_LATCH /* 900 */:
                        iTextCompaction = textCompaction(iArr, i7, eCIStringBuilder);
                        continue;
                    case BYTE_COMPACTION_MODE_LATCH /* 901 */:
                        break;
                    case NUMERIC_COMPACTION_MODE_LATCH /* 902 */:
                        iTextCompaction = numericCompaction(iArr, i7, eCIStringBuilder);
                        continue;
                    default:
                        switch (i10) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                throw FormatException.getFormatInstance();
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                break;
                            case ECI_USER_DEFINED /* 925 */:
                                iTextCompaction += 2;
                                continue;
                            case ECI_GENERAL_PURPOSE /* 926 */:
                                iTextCompaction += 3;
                                continue;
                            case ECI_CHARSET /* 927 */:
                                iTextCompaction += 2;
                                eCIStringBuilder.appendECI(iArr[i7]);
                                continue;
                            case 928:
                                iTextCompaction = decodeMacroBlock(iArr, i7, pDF417ResultMetadata);
                                continue;
                            default:
                                iTextCompaction = textCompaction(iArr, iTextCompaction, eCIStringBuilder);
                                continue;
                        }
                        break;
                }
                iTextCompaction = byteCompaction(i10, iArr, i7, eCIStringBuilder);
            } else {
                iTextCompaction += 2;
                eCIStringBuilder.append((char) iArr[i7]);
            }
        }
        if (eCIStringBuilder.isEmpty() && pDF417ResultMetadata.getFileId() == null) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, eCIStringBuilder.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static String decodeBase900toBase10(int[] iArr, int i7) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i10 = 0; i10 < i7; i10++) {
            bigIntegerAdd = bigIntegerAdd.add(EXP900[(i7 - i10) - 1].multiply(BigInteger.valueOf(iArr[i10])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] iArr, int i7, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        int i10;
        if (i7 + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i11 = 0;
        while (i11 < 2) {
            iArr2[i11] = iArr[i7];
            i11++;
            i7++;
        }
        String strDecodeBase900toBase10 = decodeBase900toBase10(iArr2, 2);
        if (strDecodeBase900toBase10.isEmpty()) {
            pDF417ResultMetadata.setSegmentIndex(0);
        } else {
            try {
                pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(strDecodeBase900toBase10));
            } catch (NumberFormatException unused) {
                throw FormatException.getFormatInstance();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (i7 < iArr[0] && i7 < iArr.length && (i10 = iArr[i7]) != MACRO_PDF417_TERMINATOR && i10 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
            sb2.append(String.format("%03d", Integer.valueOf(i10)));
            i7++;
        }
        if (sb2.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        pDF417ResultMetadata.setFileId(sb2.toString());
        int i12 = iArr[i7] == BEGIN_MACRO_PDF417_OPTIONAL_FIELD ? i7 + 1 : -1;
        while (i7 < iArr[0]) {
            int i13 = iArr[i7];
            if (i13 == MACRO_PDF417_TERMINATOR) {
                i7++;
                pDF417ResultMetadata.setLastSegment(true);
            } else {
                if (i13 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[i7 + 1]) {
                    case 0:
                        ECIStringBuilder eCIStringBuilder = new ECIStringBuilder();
                        i7 = textCompaction(iArr, i7 + 2, eCIStringBuilder);
                        pDF417ResultMetadata.setFileName(eCIStringBuilder.toString());
                        break;
                    case 1:
                        ECIStringBuilder eCIStringBuilder2 = new ECIStringBuilder();
                        i7 = numericCompaction(iArr, i7 + 2, eCIStringBuilder2);
                        try {
                            pDF417ResultMetadata.setSegmentCount(Integer.parseInt(eCIStringBuilder2.toString()));
                        } catch (NumberFormatException unused2) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 2:
                        ECIStringBuilder eCIStringBuilder3 = new ECIStringBuilder();
                        i7 = numericCompaction(iArr, i7 + 2, eCIStringBuilder3);
                        try {
                            pDF417ResultMetadata.setTimestamp(Long.parseLong(eCIStringBuilder3.toString()));
                        } catch (NumberFormatException unused3) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 3:
                        ECIStringBuilder eCIStringBuilder4 = new ECIStringBuilder();
                        i7 = textCompaction(iArr, i7 + 2, eCIStringBuilder4);
                        pDF417ResultMetadata.setSender(eCIStringBuilder4.toString());
                        break;
                    case 4:
                        ECIStringBuilder eCIStringBuilder5 = new ECIStringBuilder();
                        i7 = textCompaction(iArr, i7 + 2, eCIStringBuilder5);
                        pDF417ResultMetadata.setAddressee(eCIStringBuilder5.toString());
                        break;
                    case 5:
                        ECIStringBuilder eCIStringBuilder6 = new ECIStringBuilder();
                        i7 = numericCompaction(iArr, i7 + 2, eCIStringBuilder6);
                        try {
                            pDF417ResultMetadata.setFileSize(Long.parseLong(eCIStringBuilder6.toString()));
                        } catch (NumberFormatException unused4) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 6:
                        ECIStringBuilder eCIStringBuilder7 = new ECIStringBuilder();
                        i7 = numericCompaction(iArr, i7 + 2, eCIStringBuilder7);
                        try {
                            pDF417ResultMetadata.setChecksum(Integer.parseInt(eCIStringBuilder7.toString()));
                        } catch (NumberFormatException unused5) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i12 != -1) {
            int i14 = i7 - i12;
            if (pDF417ResultMetadata.isLastSegment()) {
                i14--;
            }
            if (i14 > 0) {
                pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i12, i14 + i12));
            }
        }
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[FALL_THROUGH, PHI: r3 r4
      0x0052: PHI (r3v10 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode) = 
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v2 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v3 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v5 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v12 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
     binds: [B:70:0x00dd, B:65:0x00cc, B:67:0x00d0, B:59:0x00b9, B:53:0x00a9, B:56:0x00af, B:46:0x0095, B:40:0x0083, B:42:0x0087, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r4v13 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode) = 
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v3 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v6 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v9 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
     binds: [B:70:0x00dd, B:65:0x00cc, B:67:0x00d0, B:59:0x00b9, B:53:0x00a9, B:56:0x00af, B:46:0x0095, B:40:0x0083, B:42:0x0087, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    private static Mode decodeTextCompaction(int[] iArr, int[] iArr2, int i7, ECIStringBuilder eCIStringBuilder, Mode mode) {
        int i10;
        char c6;
        Mode mode2;
        char c10;
        Mode mode3;
        Mode mode4 = mode;
        Mode mode5 = mode4;
        Mode mode6 = mode5;
        int i11 = 0;
        while (i11 < i7) {
            int i12 = iArr[i11];
            char c11 = ' ';
            switch (AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[mode5.ordinal()]) {
                case 1:
                    if (i12 >= 26) {
                        if (i12 != TEXT_COMPACTION_MODE_LATCH) {
                            if (i12 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                switch (i12) {
                                    case 26:
                                        break;
                                    case 27:
                                        mode4 = Mode.LOWER;
                                        break;
                                    case 28:
                                        mode4 = Mode.MIXED;
                                        break;
                                    case 29:
                                        mode6 = mode5;
                                        mode5 = Mode.PUNCT_SHIFT;
                                    default:
                                        c11 = 0;
                                        break;
                                }
                                mode3 = mode6;
                                mode6 = mode5;
                                c10 = c11;
                            } else {
                                eCIStringBuilder.append((char) iArr2[i11]);
                            }
                            c11 = 0;
                            mode3 = mode6;
                            mode6 = mode5;
                            c10 = c11;
                        } else {
                            mode4 = Mode.ALPHA;
                        }
                        c11 = 0;
                        mode5 = mode4;
                        mode3 = mode6;
                        mode6 = mode5;
                        c10 = c11;
                    } else {
                        i10 = i12 + 65;
                        c6 = (char) i10;
                        Mode mode7 = mode6;
                        mode6 = mode5;
                        c10 = c6;
                        mode3 = mode7;
                    }
                    break;
                case 2:
                    if (i12 >= 26) {
                        if (i12 != TEXT_COMPACTION_MODE_LATCH) {
                            if (i12 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                switch (i12) {
                                    case 27:
                                        mode2 = Mode.ALPHA_SHIFT;
                                        Mode mode8 = mode2;
                                        mode6 = mode5;
                                        mode5 = mode8;
                                        break;
                                    case 28:
                                        mode4 = Mode.MIXED;
                                        break;
                                    case 29:
                                        mode2 = Mode.PUNCT_SHIFT;
                                        Mode mode9 = mode2;
                                        mode6 = mode5;
                                        mode5 = mode9;
                                        break;
                                }
                                mode3 = mode6;
                                mode6 = mode5;
                                c10 = c11;
                            } else {
                                eCIStringBuilder.append((char) iArr2[i11]);
                            }
                            c11 = 0;
                            mode3 = mode6;
                            mode6 = mode5;
                            c10 = c11;
                        } else {
                            mode4 = Mode.ALPHA;
                        }
                        c11 = 0;
                        mode5 = mode4;
                        mode3 = mode6;
                        mode6 = mode5;
                        c10 = c11;
                    } else {
                        i10 = i12 + 97;
                        c6 = (char) i10;
                        Mode mode10 = mode6;
                        mode6 = mode5;
                        c10 = c6;
                        mode3 = mode10;
                    }
                    break;
                case 3:
                    if (i12 >= 25) {
                        if (i12 == TEXT_COMPACTION_MODE_LATCH) {
                            mode4 = Mode.ALPHA;
                            c11 = 0;
                            mode5 = mode4;
                        } else {
                            if (i12 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                switch (i12) {
                                    case 25:
                                        mode4 = Mode.PUNCT;
                                        c11 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 26:
                                        break;
                                    case 27:
                                        mode4 = Mode.LOWER;
                                        c11 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 28:
                                        mode4 = Mode.ALPHA;
                                        c11 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 29:
                                        mode6 = mode5;
                                        mode5 = Mode.PUNCT_SHIFT;
                                    default:
                                        c11 = 0;
                                        break;
                                }
                            } else {
                                eCIStringBuilder.append((char) iArr2[i11]);
                            }
                            c11 = 0;
                        }
                        mode3 = mode6;
                        mode6 = mode5;
                        c10 = c11;
                    } else {
                        c6 = MIXED_CHARS[i12];
                        Mode mode11 = mode6;
                        mode6 = mode5;
                        c10 = c6;
                        mode3 = mode11;
                    }
                    break;
                case 4:
                    if (i12 >= 29) {
                        if (i12 == 29 || i12 == TEXT_COMPACTION_MODE_LATCH) {
                            mode4 = Mode.ALPHA;
                            mode5 = mode4;
                        } else if (i12 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            eCIStringBuilder.append((char) iArr2[i11]);
                        }
                        mode3 = mode6;
                        mode6 = mode5;
                        c10 = 0;
                    } else {
                        c6 = PUNCT_CHARS[i12];
                        Mode mode12 = mode6;
                        mode6 = mode5;
                        c10 = c6;
                        mode3 = mode12;
                    }
                    break;
                case 5:
                    if (i12 >= 26) {
                        if (i12 != 26) {
                            if (i12 == TEXT_COMPACTION_MODE_LATCH) {
                                mode5 = Mode.ALPHA;
                                c11 = 0;
                                mode3 = mode6;
                                mode6 = mode5;
                                c10 = c11;
                            } else {
                                c11 = 0;
                            }
                        }
                        mode5 = mode6;
                        mode3 = mode6;
                        mode6 = mode5;
                        c10 = c11;
                    } else {
                        c10 = (char) (i12 + 65);
                        mode3 = mode6;
                    }
                    break;
                case 6:
                    if (i12 < 29) {
                        c10 = PUNCT_CHARS[i12];
                    } else if (i12 == 29 || i12 == TEXT_COMPACTION_MODE_LATCH) {
                        mode5 = Mode.ALPHA;
                        mode3 = mode6;
                        mode6 = mode5;
                        c10 = 0;
                    } else {
                        if (i12 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            eCIStringBuilder.append((char) iArr2[i11]);
                        }
                        c10 = 0;
                    }
                    mode3 = mode6;
                    break;
                default:
                    mode3 = mode6;
                    mode6 = mode5;
                    c10 = 0;
                    break;
            }
            if (c10 != 0) {
                eCIStringBuilder.append(c10);
            }
            i11++;
            mode5 = mode6;
            mode6 = mode3;
        }
        return mode4;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0007 A[SYNTHETIC] */
    private static int numericCompaction(int[] iArr, int i7, ECIStringBuilder eCIStringBuilder) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z3 = false;
        int i10 = 0;
        while (true) {
            int i11 = iArr[0];
            if (i7 < i11 && !z3) {
                int i12 = i7 + 1;
                int i13 = iArr[i7];
                if (i12 == i11) {
                    z3 = true;
                }
                if (i13 < TEXT_COMPACTION_MODE_LATCH) {
                    iArr2[i10] = i13;
                    i10++;
                } else {
                    if (i13 != TEXT_COMPACTION_MODE_LATCH && i13 != BYTE_COMPACTION_MODE_LATCH && i13 != ECI_CHARSET && i13 != 928) {
                        switch (i13) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                z3 = true;
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                    if (i10 % 15 != 0 || i13 == NUMERIC_COMPACTION_MODE_LATCH || z3) {
                        if (i10 > 0) {
                            eCIStringBuilder.append(decodeBase900toBase10(iArr2, i10));
                            i10 = 0;
                        }
                    }
                }
                i7 = i12;
                if (i10 % 15 != 0) {
                }
                if (i10 > 0) {
                    eCIStringBuilder.append(decodeBase900toBase10(iArr2, i10));
                    i10 = 0;
                }
            }
        }
        return i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x003d. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i7, ECIStringBuilder eCIStringBuilder) throws FormatException {
        int i10 = iArr[0];
        int[] iArr2 = new int[(i10 - i7) * 2];
        int[] iArr3 = new int[(i10 - i7) * 2];
        Mode mode = Mode.ALPHA;
        boolean z3 = false;
        int i11 = 0;
        while (i7 < iArr[0] && !z3) {
            int i12 = i7 + 1;
            int i13 = iArr[i7];
            if (i13 < TEXT_COMPACTION_MODE_LATCH) {
                iArr2[i11] = i13 / 30;
                iArr2[i11 + 1] = i13 % 30;
                i11 += 2;
            } else if (i13 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                iArr2[i11] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i7 += 2;
                iArr3[i11] = iArr[i12];
                i11++;
            } else if (i13 != ECI_CHARSET) {
                if (i13 != 928) {
                    switch (i13) {
                        case TEXT_COMPACTION_MODE_LATCH /* 900 */:
                            iArr2[i11] = TEXT_COMPACTION_MODE_LATCH;
                            i11++;
                            break;
                        case BYTE_COMPACTION_MODE_LATCH /* 901 */:
                        case NUMERIC_COMPACTION_MODE_LATCH /* 902 */:
                            break;
                        default:
                            switch (i13) {
                                case MACRO_PDF417_TERMINATOR /* 922 */:
                                case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z3 = true;
            } else {
                Mode modeDecodeTextCompaction = decodeTextCompaction(iArr2, iArr3, i11, eCIStringBuilder, mode);
                i7 += 2;
                eCIStringBuilder.appendECI(iArr[i12]);
                int i14 = iArr[0];
                if (i7 > i14) {
                    throw FormatException.getFormatInstance();
                }
                mode = modeDecodeTextCompaction;
                iArr3 = new int[(i14 - i7) * 2];
                iArr2 = new int[(i14 - i7) * 2];
                i11 = 0;
            }
            i7 = i12;
        }
        decodeTextCompaction(iArr2, iArr3, i11, eCIStringBuilder, mode);
        return i7;
    }
}

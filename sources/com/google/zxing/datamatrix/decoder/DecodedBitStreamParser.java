package com.google.zxing.datamatrix.decoder;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.base.Ascii;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.ECIStringBuilder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] C40_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] TEXT_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] TEXT_SHIFT3_SET_CHARS = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', Ascii.MAX};

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.ECI_ENCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        ECI_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        C40_SHIFT2_SET_CHARS = cArr;
        TEXT_SHIFT2_SET_CHARS = cArr;
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    public static DecoderResult decode(byte[] bArr) throws FormatException {
        int i7;
        BitSource bitSource = new BitSource(bArr);
        ECIStringBuilder eCIStringBuilder = new ECIStringBuilder(100);
        boolean z3 = false;
        StringBuilder sb2 = new StringBuilder(0);
        int i10 = 1;
        ArrayList arrayList = new ArrayList(1);
        Mode modeDecodeAsciiSegment = Mode.ASCII_ENCODE;
        HashSet hashSet = new HashSet();
        do {
            Mode mode = Mode.ASCII_ENCODE;
            if (modeDecodeAsciiSegment == mode) {
                modeDecodeAsciiSegment = decodeAsciiSegment(bitSource, eCIStringBuilder, sb2, hashSet);
            } else {
                switch (AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[modeDecodeAsciiSegment.ordinal()]) {
                    case 1:
                        decodeC40Segment(bitSource, eCIStringBuilder, hashSet);
                        break;
                    case 2:
                        decodeTextSegment(bitSource, eCIStringBuilder, hashSet);
                        break;
                    case 3:
                        decodeAnsiX12Segment(bitSource, eCIStringBuilder);
                        break;
                    case 4:
                        decodeEdifactSegment(bitSource, eCIStringBuilder);
                        break;
                    case 5:
                        decodeBase256Segment(bitSource, eCIStringBuilder, arrayList);
                        break;
                    case 6:
                        decodeECISegment(bitSource, eCIStringBuilder);
                        z3 = true;
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
                modeDecodeAsciiSegment = mode;
            }
            if (modeDecodeAsciiSegment != Mode.PAD_ENCODE) {
            }
            if (sb2.length() > 0) {
                eCIStringBuilder.appendCharacters(sb2);
            }
            if (z3) {
                if (!hashSet.contains(0) || hashSet.contains(4)) {
                    i7 = 5;
                } else if (hashSet.contains(1) || hashSet.contains(5)) {
                    i10 = 6;
                } else {
                    i7 = 4;
                }
                String string = eCIStringBuilder.toString();
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new DecoderResult(bArr, string, arrayList, null, i7);
            }
            if (!hashSet.contains(0) || hashSet.contains(4)) {
                i10 = 2;
            } else if (hashSet.contains(1) || hashSet.contains(5)) {
                i10 = 3;
            }
            i7 = i10;
            String string2 = eCIStringBuilder.toString();
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new DecoderResult(bArr, string2, arrayList, null, i7);
        } while (bitSource.available() > 0);
        if (sb2.length() > 0) {
            eCIStringBuilder.appendCharacters(sb2);
        }
        if (z3) {
            if (hashSet.contains(0)) {
                i7 = 5;
            } else {
                i7 = 5;
            }
            String string3 = eCIStringBuilder.toString();
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new DecoderResult(bArr, string3, arrayList, null, i7);
        }
        if (hashSet.contains(0)) {
            i10 = 2;
        } else {
            i10 = 2;
        }
        i7 = i10;
        String string4 = eCIStringBuilder.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new DecoderResult(bArr, string4, arrayList, null, i7);
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, ECIStringBuilder eCIStringBuilder) throws FormatException {
        int bits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i7 = 0; i7 < 3; i7++) {
                int i10 = iArr[i7];
                if (i10 == 0) {
                    eCIStringBuilder.append('\r');
                } else if (i10 == 1) {
                    eCIStringBuilder.append('*');
                } else if (i10 == 2) {
                    eCIStringBuilder.append('>');
                } else if (i10 == 3) {
                    eCIStringBuilder.append(' ');
                } else if (i10 < 14) {
                    eCIStringBuilder.append((char) (i10 + 44));
                } else {
                    if (i10 >= 40) {
                        throw FormatException.getFormatInstance();
                    }
                    eCIStringBuilder.append((char) (i10 + 51));
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static Mode decodeAsciiSegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, StringBuilder sb2, Set<Integer> set) throws FormatException {
        boolean z3 = false;
        do {
            int bits = bitSource.readBits(8);
            if (bits == 0) {
                throw FormatException.getFormatInstance();
            }
            if (bits > 128) {
                if (bits != 129) {
                    if (bits > 229) {
                        switch (bits) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                set.add(Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                                break;
                            case 233:
                            case 234:
                                break;
                            case 235:
                                z3 = true;
                                break;
                            case 236:
                                eCIStringBuilder.append("[)>\u001e05\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                eCIStringBuilder.append("[)>\u001e06\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return Mode.ANSIX12_ENCODE;
                            case 239:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            case 241:
                                return Mode.ECI_ENCODE;
                            default:
                                if (bits != 254 || bitSource.available() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i7 = bits - 130;
                        if (i7 < 10) {
                            eCIStringBuilder.append('0');
                        }
                        eCIStringBuilder.append(i7);
                    }
                } else {
                    return Mode.PAD_ENCODE;
                }
            } else {
                if (z3) {
                    bits += 128;
                }
                eCIStringBuilder.append((char) (bits - 1));
                return Mode.ASCII_ENCODE;
            }
        } while (bitSource.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    private static void decodeBase256Segment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, Collection<byte[]> collection) throws FormatException {
        int byteOffset = bitSource.getByteOffset();
        int i7 = byteOffset + 2;
        int iUnrandomize255State = unrandomize255State(bitSource.readBits(8), byteOffset + 1);
        if (iUnrandomize255State == 0) {
            iUnrandomize255State = bitSource.available() / 8;
        } else if (iUnrandomize255State >= 250) {
            iUnrandomize255State = ((iUnrandomize255State - 249) * 250) + unrandomize255State(bitSource.readBits(8), i7);
            i7 = byteOffset + 3;
        }
        if (iUnrandomize255State < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[iUnrandomize255State];
        int i10 = 0;
        while (i10 < iUnrandomize255State) {
            if (bitSource.available() < 8) {
                throw FormatException.getFormatInstance();
            }
            bArr[i10] = (byte) unrandomize255State(bitSource.readBits(8), i7);
            i10++;
            i7++;
        }
        collection.add(bArr);
        eCIStringBuilder.append(new String(bArr, StandardCharsets.ISO_8859_1));
    }

    private static void decodeC40Segment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, Set<Integer> set) throws FormatException {
        int bits;
        int[] iArr = new int[3];
        boolean z3 = false;
        int i7 = 0;
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            char[] cArr = C40_SHIFT2_SET_CHARS;
                            if (i11 < cArr.length) {
                                char c6 = cArr[i11];
                                if (z3) {
                                    eCIStringBuilder.append((char) (c6 + 128));
                                    z3 = false;
                                } else {
                                    eCIStringBuilder.append(c6);
                                }
                            } else if (i11 == 27) {
                                set.add(Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                            } else {
                                if (i11 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z3 = true;
                            }
                        } else {
                            if (i7 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            if (z3) {
                                eCIStringBuilder.append((char) (i11 + 224));
                                z3 = false;
                            } else {
                                eCIStringBuilder.append((char) (i11 + 96));
                            }
                        }
                    } else if (z3) {
                        eCIStringBuilder.append((char) (i11 + 128));
                        z3 = false;
                    } else {
                        eCIStringBuilder.append((char) i11);
                    }
                    i7 = 0;
                } else if (i11 < 3) {
                    i7 = i11 + 1;
                } else {
                    char[] cArr2 = C40_BASIC_SET_CHARS;
                    if (i11 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c10 = cArr2[i11];
                    if (z3) {
                        eCIStringBuilder.append((char) (c10 + 128));
                        z3 = false;
                    } else {
                        eCIStringBuilder.append(c10);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeECISegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder) throws FormatException {
        if (bitSource.available() < 8) {
            throw FormatException.getFormatInstance();
        }
        int bits = bitSource.readBits(8);
        if (bits <= 127) {
            eCIStringBuilder.appendECI(bits - 1);
        }
    }

    private static void decodeEdifactSegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder) {
        while (bitSource.available() > 16) {
            for (int i7 = 0; i7 < 4; i7++) {
                int bits = bitSource.readBits(6);
                if (bits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((bits & 32) == 0) {
                    bits |= 64;
                }
                eCIStringBuilder.append((char) bits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeTextSegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, Set<Integer> set) throws FormatException {
        int bits;
        int[] iArr = new int[3];
        boolean z3 = false;
        int i7 = 0;
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            char[] cArr = TEXT_SHIFT2_SET_CHARS;
                            if (i11 < cArr.length) {
                                char c6 = cArr[i11];
                                if (z3) {
                                    eCIStringBuilder.append((char) (c6 + 128));
                                    z3 = false;
                                } else {
                                    eCIStringBuilder.append(c6);
                                }
                            } else if (i11 == 27) {
                                set.add(Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                            } else {
                                if (i11 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z3 = true;
                            }
                        } else {
                            if (i7 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = TEXT_SHIFT3_SET_CHARS;
                            if (i11 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            char c10 = cArr2[i11];
                            if (z3) {
                                eCIStringBuilder.append((char) (c10 + 128));
                                z3 = false;
                            } else {
                                eCIStringBuilder.append(c10);
                            }
                        }
                    } else if (z3) {
                        eCIStringBuilder.append((char) (i11 + 128));
                        z3 = false;
                    } else {
                        eCIStringBuilder.append((char) i11);
                    }
                    i7 = 0;
                } else if (i11 < 3) {
                    i7 = i11 + 1;
                } else {
                    char[] cArr3 = TEXT_BASIC_SET_CHARS;
                    if (i11 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c11 = cArr3[i11];
                    if (z3) {
                        eCIStringBuilder.append((char) (c11 + 128));
                        z3 = false;
                    } else {
                        eCIStringBuilder.append(c11);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void parseTwoBytes(int i7, int i10, int[] iArr) {
        int i11 = ((i7 << 8) + i10) - 1;
        int i12 = i11 / 1600;
        iArr[0] = i12;
        int i13 = i11 - (i12 * 1600);
        int i14 = i13 / 40;
        iArr[1] = i14;
        iArr[2] = i13 - (i14 * 40);
    }

    private static int unrandomize255State(int i7, int i10) {
        int i11 = i7 - (((i10 * 149) % 255) + 1);
        return i11 >= 0 ? i11 : i11 + IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }
}

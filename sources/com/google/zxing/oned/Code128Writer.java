package com.google.zxing.oned;

import C0.G;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    /* JADX INFO: renamed from: com.google.zxing.oned.Code128Writer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset;
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch;

        static {
            int[] iArr = new int[MinimalEncoder.Charset.values().length];
            $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset = iArr;
            try {
                iArr[MinimalEncoder.Charset.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[MinimalEncoder.Charset.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[MinimalEncoder.Charset.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MinimalEncoder.Latch.values().length];
            $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch = iArr2;
            try {
                iArr2[MinimalEncoder.Latch.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[MinimalEncoder.Latch.SHIFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static final class MinimalEncoder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        static final String f23110A = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ";

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        static final String f23111B = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ";
        private static final int CODE_SHIFT = 98;
        private int[][] memoizedCost;
        private Latch[][] minPath;

        public enum Charset {
            A,
            B,
            C,
            NONE
        }

        public enum Latch {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private MinimalEncoder() {
        }

        private static void addPattern(Collection<int[]> collection, int i7, int[] iArr, int[] iArr2, int i10) {
            collection.add(Code128Reader.CODE_PATTERNS[i7]);
            if (i10 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = (i7 * iArr2[0]) + iArr[0];
        }

        private boolean canEncode(CharSequence charSequence, Charset charset, int i7) {
            int i10;
            char cCharAt = charSequence.charAt(i7);
            int i11 = AnonymousClass1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Charset[charset.ordinal()];
            if (i11 == 1) {
                return cCharAt == 241 || cCharAt == 242 || cCharAt == 243 || cCharAt == 244 || f23110A.indexOf(cCharAt) >= 0;
            }
            if (i11 == 2) {
                return cCharAt == 241 || cCharAt == 242 || cCharAt == 243 || cCharAt == 244 || f23111B.indexOf(cCharAt) >= 0;
            }
            if (i11 != 3) {
                return false;
            }
            return cCharAt == 241 || ((i10 = i7 + 1) < charSequence.length() && isDigit(cCharAt) && isDigit(charSequence.charAt(i10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:69:0x00ff A[SYNTHETIC] */
        public boolean[] encode(String str) {
            boolean z3;
            Charset charset;
            int i7;
            boolean z8 = false;
            this.memoizedCost = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, str.length());
            this.minPath = (Latch[][]) Array.newInstance((Class<?>) Latch.class, 4, str.length());
            Charset charset2 = Charset.NONE;
            encode(str, charset2, 0);
            ArrayList arrayList = new ArrayList();
            int[] iArr = {0};
            int[] iArr2 = {1};
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                Latch latch = this.minPath[charset2.ordinal()][i10];
                int i11 = AnonymousClass1.$SwitchMap$com$google$zxing$oned$Code128Writer$MinimalEncoder$Latch[latch.ordinal()];
                int iCharAt = 101;
                if (i11 == 1) {
                    z3 = z8;
                    charset = Charset.A;
                    addPattern(arrayList, i10 == 0 ? 103 : 101, iArr, iArr2, i10);
                } else if (i11 != 2) {
                    z3 = z8;
                    if (i11 == 3) {
                        charset = Charset.C;
                        addPattern(arrayList, i10 == 0 ? 105 : 99, iArr, iArr2, i10);
                    } else if (i11 == 4) {
                        addPattern(arrayList, 98, iArr, iArr2, i10);
                    }
                    if (charset2 == Charset.C) {
                        switch (str.charAt(i10)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = Code128Writer.CODE_FNC_2;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case 244:
                                if ((charset2 != Charset.A || latch == Latch.SHIFT) && (charset2 != Charset.B || latch != Latch.SHIFT)) {
                                }
                                break;
                            default:
                                iCharAt = str.charAt(i10) - ' ';
                                break;
                        }
                        if (((charset2 != Charset.A && latch != Latch.SHIFT) || (charset2 == Charset.B && latch == Latch.SHIFT)) && iCharAt < 0) {
                        }
                        addPattern(arrayList, iCharAt, iArr, iArr2, i10);
                    } else if (str.charAt(i10) == 241) {
                        addPattern(arrayList, 102, iArr, iArr2, i10);
                    } else {
                        addPattern(arrayList, Integer.parseInt(str.substring(i10, i10 + 2)), iArr, iArr2, i10);
                        i7 = i10 + 1;
                        if (i7 < length) {
                            i10 = i7;
                        }
                    }
                    i10++;
                    z8 = z3;
                } else {
                    z3 = z8;
                    charset = Charset.B;
                    addPattern(arrayList, i10 == 0 ? 104 : 100, iArr, iArr2, i10);
                }
                charset2 = charset;
                if (charset2 == Charset.C) {
                    switch (str.charAt(i10)) {
                        case 241:
                            iCharAt = 102;
                            break;
                        case 242:
                            iCharAt = Code128Writer.CODE_FNC_2;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case 244:
                            iCharAt = charset2 != Charset.A ? 100 : 100;
                            break;
                        default:
                            iCharAt = str.charAt(i10) - ' ';
                            break;
                    }
                    iCharAt = charset2 != Charset.A ? iCharAt + 96 : iCharAt + 96;
                    addPattern(arrayList, iCharAt, iArr, iArr2, i10);
                } else if (str.charAt(i10) == 241) {
                    addPattern(arrayList, 102, iArr, iArr2, i10);
                } else {
                    addPattern(arrayList, Integer.parseInt(str.substring(i10, i10 + 2)), iArr, iArr2, i10);
                    i7 = i10 + 1;
                    if (i7 < length) {
                        i10 = i7;
                    }
                }
                i10++;
                z8 = z3;
            }
            this.memoizedCost = null;
            this.minPath = null;
            return Code128Writer.produceResult(arrayList, iArr[z8 ? 1 : 0]);
        }

        private static boolean isDigit(char c6) {
            return c6 >= '0' && c6 <= '9';
        }

        public /* synthetic */ MinimalEncoder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private int encode(CharSequence charSequence, Charset charset, int i7) {
            int iEncode;
            int iEncode2;
            int i10 = this.memoizedCost[charset.ordinal()][i7];
            if (i10 > 0) {
                return i10;
            }
            Latch latch = Latch.NONE;
            int i11 = i7 + 1;
            int i12 = 0;
            boolean z3 = i11 >= charSequence.length();
            Charset[] charsetArr = {Charset.A, Charset.B};
            int i13 = Integer.MAX_VALUE;
            while (true) {
                if (i12 > 1) {
                    break;
                }
                if (canEncode(charSequence, charsetArr[i12], i7)) {
                    Latch latchValueOf = Latch.NONE;
                    Charset charset2 = charsetArr[i12];
                    if (charset != charset2) {
                        latchValueOf = Latch.valueOf(charset2.toString());
                        iEncode2 = 2;
                    } else {
                        iEncode2 = 1;
                    }
                    if (!z3) {
                        iEncode2 += encode(charSequence, charsetArr[i12], i11);
                    }
                    if (iEncode2 < i13) {
                        latch = latchValueOf;
                        i13 = iEncode2;
                    }
                    if (charset == charsetArr[(i12 + 1) % 2]) {
                        Latch latch2 = Latch.SHIFT;
                        int iEncode3 = z3 ? 2 : 2 + encode(charSequence, charset, i11);
                        if (iEncode3 < i13) {
                            i13 = iEncode3;
                            latch = latch2;
                        }
                    }
                }
                i12++;
            }
            Charset charset3 = Charset.C;
            if (canEncode(charSequence, charset3, i7)) {
                Latch latch3 = Latch.NONE;
                if (charset != charset3) {
                    latch3 = Latch.C;
                    iEncode = 2;
                } else {
                    iEncode = 1;
                }
                int i14 = (charSequence.charAt(i7) != 241 ? 2 : 1) + i7;
                if (i14 < charSequence.length()) {
                    iEncode += encode(charSequence, charset3, i14);
                }
                if (iEncode < i13) {
                    latch = latch3;
                    i13 = iEncode;
                }
            }
            if (i13 != Integer.MAX_VALUE) {
                this.memoizedCost[charset.ordinal()][i7] = i13;
                this.minPath[charset.ordinal()][i7] = latch;
                return i13;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) charSequence.charAt(i7)));
        }
    }

    private static int check(String str, Map<EncodeHintType, ?> map) {
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.FORCE_CODE_SET;
            if (map.containsKey(encodeHintType)) {
                String string = map.get(encodeHintType).toString();
                string.getClass();
                switch (string) {
                    case "A":
                        break;
                    case "B":
                        break;
                    case "C":
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported code set hint: ".concat(string));
                }
            }
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException(G.m(cCharAt, "Bad character in input: ASCII value="));
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Writer.check(java.lang.String, java.util.Map):int");
        }

        private static int chooseCode(CharSequence charSequence, int i7, int i10) {
            CType cTypeFindCType;
            CType cTypeFindCType2;
            char cCharAt;
            CType cTypeFindCType3 = findCType(charSequence, i7);
            CType cType = CType.ONE_DIGIT;
            if (cTypeFindCType3 == cType) {
                return i10 == 101 ? 101 : 100;
            }
            CType cType2 = CType.UNCODABLE;
            if (cTypeFindCType3 == cType2) {
                return (i7 >= charSequence.length() || ((cCharAt = charSequence.charAt(i7)) >= ' ' && (i10 != 101 || (cCharAt >= '`' && (cCharAt < 241 || cCharAt > 244))))) ? 100 : 101;
            }
            if (i10 == 101 && cTypeFindCType3 == CType.FNC_1) {
                return 101;
            }
            if (i10 == 99) {
                return 99;
            }
            if (i10 != 100) {
                if (cTypeFindCType3 == CType.FNC_1) {
                    cTypeFindCType3 = findCType(charSequence, i7 + 1);
                }
                return cTypeFindCType3 == CType.TWO_DIGITS ? 99 : 100;
            }
            CType cType3 = CType.FNC_1;
            if (cTypeFindCType3 == cType3 || (cTypeFindCType = findCType(charSequence, i7 + 2)) == cType2 || cTypeFindCType == cType) {
                return 100;
            }
            if (cTypeFindCType == cType3) {
                return findCType(charSequence, i7 + 3) == CType.TWO_DIGITS ? 99 : 100;
            }
            int i11 = i7 + 4;
            while (true) {
                cTypeFindCType2 = findCType(charSequence, i11);
                if (cTypeFindCType2 != CType.TWO_DIGITS) {
                    break;
                }
                i11 += 2;
            }
            return cTypeFindCType2 == CType.ONE_DIGIT ? 100 : 99;
        }

        private static boolean[] encodeFast(String str, int i7) {
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 1;
            while (i10 < length) {
                int iChooseCode = i7 == -1 ? chooseCode(str, i10, i12) : i7;
                int iCharAt = 100;
                if (iChooseCode == i12) {
                    switch (str.charAt(i10)) {
                        case 241:
                            iCharAt = 102;
                            break;
                        case 242:
                            iCharAt = CODE_FNC_2;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case 244:
                            if (i12 == 101) {
                                iCharAt = 101;
                            }
                            break;
                        default:
                            if (i12 == 100) {
                                iCharAt = str.charAt(i10) - ' ';
                            } else if (i12 == 101) {
                                char cCharAt = str.charAt(i10);
                                iCharAt = cCharAt - ' ';
                                if (iCharAt < 0) {
                                    iCharAt = cCharAt + '@';
                                }
                            } else {
                                int i14 = i10 + 1;
                                if (i14 == length) {
                                    throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                                }
                                iCharAt = Integer.parseInt(str.substring(i10, i10 + 2));
                                i10 = i14;
                            }
                            break;
                    }
                    i10++;
                } else {
                    if (i12 == 0) {
                        iCharAt = iChooseCode != 100 ? iChooseCode != 101 ? 105 : 103 : 104;
                    } else {
                        iCharAt = iChooseCode;
                    }
                    i12 = iChooseCode;
                }
                arrayList.add(Code128Reader.CODE_PATTERNS[iCharAt]);
                i11 += iCharAt * i13;
                if (i10 != 0) {
                    i13++;
                }
            }
            return produceResult(arrayList, i11);
        }

        private static CType findCType(CharSequence charSequence, int i7) {
            int length = charSequence.length();
            if (i7 >= length) {
                return CType.UNCODABLE;
            }
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt == 241) {
                return CType.FNC_1;
            }
            if (cCharAt < '0' || cCharAt > '9') {
                return CType.UNCODABLE;
            }
            int i10 = i7 + 1;
            if (i10 >= length) {
                return CType.ONE_DIGIT;
            }
            char cCharAt2 = charSequence.charAt(i10);
            return (cCharAt2 < '0' || cCharAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
        }

        public static boolean[] produceResult(Collection<int[]> collection, int i7) {
            int i10 = i7 % 103;
            if (i10 < 0) {
                throw new IllegalArgumentException("Unable to compute a valid input checksum");
            }
            int[][] iArr = Code128Reader.CODE_PATTERNS;
            collection.add(iArr[i10]);
            collection.add(iArr[CODE_STOP]);
            int iAppendPattern = 0;
            int i11 = 0;
            for (int[] iArr2 : collection) {
                for (int i12 : iArr2) {
                    i11 += i12;
                }
            }
            boolean[] zArr = new boolean[i11];
            Iterator<int[]> it = collection.iterator();
            while (it.hasNext()) {
                iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, it.next(), true);
            }
            return zArr;
        }

        @Override // com.google.zxing.oned.OneDimensionalCodeWriter
        public boolean[] encode(String str) {
            return encode(str, null);
        }

        @Override // com.google.zxing.oned.OneDimensionalCodeWriter
        public Collection<BarcodeFormat> getSupportedWriteFormats() {
            return Collections.singleton(BarcodeFormat.CODE_128);
        }

        @Override // com.google.zxing.oned.OneDimensionalCodeWriter
        public boolean[] encode(String str, Map<EncodeHintType, ?> map) {
            int iCheck = check(str, map);
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.CODE128_COMPACT;
                if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                    return new MinimalEncoder(null).encode(str);
                }
            }
            return encodeFast(str, iCheck);
        }
    }

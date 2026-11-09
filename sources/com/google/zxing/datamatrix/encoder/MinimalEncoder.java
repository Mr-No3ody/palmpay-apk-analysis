package com.google.zxing.datamatrix.encoder;

import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.api.ClientProto;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.common.MlKitException;
import com.google.zxing.common.MinimalECIInput;
import com.luck.picture.lib.config.Crop;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MinimalEncoder {
    static final char[] C40_SHIFT2_CHARS = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.encoder.MinimalEncoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode;
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint;

        static {
            int[] iArr = new int[SymbolShapeHint.values().length];
            $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint = iArr;
            try {
                iArr[SymbolShapeHint.FORCE_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[SymbolShapeHint.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode = iArr2;
            try {
                iArr2[Mode.ASCII.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.B256.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.C40.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.X12.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.EDF.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class Edge {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int cachedTotalSize;
        private final int characterLength;
        private final int fromPosition;
        private final Input input;
        private final Mode mode;
        private final Edge previous;
        private static final int[] allCodewordCapacities = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 280, MessageEvent.EVENT_CL_OPEN_PENDING, 456, MessageEvent.EVENT_UPLOAD_APPSFLYER_CONVERSATION_DONE, Crop.REQUEST_EDIT_CROP, 816, ClientProto.OAUTH_SCOPES_FIELD_NUMBER, 1304, 1558};
        private static final int[] squareCodewordCapacities = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 280, MessageEvent.EVENT_CL_OPEN_PENDING, 456, MessageEvent.EVENT_UPLOAD_APPSFLYER_CONVERSATION_DONE, Crop.REQUEST_EDIT_CROP, 816, ClientProto.OAUTH_SCOPES_FIELD_NUMBER, 1304, 1558};
        private static final int[] rectangularCodewordCapacities = {5, 10, 16, 33, 32, 49};

        public /* synthetic */ Edge(Input input, Mode mode, int i7, int i10, Edge edge, AnonymousClass1 anonymousClass1) {
            this(input, mode, i7, i10, edge);
        }

        public static byte[] getBytes(int i7) {
            return new byte[]{(byte) i7};
        }

        private static int getC40Value(boolean z3, int i7, char c6, int i10) {
            if (c6 == i10) {
                return 27;
            }
            if (z3) {
                if (c6 <= 31) {
                    return c6;
                }
                if (c6 == ' ') {
                    return 3;
                }
                if (c6 <= '/') {
                    return c6 - '!';
                }
                if (c6 <= '9') {
                    return c6 - ',';
                }
                if (c6 <= '@') {
                    return c6 - '+';
                }
                if (c6 <= 'Z') {
                    return c6 - '3';
                }
                if (c6 <= '_') {
                    return c6 - 'E';
                }
                return c6 <= 127 ? c6 - '`' : c6;
            }
            if (c6 == 0) {
                return 0;
            }
            if (i7 == 0 && c6 <= 3) {
                return c6 - 1;
            }
            if (i7 == 1 && c6 <= 31) {
                return c6;
            }
            if (c6 == ' ') {
                return 3;
            }
            if (c6 >= '!' && c6 <= '/') {
                return c6 - '!';
            }
            if (c6 >= '0' && c6 <= '9') {
                return c6 - ',';
            }
            if (c6 >= ':' && c6 <= '@') {
                return c6 - '+';
            }
            if (c6 >= 'A' && c6 <= 'Z') {
                return c6 - '@';
            }
            if (c6 >= '[' && c6 <= '_') {
                return c6 - 'E';
            }
            if (c6 == '`') {
                return 0;
            }
            if (c6 < 'a' || c6 > 'z') {
                return (c6 < '{' || c6 > 127) ? c6 : c6 - '`';
            }
            return c6 - 'S';
        }

        public static int getShiftValue(char c6, boolean z3, int i7) {
            if (z3 && MinimalEncoder.isInC40Shift1Set(c6)) {
                return 0;
            }
            if (!z3 && MinimalEncoder.isInTextShift1Set(c6)) {
                return 0;
            }
            if (z3 && MinimalEncoder.isInC40Shift2Set(c6, i7)) {
                return 1;
            }
            return (z3 || !MinimalEncoder.isInTextShift2Set(c6, i7)) ? 2 : 1;
        }

        private static int getX12Value(char c6) {
            if (c6 == '\r') {
                return 0;
            }
            if (c6 == '*') {
                return 1;
            }
            if (c6 == '>') {
                return 2;
            }
            if (c6 == ' ') {
                return 3;
            }
            if (c6 < '0' || c6 > '9') {
                return (c6 < 'A' || c6 > 'Z') ? c6 : c6 - '3';
            }
            return c6 - ',';
        }

        public static void setC40Word(byte[] bArr, int i7, int i10, int i11, int i12) {
            int i13 = ((i11 & 255) * 40) + ((i10 & 255) * 1600) + (i12 & 255) + 1;
            bArr[i7] = (byte) (i13 / IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            bArr[i7 + 1] = (byte) (i13 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }

        public int getB256Size() {
            int i7 = 0;
            for (Edge edge = this; edge != null && edge.mode == Mode.B256 && i7 <= 250; edge = edge.previous) {
                i7++;
            }
            return i7;
        }

        public byte[] getC40Words(boolean z3, int i7) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.characterLength; i10++) {
                char cCharAt = this.input.charAt(this.fromPosition + i10);
                if ((z3 && HighLevelEncoder.isNativeC40(cCharAt)) || (!z3 && HighLevelEncoder.isNativeText(cCharAt))) {
                    arrayList.add(Byte.valueOf((byte) getC40Value(z3, 0, cCharAt, i7)));
                } else if (MinimalEncoder.isExtendedASCII(cCharAt, i7)) {
                    char c6 = (char) ((cCharAt & 255) - 128);
                    if (!(z3 && HighLevelEncoder.isNativeC40(c6)) && (z3 || !HighLevelEncoder.isNativeText(c6))) {
                        arrayList.add((byte) 1);
                        arrayList.add(Byte.valueOf(Ascii.RS));
                        int shiftValue = getShiftValue(c6, z3, i7);
                        arrayList.add(Byte.valueOf((byte) shiftValue));
                        arrayList.add(Byte.valueOf((byte) getC40Value(z3, shiftValue, c6, i7)));
                    } else {
                        arrayList.add((byte) 1);
                        arrayList.add(Byte.valueOf(Ascii.RS));
                        arrayList.add(Byte.valueOf((byte) getC40Value(z3, 0, c6, i7)));
                    }
                } else {
                    int shiftValue2 = getShiftValue(cCharAt, z3, i7);
                    arrayList.add(Byte.valueOf((byte) shiftValue2));
                    arrayList.add(Byte.valueOf((byte) getC40Value(z3, shiftValue2, cCharAt, i7)));
                }
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) * 2];
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12 += 3) {
                setC40Word(bArr, i11, ((Byte) arrayList.get(i12)).byteValue() & UnsignedBytes.MAX_VALUE, ((Byte) arrayList.get(i12 + 1)).byteValue() & UnsignedBytes.MAX_VALUE, ((Byte) arrayList.get(i12 + 2)).byteValue() & UnsignedBytes.MAX_VALUE);
                i11 += 2;
            }
            return bArr;
        }

        public int getCodewordsRemaining(int i7) {
            return getMinSymbolSize(i7) - i7;
        }

        public byte[] getDataBytes() {
            switch (AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[this.mode.ordinal()]) {
                case 1:
                    if (this.input.isECI(this.fromPosition)) {
                        return getBytes(241, this.input.getECIValue(this.fromPosition) + 1);
                    }
                    if (MinimalEncoder.isExtendedASCII(this.input.charAt(this.fromPosition), this.input.getFNC1Character())) {
                        return getBytes(235, this.input.charAt(this.fromPosition) - 127);
                    }
                    if (this.characterLength == 2) {
                        return getBytes(this.input.charAt(this.fromPosition + 1) + ((this.input.charAt(this.fromPosition) - '0') * 10) + 82);
                    }
                    return this.input.isFNC1(this.fromPosition) ? getBytes(232) : getBytes(this.input.charAt(this.fromPosition) + 1);
                case 2:
                    return getBytes(this.input.charAt(this.fromPosition));
                case 3:
                    return getC40Words(true, this.input.getFNC1Character());
                case 4:
                    return getC40Words(false, this.input.getFNC1Character());
                case 5:
                    return getX12Words();
                case 6:
                    return getEDFBytes();
                default:
                    return new byte[0];
            }
        }

        public byte[] getEDFBytes() {
            int iCeil = (int) Math.ceil(((double) this.characterLength) / 4.0d);
            byte[] bArr = new byte[iCeil * 3];
            int i7 = this.fromPosition;
            int iMin = Math.min((this.characterLength + i7) - 1, this.input.length() - 1);
            for (int i10 = 0; i10 < iCeil; i10 += 3) {
                int[] iArr = new int[4];
                for (int i11 = 0; i11 < 4; i11++) {
                    if (i7 <= iMin) {
                        iArr[i11] = this.input.charAt(i7) & '?';
                        i7++;
                    } else {
                        iArr[i11] = i7 == iMin + 1 ? 31 : 0;
                    }
                }
                int i12 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i10] = (byte) ((i12 >> 16) & 255);
                bArr[i10 + 1] = (byte) ((i12 >> 8) & 255);
                bArr[i10 + 2] = (byte) (i12 & 255);
            }
            return bArr;
        }

        public Mode getEndMode() {
            if (this.mode == Mode.EDF) {
                if (this.characterLength < 4) {
                    return Mode.ASCII;
                }
                int lastASCII = getLastASCII();
                if (lastASCII > 0 && getCodewordsRemaining(this.cachedTotalSize + lastASCII) <= 2 - lastASCII) {
                    return Mode.ASCII;
                }
            }
            Mode mode = this.mode;
            if (mode == Mode.C40 || mode == Mode.TEXT || mode == Mode.X12) {
                if (this.fromPosition + this.characterLength >= this.input.length() && getCodewordsRemaining(this.cachedTotalSize) == 0) {
                    return Mode.ASCII;
                }
                if (getLastASCII() == 1 && getCodewordsRemaining(this.cachedTotalSize + 1) == 0) {
                    return Mode.ASCII;
                }
            }
            return this.mode;
        }

        public int getLastASCII() {
            int length = this.input.length();
            int i7 = this.fromPosition + this.characterLength;
            int i10 = length - i7;
            if (i10 <= 4 && i7 < length) {
                if (i10 == 1) {
                    return MinimalEncoder.isExtendedASCII(this.input.charAt(i7), this.input.getFNC1Character()) ? 0 : 1;
                }
                if (i10 == 2) {
                    if (!MinimalEncoder.isExtendedASCII(this.input.charAt(i7), this.input.getFNC1Character())) {
                        int i11 = i7 + 1;
                        if (!MinimalEncoder.isExtendedASCII(this.input.charAt(i11), this.input.getFNC1Character())) {
                            return (HighLevelEncoder.isDigit(this.input.charAt(i7)) && HighLevelEncoder.isDigit(this.input.charAt(i11))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i10 == 3) {
                    if (HighLevelEncoder.isDigit(this.input.charAt(i7)) && HighLevelEncoder.isDigit(this.input.charAt(i7 + 1)) && !MinimalEncoder.isExtendedASCII(this.input.charAt(i7 + 2), this.input.getFNC1Character())) {
                        return 2;
                    }
                    return (HighLevelEncoder.isDigit(this.input.charAt(i7 + 1)) && HighLevelEncoder.isDigit(this.input.charAt(i7 + 2)) && !MinimalEncoder.isExtendedASCII(this.input.charAt(i7), this.input.getFNC1Character())) ? 2 : 0;
                }
                if (HighLevelEncoder.isDigit(this.input.charAt(i7)) && HighLevelEncoder.isDigit(this.input.charAt(i7 + 1)) && HighLevelEncoder.isDigit(this.input.charAt(i7 + 2)) && HighLevelEncoder.isDigit(this.input.charAt(i7 + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        public byte[] getLatchBytes() {
            int[] iArr = AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode;
            switch (iArr[getPreviousMode().ordinal()]) {
                case 1:
                case 2:
                    int i7 = iArr[this.mode.ordinal()];
                    if (i7 == 2) {
                        return getBytes(231);
                    }
                    if (i7 == 3) {
                        return getBytes(230);
                    }
                    if (i7 == 4) {
                        return getBytes(239);
                    }
                    if (i7 == 5) {
                        return getBytes(238);
                    }
                    if (i7 == 6) {
                        return getBytes(240);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    if (this.mode != getPreviousMode()) {
                        switch (iArr[this.mode.ordinal()]) {
                            case 1:
                                return getBytes(254);
                            case 2:
                                return getBytes(254, 231);
                            case 3:
                                return getBytes(254, 230);
                            case 4:
                                return getBytes(254, 239);
                            case 5:
                                return getBytes(254, 238);
                            case 6:
                                return getBytes(254, 240);
                        }
                    }
                    break;
            }
            return new byte[0];
        }

        public int getMinSymbolSize(int i7) {
            int i10 = AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[this.input.getShapeHint().ordinal()];
            if (i10 == 1) {
                for (int i11 : squareCodewordCapacities) {
                    if (i11 >= i7) {
                        return i11;
                    }
                }
            } else if (i10 == 2) {
                for (int i12 : rectangularCodewordCapacities) {
                    if (i12 >= i7) {
                        return i12;
                    }
                }
            }
            for (int i13 : allCodewordCapacities) {
                if (i13 >= i7) {
                    return i13;
                }
            }
            int[] iArr = allCodewordCapacities;
            return iArr[iArr.length - 1];
        }

        public Mode getMode() {
            return this.mode;
        }

        public Mode getPreviousMode() {
            Edge edge = this.previous;
            return edge == null ? Mode.ASCII : edge.getEndMode();
        }

        public Mode getPreviousStartMode() {
            Edge edge = this.previous;
            return edge == null ? Mode.ASCII : edge.mode;
        }

        public byte[] getX12Words() {
            int i7 = (this.characterLength / 3) * 2;
            byte[] bArr = new byte[i7];
            for (int i10 = 0; i10 < i7; i10 += 2) {
                int i11 = (i10 / 2) * 3;
                setC40Word(bArr, i10, getX12Value(this.input.charAt(this.fromPosition + i11)), getX12Value(this.input.charAt(this.fromPosition + i11 + 1)), getX12Value(this.input.charAt(this.fromPosition + i11 + 2)));
            }
            return bArr;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0074 A[PHI: r10
          0x0074: PHI (r10v12 int) = (r10v8 int), (r10v8 int), (r10v8 int), (r10v15 int), (r10v15 int), (r10v15 int) binds: [B:55:0x0094, B:57:0x0098, B:59:0x009c, B:38:0x006c, B:40:0x0070, B:41:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x0077 A[PHI: r10
          0x0077: PHI (r10v10 int) = (r10v5 int), (r10v5 int), (r10v5 int), (r10v8 int), (r10v15 int), (r10v15 int) binds: [B:69:0x00bc, B:71:0x00c0, B:73:0x00c4, B:52:0x008f, B:32:0x0061, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
        private Edge(Input input, Mode mode, int i7, int i10, Edge edge) {
            this.input = input;
            this.mode = mode;
            this.fromPosition = i7;
            this.characterLength = i10;
            this.previous = edge;
            int numberOfC40Words = edge != null ? edge.cachedTotalSize : 0;
            Mode previousMode = getPreviousMode();
            switch (AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[mode.ordinal()]) {
                case 1:
                    numberOfC40Words = (input.isECI(i7) || MinimalEncoder.isExtendedASCII(input.charAt(i7), input.getFNC1Character())) ? numberOfC40Words + 2 : numberOfC40Words + 1;
                    if (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == Mode.X12) {
                        numberOfC40Words++;
                    }
                    break;
                case 2:
                    numberOfC40Words = (previousMode == Mode.B256 && getB256Size() != 250) ? numberOfC40Words + 1 : numberOfC40Words + 2;
                    if (previousMode == Mode.ASCII) {
                        numberOfC40Words++;
                    } else if (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == Mode.X12) {
                        numberOfC40Words += 2;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    Mode mode2 = Mode.X12;
                    if (mode == mode2) {
                        numberOfC40Words += 2;
                    } else {
                        numberOfC40Words = (MinimalEncoder.getNumberOfC40Words(input, i7, mode == Mode.C40, new int[1]) * 2) + numberOfC40Words;
                    }
                    if (previousMode == Mode.ASCII || previousMode == Mode.B256) {
                        numberOfC40Words++;
                    } else if (previousMode != mode && (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == mode2)) {
                        numberOfC40Words += 2;
                    }
                    break;
                case 6:
                    numberOfC40Words = (previousMode != Mode.ASCII && previousMode != Mode.B256) ? (previousMode != Mode.C40 && previousMode != Mode.TEXT && previousMode != Mode.X12) ? numberOfC40Words + 3 : numberOfC40Words + 5 : numberOfC40Words + 4;
                    break;
            }
            this.cachedTotalSize = numberOfC40Words;
        }

        public static byte[] getBytes(int i7, int i10) {
            return new byte[]{(byte) i7, (byte) i10};
        }
    }

    public static final class Input extends MinimalECIInput {
        private final int macroId;
        private final SymbolShapeHint shape;

        public /* synthetic */ Input(String str, Charset charset, int i7, SymbolShapeHint symbolShapeHint, int i10, AnonymousClass1 anonymousClass1) {
            this(str, charset, i7, symbolShapeHint, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getMacroId() {
            return this.macroId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SymbolShapeHint getShapeHint() {
            return this.shape;
        }

        private Input(String str, Charset charset, int i7, SymbolShapeHint symbolShapeHint, int i10) {
            super(str, charset, i7);
            this.shape = symbolShapeHint;
            this.macroId = i10;
        }
    }

    public enum Mode {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    public static final class Result {
        private final byte[] bytes;

        public Result(Edge edge) {
            int i7;
            Input input = edge.input;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 0;
            int iPrepend = ((edge.mode == Mode.C40 || edge.mode == Mode.TEXT || edge.mode == Mode.X12) && edge.getEndMode() != Mode.ASCII) ? prepend(Edge.getBytes(254), arrayList) : 0;
            for (Edge edge2 = edge; edge2 != null; edge2 = edge2.previous) {
                iPrepend += prepend(edge2.getDataBytes(), arrayList);
                if (edge2.previous == null || edge2.getPreviousStartMode() != edge2.getMode()) {
                    if (edge2.getMode() == Mode.B256) {
                        if (iPrepend <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) iPrepend));
                            i7 = iPrepend + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (iPrepend % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((iPrepend / 250) + 249)));
                            i7 = iPrepend + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i7));
                    }
                    prepend(edge2.getLatchBytes(), arrayList);
                    iPrepend = 0;
                }
            }
            if (input.getMacroId() == 5) {
                prepend(Edge.getBytes(236), arrayList);
            } else if (input.getMacroId() == 6) {
                prepend(Edge.getBytes(237), arrayList);
            }
            if (input.getFNC1Character() > 0) {
                prepend(Edge.getBytes(232), arrayList);
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                applyRandomPattern(arrayList, arrayList.size() - ((Integer) arrayList2.get(i11)).intValue(), ((Integer) arrayList3.get(i11)).intValue());
            }
            int minSymbolSize = edge.getMinSymbolSize(arrayList.size());
            if (arrayList.size() < minSymbolSize) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < minSymbolSize) {
                arrayList.add(Byte.valueOf((byte) randomize253State(arrayList.size() + 1)));
            }
            this.bytes = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.bytes;
                if (i10 >= bArr.length) {
                    return;
                }
                bArr[i10] = ((Byte) arrayList.get(i10)).byteValue();
                i10++;
            }
        }

        public static void applyRandomPattern(List<Byte> list, int i7, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i7 + i11;
                int iByteValue = (((i12 + 1) * 149) % 255) + 1 + (list.get(i12).byteValue() & UnsignedBytes.MAX_VALUE);
                if (iByteValue > 255) {
                    iByteValue -= 256;
                }
                list.set(i12, Byte.valueOf((byte) iByteValue));
            }
        }

        public static int prepend(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int randomize253State(int i7) {
            int i10 = (i7 * 149) % 253;
            int i11 = i10 + 130;
            return i11 <= 254 ? i11 : i10 - 124;
        }

        public byte[] getBytes() {
            return this.bytes;
        }
    }

    private MinimalEncoder() {
    }

    public static void addEdge(Edge[][] edgeArr, Edge edge) {
        int i7 = edge.fromPosition + edge.characterLength;
        if (edgeArr[i7][edge.getEndMode().ordinal()] == null || edgeArr[i7][edge.getEndMode().ordinal()].cachedTotalSize > edge.cachedTotalSize) {
            edgeArr[i7][edge.getEndMode().ordinal()] = edge;
        }
    }

    public static void addEdges(Input input, Edge[][] edgeArr, int i7, Edge edge) {
        if (input.isECI(i7)) {
            addEdge(edgeArr, new Edge(input, Mode.ASCII, i7, 1, edge, null));
            return;
        }
        char cCharAt = input.charAt(i7);
        int i10 = 0;
        if (edge == null || edge.getEndMode() != Mode.EDF) {
            if (HighLevelEncoder.isDigit(cCharAt) && input.haveNCharacters(i7, 2) && HighLevelEncoder.isDigit(input.charAt(i7 + 1))) {
                addEdge(edgeArr, new Edge(input, Mode.ASCII, i7, 2, edge, null));
            } else {
                addEdge(edgeArr, new Edge(input, Mode.ASCII, i7, 1, edge, null));
            }
            Mode[] modeArr = {Mode.C40, Mode.TEXT};
            for (int i11 = 0; i11 < 2; i11++) {
                Mode mode = modeArr[i11];
                int[] iArr = new int[1];
                if (getNumberOfC40Words(input, i7, mode == Mode.C40, iArr) > 0) {
                    addEdge(edgeArr, new Edge(input, mode, i7, iArr[0], edge, null));
                }
            }
            if (input.haveNCharacters(i7, 3) && HighLevelEncoder.isNativeX12(input.charAt(i7)) && HighLevelEncoder.isNativeX12(input.charAt(i7 + 1)) && HighLevelEncoder.isNativeX12(input.charAt(i7 + 2))) {
                addEdge(edgeArr, new Edge(input, Mode.X12, i7, 3, edge, null));
            }
            addEdge(edgeArr, new Edge(input, Mode.B256, i7, 1, edge, null));
        }
        while (i10 < 3) {
            int i12 = i7 + i10;
            if (!input.haveNCharacters(i12, 1) || !HighLevelEncoder.isNativeEDIFACT(input.charAt(i12))) {
                break;
            }
            int i13 = i10 + 1;
            addEdge(edgeArr, new Edge(input, Mode.EDF, i7, i13, edge, null));
            i10 = i13;
        }
        if (i10 == 3 && input.haveNCharacters(i7, 4) && HighLevelEncoder.isNativeEDIFACT(input.charAt(i7 + 3))) {
            addEdge(edgeArr, new Edge(input, Mode.EDF, i7, 4, edge, null));
        }
    }

    public static byte[] encode(String str, Charset charset, int i7, SymbolShapeHint symbolShapeHint, int i10) {
        return encodeMinimally(new Input(str, charset, i7, symbolShapeHint, i10, null)).getBytes();
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, null, -1, SymbolShapeHint.FORCE_NONE);
    }

    public static Result encodeMinimally(Input input) {
        int length = input.length();
        int i7 = 0;
        Edge[][] edgeArr = (Edge[][]) Array.newInstance((Class<?>) Edge.class, length + 1, 6);
        addEdges(input, edgeArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < 6; i11++) {
                Edge edge = edgeArr[i10][i11];
                if (edge != null && i10 < length) {
                    addEdges(input, edgeArr, i10, edge);
                }
            }
            for (int i12 = 0; i12 < 6; i12++) {
                edgeArr[i10 - 1][i12] = null;
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        while (i7 < 6) {
            Edge edge2 = edgeArr[length][i7];
            if (edge2 != null) {
                int i15 = (i7 < 1 || i7 > 3) ? edge2.cachedTotalSize : edge2.cachedTotalSize + 1;
                if (i15 < i14) {
                    i13 = i7;
                    i14 = i15;
                }
            }
            i7++;
        }
        if (i13 >= 0) {
            return new Result(edgeArr[length][i13]);
        }
        throw new IllegalStateException("Failed to encode \"" + input + "\"");
    }

    public static int getNumberOfC40Words(Input input, int i7, boolean z3, int[] iArr) {
        int i10 = 0;
        for (int i11 = i7; i11 < input.length(); i11++) {
            if (input.isECI(i11)) {
                iArr[0] = 0;
                return 0;
            }
            char cCharAt = input.charAt(i11);
            if ((z3 && HighLevelEncoder.isNativeC40(cCharAt)) || (!z3 && HighLevelEncoder.isNativeText(cCharAt))) {
                i10++;
            } else if (isExtendedASCII(cCharAt, input.getFNC1Character())) {
                int i12 = cCharAt & 255;
                i10 = (i12 < 128 || (!(z3 && HighLevelEncoder.isNativeC40((char) (i12 + (-128)))) && (z3 || !HighLevelEncoder.isNativeText((char) (i12 + (-128)))))) ? i10 + 4 : i10 + 3;
            } else {
                i10 += 2;
            }
            if (i10 % 3 == 0 || ((i10 - 2) % 3 == 0 && i11 + 1 == input.length())) {
                iArr[0] = (i11 - i7) + 1;
                return (int) Math.ceil(((double) i10) / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    public static boolean isExtendedASCII(char c6, int i7) {
        return c6 != i7 && c6 >= 128 && c6 <= 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInC40Shift1Set(char c6) {
        return c6 <= 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInC40Shift2Set(char c6, int i7) {
        for (char c10 : C40_SHIFT2_CHARS) {
            if (c10 == c6) {
                return true;
            }
        }
        return c6 == i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTextShift1Set(char c6) {
        return isInC40Shift1Set(c6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTextShift2Set(char c6, int i7) {
        return isInC40Shift2Set(c6, i7);
    }

    public static String encodeHighLevel(String str, Charset charset, int i7, SymbolShapeHint symbolShapeHint) {
        int i10;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = u.f(2, 7, str);
            i10 = 5;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            str = u.f(2, 7, str);
            i10 = 6;
        } else {
            i10 = 0;
        }
        return new String(encode(str, charset, i7, symbolShapeHint, i10), StandardCharsets.ISO_8859_1);
    }
}

package com.google.zxing.common;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MinimalECIInput implements ECIInput {
    private static final int COST_PER_ECI = 3;
    private final int[] bytes;
    private final int fnc1;

    public static final class InputEdge {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f23109c;
        private final int cachedTotalSize;
        private final int encoderIndex;
        private final InputEdge previous;

        public boolean isFNC1() {
            return this.f23109c == 1000;
        }

        private InputEdge(char c6, ECIEncoderSet eCIEncoderSet, int i7, InputEdge inputEdge, int i10) {
            char c10 = c6 == i10 ? (char) 1000 : c6;
            this.f23109c = c10;
            this.encoderIndex = i7;
            this.previous = inputEdge;
            int length = c10 == 1000 ? 1 : eCIEncoderSet.encode(c6, i7).length;
            length = (inputEdge == null ? 0 : inputEdge.encoderIndex) != i7 ? length + 3 : length;
            this.cachedTotalSize = inputEdge != null ? length + inputEdge.cachedTotalSize : length;
        }
    }

    public MinimalECIInput(String str, Charset charset, int i7) {
        this.fnc1 = i7;
        ECIEncoderSet eCIEncoderSet = new ECIEncoderSet(str, charset, i7);
        if (eCIEncoderSet.length() != 1) {
            this.bytes = encodeMinimally(str, eCIEncoderSet, i7);
            return;
        }
        this.bytes = new int[str.length()];
        for (int i10 = 0; i10 < this.bytes.length; i10++) {
            char cCharAt = str.charAt(i10);
            int[] iArr = this.bytes;
            if (cCharAt == i7) {
                cCharAt = 1000;
            }
            iArr[i10] = cCharAt;
        }
    }

    public static void addEdge(InputEdge[][] inputEdgeArr, int i7, InputEdge inputEdge) {
        if (inputEdgeArr[i7][inputEdge.encoderIndex] == null || inputEdgeArr[i7][inputEdge.encoderIndex].cachedTotalSize > inputEdge.cachedTotalSize) {
            inputEdgeArr[i7][inputEdge.encoderIndex] = inputEdge;
        }
    }

    public static void addEdges(String str, ECIEncoderSet eCIEncoderSet, InputEdge[][] inputEdgeArr, int i7, InputEdge inputEdge, int i10) {
        int i11;
        int priorityEncoderIndex;
        ECIEncoderSet eCIEncoderSet2;
        InputEdge inputEdge2;
        int i12;
        char cCharAt = str.charAt(i7);
        int length = eCIEncoderSet.length();
        if (eCIEncoderSet.getPriorityEncoderIndex() < 0 || !(cCharAt == i10 || eCIEncoderSet.canEncode(cCharAt, eCIEncoderSet.getPriorityEncoderIndex()))) {
            i11 = length;
            priorityEncoderIndex = 0;
        } else {
            priorityEncoderIndex = eCIEncoderSet.getPriorityEncoderIndex();
            i11 = priorityEncoderIndex + 1;
        }
        int i13 = priorityEncoderIndex;
        while (i13 < i11) {
            if (cCharAt == i10 || eCIEncoderSet.canEncode(cCharAt, i13)) {
                eCIEncoderSet2 = eCIEncoderSet;
                inputEdge2 = inputEdge;
                i12 = i10;
                addEdge(inputEdgeArr, i7 + 1, new InputEdge(cCharAt, eCIEncoderSet2, i13, inputEdge2, i12));
            } else {
                eCIEncoderSet2 = eCIEncoderSet;
                inputEdge2 = inputEdge;
                i12 = i10;
            }
            i13++;
            eCIEncoderSet = eCIEncoderSet2;
            inputEdge = inputEdge2;
            i10 = i12;
        }
    }

    public static int[] encodeMinimally(String str, ECIEncoderSet eCIEncoderSet, int i7) {
        int length = str.length();
        InputEdge[][] inputEdgeArr = (InputEdge[][]) Array.newInstance((Class<?>) InputEdge.class, length + 1, eCIEncoderSet.length());
        addEdges(str, eCIEncoderSet, inputEdgeArr, 0, null, i7);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < eCIEncoderSet.length(); i11++) {
                InputEdge inputEdge = inputEdgeArr[i10][i11];
                if (inputEdge != null && i10 < length) {
                    addEdges(str, eCIEncoderSet, inputEdgeArr, i10, inputEdge, i7);
                }
            }
            for (int i12 = 0; i12 < eCIEncoderSet.length(); i12++) {
                inputEdgeArr[i10 - 1][i12] = null;
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < eCIEncoderSet.length(); i15++) {
            InputEdge inputEdge2 = inputEdgeArr[length][i15];
            if (inputEdge2 != null && inputEdge2.cachedTotalSize < i14) {
                i14 = inputEdge2.cachedTotalSize;
                i13 = i15;
            }
        }
        if (i13 < 0) {
            throw new IllegalStateException(q0.k("Failed to encode \"", str, "\""));
        }
        ArrayList arrayList = new ArrayList();
        for (InputEdge inputEdge3 = inputEdgeArr[length][i13]; inputEdge3 != null; inputEdge3 = inputEdge3.previous) {
            if (inputEdge3.isFNC1()) {
                arrayList.add(0, 1000);
            } else {
                byte[] bArrEncode = eCIEncoderSet.encode(inputEdge3.f23109c, inputEdge3.encoderIndex);
                for (int length2 = bArrEncode.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bArrEncode[length2] & UnsignedBytes.MAX_VALUE));
                }
            }
            if ((inputEdge3.previous == null ? 0 : inputEdge3.previous.encoderIndex) != inputEdge3.encoderIndex) {
                arrayList.add(0, Integer.valueOf(eCIEncoderSet.getECIValue(inputEdge3.encoderIndex) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i16 = 0; i16 < size; i16++) {
            iArr[i16] = ((Integer) arrayList.get(i16)).intValue();
        }
        return iArr;
    }

    @Override // com.google.zxing.common.ECIInput
    public char charAt(int i7) {
        if (i7 < 0 || i7 >= length()) {
            throw new IndexOutOfBoundsException(G.m(i7, ""));
        }
        if (isECI(i7)) {
            throw new IllegalArgumentException(F.c(i7, "value at ", " is not a character but an ECI"));
        }
        return (char) (isFNC1(i7) ? this.fnc1 : this.bytes[i7]);
    }

    @Override // com.google.zxing.common.ECIInput
    public int getECIValue(int i7) {
        if (i7 < 0 || i7 >= length()) {
            throw new IndexOutOfBoundsException(G.m(i7, ""));
        }
        if (isECI(i7)) {
            return this.bytes[i7] - 256;
        }
        throw new IllegalArgumentException(F.c(i7, "value at ", " is not an ECI but a character"));
    }

    public int getFNC1Character() {
        return this.fnc1;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean haveNCharacters(int i7, int i10) {
        if ((i7 + i10) - 1 >= this.bytes.length) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (isECI(i7 + i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean isECI(int i7) {
        if (i7 < 0 || i7 >= length()) {
            throw new IndexOutOfBoundsException(G.m(i7, ""));
        }
        int i10 = this.bytes[i7];
        return i10 > 255 && i10 <= 999;
    }

    public boolean isFNC1(int i7) {
        if (i7 < 0 || i7 >= length()) {
            throw new IndexOutOfBoundsException(G.m(i7, ""));
        }
        return this.bytes[i7] == 1000;
    }

    @Override // com.google.zxing.common.ECIInput
    public int length() {
        return this.bytes.length;
    }

    @Override // com.google.zxing.common.ECIInput
    public CharSequence subSequence(int i7, int i10) {
        if (i7 < 0 || i7 > i10 || i10 > length()) {
            throw new IndexOutOfBoundsException(G.m(i7, ""));
        }
        StringBuilder sb2 = new StringBuilder();
        while (i7 < i10) {
            if (isECI(i7)) {
                throw new IllegalArgumentException(F.c(i7, "value at ", " is not a character but an ECI"));
            }
            sb2.append(charAt(i7));
            i7++;
        }
        return sb2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < length(); i7++) {
            if (i7 > 0) {
                sb2.append(", ");
            }
            if (isECI(i7)) {
                sb2.append("ECI(");
                sb2.append(getECIValue(i7));
                sb2.append(')');
            } else if (charAt(i7) < 128) {
                sb2.append('\'');
                sb2.append(charAt(i7));
                sb2.append('\'');
            } else {
                sb2.append((int) charAt(i7));
            }
        }
        return sb2.toString();
    }
}

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int binaryShiftCost;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i7, int i10, int i11) {
        this.token = token;
        this.mode = i7;
        this.binaryShiftByteCount = i10;
        this.bitCount = i11;
        this.binaryShiftCost = calculateBinaryShiftCost(i10);
    }

    private static int calculateBinaryShiftCost(int i7) {
        if (i7 > 62) {
            return 21;
        }
        if (i7 > 31) {
            return 20;
        }
        return i7 > 0 ? 10 : 0;
    }

    public State addBinaryShiftChar(int i7) {
        int i10;
        Token tokenAdd = this.token;
        int i11 = this.mode;
        int i12 = this.bitCount;
        if (i11 == 4 || i11 == 2) {
            int i13 = HighLevelEncoder.LATCH_TABLE[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            tokenAdd = tokenAdd.add(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.binaryShiftByteCount;
        if (i16 == 0 || i16 == 31) {
            i10 = 18;
        } else {
            i10 = i16 == 62 ? 9 : 8;
        }
        State state = new State(tokenAdd, i11, i16 + 1, i12 + i10);
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i7 + 1) : state;
    }

    public State appendFLGn(int i7) {
        Token tokenAdd;
        Token token = shiftAndAppend(4, 0).token;
        int length = 3;
        if (i7 < 0) {
            tokenAdd = token.add(0, 3);
        } else {
            if (i7 > 999999) {
                throw new IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] bytes = Integer.toString(i7).getBytes(StandardCharsets.ISO_8859_1);
            Token tokenAdd2 = token.add(bytes.length, 3);
            for (byte b7 : bytes) {
                tokenAdd2 = tokenAdd2.add(b7 - 46, 4);
            }
            length = 3 + (bytes.length * 4);
            tokenAdd = tokenAdd2;
        }
        return new State(tokenAdd, this.mode, 0, this.bitCount + length);
    }

    public State endBinaryShift(int i7) {
        int i10 = this.binaryShiftByteCount;
        return i10 == 0 ? this : new State(this.token.addBinaryShift(i7 - i10, i10), this.mode, 0, this.bitCount);
    }

    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public int getMode() {
        return this.mode;
    }

    public Token getToken() {
        return this.token;
    }

    public boolean isBetterThanOrEqualTo(State state) {
        int i7 = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i10 = this.binaryShiftByteCount;
        int i11 = state.binaryShiftByteCount;
        if (i10 < i11) {
            i7 += state.binaryShiftCost - this.binaryShiftCost;
        } else if (i10 > i11 && i11 > 0) {
            i7 += 10;
        }
        return i7 <= state.bitCount;
    }

    public State latchAndAppend(int i7, int i10) {
        int i11 = this.bitCount;
        Token tokenAdd = this.token;
        int i12 = this.mode;
        if (i7 != i12) {
            int i13 = HighLevelEncoder.LATCH_TABLE[i12][i7];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            tokenAdd = tokenAdd.add(i14, i15);
            i11 += i15;
        }
        int i16 = i7 == 2 ? 4 : 5;
        return new State(tokenAdd.add(i10, i16), i7, 0, i11 + i16);
    }

    public State shiftAndAppend(int i7, int i10) {
        Token token = this.token;
        int i11 = this.mode;
        int i12 = i11 == 2 ? 4 : 5;
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[i11][i7], i12).add(i10, 5), this.mode, 0, this.bitCount + i12 + 5);
    }

    public BitArray toBitArray(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (Token previous = endBinaryShift(bArr.length).token; previous != null; previous = previous.getPrevious()) {
            arrayList.add(previous);
        }
        BitArray bitArray = new BitArray();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Token) arrayList.get(size)).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }
}

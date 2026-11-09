package com.google.zxing.aztec.encoder;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP;
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER = 0;
    static final int[][] SHIFT_TABLE;
    private final Charset charset;
    private final byte[] text;
    static final String[] MODE_NAMES = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] LATCH_TABLE = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    static {
        int[] iArr = {5, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        CHAR_MAP = iArr2;
        iArr2[0][32] = 1;
        for (int i7 = 65; i7 <= 90; i7++) {
            CHAR_MAP[0][i7] = i7 - 63;
        }
        CHAR_MAP[1][32] = 1;
        for (int i10 = 97; i10 <= 122; i10++) {
            CHAR_MAP[1][i10] = i10 - 95;
        }
        CHAR_MAP[2][32] = 1;
        for (int i11 = 48; i11 <= 57; i11++) {
            CHAR_MAP[2][i11] = i11 - 46;
        }
        int[] iArr3 = CHAR_MAP[2];
        iArr3[44] = 12;
        iArr3[46] = 13;
        int[] iArr4 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i12 = 0; i12 < 28; i12++) {
            CHAR_MAP[3][iArr4[i12]] = i12;
        }
        int[] iArr5 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i13 = 0; i13 < 31; i13++) {
            int i14 = iArr5[i13];
            if (i14 > 0) {
                CHAR_MAP[4][i14] = i13;
            }
        }
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        SHIFT_TABLE = iArr6;
        for (int[] iArr7 : iArr6) {
            Arrays.fill(iArr7, -1);
        }
        int[][] iArr8 = SHIFT_TABLE;
        iArr8[0][4] = 0;
        int[] iArr9 = iArr8[1];
        iArr9[4] = 0;
        iArr9[0] = 28;
        iArr8[3][4] = 0;
        int[] iArr10 = iArr8[2];
        iArr10[4] = 0;
        iArr10[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.text = bArr;
        this.charset = null;
    }

    private static Collection<State> simplifyStates(Iterable<State> iterable) {
        LinkedList linkedList = new LinkedList();
        for (State state : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.addFirst(state);
                    break;
                }
                State state2 = (State) it.next();
                if (state2.isBetterThanOrEqualTo(state)) {
                    break;
                }
                if (state.isBetterThanOrEqualTo(state2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void updateStateForChar(State state, int i7, Collection<State> collection) {
        char c6 = (char) (this.text[i7] & UnsignedBytes.MAX_VALUE);
        boolean z3 = CHAR_MAP[state.getMode()][c6] > 0;
        State stateEndBinaryShift = null;
        for (int i10 = 0; i10 <= 4; i10++) {
            int i11 = CHAR_MAP[i10][c6];
            if (i11 > 0) {
                if (stateEndBinaryShift == null) {
                    stateEndBinaryShift = state.endBinaryShift(i7);
                }
                if (!z3 || i10 == state.getMode() || i10 == 2) {
                    collection.add(stateEndBinaryShift.latchAndAppend(i10, i11));
                }
                if (!z3 && SHIFT_TABLE[state.getMode()][i10] >= 0) {
                    collection.add(stateEndBinaryShift.shiftAndAppend(i10, i11));
                }
            }
        }
        if (state.getBinaryShiftByteCount() > 0 || CHAR_MAP[state.getMode()][c6] == 0) {
            collection.add(state.addBinaryShiftChar(i7));
        }
    }

    private static void updateStateForPair(State state, int i7, int i10, Collection<State> collection) {
        State stateEndBinaryShift = state.endBinaryShift(i7);
        collection.add(stateEndBinaryShift.latchAndAppend(4, i10));
        if (state.getMode() != 4) {
            collection.add(stateEndBinaryShift.shiftAndAppend(4, i10));
        }
        if (i10 == 3 || i10 == 4) {
            collection.add(stateEndBinaryShift.latchAndAppend(2, 16 - i10).latchAndAppend(2, 1));
        }
        if (state.getBinaryShiftByteCount() > 0) {
            collection.add(state.addBinaryShiftChar(i7).addBinaryShiftChar(i7 + 1));
        }
    }

    private Collection<State> updateStateListForChar(Iterable<State> iterable, int i7) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForChar(it.next(), i7, linkedList);
        }
        return simplifyStates(linkedList);
    }

    private static Collection<State> updateStateListForPair(Iterable<State> iterable, int i7, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator<State> it = iterable.iterator();
        while (it.hasNext()) {
            updateStateForPair(it.next(), i7, i10, linkedList);
        }
        return simplifyStates(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public BitArray encode() {
        int i7;
        State stateAppendFLGn = State.INITIAL_STATE;
        Charset charset = this.charset;
        if (charset != null) {
            CharacterSetECI characterSetECI = CharacterSetECI.getCharacterSetECI(charset);
            if (characterSetECI == null) {
                throw new IllegalArgumentException("No ECI code for character set " + this.charset);
            }
            stateAppendFLGn = stateAppendFLGn.appendFLGn(characterSetECI.getValue());
        }
        Collection<State> collectionSingletonList = Collections.singletonList(stateAppendFLGn);
        int i10 = 0;
        while (true) {
            byte[] bArr = this.text;
            if (i10 >= bArr.length) {
                return ((State) Collections.min(collectionSingletonList, new Comparator<State>() { // from class: com.google.zxing.aztec.encoder.HighLevelEncoder.1
                    @Override // java.util.Comparator
                    public int compare(State state, State state2) {
                        return state.getBitCount() - state2.getBitCount();
                    }
                })).toBitArray(this.text);
            }
            int i11 = i10 + 1;
            byte b7 = i11 < bArr.length ? bArr[i11] : (byte) 0;
            byte b10 = bArr[i10];
            if (b10 != 13) {
                if (b10 != 44) {
                    if (b10 != 46) {
                        if (b10 == 58 && b7 == 32) {
                            i7 = 5;
                        } else {
                            i7 = 0;
                        }
                    } else if (b7 == 32) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                } else if (b7 == 32) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
            } else if (b7 == 10) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            if (i7 > 0) {
                collectionSingletonList = updateStateListForPair(collectionSingletonList, i10, i7);
                i10 = i11;
            } else {
                collectionSingletonList = updateStateListForChar(collectionSingletonList, i10);
            }
            i10++;
        }
    }

    public HighLevelEncoder(byte[] bArr, Charset charset) {
        this.text = bArr;
        this.charset = charset;
    }
}

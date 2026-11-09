package com.google.gson.stream;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.google.gson.Strictness;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class JsonReader implements Closeable {
    static final int BUFFER_SIZE = 1024;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private Strictness strictness = Strictness.LEGACY_STRICT;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int iDoPeek = jsonReader.peeked;
                if (iDoPeek == 0) {
                    iDoPeek = jsonReader.doPeek();
                }
                if (iDoPeek == 13) {
                    jsonReader.peeked = 9;
                } else if (iDoPeek == 12) {
                    jsonReader.peeked = 8;
                } else {
                    if (iDoPeek != 14) {
                        throw jsonReader.unexpectedTokenError("a name");
                    }
                    jsonReader.peeked = 10;
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.in = reader;
    }

    private void checkLenient() throws MalformedJsonException {
        if (this.strictness != Strictness.LENIENT) {
            throw syntaxError("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i7 = this.pos;
        this.pos = i7 - 1;
        if (i7 + 4 <= this.limit || fillBuffer(5)) {
            int i10 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
                this.pos = i10 + 5;
            }
        }
    }

    private boolean fillBuffer(int i7) throws IOException {
        int i10;
        int i11;
        char[] cArr = this.buffer;
        int i12 = this.lineStart;
        int i13 = this.pos;
        this.lineStart = i12 - i13;
        int i14 = this.limit;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.limit = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i16 = this.limit;
            int i17 = reader.read(cArr, i16, cArr.length - i16);
            if (i17 == -1) {
                return false;
            }
            i10 = this.limit + i17;
            this.limit = i10;
            if (this.lineNumber == 0 && (i11 = this.lineStart) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i11 + 1;
                i7++;
            }
        } while (i10 < i7);
        return true;
    }

    private String getPath(boolean z3) {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i10 = this.stackSize;
            if (i7 >= i10) {
                return sb2.toString();
            }
            int i11 = this.stack[i7];
            switch (i11) {
                case 1:
                case 2:
                    int i12 = this.pathIndices[i7];
                    if (z3 && i12 > 0 && i7 == i10 - 1) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.pathNames[i7];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(G.m(i11, "Unknown scope value: "));
            }
            i7++;
        }
    }

    private boolean isLiteral(char c6) throws IOException {
        if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
            return false;
        }
        if (c6 != '#') {
            if (c6 == ',') {
                return false;
            }
            if (c6 != '/' && c6 != '=') {
                if (c6 == '{' || c6 == '}' || c6 == ':') {
                    return false;
                }
                if (c6 != ';') {
                    switch (c6) {
                        case '[':
                        case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                            return false;
                        case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z3) throws IOException {
        char[] cArr = this.buffer;
        int i7 = this.pos;
        int i10 = this.limit;
        while (true) {
            if (i7 == i10) {
                this.pos = i7;
                if (!fillBuffer(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i7 = this.pos;
                i10 = this.limit;
            }
            int i11 = i7 + 1;
            char c6 = cArr[i7];
            if (c6 == '\n') {
                this.lineNumber++;
                this.lineStart = i11;
            } else if (c6 != ' ' && c6 != '\r' && c6 != '\t') {
                if (c6 == '/') {
                    this.pos = i11;
                    if (i11 == i10) {
                        this.pos = i7;
                        boolean zFillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!zFillBuffer) {
                        }
                        return c6;
                    }
                    checkLenient();
                    int i12 = this.pos;
                    char c10 = cArr[i12];
                    if (c10 == '*') {
                        this.pos = i12 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i7 = this.pos + 2;
                        i10 = this.limit;
                    } else {
                        if (c10 != '/') {
                            return c6;
                        }
                        this.pos = i12 + 1;
                        skipToEndOfLine();
                        i7 = this.pos;
                        i10 = this.limit;
                    }
                } else {
                    if (c6 != '#') {
                        this.pos = i11;
                        return c6;
                    }
                    this.pos = i11;
                    checkLenient();
                    skipToEndOfLine();
                    i7 = this.pos;
                    i10 = this.limit;
                }
            }
            i7 = i11;
        }
    }

    private String nextQuotedValue(char c6) throws IOException {
        int i7;
        char[] cArr = this.buffer;
        StringBuilder sb2 = null;
        do {
            int i10 = this.pos;
            int i11 = this.limit;
            while (true) {
                int i12 = i11;
                i7 = i10;
                while (true) {
                    if (i10 < i12) {
                        int i13 = i10 + 1;
                        char c10 = cArr[i10];
                        if (this.strictness == Strictness.STRICT && c10 < ' ') {
                            throw syntaxError("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c10 == c6) {
                            this.pos = i13;
                            int i14 = (i13 - i7) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i7, i14);
                            }
                            sb2.append(cArr, i7, i14);
                            return sb2.toString();
                        }
                        if (c10 == '\\') {
                            this.pos = i13;
                            int i15 = i13 - i7;
                            int i16 = i15 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i15 * 2, 16));
                            }
                            sb2.append(cArr, i7, i16);
                            sb2.append(readEscapeCharacter());
                            i10 = this.pos;
                            i11 = this.limit;
                        } else {
                            if (c10 == '\n') {
                                this.lineNumber++;
                                this.lineStart = i13;
                            }
                            i10 = i13;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i10 - i7) * 2, 16));
            }
            sb2.append(cArr, i7, i10 - i7);
            this.pos = i10;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String nextUnquotedValue() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i7 = 0;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = this.pos;
                if (i11 + i10 < this.limit) {
                    char c6 = this.buffer[i11 + i10];
                    if (c6 != '\t' && c6 != '\n' && c6 != '\f' && c6 != '\r' && c6 != ' ') {
                        if (c6 != '#') {
                            if (c6 != ',') {
                                if (c6 != '/' && c6 != '=') {
                                    if (c6 != '{' && c6 != '}' && c6 != ':') {
                                        if (c6 != ';') {
                                            switch (c6) {
                                                case '[':
                                                case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                                                    break;
                                                case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    i7 = i10;
                } else if (i10 >= this.buffer.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i10, 16));
                    }
                    sb2.append(this.buffer, this.pos, i10);
                    this.pos += i10;
                    if (!fillBuffer(1)) {
                    }
                } else if (!fillBuffer(i10 + 1)) {
                    i7 = i10;
                }
                if (sb2 == null) {
                    string = new String(this.buffer, this.pos, i7);
                } else {
                    sb2.append(this.buffer, this.pos, i7);
                    string = sb2.toString();
                }
                this.pos += i7;
                return string;
            }
        }
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i7;
        char c6 = this.buffer[this.pos];
        if (c6 == 't' || c6 == 'T') {
            str = "true";
            str2 = "TRUE";
            i7 = 5;
        } else if (c6 == 'f' || c6 == 'F') {
            str = "false";
            str2 = "FALSE";
            i7 = 6;
        } else {
            if (c6 != 'n' && c6 != 'N') {
                return 0;
            }
            str = BuildConfig.TRAVIS;
            str2 = "NULL";
            i7 = 7;
        }
        boolean z3 = this.strictness != Strictness.STRICT;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (this.pos + i10 >= this.limit && !fillBuffer(i10 + 1)) {
                return 0;
            }
            char c10 = this.buffer[this.pos + i10];
            if (c10 != str.charAt(i10) && (!z3 || c10 != str2.charAt(i10))) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i7;
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int peekNumber() throws IOException {
        char c6;
        int i7;
        char[] cArr = this.buffer;
        int i10 = this.pos;
        int i11 = this.limit;
        int i12 = 0;
        int i13 = 0;
        char c10 = 0;
        boolean z3 = false;
        int i14 = 1;
        long j6 = 0;
        while (true) {
            char c11 = 2;
            if (i10 + i13 != i11) {
                c6 = cArr[i10 + i13];
                i7 = i12;
                if (c6 != '+') {
                    if (c6 != 'E' || c6 == 'e') {
                        if (c10 == 2 && c10 != 4) {
                            return i7;
                        }
                        c10 = 5;
                    } else if (c6 == '-') {
                        c11 = 6;
                        if (c10 == 0) {
                            c10 = 1;
                            z3 = true;
                        } else if (c10 != 5) {
                            return i7;
                        }
                    } else if (c6 != '.') {
                        if (c6 < '0' || c6 > '9') {
                            if (!isLiteral(c6)) {
                                break;
                            }
                            return i7;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j6 = -(c6 - '0');
                        } else if (c10 == 2) {
                            if (j6 == 0) {
                                return i7;
                            }
                            long j10 = (10 * j6) - ((long) (c6 - '0'));
                            i14 &= (j6 > MIN_INCOMPLETE_INTEGER || (j6 == MIN_INCOMPLETE_INTEGER && j10 < j6)) ? 1 : i7;
                            j6 = j10;
                        } else if (c10 == 3) {
                            c10 = 4;
                        } else if (c10 == 5 || c10 == 6) {
                            c10 = 7;
                        }
                    } else {
                        if (c10 != 2) {
                            return i7;
                        }
                        c10 = 3;
                    }
                    i13++;
                    i12 = i7;
                } else {
                    c11 = 6;
                    if (c10 != 5) {
                        return i7;
                    }
                }
                c10 = c11;
                i13++;
                i12 = i7;
            } else {
                if (i13 == cArr.length) {
                    return i12;
                }
                if (!fillBuffer(i13 + 1)) {
                    i7 = i12;
                    break;
                }
                i10 = this.pos;
                i11 = this.limit;
                c6 = cArr[i10 + i13];
                i7 = i12;
                if (c6 != '+') {
                    if (c6 != 'E') {
                        if (c10 == 2) {
                        }
                        c10 = 5;
                    } else {
                        if (c10 == 2) {
                        }
                        c10 = 5;
                    }
                    i13++;
                    i12 = i7;
                } else {
                    c11 = 6;
                    if (c10 != 5) {
                        return i7;
                    }
                }
                c10 = c11;
                i13++;
                i12 = i7;
            }
        }
        if (c10 == 2 && i14 != 0 && ((j6 != Long.MIN_VALUE || z3) && (j6 != 0 || !z3))) {
            if (!z3) {
                j6 = -j6;
            }
            this.peekedLong = j6;
            this.pos += i13;
            this.peeked = 15;
            return 15;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i7;
        }
        this.peekedNumberLength = i13;
        this.peeked = 16;
        return 16;
    }

    private void push(int i7) {
        int i10 = this.stackSize;
        int[] iArr = this.stack;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.stack = Arrays.copyOf(iArr, i11);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i11);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i11);
        }
        int[] iArr2 = this.stack;
        int i12 = this.stackSize;
        this.stackSize = i12 + 1;
        iArr2[i12] = i7;
    }

    private char readEscapeCharacter() throws IOException {
        int i7;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i10 = this.pos;
        int i11 = i10 + 1;
        this.pos = i11;
        char c6 = cArr[i10];
        if (c6 != '\n') {
            if (c6 != '\"') {
                if (c6 != '\'') {
                    if (c6 != '/' && c6 != '\\') {
                        if (c6 == 'b') {
                            return '\b';
                        }
                        if (c6 == 'f') {
                            return '\f';
                        }
                        if (c6 == 'n') {
                            return '\n';
                        }
                        if (c6 == 'r') {
                            return '\r';
                        }
                        if (c6 == 't') {
                            return '\t';
                        }
                        if (c6 != 'u') {
                            throw syntaxError("Invalid escape sequence");
                        }
                        if (i10 + 5 > this.limit && !fillBuffer(4)) {
                            throw syntaxError("Unterminated escape sequence");
                        }
                        int i12 = this.pos;
                        int i13 = i12 + 4;
                        int i14 = 0;
                        while (i12 < i13) {
                            char[] cArr2 = this.buffer;
                            char c10 = cArr2[i12];
                            int i15 = i14 << 4;
                            if (c10 >= '0' && c10 <= '9') {
                                i7 = c10 - '0';
                            } else if (c10 >= 'a' && c10 <= 'f') {
                                i7 = c10 - 'W';
                            } else {
                                if (c10 < 'A' || c10 > 'F') {
                                    throw syntaxError("Malformed Unicode escape \\u".concat(new String(cArr2, this.pos, 4)));
                                }
                                i7 = c10 - '7';
                            }
                            i14 = i7 + i15;
                            i12++;
                        }
                        this.pos += 4;
                        return (char) i14;
                    }
                }
            }
            return c6;
        }
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Cannot escape a newline character in strict mode");
        }
        this.lineNumber++;
        this.lineStart = i11;
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Invalid escaped character \"'\" in strict mode");
        }
        return c6;
    }

    private void skipQuotedValue(char c6) throws IOException {
        char[] cArr = this.buffer;
        do {
            int i7 = this.pos;
            int i10 = this.limit;
            while (i7 < i10) {
                int i11 = i7 + 1;
                char c10 = cArr[i7];
                if (c10 == c6) {
                    this.pos = i11;
                    return;
                }
                if (c10 == '\\') {
                    this.pos = i11;
                    readEscapeCharacter();
                    i7 = this.pos;
                    i10 = this.limit;
                } else {
                    if (c10 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i11;
                    }
                    i7 = i11;
                }
            }
            this.pos = i7;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i7 = this.pos;
            if (cArr[i7] != '\n') {
                for (int i10 = 0; i10 < length; i10++) {
                    if (this.buffer[this.pos + i10] == str.charAt(i10)) {
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i7 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() throws IOException {
        char c6;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i7 = this.pos;
            int i10 = i7 + 1;
            this.pos = i10;
            c6 = cArr[i7];
            if (c6 == '\n') {
                this.lineNumber++;
                this.lineStart = i10;
                return;
            }
        } while (c6 != '\r');
    }

    private void skipUnquotedValue() throws IOException {
        do {
            int i7 = 0;
            while (true) {
                int i10 = this.pos;
                if (i10 + i7 < this.limit) {
                    char c6 = this.buffer[i10 + i7];
                    if (c6 != '\t' && c6 != '\n' && c6 != '\f' && c6 != '\r' && c6 != ' ') {
                        if (c6 != '#') {
                            if (c6 != ',') {
                                if (c6 != '/' && c6 != '=') {
                                    if (c6 != '{' && c6 != '}' && c6 != ':') {
                                        if (c6 != ';') {
                                            switch (c6) {
                                                case '[':
                                                case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                                                    break;
                                                case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                                                    break;
                                                default:
                                                    i7++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    this.pos += i7;
                    return;
                }
                this.pos = i10 + i7;
            }
        } while (fillBuffer(1));
    }

    private MalformedJsonException syntaxError(String str) throws MalformedJsonException {
        StringBuilder sbS = u.s(str);
        sbS.append(locationString());
        sbS.append("\nSee ");
        sbS.append(TroubleshootingGuide.createUrl("malformed-json"));
        throw new MalformedJsonException(sbS.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException unexpectedTokenError(String str) throws IOException {
        String str2 = peek() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbQ = q0.q("Expected ", str, " but was ");
        sbQ.append(peek());
        sbQ.append(locationString());
        sbQ.append("\nSee ");
        sbQ.append(TroubleshootingGuide.createUrl(str2));
        return new IllegalStateException(sbQ.toString());
    }

    public void beginArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 3) {
            throw unexpectedTokenError("BEGIN_ARRAY");
        }
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
    }

    public void beginObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 1) {
            throw unexpectedTokenError("BEGIN_OBJECT");
        }
        push(3);
        this.peeked = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public int doPeek() throws IOException {
        int iNextNonWhitespace;
        int[] iArr = this.stack;
        int i7 = this.stackSize;
        int i10 = iArr[i7 - 1];
        if (i10 == 1) {
            iArr[i7 - 1] = 2;
        } else if (i10 == 2) {
            int iNextNonWhitespace2 = nextNonWhitespace(true);
            if (iNextNonWhitespace2 != 44) {
                if (iNextNonWhitespace2 != 59) {
                    if (iNextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i10 == 3 || i10 == 5) {
                iArr[i7 - 1] = 4;
                if (i10 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (iNextNonWhitespace != 59) {
                        if (iNextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 == 125) {
                    if (i10 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) iNextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i10 == 4) {
                iArr[i7 - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i11 = this.pos;
                        if (cArr[i11] == '>') {
                            this.pos = i11 + 1;
                        }
                    }
                }
            } else if (i10 == 6) {
                if (this.strictness == Strictness.LENIENT) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i10 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i10 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i10 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i10 != 1 && i10 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw unexpectedTokenError("END_ARRAY");
        }
        int i7 = this.stackSize;
        this.stackSize = i7 - 1;
        int[] iArr = this.pathIndices;
        int i10 = i7 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw unexpectedTokenError("END_OBJECT");
        }
        int i7 = this.stackSize;
        int i10 = i7 - 1;
        this.stackSize = i10;
        this.pathNames[i10] = null;
        int[] iArr = this.pathIndices;
        int i11 = i7 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.peeked = 0;
    }

    public String getPreviousPath() {
        return getPath(true);
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public boolean hasNext() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    public String locationString() {
        StringBuilder sbP = q0.p(this.lineNumber + 1, " at line ", (this.pos - this.lineStart) + 1, " column ", " path ");
        sbP.append(getPath());
        return sbP.toString();
    }

    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i7 = this.stackSize - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iDoPeek != 6) {
            throw unexpectedTokenError("a boolean");
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i7 = this.stackSize - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (iDoPeek == 8 || iDoPeek == 9) {
            this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw unexpectedTokenError("a double");
        }
        this.peeked = 11;
        double d2 = Double.parseDouble(this.peekedString);
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw syntaxError("JSON forbids NaN and infinities: " + d2);
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return d2;
    }

    public int nextInt() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            long j6 = this.peekedLong;
            int i7 = (int) j6;
            if (j6 != i7) {
                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return i7;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw unexpectedTokenError("an int");
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                int i11 = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i12 = this.stackSize - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d2 = Double.parseDouble(this.peekedString);
        int i13 = (int) d2;
        if (i13 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public long nextLong() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i7 = this.stackSize - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw unexpectedTokenError("a long");
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                long j6 = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return j6;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d2 = Double.parseDouble(this.peekedString);
        long j10 = (long) d2;
        if (j10 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j10;
    }

    public String nextName() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue('\'');
        } else {
            if (iDoPeek != 13) {
                throw unexpectedTokenError("a name");
            }
            strNextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    public void nextNull() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 7) {
            throw unexpectedTokenError(BuildConfig.TRAVIS);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i7 = this.stackSize - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            str = nextUnquotedValue();
        } else if (iDoPeek == 8) {
            str = nextQuotedValue('\'');
        } else if (iDoPeek == 9) {
            str = nextQuotedValue('\"');
        } else if (iDoPeek == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (iDoPeek != 16) {
                throw unexpectedTokenError("a string");
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i7 = this.stackSize - 1;
        iArr[i7] = iArr[i7] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Deprecated
    public final void setLenient(boolean z3) {
        setStrictness(z3 ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i7 = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            switch (iDoPeek) {
                case 1:
                    push(3);
                    i7++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i7--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i7++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i7--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue('\"');
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i7 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue('\"');
                    if (i7 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i7 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i7 > 0);
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }

    public String getPath() {
        return getPath(false);
    }
}

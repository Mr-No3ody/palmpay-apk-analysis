package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.horcrux.svg.d0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaf = {'u', 'l', 'l'};
    private static final char[] zag = {'r', 'u', 'e'};
    private static final char[] zah = {'r', 'u', 'e', '\"'};
    private static final char[] zai = {'a', 'l', 's', 'e'};
    private static final char[] zaj = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zak = {'\n'};
    private static final zai zam = new zaa();
    private static final zai zan = new zab();
    private static final zai zao = new zac();
    private static final zai zap = new zad();
    private static final zai zaq = new zae();
    private static final zai zar = new zaf();
    private static final zai zas = new zag();
    private static final zai zat = new zah();
    private final char[] zaa = new char[1];
    private final char[] zab = new char[32];
    private final char[] zac = new char[1024];
    private final StringBuilder zad = new StringBuilder(32);
    private final StringBuilder zae = new StringBuilder(1024);
    private final Stack zal = new Stack();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        @KeepForSdk
        public ParseException(@NonNull String str) {
            super(str);
        }

        @KeepForSdk
        public ParseException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }

        @KeepForSdk
        public ParseException(@NonNull Throwable th) {
            super(th);
        }
    }

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @Nullable char[] cArr2) throws ParseException, IOException {
        sb2.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z3 = false;
        boolean z8 = false;
        while (true) {
            int i7 = bufferedReader.read(cArr);
            if (i7 == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            int i10 = 0;
            while (i10 < i7) {
                char c6 = cArr[i10];
                if (Character.isISOControl(c6) && (cArr2 == null || cArr2[0] != c6)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i11 = i10 + 1;
                if (c6 != '\"') {
                    if (c6 == '\\') {
                        z3 = !z3;
                        z8 = true;
                    }
                    i10 = i11;
                } else if (!z3) {
                    sb2.append(cArr, 0, i10);
                    bufferedReader.reset();
                    bufferedReader.skip(i11);
                    return z8 ? JsonUtils.unescapeString(sb2.toString()) : sb2.toString();
                }
                z3 = false;
                i10 = i11;
            }
            sb2.append(cArr, 0, i7);
            bufferedReader.mark(cArr.length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zai(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        HashMap map;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strZaj = zaj(bufferedReader);
        boolean z3 = true;
        if (strZaj == null) {
            zaz(1);
            return false;
        }
        while (strZaj != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strZaj);
            if (field == null) {
                strZaj = zak(bufferedReader);
            } else {
                Stack stack = this.zal;
                stack.push(4);
                int i7 = field.zaa;
                char c6 = '}';
                switch (i7) {
                    case 0:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zab(bufferedReader));
                        } else {
                            fastJsonResponse.zab(field, zam(bufferedReader, zam));
                        }
                        break;
                    case 1:
                        if (!field.zab) {
                            fastJsonResponse.zac(field, zad(bufferedReader));
                        } else {
                            fastJsonResponse.zad(field, zam(bufferedReader, zas));
                        }
                        break;
                    case 2:
                        if (!field.zab) {
                            fastJsonResponse.zae(field, zac(bufferedReader));
                        } else {
                            fastJsonResponse.zaf(field, zam(bufferedReader, zan));
                        }
                        break;
                    case 3:
                        if (!field.zab) {
                            fastJsonResponse.zag(field, zaf(bufferedReader));
                        } else {
                            fastJsonResponse.zah(field, zam(bufferedReader, zao));
                        }
                        break;
                    case 4:
                        if (!field.zab) {
                            fastJsonResponse.zai(field, zag(bufferedReader));
                        } else {
                            fastJsonResponse.zaj(field, zam(bufferedReader, zap));
                        }
                        break;
                    case 5:
                        if (!field.zab) {
                            fastJsonResponse.zak(field, zah(bufferedReader));
                        } else {
                            fastJsonResponse.zal(field, zam(bufferedReader, zat));
                        }
                        break;
                    case 6:
                        if (!field.zab) {
                            fastJsonResponse.zam(field, zar(bufferedReader, false));
                        } else {
                            fastJsonResponse.zan(field, zam(bufferedReader, zaq));
                        }
                        break;
                    case 7:
                        if (!field.zab) {
                            fastJsonResponse.zao(field, zaa(bufferedReader));
                        } else {
                            fastJsonResponse.zap(field, zam(bufferedReader, zar));
                        }
                        break;
                    case 8:
                        fastJsonResponse.zaq(field, Base64Utils.decode(zan(bufferedReader, this.zac, this.zae, zak)));
                        break;
                    case 9:
                        fastJsonResponse.zaq(field, Base64Utils.decodeUrlSafe(zan(bufferedReader, this.zac, this.zae, zak)));
                        break;
                    case 10:
                        char cZaw = zaw(bufferedReader);
                        if (cZaw == 'n') {
                            zay(bufferedReader, zaf);
                            map = null;
                        } else {
                            if (cZaw != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            stack.push(1);
                            map = new HashMap();
                            while (true) {
                                char cZaw2 = zaw(bufferedReader);
                                if (cZaw2 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cZaw2 == '\"') {
                                    char[] cArr = this.zab;
                                    StringBuilder sb2 = this.zad;
                                    String strZaA = zaA(bufferedReader, cArr, sb2, null);
                                    if (zaw(bufferedReader) != ':') {
                                        throw new ParseException("No map value found for key ".concat(String.valueOf(strZaA)));
                                    }
                                    if (zaw(bufferedReader) != '\"') {
                                        throw new ParseException("Expected String value for key ".concat(String.valueOf(strZaA)));
                                    }
                                    map.put(strZaA, zaA(bufferedReader, cArr, sb2, null));
                                    char cZaw3 = zaw(bufferedReader);
                                    if (cZaw3 == ',') {
                                        z3 = true;
                                        c6 = '}';
                                    } else {
                                        if (cZaw3 != '}') {
                                            throw new ParseException(u.p(new StringBuilder(String.valueOf(cZaw3).length() + 47), "Unexpected character while parsing string map: ", cZaw3));
                                        }
                                        zaz(1);
                                    }
                                } else if (cZaw2 == c6) {
                                    zaz(z3 ? 1 : 0);
                                }
                            }
                        }
                        fastJsonResponse.zar(field, map);
                        break;
                    case 11:
                        if (field.zab) {
                            char cZaw4 = zaw(bufferedReader);
                            if (cZaw4 == 'n') {
                                zay(bufferedReader, zaf);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                stack.push(5);
                                if (cZaw4 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        } else {
                            char cZaw5 = zaw(bufferedReader);
                            if (cZaw5 == 'n') {
                                zay(bufferedReader, zaf);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                stack.push(1);
                                if (cZaw5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZaf = field.zaf();
                                    zai(bufferedReader, fastJsonResponseZaf);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZaf);
                                } catch (IllegalAccessException e10) {
                                    throw new ParseException("Error instantiating inner object", e10);
                                } catch (InstantiationException e11) {
                                    throw new ParseException("Error instantiating inner object", e11);
                                }
                            }
                        }
                        break;
                    default:
                        throw new ParseException(d0.n(i7, "Invalid field type ", new StringBuilder(String.valueOf(i7).length() + 19)));
                }
                zaz(4);
                zaz(2);
                char cZaw6 = zaw(bufferedReader);
                if (cZaw6 == ',') {
                    strZaj = zaj(bufferedReader);
                } else {
                    if (cZaw6 != '}') {
                        throw new ParseException(u.p(new StringBuilder(String.valueOf(cZaw6).length() + 54), "Expected end of object or field separator, but found: ", cZaw6));
                    }
                    strZaj = null;
                }
                z3 = true;
            }
        }
        zaz(z3 ? 1 : 0);
        return z3;
    }

    @Nullable
    private final String zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        Stack stack = this.zal;
        stack.push(2);
        char cZaw = zaw(bufferedReader);
        if (cZaw == '\"') {
            stack.push(3);
            String strZaA = zaA(bufferedReader, this.zab, this.zad, null);
            zaz(3);
            if (zaw(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZaw != ']') {
            if (cZaw != '}') {
                throw new ParseException(u.p(new StringBuilder(String.valueOf(cZaw).length() + 18), "Unexpected token: ", cZaw));
            }
            zaz(2);
            return null;
        }
        zaz(2);
        zaz(1);
        zaz(5);
        return null;
    }

    @Nullable
    private final String zak(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cZaw = zaw(bufferedReader);
        int i7 = 1;
        if (cZaw == '\"') {
            char[] cArr = this.zaa;
            if (bufferedReader.read(cArr) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c6 = cArr[0];
            boolean z3 = false;
            while (true) {
                if (c6 == '\"') {
                    if (!z3) {
                        break;
                    }
                    c6 = '\"';
                    z3 = true;
                }
                z3 = c6 == '\\' ? !z3 : false;
                if (bufferedReader.read(cArr) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c6 = cArr[0];
                if (Character.isISOControl(c6)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
            }
        } else {
            if (cZaw == ',') {
                throw new ParseException("Missing value");
            }
            if (cZaw == '[') {
                this.zal.push(5);
                bufferedReader.mark(32);
                if (zaw(bufferedReader) == ']') {
                    zaz(5);
                } else {
                    bufferedReader.reset();
                    boolean z8 = false;
                    boolean z10 = false;
                    while (i7 > 0) {
                        char cZaw2 = zaw(bufferedReader);
                        if (cZaw2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cZaw2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (cZaw2 == '\"') {
                            if (!z10) {
                                z8 = !z8;
                            }
                            cZaw2 = '\"';
                        }
                        if (cZaw2 == '[') {
                            if (!z8) {
                                i7++;
                            }
                            cZaw2 = '[';
                        }
                        if (cZaw2 == ']' && !z8) {
                            i7--;
                        }
                        z10 = (cZaw2 == '\\' && z8) ? !z10 : false;
                    }
                    zaz(5);
                }
            } else if (cZaw != '{') {
                bufferedReader.reset();
                zax(bufferedReader, this.zac);
            } else {
                this.zal.push(1);
                bufferedReader.mark(32);
                char cZaw3 = zaw(bufferedReader);
                if (cZaw3 == '}') {
                    zaz(1);
                } else {
                    if (cZaw3 != '\"') {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(cZaw3).length() + 17);
                        sb2.append("Unexpected token ");
                        sb2.append(cZaw3);
                        throw new ParseException(sb2.toString());
                    }
                    bufferedReader.reset();
                    zaj(bufferedReader);
                    while (zak(bufferedReader) != null) {
                    }
                    zaz(1);
                }
            }
        }
        char cZaw4 = zaw(bufferedReader);
        if (cZaw4 == ',') {
            zaz(2);
            return zaj(bufferedReader);
        }
        if (cZaw4 == '}') {
            zaz(2);
            return null;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZaw4).length() + 17);
        sb3.append("Unexpected token ");
        sb3.append(cZaw4);
        throw new ParseException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* JADX INFO: renamed from: zal, reason: merged with bridge method [inline-methods] */
    public final String zaa(BufferedReader bufferedReader) throws ParseException, IOException {
        return zan(bufferedReader, this.zab, this.zad, null);
    }

    @Nullable
    private final ArrayList zam(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char cZaw = zaw(bufferedReader);
        if (cZaw == 'n') {
            zay(bufferedReader, zaf);
            return null;
        }
        if (cZaw != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zal.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZaw2 = zaw(bufferedReader);
            if (cZaw2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZaw2 != ',') {
                if (cZaw2 == ']') {
                    zaz(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    @Nullable
    private final String zan(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @Nullable char[] cArr2) throws ParseException, IOException {
        char cZaw = zaw(bufferedReader);
        if (cZaw == '\"') {
            return zaA(bufferedReader, cArr, sb2, cArr2);
        }
        if (cZaw != 'n') {
            throw new ParseException("Expected string");
        }
        zay(bufferedReader, zaf);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zao, reason: merged with bridge method [inline-methods] */
    public final int zab(BufferedReader bufferedReader) throws ParseException, IOException {
        int i7;
        int i10;
        char[] cArr = this.zac;
        int iZax = zax(bufferedReader, cArr);
        if (iZax == 0) {
            return 0;
        }
        if (iZax <= 0) {
            throw new ParseException("No number to parse");
        }
        char c6 = cArr[0];
        int i11 = c6 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i12 = c6 == '-' ? 1 : 0;
        if (i12 < iZax) {
            i10 = i12 + 1;
            int iDigit = Character.digit(cArr[i12], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i7 = -iDigit;
        } else {
            i7 = 0;
            i10 = i12;
        }
        while (i10 < iZax) {
            int i13 = i10 + 1;
            int iDigit2 = Character.digit(cArr[i10], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i7 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i14 = i7 * 10;
            if (i14 < i11 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i7 = i14 - iDigit2;
            i10 = i13;
        }
        if (i12 == 0) {
            return -i7;
        }
        if (i10 > 1) {
            return i7;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zap, reason: merged with bridge method [inline-methods] */
    public final long zac(BufferedReader bufferedReader) throws ParseException, IOException {
        long j6;
        int i7;
        char[] cArr = this.zac;
        int iZax = zax(bufferedReader, cArr);
        if (iZax == 0) {
            return 0L;
        }
        if (iZax <= 0) {
            throw new ParseException("No number to parse");
        }
        char c6 = cArr[0];
        long j10 = c6 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i10 = c6 == '-' ? 1 : 0;
        int i11 = 10;
        if (i10 < iZax) {
            i7 = i10 + 1;
            int iDigit = Character.digit(cArr[i10], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j6 = -iDigit;
        } else {
            j6 = 0;
            i7 = i10;
        }
        while (i7 < iZax) {
            int i12 = i7 + 1;
            int iDigit2 = Character.digit(cArr[i7], i11);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j6 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j11 = j6 * 10;
            long j12 = j10;
            long j13 = iDigit2;
            if (j11 < j12 + j13) {
                throw new ParseException("Number too large");
            }
            j6 = j11 - j13;
            i7 = i12;
            j10 = j12;
            i11 = 10;
        }
        if (i10 == 0) {
            return -j6;
        }
        if (i7 > 1) {
            return j6;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* JADX INFO: renamed from: zaq, reason: merged with bridge method [inline-methods] */
    public final BigInteger zad(BufferedReader bufferedReader) throws ParseException, IOException {
        char[] cArr = this.zac;
        int iZax = zax(bufferedReader, cArr);
        if (iZax == 0) {
            return null;
        }
        return new BigInteger(new String(cArr, 0, iZax));
    }

    private final boolean zar(BufferedReader bufferedReader, boolean z3) throws ParseException, IOException {
        char cZaw = zaw(bufferedReader);
        if (cZaw == '\"') {
            if (z3) {
                throw new ParseException("No boolean value found in string");
            }
            return zar(bufferedReader, true);
        }
        if (cZaw == 'f') {
            zay(bufferedReader, z3 ? zaj : zai);
            return false;
        }
        if (cZaw == 'n') {
            zay(bufferedReader, zaf);
            return false;
        }
        if (cZaw != 't') {
            throw new ParseException(u.p(new StringBuilder(String.valueOf(cZaw).length() + 18), "Unexpected token: ", cZaw));
        }
        zay(bufferedReader, z3 ? zah : zag);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zas, reason: merged with bridge method [inline-methods] */
    public final float zaf(BufferedReader bufferedReader) throws ParseException, IOException {
        char[] cArr = this.zac;
        int iZax = zax(bufferedReader, cArr);
        if (iZax == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(cArr, 0, iZax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zat, reason: merged with bridge method [inline-methods] */
    public final double zag(BufferedReader bufferedReader) throws ParseException, IOException {
        char[] cArr = this.zac;
        int iZax = zax(bufferedReader, cArr);
        if (iZax == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(cArr, 0, iZax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* JADX INFO: renamed from: zau, reason: merged with bridge method [inline-methods] */
    public final BigDecimal zah(BufferedReader bufferedReader) throws ParseException, IOException {
        char[] cArr = this.zac;
        int iZax = zax(bufferedReader, cArr);
        if (iZax == 0) {
            return null;
        }
        return new BigDecimal(new String(cArr, 0, iZax));
    }

    @Nullable
    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZaw = zaw(bufferedReader);
        if (cZaw == ']') {
            zaz(5);
            return arrayList;
        }
        if (cZaw == 'n') {
            zay(bufferedReader, zaf);
            zaz(5);
            return null;
        }
        if (cZaw != '{') {
            StringBuilder sb2 = new StringBuilder(String.valueOf(cZaw).length() + 18);
            sb2.append("Unexpected token: ");
            sb2.append(cZaw);
            throw new ParseException(sb2.toString());
        }
        Stack stack = this.zal;
        stack.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZaf = field.zaf();
                if (!zai(bufferedReader, fastJsonResponseZaf)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZaf);
                char cZaw2 = zaw(bufferedReader);
                if (cZaw2 != ',') {
                    if (cZaw2 == ']') {
                        zaz(5);
                        return arrayList;
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(cZaw2).length() + 18);
                    sb3.append("Unexpected token: ");
                    sb3.append(cZaw2);
                    throw new ParseException(sb3.toString());
                }
                if (zaw(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                stack.push(1);
            } catch (IllegalAccessException e10) {
                throw new ParseException("Error instantiating inner object", e10);
            } catch (InstantiationException e11) {
                throw new ParseException("Error instantiating inner object", e11);
            }
        }
    }

    private final char zaw(BufferedReader bufferedReader) throws ParseException, IOException {
        char[] cArr = this.zaa;
        if (bufferedReader.read(cArr) != -1) {
            while (Character.isWhitespace(cArr[0])) {
                if (bufferedReader.read(cArr) == -1) {
                }
            }
            return cArr[0];
        }
        return (char) 0;
    }

    private final int zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i7;
        char cZaw = zaw(bufferedReader);
        if (cZaw == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZaw == ',') {
            throw new ParseException("Missing value");
        }
        if (cZaw == 'n') {
            zay(bufferedReader, zaf);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZaw == '\"') {
            i7 = 0;
            boolean z3 = false;
            while (i7 < 1024 && bufferedReader.read(cArr, i7, 1) != -1) {
                char c6 = cArr[i7];
                if (Character.isISOControl(c6)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i10 = i7 + 1;
                if (c6 != '\"') {
                    if (c6 == '\\') {
                        z3 = !z3;
                    }
                    i7 = i10;
                } else if (!z3) {
                    bufferedReader.reset();
                    bufferedReader.skip(i10);
                    return i7;
                }
                z3 = false;
                i7 = i10;
            }
        } else {
            cArr[0] = cZaw;
            i7 = 1;
            while (i7 < 1024 && bufferedReader.read(cArr, i7, 1) != -1) {
                char c10 = cArr[i7];
                if (c10 == '}' || c10 == ',' || Character.isWhitespace(c10) || cArr[i7] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i7 - 1);
                    cArr[i7] = 0;
                    return i7;
                }
                i7++;
            }
        }
        if (i7 == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    private final void zay(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i7 = 0;
        while (true) {
            int length = cArr.length;
            if (i7 >= length) {
                return;
            }
            char[] cArr2 = this.zab;
            int i10 = bufferedReader.read(cArr2, 0, length - i7);
            if (i10 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (cArr[i11 + i7] != cArr2[i11]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i7 += i10;
        }
    }

    private final void zaz(int i7) throws ParseException {
        Stack stack = this.zal;
        if (stack.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 35);
            sb2.append("Expected state ");
            sb2.append(i7);
            sb2.append(" but had empty stack");
            throw new ParseException(sb2.toString());
        }
        int iIntValue = ((Integer) stack.pop()).intValue();
        if (iIntValue == i7) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 24 + String.valueOf(iIntValue).length());
        sb3.append("Expected state ");
        sb3.append(i7);
        sb3.append(" but had ");
        sb3.append(iIntValue);
        throw new ParseException(sb3.toString());
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                Stack stack = this.zal;
                stack.push(0);
                char cZaw = zaw(bufferedReader);
                if (cZaw == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZaw == '[') {
                    stack.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZaw != '{') {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(cZaw).length() + 18);
                        sb2.append("Unexpected token: ");
                        sb2.append(cZaw);
                        throw new ParseException(sb2.toString());
                    }
                    stack.push(1);
                    zai(bufferedReader, t);
                }
                zaz(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException e10) {
            throw new ParseException(e10);
        }
    }

    public final /* synthetic */ boolean zae(BufferedReader bufferedReader, boolean z3) {
        return zar(bufferedReader, false);
    }
}

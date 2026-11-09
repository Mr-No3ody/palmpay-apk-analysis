package W5;

import C0.G;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f10561a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i7, char c6) {
        return i7 < str.length() && str.charAt(i7) == c6;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x0134 A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01dd A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01fd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0134, please report this as an issue */
    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        String strL;
        String message;
        int i7;
        int i10;
        int iC;
        int iC2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id2;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i11 = index + 4;
            int iC3 = c(str, index, i11);
            if (a(str, i11, '-')) {
                i11 = index + 5;
            }
            int i12 = i11 + 2;
            int iC4 = c(str, i11, i12);
            if (a(str, i12, '-')) {
                i12 = i11 + 3;
            }
            int i13 = i12 + 2;
            int iC5 = c(str, i12, i13);
            boolean zA = a(str, i13, 'T');
            if (!zA && str.length() <= i13) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC3, iC4 - 1, iC5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i13);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i14 = i12 + 5;
                int iC6 = c(str, i12 + 3, i14);
                if (a(str, i14, ':')) {
                    i14 = i12 + 6;
                }
                int i15 = i14 + 2;
                int iC7 = c(str, i14, i15);
                if (a(str, i15, ':')) {
                    i15 = i14 + 3;
                }
                if (str.length() <= i15 || (cCharAt2 = str.charAt(i15)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i13 = i15;
                    i7 = iC6;
                    i10 = iC7;
                } else {
                    int i16 = i15 + 2;
                    iC2 = c(str, i15, i16);
                    if (iC2 > 59 && iC2 < 63) {
                        iC2 = 59;
                    }
                    if (a(str, i16, '.')) {
                        int i17 = i15 + 3;
                        int i18 = i15 + 4;
                        while (true) {
                            if (i18 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i18);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i18++;
                            }
                            length2 = i18;
                            break;
                        }
                        int iMin = Math.min(length2, i15 + 6);
                        iC = c(str, i17, iMin);
                        int i19 = iMin - i17;
                        if (i19 == 1) {
                            iC *= 100;
                        } else if (i19 == 2) {
                            iC *= 10;
                        }
                        i7 = iC6;
                        i13 = length2;
                        i10 = iC7;
                    } else {
                        i7 = iC6;
                        i13 = i16;
                        i10 = iC7;
                        iC = 0;
                    }
                }
                if (str.length() > i13) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i13);
                timeZone = f10561a;
                if (cCharAt == 'Z') {
                    length = i13 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i13);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + TransType.TRANS_SCENE_REFUND;
                    }
                    length = i13 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                        str2 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str2);
                        id2 = timeZone.getID();
                        if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iC3);
                gregorianCalendar2.set(2, iC4 - 1);
                gregorianCalendar2.set(5, iC5);
                gregorianCalendar2.set(11, i7);
                gregorianCalendar2.set(12, i10);
                gregorianCalendar2.set(13, iC2);
                gregorianCalendar2.set(14, iC);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i7 = 0;
            i10 = 0;
            iC = 0;
            iC2 = 0;
            if (str.length() > i13) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i13);
            timeZone = f10561a;
            if (cCharAt == 'Z') {
                length = i13 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i13);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + TransType.TRANS_SCENE_REFUND;
                }
                length = i13 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    id2 = timeZone.getID();
                    if (!id2.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iC3);
            gregorianCalendar3.set(2, iC4 - 1);
            gregorianCalendar3.set(5, iC5);
            gregorianCalendar3.set(11, i7);
            gregorianCalendar3.set(12, i10);
            gregorianCalendar3.set(13, iC2);
            gregorianCalendar3.set(14, iC);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                strL = null;
            } else {
                strL = G.l('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(G.p("Failed to parse date [", strL, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
                strL = null;
            } else {
                strL = G.l('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(G.p("Failed to parse date [", strL, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e12) {
            e = e12;
            if (str == null) {
                strL = null;
            } else {
                strL = G.l('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(G.p("Failed to parse date [", strL, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int c(String str, int i7, int i10) {
        int i11;
        int i12;
        if (i7 < 0 || i10 > str.length() || i7 > i10) {
            throw new NumberFormatException(str);
        }
        if (i7 < i10) {
            i12 = i7 + 1;
            int iDigit = Character.digit(str.charAt(i7), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i10));
            }
            i11 = -iDigit;
        } else {
            i11 = 0;
            i12 = i7;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int iDigit2 = Character.digit(str.charAt(i12), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i10));
            }
            i11 = (i11 * 10) - iDigit2;
            i12 = i13;
        }
        return -i11;
    }
}

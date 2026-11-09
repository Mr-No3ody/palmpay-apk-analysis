package com.google.zxing.client.result;

import com.adjust.sdk.Constants;
import com.google.zxing.Result;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultParser {
    private static final String BYTE_ORDER_MARK = "\ufeff";
    private static final ResultParser[] PARSERS = {new BookmarkDoCoMoResultParser(), new AddressBookDoCoMoResultParser(), new EmailDoCoMoResultParser(), new AddressBookAUResultParser(), new VCardResultParser(), new BizcardResultParser(), new VEventResultParser(), new EmailAddressResultParser(), new SMTPResultParser(), new TelResultParser(), new SMSMMSResultParser(), new SMSTOMMSTOResultParser(), new GeoResultParser(), new WifiResultParser(), new URLTOResultParser(), new URIResultParser(), new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser(), new VINResultParser()};
    private static final Pattern DIGITS = Pattern.compile("\\d+");
    private static final Pattern AMPERSAND = Pattern.compile("&");
    private static final Pattern EQUALS = Pattern.compile("=");
    static final String[] EMPTY_STR_ARRAY = new String[0];

    private static void appendKeyValue(CharSequence charSequence, Map<String, String> map) {
        String[] strArrSplit = EQUALS.split(charSequence, 2);
        if (strArrSplit.length == 2) {
            try {
                map.put(strArrSplit[0], urlDecode(strArrSplit[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private static int countPrecedingBackslashes(CharSequence charSequence, int i7) {
        int i10 = 0;
        for (int i11 = i7 - 1; i11 >= 0 && charSequence.charAt(i11) == '\\'; i11--) {
            i10++;
        }
        return i10;
    }

    public static String getMassagedText(Result result) {
        String text = result.getText();
        return text.startsWith(BYTE_ORDER_MARK) ? text.substring(1) : text;
    }

    public static boolean isStringOfDigits(CharSequence charSequence, int i7) {
        return charSequence != null && i7 > 0 && i7 == charSequence.length() && DIGITS.matcher(charSequence).matches();
    }

    public static boolean isSubstringOfDigits(CharSequence charSequence, int i7, int i10) {
        int i11;
        return charSequence != null && i10 > 0 && charSequence.length() >= (i11 = i10 + i7) && DIGITS.matcher(charSequence.subSequence(i7, i11)).matches();
    }

    public static String[] matchPrefixedField(String str, String str2, char c6, boolean z3) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i7 = 0;
        while (i7 < length) {
            int iIndexOf = str2.indexOf(str, i7);
            if (iIndexOf < 0) {
                break;
            }
            int length2 = str.length() + iIndexOf;
            boolean z8 = true;
            ArrayList arrayList2 = arrayList;
            int length3 = length2;
            while (z8) {
                int iIndexOf2 = str2.indexOf(c6, length3);
                if (iIndexOf2 < 0) {
                    length3 = str2.length();
                } else if (countPrecedingBackslashes(str2, iIndexOf2) % 2 != 0) {
                    length3 = iIndexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String strUnescapeBackslash = unescapeBackslash(str2.substring(length2, iIndexOf2));
                    if (z3) {
                        strUnescapeBackslash = strUnescapeBackslash.trim();
                    }
                    if (!strUnescapeBackslash.isEmpty()) {
                        arrayList2.add(strUnescapeBackslash);
                    }
                    length3 = iIndexOf2 + 1;
                }
                z8 = false;
            }
            i7 = length3;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(EMPTY_STR_ARRAY);
    }

    public static String matchSinglePrefixedField(String str, String str2, char c6, boolean z3) {
        String[] strArrMatchPrefixedField = matchPrefixedField(str, str2, c6, z3);
        if (strArrMatchPrefixedField == null) {
            return null;
        }
        return strArrMatchPrefixedField[0];
    }

    public static void maybeAppend(String str, StringBuilder sb2) {
        if (str != null) {
            sb2.append('\n');
            sb2.append(str);
        }
    }

    public static String[] maybeWrap(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    public static int parseHexDigit(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        if (c6 >= 'a' && c6 <= 'f') {
            return c6 - 'W';
        }
        if (c6 < 'A' || c6 > 'F') {
            return -1;
        }
        return c6 - '7';
    }

    public static Map<String, String> parseNameValuePairs(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf < 0) {
            return null;
        }
        HashMap map = new HashMap(3);
        for (String str2 : AMPERSAND.split(str.substring(iIndexOf + 1))) {
            appendKeyValue(str2, map);
        }
        return map;
    }

    public static ParsedResult parseResult(Result result) {
        for (ResultParser resultParser : PARSERS) {
            ParsedResult parsedResult = resultParser.parse(result);
            if (parsedResult != null) {
                return parsedResult;
            }
        }
        return new TextParsedResult(result.getText(), null);
    }

    public static String unescapeBackslash(String str) {
        int iIndexOf = str.indexOf(92);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, iIndexOf);
        boolean z3 = false;
        while (iIndexOf < length) {
            char cCharAt = str.charAt(iIndexOf);
            if (z3 || cCharAt != '\\') {
                sb2.append(cCharAt);
                z3 = false;
            } else {
                z3 = true;
            }
            iIndexOf++;
        }
        return sb2.toString();
    }

    public static String urlDecode(String str) {
        try {
            return URLDecoder.decode(str, Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public abstract ParsedResult parse(Result result);

    public static void maybeAppend(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append('\n');
                sb2.append(str);
            }
        }
    }
}

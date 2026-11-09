package com.google.zxing.client.result;

import com.google.android.material.navigation.NavigationBarView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class VINResultParser extends ResultParser {
    private static final Pattern IOQ = Pattern.compile("[IOQ]");
    private static final Pattern AZ09 = Pattern.compile("[A-Z0-9]{17}");

    private static char checkChar(int i7) {
        if (i7 < 10) {
            return (char) (i7 + 48);
        }
        if (i7 == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    private static boolean checkChecksum(CharSequence charSequence) {
        int i7 = 0;
        int iVinPositionWeight = 0;
        while (i7 < charSequence.length()) {
            int i10 = i7 + 1;
            iVinPositionWeight += vinPositionWeight(i10) * vinCharValue(charSequence.charAt(i7));
            i7 = i10;
        }
        return charSequence.charAt(8) == checkChar(iVinPositionWeight % 11);
    }

    private static String countryCode(CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        char cCharAt2 = charSequence.charAt(1);
        if (cCharAt == '9') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                return "BR";
            }
            if (cCharAt2 < '3' || cCharAt2 > '9') {
                return null;
            }
            return "BR";
        }
        if (cCharAt == 'S') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'M') {
                return "UK";
            }
            if (cCharAt2 < 'N' || cCharAt2 > 'T') {
                return null;
            }
            return "DE";
        }
        if (cCharAt == 'Z') {
            if (cCharAt2 < 'A' || cCharAt2 > 'R') {
                return null;
            }
            return "IT";
        }
        switch (cCharAt) {
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
            case '4':
            case '5':
                return "US";
            case '2':
                return "CA";
            case '3':
                if (cCharAt2 < 'A' || cCharAt2 > 'W') {
                    return null;
                }
                return "MX";
            default:
                switch (cCharAt) {
                    case 'J':
                        if (cCharAt2 < 'A' || cCharAt2 > 'T') {
                            return null;
                        }
                        return "JP";
                    case 'K':
                        if (cCharAt2 < 'L' || cCharAt2 > 'R') {
                            return null;
                        }
                        return "KO";
                    case 'L':
                        return "CN";
                    case 'M':
                        if (cCharAt2 < 'A' || cCharAt2 > 'E') {
                            return null;
                        }
                        return "IN";
                    default:
                        switch (cCharAt) {
                            case 'V':
                                if (cCharAt2 >= 'F' && cCharAt2 <= 'R') {
                                    return "FR";
                                }
                                if (cCharAt2 < 'S' || cCharAt2 > 'W') {
                                    return null;
                                }
                                return "ES";
                            case 'W':
                                return "DE";
                            case 'X':
                                if (cCharAt2 == '0') {
                                    return "RU";
                                }
                                if (cCharAt2 < '3' || cCharAt2 > '9') {
                                    return null;
                                }
                                return "RU";
                            default:
                                return null;
                        }
                }
        }
    }

    private static int modelYear(char c6) {
        if (c6 >= 'E' && c6 <= 'H') {
            return c6 + 1915;
        }
        if (c6 >= 'J' && c6 <= 'N') {
            return c6 + 1914;
        }
        if (c6 == 'P') {
            return 1993;
        }
        if (c6 >= 'R' && c6 <= 'T') {
            return c6 + 1912;
        }
        if (c6 >= 'V' && c6 <= 'Y') {
            return c6 + 1911;
        }
        if (c6 >= '1' && c6 <= '9') {
            return c6 + 1952;
        }
        if (c6 < 'A' || c6 > 'D') {
            throw new IllegalArgumentException();
        }
        return c6 + 1945;
    }

    private static int vinCharValue(char c6) {
        if (c6 >= 'A' && c6 <= 'I') {
            return c6 - '@';
        }
        if (c6 >= 'J' && c6 <= 'R') {
            return c6 - 'I';
        }
        if (c6 >= 'S' && c6 <= 'Z') {
            return c6 - 'Q';
        }
        if (c6 < '0' || c6 > '9') {
            throw new IllegalArgumentException();
        }
        return c6 - '0';
    }

    private static int vinPositionWeight(int i7) {
        if (i7 >= 1 && i7 <= 7) {
            return 9 - i7;
        }
        if (i7 == 8) {
            return 10;
        }
        if (i7 == 9) {
            return 0;
        }
        if (i7 < 10 || i7 > 17) {
            throw new IllegalArgumentException();
        }
        return 19 - i7;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.CODE_39) {
            return null;
        }
        String strTrim = IOQ.matcher(result.getText()).replaceAll("").trim();
        if (!AZ09.matcher(strTrim).matches()) {
            return null;
        }
        try {
            if (!checkChecksum(strTrim)) {
                return null;
            }
            String strSubstring = strTrim.substring(0, 3);
            return new VINParsedResult(strTrim, strSubstring, strTrim.substring(3, 9), strTrim.substring(9, 17), countryCode(strSubstring), strTrim.substring(3, 8), modelYear(strTrim.charAt(9)), strTrim.charAt(10), strTrim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}

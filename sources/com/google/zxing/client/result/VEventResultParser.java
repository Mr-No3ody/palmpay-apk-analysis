package com.google.zxing.client.result;

import com.google.android.gms.stats.CodePackage;
import com.google.zxing.Result;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class VEventResultParser extends ResultParser {
    private static String matchSingleVCardPrefixedField(CharSequence charSequence, String str) {
        List<String> listMatchSingleVCardPrefixedField = VCardResultParser.matchSingleVCardPrefixedField(charSequence, str, true, false);
        if (listMatchSingleVCardPrefixedField == null || listMatchSingleVCardPrefixedField.isEmpty()) {
            return null;
        }
        return listMatchSingleVCardPrefixedField.get(0);
    }

    private static String[] matchVCardPrefixedField(CharSequence charSequence, String str) {
        List<List<String>> listMatchVCardPrefixedField = VCardResultParser.matchVCardPrefixedField(charSequence, str, true, false);
        if (listMatchVCardPrefixedField == null || listMatchVCardPrefixedField.isEmpty()) {
            return null;
        }
        int size = listMatchVCardPrefixedField.size();
        String[] strArr = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr[i7] = listMatchVCardPrefixedField.get(i7).get(0);
        }
        return strArr;
    }

    private static String stripMailto(String str) {
        if (str != null) {
            return (str.startsWith("mailto:") || str.startsWith("MAILTO:")) ? str.substring(7) : str;
        }
        return str;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public CalendarParsedResult parse(Result result) {
        double d2;
        double d10;
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String strMatchSingleVCardPrefixedField = matchSingleVCardPrefixedField("SUMMARY", massagedText);
        String strMatchSingleVCardPrefixedField2 = matchSingleVCardPrefixedField("DTSTART", massagedText);
        if (strMatchSingleVCardPrefixedField2 == null) {
            return null;
        }
        String strMatchSingleVCardPrefixedField3 = matchSingleVCardPrefixedField("DTEND", massagedText);
        String strMatchSingleVCardPrefixedField4 = matchSingleVCardPrefixedField("DURATION", massagedText);
        String strMatchSingleVCardPrefixedField5 = matchSingleVCardPrefixedField(CodePackage.LOCATION, massagedText);
        String strStripMailto = stripMailto(matchSingleVCardPrefixedField("ORGANIZER", massagedText));
        String[] strArrMatchVCardPrefixedField = matchVCardPrefixedField("ATTENDEE", massagedText);
        if (strArrMatchVCardPrefixedField != null) {
            for (int i7 = 0; i7 < strArrMatchVCardPrefixedField.length; i7++) {
                strArrMatchVCardPrefixedField[i7] = stripMailto(strArrMatchVCardPrefixedField[i7]);
            }
        }
        String strMatchSingleVCardPrefixedField6 = matchSingleVCardPrefixedField("DESCRIPTION", massagedText);
        String strMatchSingleVCardPrefixedField7 = matchSingleVCardPrefixedField("GEO", massagedText);
        if (strMatchSingleVCardPrefixedField7 == null) {
            d2 = Double.NaN;
            d10 = Double.NaN;
        } else {
            int iIndexOf = strMatchSingleVCardPrefixedField7.indexOf(59);
            if (iIndexOf < 0) {
                return null;
            }
            try {
                d2 = Double.parseDouble(strMatchSingleVCardPrefixedField7.substring(0, iIndexOf));
                d10 = Double.parseDouble(strMatchSingleVCardPrefixedField7.substring(iIndexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new CalendarParsedResult(strMatchSingleVCardPrefixedField, strMatchSingleVCardPrefixedField2, strMatchSingleVCardPrefixedField3, strMatchSingleVCardPrefixedField4, strMatchSingleVCardPrefixedField5, strStripMailto, strArrMatchVCardPrefixedField, strMatchSingleVCardPrefixedField6, d2, d10);
    }
}

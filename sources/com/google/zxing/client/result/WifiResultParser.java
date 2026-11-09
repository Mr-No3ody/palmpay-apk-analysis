package com.google.zxing.client.result;

import com.google.zxing.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String strSubstring;
        String strMatchSinglePrefixedField;
        String str;
        boolean z3;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (strMatchSinglePrefixedField = ResultParser.matchSinglePrefixedField("S:", (strSubstring = massagedText.substring(5)), ';', false)) == null || strMatchSinglePrefixedField.isEmpty()) {
            return null;
        }
        String strMatchSinglePrefixedField2 = ResultParser.matchSinglePrefixedField("P:", strSubstring, ';', false);
        String strMatchSinglePrefixedField3 = ResultParser.matchSinglePrefixedField("T:", strSubstring, ';', false);
        if (strMatchSinglePrefixedField3 == null) {
            strMatchSinglePrefixedField3 = "nopass";
        }
        String str2 = strMatchSinglePrefixedField3;
        String strMatchSinglePrefixedField4 = ResultParser.matchSinglePrefixedField("PH2:", strSubstring, ';', false);
        String strMatchSinglePrefixedField5 = ResultParser.matchSinglePrefixedField("H:", strSubstring, ';', false);
        if (strMatchSinglePrefixedField5 != null) {
            if (strMatchSinglePrefixedField4 != null || "true".equalsIgnoreCase(strMatchSinglePrefixedField5) || "false".equalsIgnoreCase(strMatchSinglePrefixedField5)) {
                str = strMatchSinglePrefixedField4;
                z3 = Boolean.parseBoolean(strMatchSinglePrefixedField5);
            } else {
                str = strMatchSinglePrefixedField5;
            }
            return new WifiParsedResult(str2, strMatchSinglePrefixedField, strMatchSinglePrefixedField2, z3, ResultParser.matchSinglePrefixedField("I:", strSubstring, ';', false), ResultParser.matchSinglePrefixedField("A:", strSubstring, ';', false), ResultParser.matchSinglePrefixedField("E:", strSubstring, ';', false), str);
        }
        str = strMatchSinglePrefixedField4;
        z3 = false;
        return new WifiParsedResult(str2, strMatchSinglePrefixedField, strMatchSinglePrefixedField2, z3, ResultParser.matchSinglePrefixedField("I:", strSubstring, ';', false), ResultParser.matchSinglePrefixedField("A:", strSubstring, ';', false), ResultParser.matchSinglePrefixedField("E:", strSubstring, ';', false), str);
    }
}

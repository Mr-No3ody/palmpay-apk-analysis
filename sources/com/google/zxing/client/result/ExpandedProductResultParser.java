package com.google.zxing.client.result;

import com.google.api.Service;
import com.google.common.base.Ascii;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedProductResultParser extends ResultParser {
    private static String findAIvalue(int i7, String str) {
        if (str.charAt(i7) != '(') {
            return null;
        }
        String strSubstring = str.substring(i7 + 1);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strSubstring.length(); i10++) {
            char cCharAt = strSubstring.charAt(i10);
            if (cCharAt == ')') {
                return sb2.toString();
            }
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    private static String findValue(int i7, String str) {
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(i7);
        for (int i10 = 0; i10 < strSubstring.length(); i10++) {
            char cCharAt = strSubstring.charAt(i10);
            if (cCharAt != '(') {
                sb2.append(cCharAt);
            } else {
                if (findAIvalue(i10, strSubstring) != null) {
                    break;
                }
                sb2.append('(');
            }
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.client.result.ResultParser
    public ExpandedProductParsedResult parse(Result result) {
        ExpandedProductParsedResult expandedProductParsedResult;
        ExpandedProductParsedResult expandedProductParsedResult2 = null;
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED) {
            return null;
        }
        String massagedText = ResultParser.getMassagedText(result);
        HashMap map = new HashMap();
        int length = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String strSubstring = null;
        String strSubstring2 = null;
        String strSubstring3 = null;
        String strSubstring4 = null;
        while (length < massagedText.length()) {
            String strFindAIvalue = findAIvalue(length, massagedText);
            if (strFindAIvalue == null) {
                return expandedProductParsedResult2;
            }
            int length2 = strFindAIvalue.length() + 2 + length;
            String strFindValue = findValue(length2, massagedText);
            length = strFindValue.length() + length2;
            byte b7 = -1;
            switch (strFindAIvalue.hashCode()) {
                case 1536:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals(TransType.TRANS_SCENE_REFUND)) {
                        b7 = 0;
                    }
                    break;
                case 1537:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("01")) {
                        b7 = 1;
                    }
                    break;
                case 1567:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals(TransType.TRANS_TYPE_BIND_REPAY_CARD)) {
                        b7 = 2;
                    }
                    break;
                case 1568:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals(TransType.TRANS_TYPE_CASH_LOAN)) {
                        b7 = 3;
                    }
                    break;
                case 1570:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals(TransType.TRANS_TYPE_AIRTIME_LOAN)) {
                        b7 = 4;
                    }
                    break;
                case 1572:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("15")) {
                        b7 = 5;
                    }
                    break;
                case 1574:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("17")) {
                        b7 = 6;
                    }
                    break;
                case 1567966:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3100")) {
                        b7 = 7;
                    }
                    break;
                case 1567967:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3101")) {
                        b7 = 8;
                    }
                    break;
                case 1567968:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3102")) {
                        b7 = 9;
                    }
                    break;
                case 1567969:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3103")) {
                        b7 = 10;
                    }
                    break;
                case 1567970:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3104")) {
                        b7 = Ascii.VT;
                    }
                    break;
                case 1567971:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3105")) {
                        b7 = Ascii.FF;
                    }
                    break;
                case 1567972:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3106")) {
                        b7 = Ascii.CR;
                    }
                    break;
                case 1567973:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3107")) {
                        b7 = Ascii.SO;
                    }
                    break;
                case 1567974:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3108")) {
                        b7 = Ascii.SI;
                    }
                    break;
                case 1567975:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3109")) {
                        b7 = Ascii.DLE;
                    }
                    break;
                case 1568927:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3200")) {
                        b7 = 17;
                    }
                    break;
                case 1568928:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3201")) {
                        b7 = Ascii.DC2;
                    }
                    break;
                case 1568929:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3202")) {
                        b7 = 19;
                    }
                    break;
                case 1568930:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3203")) {
                        b7 = Ascii.DC4;
                    }
                    break;
                case 1568931:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3204")) {
                        b7 = Ascii.NAK;
                    }
                    break;
                case 1568932:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3205")) {
                        b7 = Ascii.SYN;
                    }
                    break;
                case 1568933:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3206")) {
                        b7 = Ascii.ETB;
                    }
                    break;
                case 1568934:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3207")) {
                        b7 = Ascii.CAN;
                    }
                    break;
                case 1568935:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3208")) {
                        b7 = Ascii.EM;
                    }
                    break;
                case 1568936:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3209")) {
                        b7 = Ascii.SUB;
                    }
                    break;
                case 1575716:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3920")) {
                        b7 = Ascii.ESC;
                    }
                    break;
                case 1575717:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3921")) {
                        b7 = Ascii.FS;
                    }
                    break;
                case 1575718:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3922")) {
                        b7 = Ascii.GS;
                    }
                    break;
                case 1575719:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3923")) {
                        b7 = Ascii.RS;
                    }
                    break;
                case 1575747:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3930")) {
                        b7 = Ascii.US;
                    }
                    break;
                case 1575748:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3931")) {
                        b7 = 32;
                    }
                    break;
                case 1575749:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3932")) {
                        b7 = 33;
                    }
                    break;
                case 1575750:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    if (strFindAIvalue.equals("3933")) {
                        b7 = 34;
                    }
                    break;
                default:
                    expandedProductParsedResult = expandedProductParsedResult2;
                    break;
            }
            switch (b7) {
                case 0:
                    str2 = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 1:
                    str = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 2:
                    str3 = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 3:
                    str4 = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 4:
                    str5 = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 5:
                    str6 = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 6:
                    str7 = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    strSubstring = strFindAIvalue.substring(3);
                    str9 = ExpandedProductParsedResult.KILOGRAM;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                    strSubstring = strFindAIvalue.substring(3);
                    str9 = ExpandedProductParsedResult.POUND;
                    break;
                case 27:
                case 28:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    strSubstring3 = strFindAIvalue.substring(3);
                    strSubstring2 = strFindValue;
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    if (strFindValue.length() < 4) {
                        return expandedProductParsedResult;
                    }
                    strSubstring2 = strFindValue.substring(3);
                    strSubstring4 = strFindValue.substring(0, 3);
                    strSubstring3 = strFindAIvalue.substring(3);
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
                default:
                    map.put(strFindAIvalue, strFindValue);
                    continue;
                    expandedProductParsedResult2 = expandedProductParsedResult;
                    break;
            }
            str8 = strFindValue;
            expandedProductParsedResult2 = expandedProductParsedResult;
        }
        return new ExpandedProductParsedResult(massagedText, str, str2, str3, str4, str5, str6, str7, str8, str9, strSubstring, strSubstring2, strSubstring3, strSubstring4, map);
    }
}

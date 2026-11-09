package com.google.zxing.oned.rss.expanded.decoders;

import N8.q0;
import com.google.zxing.NotFoundException;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class FieldParser {
    private static final Map<String, DataLength> FOUR_DIGIT_DATA_LENGTH;
    private static final Map<String, DataLength> THREE_DIGIT_DATA_LENGTH;
    private static final Map<String, DataLength> THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
    private static final Map<String, DataLength> TWO_DIGIT_DATA_LENGTH;

    public static final class DataLength {
        final int length;
        final boolean variable;

        private DataLength(boolean z3, int i7) {
            this.variable = z3;
            this.length = i7;
        }

        public static DataLength fixed(int i7) {
            return new DataLength(false, i7);
        }

        public static DataLength variable(int i7) {
            return new DataLength(true, i7);
        }
    }

    static {
        HashMap map = new HashMap();
        TWO_DIGIT_DATA_LENGTH = map;
        map.put(TransType.TRANS_SCENE_REFUND, DataLength.fixed(18));
        map.put("01", DataLength.fixed(14));
        map.put("02", DataLength.fixed(14));
        map.put(TransType.TRANS_TYPE_BIND_REPAY_CARD, DataLength.variable(20));
        map.put(TransType.TRANS_TYPE_CASH_LOAN, DataLength.fixed(6));
        map.put(TransType.TRANS_TYPE_REPAY_CASH_LOAN, DataLength.fixed(6));
        map.put(TransType.TRANS_TYPE_AIRTIME_LOAN, DataLength.fixed(6));
        map.put("15", DataLength.fixed(6));
        map.put("16", DataLength.fixed(6));
        map.put("17", DataLength.fixed(6));
        map.put("20", DataLength.fixed(2));
        map.put(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN, DataLength.variable(20));
        map.put(TransType.TRANS_TYPE_P2P_CASH_IN, DataLength.variable(29));
        map.put("30", DataLength.variable(8));
        map.put(TransType.TRANS_TYPE_EX_GRATIA_REFUND, DataLength.variable(8));
        for (int i7 = 90; i7 <= 99; i7++) {
            TWO_DIGIT_DATA_LENGTH.put(String.valueOf(i7), DataLength.variable(30));
        }
        HashMap map2 = new HashMap();
        THREE_DIGIT_DATA_LENGTH = map2;
        map2.put("235", DataLength.variable(28));
        map2.put("240", DataLength.variable(30));
        map2.put("241", DataLength.variable(30));
        map2.put("242", DataLength.variable(6));
        map2.put("243", DataLength.variable(20));
        map2.put("250", DataLength.variable(30));
        map2.put("251", DataLength.variable(30));
        map2.put("253", DataLength.variable(30));
        map2.put("254", DataLength.variable(20));
        map2.put("255", DataLength.variable(25));
        map2.put("400", DataLength.variable(30));
        map2.put("401", DataLength.variable(30));
        map2.put("402", DataLength.fixed(17));
        map2.put("403", DataLength.variable(30));
        map2.put("410", DataLength.fixed(13));
        map2.put("411", DataLength.fixed(13));
        map2.put("412", DataLength.fixed(13));
        map2.put("413", DataLength.fixed(13));
        map2.put("414", DataLength.fixed(13));
        map2.put("415", DataLength.fixed(13));
        map2.put("416", DataLength.fixed(13));
        map2.put("417", DataLength.fixed(13));
        map2.put("420", DataLength.variable(20));
        map2.put("421", DataLength.variable(15));
        map2.put("422", DataLength.fixed(3));
        map2.put("423", DataLength.variable(15));
        map2.put("424", DataLength.fixed(3));
        map2.put("425", DataLength.variable(15));
        map2.put("426", DataLength.fixed(3));
        map2.put("427", DataLength.variable(3));
        map2.put("710", DataLength.variable(20));
        map2.put("711", DataLength.variable(20));
        map2.put("712", DataLength.variable(20));
        map2.put("713", DataLength.variable(20));
        map2.put("714", DataLength.variable(20));
        map2.put("715", DataLength.variable(20));
        THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH = new HashMap();
        for (int i10 = MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS; i10 <= 316; i10++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(String.valueOf(i10), DataLength.fixed(6));
        }
        for (int i11 = 320; i11 <= 337; i11++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(String.valueOf(i11), DataLength.fixed(6));
        }
        for (int i12 = MessageEvent.EVENT_UPLOAD_CONTACTS_SUCCESS; i12 <= 357; i12++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(String.valueOf(i12), DataLength.fixed(6));
        }
        for (int i13 = MessageEvent.EVENT_CL_REPAYMENT_FAILED; i13 <= 369; i13++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(String.valueOf(i13), DataLength.fixed(6));
        }
        Map<String, DataLength> map3 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
        map3.put("390", DataLength.variable(15));
        map3.put("391", DataLength.variable(18));
        map3.put("392", DataLength.variable(15));
        map3.put("393", DataLength.variable(18));
        map3.put("394", DataLength.fixed(4));
        map3.put("395", DataLength.fixed(6));
        map3.put("703", DataLength.variable(30));
        map3.put("723", DataLength.variable(30));
        HashMap map4 = new HashMap();
        FOUR_DIGIT_DATA_LENGTH = map4;
        map4.put("4300", DataLength.variable(35));
        map4.put("4301", DataLength.variable(35));
        map4.put("4302", DataLength.variable(70));
        map4.put("4303", DataLength.variable(70));
        map4.put("4304", DataLength.variable(70));
        map4.put("4305", DataLength.variable(70));
        map4.put("4306", DataLength.variable(70));
        map4.put("4307", DataLength.fixed(2));
        map4.put("4308", DataLength.variable(30));
        map4.put("4309", DataLength.fixed(20));
        map4.put("4310", DataLength.variable(35));
        map4.put("4311", DataLength.variable(35));
        map4.put("4312", DataLength.variable(70));
        map4.put("4313", DataLength.variable(70));
        map4.put("4314", DataLength.variable(70));
        map4.put("4315", DataLength.variable(70));
        map4.put("4316", DataLength.variable(70));
        map4.put("4317", DataLength.fixed(2));
        map4.put("4318", DataLength.variable(20));
        map4.put("4319", DataLength.variable(30));
        map4.put("4320", DataLength.variable(35));
        map4.put("4321", DataLength.fixed(1));
        map4.put("4322", DataLength.fixed(1));
        map4.put("4323", DataLength.fixed(1));
        map4.put("4324", DataLength.fixed(10));
        map4.put("4325", DataLength.fixed(10));
        map4.put("4326", DataLength.fixed(6));
        map4.put(PushMessage.MESSAGE_TYPE_TRANSFER_MONEY, DataLength.fixed(13));
        map4.put("7002", DataLength.variable(30));
        map4.put("7003", DataLength.fixed(10));
        map4.put("7004", DataLength.variable(4));
        map4.put("7005", DataLength.variable(12));
        map4.put("7006", DataLength.fixed(6));
        map4.put("7007", DataLength.variable(12));
        map4.put("7008", DataLength.variable(3));
        map4.put("7009", DataLength.variable(10));
        map4.put("7010", DataLength.variable(2));
        map4.put("7011", DataLength.variable(10));
        map4.put("7020", DataLength.variable(20));
        map4.put("7021", DataLength.variable(20));
        map4.put("7022", DataLength.variable(20));
        map4.put("7023", DataLength.variable(30));
        map4.put("7040", DataLength.fixed(4));
        map4.put("7240", DataLength.variable(20));
        map4.put("8001", DataLength.fixed(14));
        map4.put("8002", DataLength.variable(20));
        map4.put("8003", DataLength.variable(30));
        map4.put("8004", DataLength.variable(30));
        map4.put("8005", DataLength.fixed(6));
        map4.put("8006", DataLength.fixed(18));
        map4.put("8007", DataLength.variable(34));
        map4.put("8008", DataLength.variable(12));
        map4.put("8009", DataLength.variable(50));
        map4.put("8010", DataLength.variable(30));
        map4.put("8011", DataLength.variable(12));
        map4.put("8012", DataLength.variable(20));
        map4.put("8013", DataLength.variable(25));
        map4.put("8017", DataLength.fixed(18));
        map4.put("8018", DataLength.fixed(18));
        map4.put("8019", DataLength.variable(10));
        map4.put("8020", DataLength.variable(25));
        map4.put("8026", DataLength.fixed(18));
        map4.put("8100", DataLength.fixed(6));
        map4.put("8101", DataLength.fixed(10));
        map4.put("8102", DataLength.fixed(2));
        map4.put("8110", DataLength.variable(70));
        map4.put("8111", DataLength.fixed(4));
        map4.put("8112", DataLength.variable(70));
        map4.put("8200", DataLength.variable(70));
    }

    private FieldParser() {
    }

    public static String parseFieldsInGeneralPurpose(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        DataLength dataLength = TWO_DIGIT_DATA_LENGTH.get(str.substring(0, 2));
        if (dataLength != null) {
            return dataLength.variable ? processVariableAI(2, dataLength.length, str) : processFixedAI(2, dataLength.length, str);
        }
        if (str.length() < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, 3);
        DataLength dataLength2 = THREE_DIGIT_DATA_LENGTH.get(strSubstring);
        if (dataLength2 != null) {
            return dataLength2.variable ? processVariableAI(3, dataLength2.length, str) : processFixedAI(3, dataLength2.length, str);
        }
        if (str.length() < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        DataLength dataLength3 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.get(strSubstring);
        if (dataLength3 != null) {
            return dataLength3.variable ? processVariableAI(4, dataLength3.length, str) : processFixedAI(4, dataLength3.length, str);
        }
        DataLength dataLength4 = FOUR_DIGIT_DATA_LENGTH.get(str.substring(0, 4));
        if (dataLength4 != null) {
            return dataLength4.variable ? processVariableAI(4, dataLength4.length, str) : processFixedAI(4, dataLength4.length, str);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static String processFixedAI(int i7, int i10, String str) throws NotFoundException {
        if (str.length() < i7) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, i7);
        int i11 = i10 + i7;
        if (str.length() < i11) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring2 = str.substring(i7, i11);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String fieldsInGeneralPurpose = parseFieldsInGeneralPurpose(str.substring(i11));
        return fieldsInGeneralPurpose == null ? str2 : q0.j(str2, fieldsInGeneralPurpose);
    }

    private static String processVariableAI(int i7, int i10, String str) throws NotFoundException {
        String strSubstring = str.substring(0, i7);
        int iMin = Math.min(str.length(), i10 + i7);
        String strSubstring2 = str.substring(i7, iMin);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String fieldsInGeneralPurpose = parseFieldsInGeneralPurpose(str.substring(iMin));
        return fieldsInGeneralPurpose == null ? str2 : q0.j(str2, fieldsInGeneralPurpose);
    }
}

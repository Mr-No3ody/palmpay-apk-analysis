package com.transsnet.palmpay.core.bean;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class BalanceAndLimitResp extends CommonResult {
    public BalanceAndLimitData data;

    public static class BalanceAndLimitData {
        public String amountLimitContentJumpUrl;
        public String amountLimitContentPrefix;
        public String amountLimitContentSuffix;
        public ArrayList<Long> amountList;
        public long balanceAmount;
        public long cashBox;
        public boolean firstTransfer;
        public long maxAmount;
        public long minAmount;
        public Long reminderAmount;
        public Long stampDutyMinAmount;
        public String stampDutyMinAmountBankTip;
        public String stampDutyMinAmountPpTip;
        public String stampDutyMinAmountRequestTip;
        public boolean stampDutySwitch;
        public TransferSafe transferSafe;
    }

    public static class TransferSafe {
        public String content;
        public String jumpUrl;
    }
}

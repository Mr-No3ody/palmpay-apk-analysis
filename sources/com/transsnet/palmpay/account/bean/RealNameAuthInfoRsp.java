package com.transsnet.palmpay.account.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RealNameAuthInfoRsp {
    public String bankAccount;
    public String bankCard;
    public String bvn;
    public NinInfo bvnInfo;
    public boolean canShowDefault;
    public boolean canSkipIdImg;
    public String firstName;
    public String idImg;
    public String idNum;
    public String jumpPath;
    public String lastName;
    public TierLimit limitT1;
    public TierLimit limitT2;
    public TierLimit limitT3;
    public String limitUpCopywriter;
    public String mobileMoneyAccountTier;
    public boolean needIdImg;
    public NinInfo ninInfo;
    public long transactionLimit;

    public static class NinInfo {
        public String s3Url;
    }

    public static class TierLimit {
        public Long balanceLimit;
        public String name;
        public List<String> requirement;
        public Long transactionLimit;
    }

    public TierLimit getCurrentTierLimit() {
        if ("1".equals(this.mobileMoneyAccountTier)) {
            return this.limitT1;
        }
        if ("2".equals(this.mobileMoneyAccountTier)) {
            return this.limitT2;
        }
        if ("3".equals(this.mobileMoneyAccountTier)) {
            return this.limitT3;
        }
        return null;
    }
}

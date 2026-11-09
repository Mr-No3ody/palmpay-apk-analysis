package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonErrorResult;

/* JADX INFO: loaded from: classes4.dex */
public class QueryHomeAccountInfoRsp {
    public AccountInfoBean accountInfo;
    public AssetBannerBean assetBannerDTO;
    public String fallbackText;
    public boolean securityCenterRedDot;
    public long totalAvailableBalance;
    public CommonErrorResult validationCheckResp;

    public static class AccountInfoBean {
        public BriefnessAccountAmountBean briefnessAccountAmount;

        public static class BriefnessAccountAmountBean {
            public String accountId;
            public long availableBalance;
        }
    }
}

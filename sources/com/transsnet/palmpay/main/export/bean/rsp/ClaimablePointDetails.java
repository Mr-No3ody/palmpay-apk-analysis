package com.transsnet.palmpay.main.export.bean.rsp;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ClaimablePointDetails {
    public List<ClaimablePointItem> claimablePointInfoList;
    public long totalPoint;

    public static class ClaimablePointItem {
        public String bizId;
        public String bizType;
    }
}

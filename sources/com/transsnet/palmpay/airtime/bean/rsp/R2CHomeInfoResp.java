package com.transsnet.palmpay.airtime.bean.rsp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R2CHomeInfoResp {
    public List<Recharge2CashProviderV2Rsp> billerList;
    public String darkInstruction;
    public String instruction;
    public PhoneInfo phoneInfo;

    public static class PhoneInfo {
        public String network;
        public String phoneNo;
    }
}

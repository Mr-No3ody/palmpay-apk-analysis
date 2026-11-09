package com.transsnet.palmpay.account.bean;

import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public class SendSmsNewV2Rsp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public int countdownSeconds;
        public long nextSendTime;
        public boolean realSend;
    }
}

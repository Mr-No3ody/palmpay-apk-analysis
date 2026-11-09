package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PalmPayContact;

/* JADX INFO: loaded from: classes3.dex */
public class MemberQRCodeScanResp extends CommonResult {
    private PalmPayContact data;

    public PalmPayContact getData() {
        return this.data;
    }

    public void setData(PalmPayContact data) {
        this.data = data;
    }
}

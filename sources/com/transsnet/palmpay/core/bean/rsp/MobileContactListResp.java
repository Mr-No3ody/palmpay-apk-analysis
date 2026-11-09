package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MobileContactListResp extends CommonResult {
    private List<PalmPayContact> data;

    public List<PalmPayContact> getData() {
        return this.data;
    }

    public void setData(List<PalmPayContact> data) {
        this.data = data;
    }
}

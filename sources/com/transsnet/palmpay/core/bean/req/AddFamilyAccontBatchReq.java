package com.transsnet.palmpay.core.bean.req;

import com.transsnet.palmpay.core.bean.RemindListBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AddFamilyAccontBatchReq {
    public String billerId;
    public String billerName;
    public String categoryId;
    public String customerId;
    public String institutionLogo;
    public String itemId;
    public Integer memberId;
    public String phone;
    public String tag;
    public int source = -1;
    public List<RemindListBean> remindList = new ArrayList();

    public AddFamilyAccontBatchReq() {
    }

    public AddFamilyAccontBatchReq(String phone, String tag, String categoryId) {
        this.phone = phone;
        this.tag = tag;
        this.categoryId = categoryId;
    }
}

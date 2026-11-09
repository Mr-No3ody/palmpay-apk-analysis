package com.transsnet.palmpay.account.bean;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RegularRuleRsp extends CommonResult {
    public List<DataBean> data;

    public static class DataBean {
        public String msg;
        public boolean pass;
        public String rule;
    }
}

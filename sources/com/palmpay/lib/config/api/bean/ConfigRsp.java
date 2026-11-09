package com.palmpay.lib.config.api.bean;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigRsp {
    private DataBean data;
    private String respCode;
    private String respMsg;

    public class DataBean {
        private HashMap<String, String> paramMap;

        public DataBean() {
        }
    }

    public ConfigRsp() {
        DataBean dataBean = new DataBean();
        this.data = dataBean;
        dataBean.paramMap = new HashMap();
    }

    public HashMap<String, String> getData() {
        DataBean dataBean = this.data;
        if (dataBean == null) {
            return null;
        }
        return dataBean.paramMap;
    }

    public boolean isSuccess() {
        return "00000000".equals(this.respCode);
    }
}

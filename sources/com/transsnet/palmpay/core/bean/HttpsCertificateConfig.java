package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HttpsCertificateConfig {
    public List<DataBean> certificates;

    public static class DataBean {
        public String certificate;
        public long end;
        public String note;
        public String os;
        public long start;
    }
}

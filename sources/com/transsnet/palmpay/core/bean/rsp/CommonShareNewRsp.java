package com.transsnet.palmpay.core.bean.rsp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CommonShareNewRsp {
    public Long expireDate;
    public List<ShareItem> shareList;
    public String titleImg;
    public String url;

    public static class ShareItem {
        public String itemIcon;
        public String itemName;
        public String itemUrl;
    }
}

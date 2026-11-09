package com.transsnet.palmpay.core.bean.req;

/* JADX INFO: loaded from: classes3.dex */
public class CommonShareReq {
    public static int TYPE_RETURN_WEB_PAGE_PATH_AND_SHARE_TEXT = 1;
    public static int TYPE_SEND_NOTIFICATION;
    public int businessType;
    public String extraParam;
    public String memberId;
    private String pagePath;
    public int type;

    public CommonShareReq(int businessType, String memberId, int type) {
        this.businessType = businessType;
        this.memberId = memberId;
        this.type = type;
    }

    public CommonShareReq(int businessType, String memberId, int type, String extraParam) {
        this.businessType = businessType;
        this.memberId = memberId;
        this.type = type;
        this.extraParam = extraParam;
    }

    public CommonShareReq(int businessType) {
        this.businessType = businessType;
        this.memberId = "";
        this.type = TYPE_RETURN_WEB_PAGE_PATH_AND_SHARE_TEXT;
    }

    public CommonShareReq(int businessType, String extraParam) {
        this.businessType = businessType;
        this.memberId = "";
        this.type = TYPE_RETURN_WEB_PAGE_PATH_AND_SHARE_TEXT;
        this.extraParam = extraParam;
        this.pagePath = extraParam;
    }
}

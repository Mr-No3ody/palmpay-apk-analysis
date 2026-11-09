package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ParseInstalmentsQrcodeRsp extends CommonResult implements Serializable {
    public DataBean data;

    public static class DataBean implements Serializable {
        public String accountMark;
        public int accountType;
        public BindNeedInfoDtoBean bindNeedInfoDto;
        public int businessType;
        public String cashBackPictureUrl;
        public String copywriting;
        public String darkAccountMark;
        public boolean isMine;
        public String jumpUrl;
        public int labelType;
        public String memberId;
        public String merchantName;
        public String merchantNo;
        public String merchantUrl;
        public String phone;
        public String pictureUrl;
        public String qrContent;
        public String shopName;
        public String snNo;
        public int soNoType;
        public int status;
        public String transType;
        public int type;
        public String url;

        public static class BindNeedInfoDtoBean implements Serializable {
            public int authenType;
            public boolean hasBindOther;
            public String headPortrait;
            public String phone;
        }
    }
}

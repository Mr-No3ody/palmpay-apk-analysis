package com.transsnet.palmpay.account.bean.rsp;

import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UploadAppsFlyerRsp {
    public String benefit;
    public String campaignContent;
    public List<SignUpRetainDialogConfig> popupContents;
    public String scene;

    public static SignUpRetainDialogConfig getConfigByPosition(String str, List<SignUpRetainDialogConfig> list) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            for (SignUpRetainDialogConfig signUpRetainDialogConfig : list) {
                if (signUpRetainDialogConfig.positionCode.equals(str)) {
                    return signUpRetainDialogConfig;
                }
            }
        }
        return null;
    }
}

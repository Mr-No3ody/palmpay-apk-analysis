package com.transsnet.palmpay.account.bean.rsp;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CheckIdentifyRsp {
    public String areaCode;
    public String areaName;
    public Boolean canSkipAddress;
    public Boolean canSkipIndustry;
    public String lgaCode;
    public String lgaName;
    public Boolean needAddress;
    public Boolean needIndustry;
    public String stateCode;
    public String stateName;
    public String street;
    public TeenagerPopInfo teenagerPop;
    public String verifyToken;

    public static Bundle copyAddressFromBundle(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            bundle2.putString("stateCode", bundle.getString("stateCode"));
            bundle2.putString("stateName", bundle.getString("stateName"));
            bundle2.putString("areaCode", bundle.getString("areaCode"));
            bundle2.putString("areaName", bundle.getString("areaName"));
            bundle2.putString("lgaCode", bundle.getString("lgaCode"));
            bundle2.putString("lgaName", bundle.getString("lgaName"));
            bundle2.putString("street", bundle.getString("street"));
        }
        return bundle2;
    }

    public Bundle saveAddressToBundle(Bundle bundle) {
        if (!TextUtils.isEmpty(this.stateCode) && !TextUtils.isEmpty(this.stateName)) {
            bundle.putString("stateCode", this.stateCode);
            bundle.putString("stateName", this.stateName);
        }
        if (!TextUtils.isEmpty(this.areaCode) && !TextUtils.isEmpty(this.areaName)) {
            bundle.putString("areaCode", this.areaCode);
            bundle.putString("areaName", this.areaName);
        }
        if (!TextUtils.isEmpty(this.lgaCode) && !TextUtils.isEmpty(this.lgaName)) {
            bundle.putString("lgaCode", this.lgaCode);
            bundle.putString("lgaName", this.lgaName);
        }
        if (!TextUtils.isEmpty(this.street)) {
            bundle.putString("street", this.street);
        }
        return bundle;
    }
}

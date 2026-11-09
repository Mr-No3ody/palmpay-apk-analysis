package com.palmpay.lib.config.api.bean;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.util.List;
import p183m6.k;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigReq {
    public String appId;
    public List<String> codes;
    public Extra nebulaClientParam;
    public String sign;

    public class Extra {
        public String memberId;
        public String pp_channel;
        public String pp_client_ver;
        public String pp_device_id;
        public String pp_device_type;

        public Extra() {
        }
    }

    public ConfigReq(Context context, String str) {
        this.appId = str;
        Extra extra = new Extra();
        this.nebulaClientParam = extra;
        extra.pp_device_id = Settings.Secure.getString(context.getContentResolver(), "android_id");
        this.nebulaClientParam.pp_device_type = "ANDROID" + Build.VERSION.RELEASE;
        this.nebulaClientParam.pp_client_ver = k.b(context);
    }

    public void setChannel(String str) {
        Extra extra = this.nebulaClientParam;
        if (extra != null) {
            extra.pp_channel = str;
        }
    }
}

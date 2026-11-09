package com.transsnet.palmpay.core.bean;

import android.text.TextUtils;
import android.webkit.WebSettings;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.Locale;
import p367ya.a;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceInformation {
    public String userAgentBrowserValue;
    public boolean httpBrowserJavaEnabled = false;
    public boolean httpBrowserJavaScriptEnabled = true;
    public String httpBrowserLanguage = Locale.getDefault().getLanguage();
    public int httpBrowserScreenHeight = ScreenUtils.getScreenHeight();
    public int httpBrowserScreenWidth = ScreenUtils.getScreenWidth();
    public String httpBrowserTimeDifference = "";
    public int httpBrowserColorDepth = 1;
    public String deviceChannel = "browser";

    public DeviceInformation() {
        String string = a.d().f44149a.getString("key_user_agent", "");
        this.userAgentBrowserValue = string;
        try {
            if (TextUtils.isEmpty(string)) {
                this.userAgentBrowserValue = WebSettings.getDefaultUserAgent(BaseApplication.get());
                a aVarD = a.d();
                aVarD.f44149a.i("key_user_agent", this.userAgentBrowserValue);
            }
        } catch (Exception unused) {
        }
    }
}

package com.transsnet.palmpay.ui.activity.test;

import Ac.e;
import Ac.f;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import androidx.camera.video.u;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SDCardUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/test/PhoneInformationActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhoneInformationActivity extends BaseActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_phone_information;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(-1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String str;
        User user;
        TextView textView = (TextView) findViewById(e.tvDebugInfo);
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("App version: ");
            sb2.append(BaseApplication.get().getVersionName() + "/" + BaseApplication.get().getVersionCode());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (Exception unused) {
        }
        try {
            sb2.append("Phone info: ");
            sb2.append(DeviceUtils.getManufacturer() + "/" + DeviceUtils.getModel());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (Exception unused2) {
        }
        try {
            sb2.append("Device ID: ");
            sb2.append(PhoneUtils.getUniqueId());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (Exception unused3) {
        }
        sb2.append("WebView: ");
        try {
            PackageManager packageManager = getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.webview", 0);
                str = packageInfo.versionName + "/" + packageInfo.versionCode;
            } else {
                str = "";
            }
        } catch (Exception unused4) {
        }
        sb2.append(str);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        try {
            sb2.append("Storage: ");
            sb2.append(SDCardUtils.getSDFreeSize() + "/" + SDCardUtils.getSDTotalSize());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (Exception unused5) {
        }
        if (BaseApplication.hasLogin() && (user = BaseApplication.get().getUser()) != null) {
            sb2.append("User: ");
            sb2.append(u.n(user.getPhoneNumber(), "/", user.getMemberId(), "/", user.getUserLevel()));
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        try {
            sb2.append("Device Fingerprint: ");
            sb2.append(Build.FINGERPRINT);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (Exception unused6) {
        }
        textView.setText(sb2.toString());
    }
}

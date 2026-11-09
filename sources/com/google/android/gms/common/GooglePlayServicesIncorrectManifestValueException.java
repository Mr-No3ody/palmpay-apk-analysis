package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i7) {
        int i10 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 104 + String.valueOf(i7).length() + 194);
        sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb2.append(i10);
        sb2.append(" but found ");
        sb2.append(i7);
        sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i7, sb2.toString());
    }
}

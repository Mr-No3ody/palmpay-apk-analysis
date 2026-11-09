package com.transsnet.palmpay.util;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class IntentUtil {
    private static final String TAG = "IntentUtil";

    public static void gotoSystemContactsPage(Activity activity, int i7) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.PICK");
            intent.setData(ContactsContract.Contacts.CONTENT_URI);
            activity.startActivityForResult(intent, i7);
        } catch (Exception e10) {
            Log.e(TAG, "gotoSystemContactsPage: ", e10);
        }
    }
}

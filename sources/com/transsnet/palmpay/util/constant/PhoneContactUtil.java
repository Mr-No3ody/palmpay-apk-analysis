package com.transsnet.palmpay.util.constant;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.util.Utils;

/* JADX INFO: loaded from: classes4.dex */
public class PhoneContactUtil {
    private static final String TAG = "PhoneContactUtil";

    public static String[] getPhoneContacts(Uri uri) {
        String[] strArr = new String[2];
        if (uri != null) {
            ContentResolver contentResolver = Utils.getApp().getContentResolver();
            Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
            if (cursorQuery == null) {
                Log.e(TAG, "get Contacts is fail");
                return strArr;
            }
            cursorQuery.moveToFirst();
            try {
                strArr[0] = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                Cursor cursorQuery2 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=" + string, null, null);
                if (cursorQuery2 != null) {
                    cursorQuery2.moveToFirst();
                    strArr[1] = cursorQuery2.getString(cursorQuery2.getColumnIndex("data1"));
                }
                cursorQuery2.close();
            } catch (Exception e10) {
                e10.printStackTrace();
                ToastUtils.showShort("fail to get contacts");
            }
            cursorQuery.close();
        }
        return strArr;
    }
}

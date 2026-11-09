package com.transsnet.palmpay.util;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UnclassifiedUtil {
    private static final String TAG = "UnclassifiedUtil";
    private static final SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);

    public static void mergeJSONObject(Map<String, Object> map, JSONObject jSONObject) throws JSONException {
        try {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof Date) {
                    SimpleDateFormat simpleDateFormat = mDateFormat;
                    synchronized (simpleDateFormat) {
                        try {
                            jSONObject.put(str, simpleDateFormat.format((Date) obj));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    jSONObject.put(str, obj);
                }
            }
        } catch (Exception e10) {
            Log.e(TAG, "mergeJSONObject: ", e10);
        }
    }
}

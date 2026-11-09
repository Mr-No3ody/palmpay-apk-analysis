package cn.tongdun.android.shell.q999ggg99999qqggqqg9qg;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 108);
            byte b10 = (byte) (bArr[0] ^ 32);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String q999ggg99999qqggqqg9qg(JSONObject jSONObject, int i7) {
        int length = (jSONObject.toString().length() << 2) / 3;
        if (length >= i7) {
            String strOptString = jSONObject.optString(q999ggg99999qqggqqg9qg("4d212b", 83));
            if (TextUtils.isEmpty(strOptString)) {
                return jSONObject.toString();
            }
            try {
                JSONArray jSONArray = new JSONArray(strOptString);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        jSONObjectOptJSONObject.remove(q999ggg99999qqggqqg9qg("52190a1c120f", 98));
                    }
                }
                try {
                    jSONObject.put(q999ggg99999qqggqqg9qg("4d0802", 122), jSONArray);
                } catch (JSONException unused) {
                }
                if (length > i7) {
                    jSONObject.remove(q999ggg99999qqggqqg9qg("4d616b", 19));
                }
            } catch (JSONException unused2) {
                return jSONObject.toString();
            }
        }
        return jSONObject.toString();
    }
}

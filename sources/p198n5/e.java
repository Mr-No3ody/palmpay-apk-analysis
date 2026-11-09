package p198n5;

import C0.G;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class e extends a {
    @Override // p198n5.a
    public void b(int i7, String str, String str2, Throwable th) {
        int iMin;
        if (i7 > 7) {
            return;
        }
        String strO = G.o("TRACK.", str);
        if (str2.length() < 4000) {
            if (i7 == 7) {
                Log.wtf(strO, str2);
                return;
            } else {
                Log.println(i7, strO, str2);
                return;
            }
        }
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str2.indexOf(10, i10);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i10 + 4000);
                String strSubstring = str2.substring(i10, iMin);
                if (i7 == 7) {
                    Log.wtf(strO, strSubstring);
                } else {
                    Log.println(i7, strO, strSubstring);
                }
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i10 = iMin;
                }
            }
            i10 = iMin + 1;
        }
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final String getType() {
        return "Logcat";
    }
}

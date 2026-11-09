package com.facebook.soloader;

import N8.q0;
import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w {
    public static v a(String str, Context context, x[] xVarArr) {
        StringBuilder sbQ = q0.q("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i7 = 0; i7 < xVarArr.length; i7++) {
            sbQ.append("\n\t\tSoSource ");
            sbQ.append(i7);
            sbQ.append(": ");
            sbQ.append(xVarArr[i7].toString());
        }
        if (context != null) {
            sbQ.append("\n\tNative lib dir: ");
            sbQ.append(context.getApplicationInfo().nativeLibraryDir);
            sbQ.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return new v(str, sbQ.toString());
    }
}

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @Nullable
    @KeepForSdk
    public static String getXmlAttributeString(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z3, boolean z8, @NonNull String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z3) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(strSubstring).length());
                sb2.append(packageName);
                sb2.append(":string/");
                sb2.append(strSubstring);
                resources.getValue(sb2.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                new StringBuilder(d.c(30, str2) + attributeValue.length());
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                new StringBuilder(d.c(28, str2) + typedValue.toString().length());
            }
        }
        if (z8 && attributeValue == null) {
            new StringBuilder(String.valueOf(str2).length() + 33);
        }
        return attributeValue;
    }
}

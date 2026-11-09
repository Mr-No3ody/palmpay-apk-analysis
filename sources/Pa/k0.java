package Pa;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7098a = Pattern.compile("https://\\S+");

    public static SpannableStringBuilder a() {
        Context context = BaseApplication.getContext();
        return new SpanUtils().append(context.getString(p025ba.k.core_oc_limit)).setForegroundColor(context.getColor(L6.b.ppColorTextPrimary)).create();
    }

    public static SpannableStringBuilder b(String str) {
        return new SpanUtils().append(str).append(" View>").setForegroundColor(Color.parseColor("#ff8312ff")).create();
    }

    public static CharSequence c(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                SpannableString spannableString = new SpannableString(str);
                int color = context.getColor(L6.b.ppColorLink);
                Matcher matcher = f7098a.matcher(str);
                while (matcher.find()) {
                    spannableString.setSpan(new ForegroundColorSpan(color), matcher.start(), matcher.end(), 33);
                }
                return spannableString;
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static void d(SpannableString spannableString, String str, int i7, int i10, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(spannableString.toString());
        if (matcher != null) {
            while (matcher.find()) {
                spannableString.setSpan(new ForegroundColorSpan(i7), matcher.start(), matcher.end(), 33);
                spannableString.setSpan(new AbsoluteSizeSpan(i10), matcher.start(), matcher.end(), 33);
                if (str2 != null && !str2.isEmpty()) {
                    spannableString.setSpan(new TypefaceSpan(str2), matcher.start(), matcher.end(), 33);
                }
            }
        }
    }
}

package com.facebook.hermes.unicode;

import com.facebook.proguard.annotations.DoNotStrip;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class AndroidUnicodeUtils {
    @DoNotStrip
    public static String convertToCase(String str, int i7, boolean z3) {
        Locale locale = z3 ? Locale.getDefault() : Locale.ENGLISH;
        if (i7 == 0) {
            return str.toUpperCase(locale);
        }
        if (i7 == 1) {
            return str.toLowerCase(locale);
        }
        throw new RuntimeException("Invalid target case");
    }

    @DoNotStrip
    public static String dateFormat(double d2, boolean z3, boolean z8) {
        DateFormat timeInstance;
        if (z3 && z8) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z3) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!z8) {
                throw new RuntimeException("Bad dateFormat configuration");
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d2)).toString();
    }

    @DoNotStrip
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @DoNotStrip
    public static String normalize(String str, int i7) {
        if (i7 == 0) {
            return Normalizer.normalize(str, Normalizer.Form.NFC);
        }
        if (i7 == 1) {
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        if (i7 == 2) {
            return Normalizer.normalize(str, Normalizer.Form.NFKC);
        }
        if (i7 == 3) {
            return Normalizer.normalize(str, Normalizer.Form.NFKD);
        }
        throw new RuntimeException("Invalid form");
    }
}

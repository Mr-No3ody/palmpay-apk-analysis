package U2;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G.h f9111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G.h f9112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G.h f9113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G.h f9114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G.h f9115e;

    static {
        G.h hVar = new G.h();
        hVar.put("ca", "calendar");
        hVar.put("nu", "numbers");
        hVar.put("hc", "hours");
        hVar.put("co", "collation");
        hVar.put("kn", "colnumeric");
        hVar.put("kf", "colcasefirst");
        f9111a = hVar;
        G.h hVar2 = new G.h();
        hVar2.put("calendar", "ca");
        hVar2.put("numbers", "nu");
        hVar2.put("hours", "hc");
        hVar2.put("collation", "co");
        hVar2.put("colnumeric", "kn");
        hVar2.put("colcasefirst", "kf");
        f9112b = hVar2;
        G.h hVar3 = new G.h();
        hVar3.put("dictionary", "dict");
        hVar3.put("phonebook", "phonebk");
        hVar3.put("traditional", "trad");
        hVar3.put("gb2312han", "gb2312");
        f9113c = hVar3;
        G.h hVar4 = new G.h();
        hVar4.put("gregorian", "gregory");
        f9114d = hVar4;
        G.h hVar5 = new G.h();
        hVar5.put("traditional", "traditio");
        f9115e = hVar5;
        G.h hVar6 = new G.h();
        hVar6.put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
        hVar6.put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
        hVar6.put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
    }

    public static boolean a(String str, String str2, C c6) throws B {
        c6.a();
        ULocale uLocale = c6.f9108a;
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals(FirebaseAnalytics.Event.SEARCH)) {
                return false;
            }
            availableNames = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String b(String str) {
        G.h hVar = f9113c;
        return !hVar.containsKey(str) ? str : (String) hVar.get(str);
    }

    public static Object c(Object obj, String str) {
        if (str.equals("ca") && (obj instanceof String)) {
            String str2 = (String) obj;
            G.h hVar = f9114d;
            return !hVar.containsKey(str2) ? str2 : (String) hVar.get(str2);
        }
        if (str.equals("nu") && (obj instanceof String)) {
            String str3 = (String) obj;
            G.h hVar2 = f9115e;
            return !hVar2.containsKey(str3) ? str3 : (String) hVar2.get(str3);
        }
        if (str.equals("co") && (obj instanceof String)) {
            return b((String) obj);
        }
        if (str.equals("kn") && (obj instanceof String) && obj.equals("yes")) {
            return "true";
        }
        return ((str.equals("kn") || str.equals("kf")) && (obj instanceof String) && obj.equals("no")) ? "false" : obj;
    }
}

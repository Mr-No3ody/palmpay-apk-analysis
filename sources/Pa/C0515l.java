package Pa;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CountryCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Pa.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0515l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7099b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f7100a = d();

    public static int e(String str) {
        String str2 = "core_country_" + str.toLowerCase();
        try {
            return p025ba.d.class.getField(str2).getInt(str2);
        } catch (IllegalAccessException e10) {
            F6.d.c("l", "getDrawableResourceId 2: ", e10);
            return p025ba.d.core_country_ng;
        } catch (NoSuchFieldException e11) {
            F6.d.c("l", "getDrawableResourceId 1: ", e11);
            return p025ba.d.core_country_ng;
        }
    }

    public final CountryCode.CountriesBean a(int i7) {
        List listD = d();
        if (listD != null && !listD.isEmpty()) {
            List listD2 = d();
            int i10 = 0;
            if (listD2 != null && !listD2.isEmpty()) {
                Iterator it = listD2.iterator();
                while (it.hasNext() && ((CountryCode.CountriesBean) it.next()).code != i7) {
                    i10++;
                }
            }
            try {
                return (CountryCode.CountriesBean) listD.get(i10);
            } catch (IndexOutOfBoundsException e10) {
                F6.d.c("l", "getCountryByCode: ", e10);
            }
        }
        return null;
    }

    public final CountryCode.CountriesBean b(String str) {
        List listD = d();
        if (listD != null && !listD.isEmpty()) {
            int iC = c(str);
            if (iC >= 0) {
                try {
                    if (iC >= listD.size()) {
                        iC = c("NG");
                    }
                } catch (IndexOutOfBoundsException e10) {
                    F6.d.c("l", "getCountryByLocale: ", e10);
                }
            } else {
                iC = c("NG");
            }
            return (CountryCode.CountriesBean) listD.get(iC);
        }
        return null;
    }

    public final int c(String str) {
        List listD = d();
        int i7 = 0;
        if (listD != null && !listD.isEmpty() && !TextUtils.isEmpty(str)) {
            Iterator it = listD.iterator();
            while (it.hasNext() && !str.equalsIgnoreCase(((CountryCode.CountriesBean) it.next()).locale)) {
                i7++;
            }
        }
        return i7;
    }

    public final List d() {
        List list = this.f7100a;
        if (list != null && !list.isEmpty()) {
            return this.f7100a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CountryCode.CountriesBean("Nigeria", "尼日利亚", "NG", "NGN", "₦", 234));
        arrayList.add(new CountryCode.CountriesBean("Ghana", "加纳", "GH", "GHS", "GHS", 233));
        this.f7100a = arrayList;
        return arrayList;
    }
}

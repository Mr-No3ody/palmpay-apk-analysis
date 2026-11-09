package Eb;

import Pa.n0;
import android.content.Context;
import android.content.ContextWrapper;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f2269a = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Integer f2270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f2271c;

    public static Map a() {
        return com.airbnb.lottie.model.layer.d.q(LoanHomeSource.TRACK_PARAM_KEY, a.f2267a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0164  */
    /* JADX WARN: Code duplicated, block: B:106:0x0184 A[LOOP:0: B:104:0x017e->B:106:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca A[LOOP:2: B:56:0x00c4->B:58:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0125  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x0139  */
    /* JADX WARN: Code duplicated, block: B:94:0x0144  */
    /* JADX WARN: Code duplicated, block: B:96:0x014a  */
    /* JADX WARN: Code duplicated, block: B:97:0x014f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void b(Context context, ProductContentInfo item) {
        String str;
        Integer num;
        String str2;
        Boolean bool;
        boolean zBooleanValue;
        ContextWrapper contextWrapper;
        String str3;
        ClickEvent clickEvent;
        Boolean bool2;
        LoanHomeActivity loanHomeActivity;
        boolean zBooleanValue2;
        ContextWrapper contextWrapper2;
        Integer num2;
        String str4;
        ClickEvent clickEvent2;
        Integer num3;
        String str5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Integer num4 = item.accountType;
        if ((num4 != null && num4.intValue() == 14) || (str = item.status) == null) {
            return;
        }
        LoanHomeActivity loanHomeActivity2 = null;
        switch (str.hashCode()) {
            case -458753563:
                if (!str.equals("canBorrow")) {
                }
                bool2 = p118hf.a.f37382e;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    Intrinsics.checkNotNullParameter(context, "context");
                    while (true) {
                        if (context != null) {
                            loanHomeActivity = null;
                        } else if (context instanceof LoanHomeActivity) {
                            loanHomeActivity = (LoanHomeActivity) context;
                        } else {
                            if (context instanceof ContextWrapper) {
                                contextWrapper2 = (ContextWrapper) context;
                            } else {
                                contextWrapper2 = null;
                            }
                            context = contextWrapper2 != null ? contextWrapper2.getBaseContext() : null;
                        }
                    }
                    zBooleanValue2 = loanHomeActivity == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                }
                if (zBooleanValue2) {
                    num3 = item.accountType;
                    str5 = item.loanProduct;
                    if (c(num3, str5)) {
                        f2270b = num3;
                        f2271c = str5;
                    } else {
                        f2270b = null;
                        f2271c = null;
                    }
                    break;
                } else {
                    num2 = item.accountType;
                    str4 = item.loanProduct;
                    if (!c(num2, str4)) {
                        if (c(num2, str4)) {
                            f2270b = num2;
                            f2271c = str4;
                        } else {
                            f2270b = null;
                            f2271c = null;
                        }
                        clickEvent2 = new ClickEvent("Old_Loan_Product_Borrow");
                        if (str4 != null) {
                            clickEvent2.add("loanProduct", str4);
                        }
                        if (num2 != null) {
                            clickEvent2.add("accountType", String.valueOf(num2.intValue()));
                        }
                        for (Map.Entry entry : a().entrySet()) {
                            clickEvent2.add((String) entry.getKey(), (String) entry.getValue());
                        }
                        n0.g().q(clickEvent2);
                        break;
                    }
                }
                break;
            case 568196142:
                if (!str.equals("declined")) {
                }
                num = item.accountType;
                str2 = item.loanProduct;
                Intrinsics.checkNotNullParameter(context, "context");
                if (c(num, str2)) {
                    bool = p118hf.a.f37382e;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        Intrinsics.checkNotNullParameter(context, "context");
                        while (context != null) {
                            if (context instanceof LoanHomeActivity) {
                                loanHomeActivity2 = (LoanHomeActivity) context;
                                zBooleanValue = loanHomeActivity2 == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                            } else {
                                if (context instanceof ContextWrapper) {
                                    contextWrapper = (ContextWrapper) context;
                                } else {
                                    contextWrapper = null;
                                }
                                context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                            }
                        }
                        zBooleanValue = loanHomeActivity2 == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                    }
                    if (zBooleanValue) {
                        str3 = "Loan_Product_Click_Apply";
                    } else {
                        str3 = "Old_Loan_Product_Click_Apply";
                    }
                    clickEvent = new ClickEvent(str3);
                    if (str2 != null) {
                        clickEvent.add("loanProduct", str2);
                    }
                    if (num != null) {
                        clickEvent.add("accountType", String.valueOf(num.intValue()));
                    }
                    for (Map.Entry entry2 : a().entrySet()) {
                        clickEvent.add((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    n0.g().q(clickEvent);
                    break;
                }
                break;
            case 1048639608:
                if (!str.equals("needApply")) {
                }
                num = item.accountType;
                str2 = item.loanProduct;
                Intrinsics.checkNotNullParameter(context, "context");
                if (c(num, str2)) {
                    bool = p118hf.a.f37382e;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        Intrinsics.checkNotNullParameter(context, "context");
                        while (context != null) {
                            if (context instanceof LoanHomeActivity) {
                                loanHomeActivity2 = (LoanHomeActivity) context;
                                zBooleanValue = loanHomeActivity2 == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                            } else {
                                if (context instanceof ContextWrapper) {
                                    contextWrapper = (ContextWrapper) context;
                                } else {
                                    contextWrapper = null;
                                }
                                if (contextWrapper != null) {
                                }
                            }
                        }
                        zBooleanValue = loanHomeActivity2 == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                    }
                    if (zBooleanValue) {
                        str3 = "Loan_Product_Click_Apply";
                    } else {
                        str3 = "Old_Loan_Product_Click_Apply";
                    }
                    clickEvent = new ClickEvent(str3);
                    if (str2 != null) {
                        clickEvent.add("loanProduct", str2);
                    }
                    if (num != null) {
                        clickEvent.add("accountType", String.valueOf(num.intValue()));
                    }
                    while (r7.hasNext()) {
                        clickEvent.add((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    n0.g().q(clickEvent);
                    break;
                }
                break;
            case 1671308008:
                if (!str.equals("disable")) {
                }
                num = item.accountType;
                str2 = item.loanProduct;
                Intrinsics.checkNotNullParameter(context, "context");
                if (c(num, str2)) {
                    bool = p118hf.a.f37382e;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        Intrinsics.checkNotNullParameter(context, "context");
                        while (context != null) {
                            if (context instanceof LoanHomeActivity) {
                                loanHomeActivity2 = (LoanHomeActivity) context;
                                zBooleanValue = loanHomeActivity2 == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                            } else {
                                if (context instanceof ContextWrapper) {
                                    contextWrapper = (ContextWrapper) context;
                                } else {
                                    contextWrapper = null;
                                }
                                if (contextWrapper != null) {
                                }
                            }
                        }
                        zBooleanValue = loanHomeActivity2 == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                    }
                    if (zBooleanValue) {
                        str3 = "Loan_Product_Click_Apply";
                    } else {
                        str3 = "Old_Loan_Product_Click_Apply";
                    }
                    clickEvent = new ClickEvent(str3);
                    if (str2 != null) {
                        clickEvent.add("loanProduct", str2);
                    }
                    if (num != null) {
                        clickEvent.add("accountType", String.valueOf(num.intValue()));
                    }
                    while (r7.hasNext()) {
                        clickEvent.add((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    n0.g().q(clickEvent);
                    break;
                }
                break;
            case 2097810772:
                if (!str.equals("borrowed")) {
                }
                bool2 = p118hf.a.f37382e;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    Intrinsics.checkNotNullParameter(context, "context");
                    while (true) {
                        if (context != null) {
                            loanHomeActivity = null;
                        } else if (context instanceof LoanHomeActivity) {
                            loanHomeActivity = (LoanHomeActivity) context;
                        } else {
                            if (context instanceof ContextWrapper) {
                                contextWrapper2 = (ContextWrapper) context;
                            } else {
                                contextWrapper2 = null;
                            }
                            if (contextWrapper2 != null) {
                            }
                        }
                    }
                    zBooleanValue2 = loanHomeActivity == null ? ActivityUtils.getTopActivity() instanceof LoanHomeActivity : true;
                }
                if (zBooleanValue2) {
                    num3 = item.accountType;
                    str5 = item.loanProduct;
                    if (c(num3, str5)) {
                        f2270b = null;
                        f2271c = null;
                    } else {
                        f2270b = num3;
                        f2271c = str5;
                    }
                    break;
                } else {
                    num2 = item.accountType;
                    str4 = item.loanProduct;
                    if (!c(num2, str4)) {
                        if (c(num2, str4)) {
                            f2270b = null;
                            f2271c = null;
                        } else {
                            f2270b = num2;
                            f2271c = str4;
                        }
                        clickEvent2 = new ClickEvent("Old_Loan_Product_Borrow");
                        if (str4 != null) {
                            clickEvent2.add("loanProduct", str4);
                        }
                        if (num2 != null) {
                            clickEvent2.add("accountType", String.valueOf(num2.intValue()));
                        }
                        while (r7.hasNext()) {
                            clickEvent2.add((String) entry.getKey(), (String) entry.getValue());
                        }
                        n0.g().q(clickEvent2);
                        break;
                    }
                }
                break;
        }
    }

    public static boolean c(Integer num, String str) {
        if (num != null && num.intValue() == 7) {
            return true;
        }
        if (num != null && num.intValue() == 9) {
            return true;
        }
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -722072964) {
            return str.equals("CASH_LOAN");
        }
        if (iHashCode != 172275258) {
            return iHashCode == 709418006 && str.equals("INSTALLMENT_LOAN");
        }
        return str.equals("CASH_INSTANT_LOAN");
    }

    public static void d(String str, String str2) {
        LoanHomeActivity loanHomeActivity;
        if (str2 == null) {
            str2 = f2271c;
        }
        Integer num = f2270b;
        if (str2 == null && f2271c == null) {
            return;
        }
        if (!c(num, str2 == null ? f2271c : str2)) {
            f2270b = null;
            f2271c = null;
            return;
        }
        Context context = BaseApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        while (true) {
            if (context == null) {
                loanHomeActivity = null;
                break;
            } else if (context instanceof LoanHomeActivity) {
                loanHomeActivity = (LoanHomeActivity) context;
                break;
            } else {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            }
        }
        if (!(loanHomeActivity != null ? true : ActivityUtils.getTopActivity() instanceof LoanHomeActivity)) {
            f2270b = null;
            f2271c = null;
            return;
        }
        ClickEvent clickEvent = new ClickEvent("PersonalLoanBorrow");
        clickEvent.add("result", str);
        if (str2 != null) {
            clickEvent.add("loanProduct", str2);
        }
        if (num != null) {
            clickEvent.add("accountType", String.valueOf(num.intValue()));
        }
        for (Map.Entry entry : a().entrySet()) {
            clickEvent.add((String) entry.getKey(), (String) entry.getValue());
        }
        n0.g().q(clickEvent);
        f2270b = null;
        f2271c = null;
    }
}

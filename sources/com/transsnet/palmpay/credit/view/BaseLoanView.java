package com.transsnet.palmpay.credit.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.bean.Dark;
import com.transsnet.palmpay.credit.bean.KingkongThemeInfo;
import com.transsnet.palmpay.credit.bean.Light;
import com.transsnet.palmpay.credit.bean.LoanHomeThemeInfo;
import com.transsnet.palmpay.credit.bean.OutstandingThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p186mb.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/view/BaseLoanView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/transsnet/palmpay/credit/bean/LoanHomeThemeInfo;", "getLoanThemeInfo", "()Lcom/transsnet/palmpay/credit/bean/LoanHomeThemeInfo;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseLoanView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLoanView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final LoanHomeThemeInfo getLoanThemeInfo() {
        return d.f39634e.getInstance().f39637b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final KingkongThemeInfo a(String str) {
        Light light;
        List<KingkongThemeInfo> list;
        Dark dark;
        Object obj = null;
        if (d()) {
            LoanHomeThemeInfo loanThemeInfo = getLoanThemeInfo();
            if (loanThemeInfo == null || (dark = loanThemeInfo.dark) == null) {
                list = null;
            } else {
                list = dark.kingkongThemeInfo;
            }
        } else {
            LoanHomeThemeInfo loanThemeInfo2 = getLoanThemeInfo();
            if (loanThemeInfo2 == null || (light = loanThemeInfo2.light) == null) {
                list = null;
            } else {
                list = light.kingkongThemeInfo;
            }
        }
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (TextUtils.equals(str, ((KingkongThemeInfo) obj2).style)) {
                obj = obj2;
                break;
            }
        }
        return (KingkongThemeInfo) obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final OutstandingThemeInfo b(String str) {
        Light light;
        List<OutstandingThemeInfo> list;
        Dark dark;
        Object obj = null;
        if (d()) {
            LoanHomeThemeInfo loanThemeInfo = getLoanThemeInfo();
            if (loanThemeInfo == null || (dark = loanThemeInfo.dark) == null) {
                list = null;
            } else {
                list = dark.outstandingThemeInfo;
            }
        } else {
            LoanHomeThemeInfo loanThemeInfo2 = getLoanThemeInfo();
            if (loanThemeInfo2 == null || (light = loanThemeInfo2.light) == null) {
                list = null;
            } else {
                list = light.outstandingThemeInfo;
            }
        }
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (TextUtils.equals(str, ((OutstandingThemeInfo) obj2).style)) {
                obj = obj2;
                break;
            }
        }
        return (OutstandingThemeInfo) obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final ProductThemeInfo c(String str) {
        Light light;
        List<ProductThemeInfo> list;
        Dark dark;
        Object obj = null;
        if (d()) {
            LoanHomeThemeInfo loanThemeInfo = getLoanThemeInfo();
            if (loanThemeInfo == null || (dark = loanThemeInfo.dark) == null) {
                list = null;
            } else {
                list = dark.productThemeInfo;
            }
        } else {
            LoanHomeThemeInfo loanThemeInfo2 = getLoanThemeInfo();
            if (loanThemeInfo2 == null || (light = loanThemeInfo2.light) == null) {
                list = null;
            } else {
                list = light.productThemeInfo;
            }
        }
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (TextUtils.equals(str, ((ProductThemeInfo) obj2).style)) {
                obj = obj2;
                break;
            }
        }
        return (ProductThemeInfo) obj;
    }

    public final boolean d() {
        Context context = getContext();
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity != null) {
            return baseActivity.isDarkMode();
        }
        return false;
    }
}

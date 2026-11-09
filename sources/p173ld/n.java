package p173ld;

import G1.d;
import Jd.c;
import L6.b;
import M1.k;
import Pa.r0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.widget.ImageView;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39332b;

    public n() {
        super(f.sm_select_bank_list_title_layout);
        a(-100, f.sm_select_bank_list_item_layout);
    }

    @Override // M1.k
    public final void b(BaseViewHolder viewHolder, SectionEntity sectionEntity) {
        BankInfo bankInfo = (BankInfo) sectionEntity;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(bankInfo, "bankInfo");
        viewHolder.setText(e.title_tv, c.c(bankInfo.bankName));
    }

    public final int c(String letter) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        if ("#".equals(letter)) {
            return 0;
        }
        List<Object> data = getData();
        int size = data.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (c.c(((BankInfo) data.get(i7)).bankName).equals(letter)) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.chad.library.adapter.base.viewholder.BaseViewHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // M1.j
    public final void convert(BaseViewHolder viewHolder, Object obj) {
        int iE;
        String lowerCase;
        BankInfo bankInfo = (BankInfo) obj;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(bankInfo, "bankInfo");
        ImageView imageView = (ImageView) viewHolder.getView(e.bank_logo);
        getContext();
        r0.j1(imageView, bankInfo.bankUrl, d.O(r.cv_default_bank_logo));
        int i7 = e.bank_name;
        ?? r10 = bankInfo.bankName;
        if (!TextUtils.isEmpty(this.f39332b)) {
            if (r10 != 0) {
                Locale locale = Locale.ROOT;
                String lowerCase2 = r10.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 != null) {
                    String str = this.f39332b;
                    if (str != null) {
                        lowerCase = str.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (lowerCase == null) {
                            lowerCase = "";
                        }
                    } else {
                        lowerCase = "";
                    }
                    iE = StringsKt.E(lowerCase2, lowerCase, 0, false, 6);
                } else {
                    iE = -1;
                }
            } else {
                iE = -1;
            }
            if (iE != -1) {
                String str2 = this.f39332b;
                int length = (str2 != null ? str2.length() : 0) + iE;
                SpannableString spannableString = new SpannableString(r10);
                spannableString.setSpan(new ForegroundColorSpan(CommonViewExtKt.colorInt(b.ppColorPrimary, getContext())), iE, length, 33);
                spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), iE, length, 33);
                r10 = spannableString;
            }
        }
        viewHolder.setText(i7, r10);
    }
}

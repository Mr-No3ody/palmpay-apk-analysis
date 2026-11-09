package p173ld;

import L6.b;
import M1.j;
import Pa.r0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39337b;

    public r(boolean z3) {
        super(f.sm_select_bank_list_item_layout_v2, null);
        this.f39336a = z3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.chad.library.adapter.base.viewholder.BaseViewHolder, java.lang.Object] */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        int iE;
        String lowerCase;
        BankInfo item = (BankInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        r0.o1(item.bankUrl, (ImageView) holder.getView(e.bank_logo));
        int i7 = e.bank_name;
        ?? r3 = item.bankName;
        if (!TextUtils.isEmpty(this.f39337b)) {
            if (r3 != 0) {
                Locale locale = Locale.ROOT;
                String lowerCase2 = r3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 != null) {
                    String str = this.f39337b;
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
                String str2 = this.f39337b;
                int length = (str2 != null ? str2.length() : 0) + iE;
                SpannableString spannableString = new SpannableString(r3);
                spannableString.setSpan(new ForegroundColorSpan(CommonViewExtKt.colorInt(b.ppColorPrimary, getContext())), iE, length, 33);
                spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), iE, length, 33);
                r3 = spannableString;
            }
        }
        holder.setText(i7, r3);
        String str3 = (!this.f39336a || TextUtils.isEmpty(item.bankDarkMark)) ? item.bankMark : item.bankDarkMark;
        if (TextUtils.isEmpty(str3)) {
            holder.setGone(e.iv_label, true);
        } else {
            holder.setGone(e.iv_label, false);
            r0.i1((ImageView) holder.getView(e.iv_label), str3, Integer.MIN_VALUE, CommonViewExtKt.getDp(16));
        }
    }
}

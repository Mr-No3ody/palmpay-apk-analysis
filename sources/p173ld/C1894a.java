package p173ld;

import L6.b;
import M1.j;
import Pa.r0;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p159kd.e;
import p159kd.f;

/* JADX INFO: renamed from: ld.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1894a extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894a(Context adapterContext) {
        super(f.sm_item_recipients_match, null);
        Intrinsics.checkNotNullParameter(adapterContext, "adapterContext");
        this.f39316a = adapterContext;
        this.f39317b = "";
    }

    public final void a(String keyword, List matches) {
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.f39317b = keyword;
        setList(matches);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        SpannableString spannableString;
        int iE;
        MatchRecipientsImpl item = (MatchRecipientsImpl) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        r0.m1(item.getRecipientHeadImage(), (ImageView) holder.getView(e.iv_avatar));
        int i7 = e.tv_name;
        String recipientNickname = item.getRecipientNickname();
        if (recipientNickname == null) {
            recipientNickname = "";
        }
        holder.setText(i7, recipientNickname);
        int i10 = e.tv_account;
        String account = item.getAccount();
        if (account == null) {
            account = "";
        }
        holder.setText(i10, account);
        int i11 = e.tv_bank_name;
        String recipientBankName = item.getRecipientBankName();
        holder.setText(i11, recipientBankName != null ? recipientBankName : "");
        TextView textView = (TextView) holder.getView(e.tv_account);
        if (!StringsKt.F(this.f39317b) && (iE = StringsKt.E((spannableString = new SpannableString(textView.getText())), this.f39317b, 0, false, 6)) >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(CommonViewExtKt.colorInt(b.ppColorPrimary, this.f39316a)), iE, this.f39317b.length() + iE, 18);
            textView.setText(spannableString);
        }
    }
}

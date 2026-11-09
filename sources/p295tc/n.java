package p295tc;

import L6.b;
import M1.j;
import Pa.r0;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.jara_packet.bean.WhoInviteItem;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p141j9.C1798f;
import p220oa.h;
import p236pc.d;
import p236pc.e;
import p236pc.f;
import p294tb.W;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42579e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1798f f42580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f42583d;

    static {
        new m(null);
    }

    public n(C1798f c1798f) {
        super(e.jp_item_cs_homepage_who_invite, null);
        this.f42580a = c1798f;
        this.f42582c = 5;
        this.f42583d = z.f38935a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final void a() {
        List listU;
        if (this.f42581b) {
            listU = this.f42583d;
        } else {
            int size = this.f42583d.size();
            int i7 = this.f42582c;
            if (size <= i7) {
                listU = this.f42583d;
            } else {
                listU = CollectionsKt.U(this.f42583d, i7);
            }
        }
        setNewInstance(CollectionsKt.Z(listU));
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        CharSequence charSequence;
        WhoInviteItem item = (WhoInviteItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) holder.getView(d.tvWhoInvitePrimary);
        String phone = item.getPhone();
        if (phone == null) {
            phone = "";
        }
        String strZ = r0.Z(phone);
        String displayName = item.getDisplayName();
        String string = displayName != null ? StringsKt.V(displayName).toString() : null;
        String str = string != null ? string : "";
        if (str.length() == 0) {
            Intrinsics.e(strZ);
            charSequence = strZ;
        } else {
            String string2 = getContext().getString(f.jp_who_invite_nick_format, str);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Intrinsics.e(strZ);
            if (strZ.length() > 0) {
                spannableStringBuilder.append((CharSequence) strZ);
                spannableStringBuilder.append((CharSequence) " ");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) string2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(CommonViewExtKt.colorInt(b.ppColorTextDisable, getContext())), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        textView.setText(charSequence);
        TextView textView2 = (TextView) holder.getView(d.tvWhoInviteReason);
        if (TextUtils.isEmpty(item.getReason())) {
            h.c(textView2);
        } else {
            h.C(textView2);
            textView2.setText(item.getReason());
        }
        PpButton ppButton = (PpButton) holder.getView(d.btnWhoInvite);
        if (item.hasInvited()) {
            ppButton.setText(getContext().getString(f.jp_share_again));
            ppButton.setBackgroundResource(r.cv_shape_halfround_purple_stroke);
            ppButton.setBackgroundTintList(ColorStateList.valueOf(-1));
            ppButton.setTextColor(-1);
        } else {
            ppButton.setText(getContext().getString(k.core_invite));
            ppButton.setBackgroundResource(r.cv_shape_round_corner_primary);
            ppButton.setBackgroundTintList(null);
            ppButton.setTextColor(CommonViewExtKt.colorInt(b.ppColorButtonTextWhite, getContext()));
        }
        ppButton.setOnClickListener(new W(2, this, item));
    }
}

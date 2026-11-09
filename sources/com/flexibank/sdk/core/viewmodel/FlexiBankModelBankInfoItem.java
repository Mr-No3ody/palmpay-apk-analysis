package com.flexibank.sdk.core.viewmodel;

import C0.G;
import G1.d;
import N8.q0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import com.flexibank.sdk.core.bean.FlexiBankBankInfo;
import com.flexibank.sdk.core.bean.FlexiBankPaymentMethod;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import j4.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010.\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R$\u00102\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010>\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001d\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!¨\u0006?"}, d2 = {"Lcom/flexibank/sdk/core/viewmodel/FlexiBankModelBankInfoItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/flexibank/sdk/core/bean/FlexiBankBankInfo;", "bankInfo", "", "setBankCardInfo", "(Lcom/flexibank/sdk/core/bean/FlexiBankBankInfo;)V", "Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;", "paymentMethod", "setPaymehtMethod", "(Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;)V", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "getMBankIcon", "()Landroid/widget/ImageView;", "setMBankIcon", "(Landroid/widget/ImageView;)V", "mBankIcon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getMBankNameTv", "()Landroid/widget/TextView;", "setMBankNameTv", "(Landroid/widget/TextView;)V", "mBankNameTv", "Landroid/widget/RelativeLayout;", "d", "Landroid/widget/RelativeLayout;", "getMRoot", "()Landroid/widget/RelativeLayout;", "setMRoot", "(Landroid/widget/RelativeLayout;)V", "mRoot", "e", "getMRightIv", "setMRightIv", "mRightIv", "f", "getMDefaultCardView", "setMDefaultCardView", "mDefaultCardView", "Landroid/view/View;", "g", "Landroid/view/View;", "getMBottomLine", "()Landroid/view/View;", "setMBottomLine", "(Landroid/view/View;)V", "mBottomLine", "i", "getMHintText", "setMHintText", "mHintText", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelBankInfoItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ImageView mBankIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public TextView mBankNameTv;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public RelativeLayout mRoot;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ImageView mRightIv;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ImageView mDefaultCardView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public View mBottomLine;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public TextView mHintText;

    public FlexiBankModelBankInfoItem(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22100a = context;
        View.inflate(context, q.fb_model_bank_info_item, this);
        this.mRoot = (RelativeLayout) findViewById(p.fb_mbci_root);
        this.mDefaultCardView = (ImageView) findViewById(p.fb_cmbii_view_default_card);
        this.mBankIcon = (ImageView) findViewById(p.fb_mbci_access_bank_iv);
        this.mBankNameTv = (TextView) findViewById(p.fb_mbci_bank_name_tv);
        this.mRightIv = (ImageView) findViewById(p.fb_mbci_right_iv);
        this.mBottomLine = findViewById(p.fb_mbci_bottom_line);
        this.mHintText = (TextView) findViewById(p.fb_mbci_hint_text_tv);
    }

    public final void a() {
        ImageView imageView = this.mBankIcon;
        Intrinsics.e(imageView);
        imageView.setVisibility(0);
        TextView textView = this.mBankNameTv;
        Intrinsics.e(textView);
        textView.setVisibility(0);
        TextView textView2 = this.mHintText;
        Intrinsics.e(textView2);
        textView2.setVisibility(8);
    }

    @Nullable
    public final ImageView getMBankIcon() {
        return this.mBankIcon;
    }

    @Nullable
    public final TextView getMBankNameTv() {
        return this.mBankNameTv;
    }

    @Nullable
    public final View getMBottomLine() {
        return this.mBottomLine;
    }

    @Nullable
    public final ImageView getMDefaultCardView() {
        return this.mDefaultCardView;
    }

    @Nullable
    public final TextView getMHintText() {
        return this.mHintText;
    }

    @Nullable
    public final ImageView getMRightIv() {
        return this.mRightIv;
    }

    @Nullable
    public final RelativeLayout getMRoot() {
        return this.mRoot;
    }

    public final void setBankCardInfo(@NotNull FlexiBankBankInfo bankInfo) {
        Intrinsics.checkNotNullParameter(bankInfo, "bankInfo");
        a();
        if (TextUtils.isEmpty(bankInfo.getBankCode())) {
            TextView textView = this.mBankNameTv;
            Intrinsics.e(textView);
            textView.setBackgroundResource(o.fb_bank_loading_name_bg);
            ImageView imageView = this.mBankIcon;
            Intrinsics.e(imageView);
            imageView.setImageResource(o.fb_bank_loading_icon);
            ImageView imageView2 = this.mRightIv;
            Intrinsics.e(imageView2);
            imageView2.setVisibility(8);
            return;
        }
        TextView textView2 = this.mBankNameTv;
        Intrinsics.e(textView2);
        textView2.setBackground(null);
        TextView textView3 = this.mBankNameTv;
        Intrinsics.e(textView3);
        textView3.setText(bankInfo.getBankName());
        Context context = this.f22100a;
        if (u.b(context)) {
            Intrinsics.e(context);
            m mVarA = b.c(context).c(context).load(bankInfo.getBankUrl()).a(new d().x(o.fb_default_bank_logo));
            ImageView imageView3 = this.mBankIcon;
            Intrinsics.e(imageView3);
            mVarA.S(imageView3);
        }
        ImageView imageView4 = this.mRightIv;
        Intrinsics.e(imageView4);
        imageView4.setImageResource(o.fb_check);
    }

    public final void setMBankIcon(@Nullable ImageView imageView) {
        this.mBankIcon = imageView;
    }

    public final void setMBankNameTv(@Nullable TextView textView) {
        this.mBankNameTv = textView;
    }

    public final void setMBottomLine(@Nullable View view) {
        this.mBottomLine = view;
    }

    public final void setMDefaultCardView(@Nullable ImageView imageView) {
        this.mDefaultCardView = imageView;
    }

    public final void setMHintText(@Nullable TextView textView) {
        this.mHintText = textView;
    }

    public final void setMRightIv(@Nullable ImageView imageView) {
        this.mRightIv = imageView;
    }

    public final void setMRoot(@Nullable RelativeLayout relativeLayout) {
        this.mRoot = relativeLayout;
    }

    public final void setPaymehtMethod(@NotNull FlexiBankPaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        a();
        if (TextUtils.isEmpty(paymentMethod.getBankCode())) {
            TextView textView = this.mBankNameTv;
            Intrinsics.e(textView);
            textView.setBackgroundResource(o.fb_bank_loading_name_bg);
            ImageView imageView = this.mBankIcon;
            Intrinsics.e(imageView);
            imageView.setImageResource(o.fb_bank_loading_icon);
            TextView textView2 = this.mBankNameTv;
            Intrinsics.e(textView2);
            textView2.setText("");
            ImageView imageView2 = this.mRightIv;
            Intrinsics.e(imageView2);
            imageView2.setVisibility(8);
            return;
        }
        TextView textView3 = this.mBankNameTv;
        Intrinsics.e(textView3);
        textView3.setBackground(null);
        String bankName = paymentMethod.getBankName();
        if (!TextUtils.isEmpty(bankName)) {
            Intrinsics.e(bankName);
            if (bankName.length() > 12) {
                String strSubstring = bankName.substring(0, 12);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                bankName = strSubstring + "... ";
            }
        }
        if (!TextUtils.isEmpty(paymentMethod.getCardNo())) {
            String cardNo = paymentMethod.getCardNo();
            if (!TextUtils.isEmpty(cardNo)) {
                Intrinsics.e(cardNo);
                if (cardNo.length() > 4) {
                    cardNo = cardNo.substring(cardNo.length() - 4);
                    Intrinsics.checkNotNullExpressionValue(cardNo, "substring(...)");
                }
            }
            bankName = q0.l(bankName, "(", G.o("**** ", cardNo), ")");
        }
        TextView textView4 = this.mBankNameTv;
        Intrinsics.e(textView4);
        textView4.setText(bankName);
        Context context = this.f22100a;
        if (u.b(context)) {
            Intrinsics.e(context);
            m mVarA = b.c(context).c(context).load(paymentMethod.getBankUrl()).a(new d().x(o.fb_default_bank_logo));
            ImageView imageView3 = this.mBankIcon;
            Intrinsics.e(imageView3);
            mVarA.S(imageView3);
        }
        ImageView imageView4 = this.mRightIv;
        Intrinsics.e(imageView4);
        imageView4.setImageResource(o.fb_check);
    }
}

package com.transsnet.palmpay.core.viewmodel;

import Pa.k0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.regex.Pattern;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewTitleView extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f28561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28565g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28566i;

    public PreviewTitleView(Context context) {
        super(context);
    }

    public static void e(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        textView.setText(str);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_preview_title_view, this);
        this.f28561c = (ImageView) findViewById(e.cptv_iv);
        this.f28562d = (TextView) findViewById(e.amount_label);
        this.f28563e = (TextView) findViewById(e.cptv_tv1);
        this.f28564f = (TextView) findViewById(e.cptv_tv2);
        this.f28565g = (TextView) findViewById(e.cptv_tv3);
        this.f28566i = (TextView) findViewById(e.tvAmount);
        setAmount(0L);
        return this;
    }

    public final void d(String str) {
        e(this.f28565g, str);
    }

    public TextView getAmountLabelTv() {
        return this.f28562d;
    }

    public ImageView getIconIv() {
        return this.f28561c;
    }

    public TextView getLine1Tv() {
        return this.f28563e;
    }

    public TextView getLine2Tv() {
        return this.f28564f;
    }

    public TextView getLine3Tv() {
        return this.f28565g;
    }

    public void setAmount(long amount) {
        TextView textView = this.f28566i;
        Pattern pattern = k0.f7098a;
        String strA = r0.A(amount);
        textView.setText(new SpanUtils().append(BaseApplication.getCurrencySymbol()).setFontSize(20, true).append(" ").append(strA.substring(0, strA.length() - 3)).setFontSize(37, true).append(strA.substring(strA.length() - 3)).setFontSize(20, true).create());
    }

    public PreviewTitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PreviewTitleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setAmount(CharSequence amountStr) {
        this.f28566i.setText(amountStr);
    }
}

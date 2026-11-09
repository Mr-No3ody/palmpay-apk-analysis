package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/custom_view/CashBoxIntroductionView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "license", "", "setBusinessLicenseText", "(Ljava/lang/String;)V", "fundLicense", "setFundLicenseText", "a", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashBoxIntroductionView extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f30946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Group f30947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f30948e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public CashBoxIntroductionView(@Nullable Context context) {
        super(context);
    }

    private final void setBusinessLicenseText(String license) {
        TextView textView;
        if (license == null || license.length() == 0 || (textView = this.f30946c) == null) {
            return;
        }
        textView.setText(license);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(t.cv_cash_box_licenced_deposits_layout, (ViewGroup) this, true);
        this.f30946c = viewInflate != null ? (TextView) viewInflate.findViewById(s.tv2) : null;
        this.f30947d = viewInflate != null ? (Group) viewInflate.findViewById(s.fundGroup) : null;
        this.f30948e = viewInflate != null ? (TextView) viewInflate.findViewById(s.tvFund2) : null;
        setBusinessLicenseText(SPUtils.getInstance().getString("cash_box_business_license"));
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    public final void d(String license) {
        Intrinsics.checkNotNullParameter(license, "license");
        setBusinessLicenseText(license);
    }

    public final void setFundLicenseText(@Nullable String fundLicense) {
        TextView textView;
        if (fundLicense == null || fundLicense.length() == 0 || (textView = this.f30948e) == null) {
            return;
        }
        textView.setText(fundLicense);
    }

    public CashBoxIntroductionView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CashBoxIntroductionView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}

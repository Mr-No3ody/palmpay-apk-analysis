package com.transsnet.palmpay.account.ui.view;

import F8.d;
import F8.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB)\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/account/ui/view/GenderV2View;", "Landroid/widget/LinearLayout;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", ViewProps.ENABLED, "", "setEnabled", "(Z)V", ViewProps.VISIBLE, "setMaleIconVisible", "e", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getOnCheckedChangeListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "onCheckedChangeListener", FirebaseAnalytics.Param.INDEX, "getGender", "()I", "setGender", "(I)V", "gender", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GenderV2View extends LinearLayout implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatCheckBox f26324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatCheckBox f26325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f26326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f26327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

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

    @JvmOverloads
    public GenderV2View(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    public final int getGender() {
        AppCompatCheckBox appCompatCheckBox = this.f26324a;
        if (appCompatCheckBox != null) {
            Intrinsics.e(appCompatCheckBox);
            if (appCompatCheckBox.isChecked()) {
                return 0;
            }
        }
        AppCompatCheckBox appCompatCheckBox2 = this.f26325b;
        if (appCompatCheckBox2 == null) {
            return -1;
        }
        Intrinsics.e(appCompatCheckBox2);
        return appCompatCheckBox2.isChecked() ? 1 : -1;
    }

    @Nullable
    public final CompoundButton.OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        int id2 = buttonView.getId();
        if (z3) {
            if (id2 == d.checkMale) {
                setGender(1);
            } else if (id2 == d.checkFemale) {
                setGender(0);
            }
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(buttonView, z3);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        AppCompatCheckBox appCompatCheckBox = this.f26324a;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setEnabled(enabled);
        }
        AppCompatCheckBox appCompatCheckBox2 = this.f26325b;
        if (appCompatCheckBox2 != null) {
            appCompatCheckBox2.setEnabled(enabled);
        }
        super.setEnabled(enabled);
    }

    public final void setGender(int i7) {
        AppCompatCheckBox appCompatCheckBox = this.f26324a;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setChecked(i7 == 0);
        }
        AppCompatCheckBox appCompatCheckBox2 = this.f26325b;
        if (appCompatCheckBox2 != null) {
            appCompatCheckBox2.setChecked(i7 == 1);
        }
    }

    public final void setMaleIconVisible(boolean visible) {
        ImageView imageView = this.f26326c;
        if (imageView != null) {
            imageView.setVisibility(visible ? 0 : 8);
        }
        ImageView imageView2 = this.f26327d;
        if (imageView2 != null) {
            imageView2.setVisibility(visible ? 0 : 8);
        }
    }

    public final void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @JvmOverloads
    public GenderV2View(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ GenderV2View(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public GenderV2View(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        setOrientation(0);
        View.inflate(getContext(), e.ac_layout_gender_view_v2, this);
        this.f26324a = (AppCompatCheckBox) findViewById(d.checkFemale);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(d.checkMale);
        this.f26325b = appCompatCheckBox;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setOnCheckedChangeListener(this);
        }
        AppCompatCheckBox appCompatCheckBox2 = this.f26324a;
        if (appCompatCheckBox2 != null) {
            appCompatCheckBox2.setOnCheckedChangeListener(this);
        }
        this.f26326c = (ImageView) findViewById(d.ivMale);
        this.f26327d = (ImageView) findViewById(d.ivFemale);
    }
}

package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.google.common.net.HttpHeaders;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/UnsatisfiedLinkErrorActivity;", "Landroidx/appcompat/app/o;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnsatisfiedLinkErrorActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27723a = 0;

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

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        int intExtra = intent != null ? intent.getIntExtra("extra_type", 1) : 1;
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this);
        int iColorInt2 = CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, this);
        if (intExtra != 1) {
            SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append("We're really sorry the APP is not functioning properly.\n").setForegroundColor(iColorInt).append("Clearing APP cache data often helps.If clearing the cache does not resolve, try updating the app to the latest version. \n").setForegroundColor(iColorInt).append("We are continuously working to fix any problems.\n").setForegroundColor(iColorInt).create();
            final int i7 = 2;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UnsatisfiedLinkErrorActivity f27771b;

                {
                    this.f27771b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnsatisfiedLinkErrorActivity unsatisfiedLinkErrorActivity = this.f27771b;
                    switch (i7) {
                        case 0:
                            int i10 = UnsatisfiedLinkErrorActivity.f27723a;
                            i0.O(unsatisfiedLinkErrorActivity);
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                        case 1:
                            int i11 = UnsatisfiedLinkErrorActivity.f27723a;
                            ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                        case 2:
                            int i12 = UnsatisfiedLinkErrorActivity.f27723a;
                            ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                        default:
                            int i13 = UnsatisfiedLinkErrorActivity.f27723a;
                            i0.O(unsatisfiedLinkErrorActivity);
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                    }
                }
            };
            final int i10 = 3;
            io.fastkv.n.O(this, 2, null, "Experiencing some issues?", null, null, null, spannableStringBuilderCreate, null, "Clear Data", onClickListener, null, HttpHeaders.UPGRADE, new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.g0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UnsatisfiedLinkErrorActivity f27771b;

                {
                    this.f27771b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnsatisfiedLinkErrorActivity unsatisfiedLinkErrorActivity = this.f27771b;
                    switch (i10) {
                        case 0:
                            int i11 = UnsatisfiedLinkErrorActivity.f27723a;
                            i0.O(unsatisfiedLinkErrorActivity);
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                        case 1:
                            int i12 = UnsatisfiedLinkErrorActivity.f27723a;
                            ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                        case 2:
                            int i13 = UnsatisfiedLinkErrorActivity.f27723a;
                            ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                        default:
                            int i14 = UnsatisfiedLinkErrorActivity.f27723a;
                            i0.O(unsatisfiedLinkErrorActivity);
                            unsatisfiedLinkErrorActivity.finish();
                            break;
                    }
                }
            }, null, true, 0, 8161658);
            return;
        }
        int i11 = p025ba.k.core_opps;
        SpannableStringBuilder spannableStringBuilderCreate2 = new SpanUtils().append("Your app installation is corrupted.\n").setForegroundColor(iColorInt).append("To resolve this issue:\n").setForegroundColor(iColorInt).append("1. Uninstall the app completely from your device.\n").setForegroundColor(iColorInt).append("2. Reinstall the latest version from Google Play.\n\n").setForegroundColor(iColorInt).append("If the problem persists after reinstallation, please contact our support team.\n\n").setForegroundColor(iColorInt2).append("Thank you for your patience!\n").setForegroundColor(iColorInt2).create();
        final int i12 = 0;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnsatisfiedLinkErrorActivity f27771b;

            {
                this.f27771b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnsatisfiedLinkErrorActivity unsatisfiedLinkErrorActivity = this.f27771b;
                switch (i12) {
                    case 0:
                        int i13 = UnsatisfiedLinkErrorActivity.f27723a;
                        i0.O(unsatisfiedLinkErrorActivity);
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                    case 1:
                        int i14 = UnsatisfiedLinkErrorActivity.f27723a;
                        ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                    case 2:
                        int i15 = UnsatisfiedLinkErrorActivity.f27723a;
                        ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                    default:
                        int i16 = UnsatisfiedLinkErrorActivity.f27723a;
                        i0.O(unsatisfiedLinkErrorActivity);
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                }
            }
        };
        final int i13 = 1;
        io.fastkv.n.O(this, 2, Integer.valueOf(i11), null, null, null, null, spannableStringBuilderCreate2, null, "Go to Google Play", onClickListener2, null, "Uninstall", new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnsatisfiedLinkErrorActivity f27771b;

            {
                this.f27771b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnsatisfiedLinkErrorActivity unsatisfiedLinkErrorActivity = this.f27771b;
                switch (i13) {
                    case 0:
                        int i14 = UnsatisfiedLinkErrorActivity.f27723a;
                        i0.O(unsatisfiedLinkErrorActivity);
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                    case 1:
                        int i15 = UnsatisfiedLinkErrorActivity.f27723a;
                        ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                    case 2:
                        int i16 = UnsatisfiedLinkErrorActivity.f27723a;
                        ActivityUtils.startActivity(IntentUtils.getLaunchAppDetailsSettingsIntent(unsatisfiedLinkErrorActivity.getApplication().getPackageName()));
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                    default:
                        int i17 = UnsatisfiedLinkErrorActivity.f27723a;
                        i0.O(unsatisfiedLinkErrorActivity);
                        unsatisfiedLinkErrorActivity.finish();
                        break;
                }
            }
        }, null, true, 0, 8161660);
    }
}

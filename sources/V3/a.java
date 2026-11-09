package V3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Z;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p177m.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p177m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9982a;

    public /* synthetic */ a(int i7) {
        this.f9982a = i7;
    }

    @Override // p177m.b
    public final Intent createIntent(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f9982a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                return intent;
            case 1:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = intentSenderRequest.f12045b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = intentSenderRequest.f12044a;
                        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                        intentSenderRequest = new IntentSenderRequest(intentSender, null, intentSenderRequest.f12046c, intentSenderRequest.f12047d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (Z.L(2)) {
                    intent2.toString();
                }
                return intent2;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent4.setData(Uri.fromParts("package", context.getPackageName(), null));
                return intent4;
            case 3:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
                Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            case 4:
                String input2 = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                return j.f39409a.createIntent$activity_release(new String[]{input2});
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent5 = new Intent("android.intent.action.PICK");
                intent5.setType("vnd.android.cursor.dir/phone_v2");
                return intent5;
        }
    }

    @Override // p177m.b
    public p177m.a getSynchronousResult(Context context, Object obj) {
        switch (this.f9982a) {
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter((String[]) obj, "input");
                return null;
            case 4:
                String input = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (androidx.core.content.d.a(context, input) == 0) {
                    return new p177m.a(Boolean.TRUE);
                }
                return null;
            default:
                return super.getSynchronousResult(context, obj);
        }
    }

    @Override // p177m.b
    public final Object parseResult(int i7, Intent intent) {
        switch (this.f9982a) {
            case 0:
                return Unit.f38893a;
            case 1:
                return new ActivityResult(i7, intent);
            case 2:
                return Unit.f38893a;
            case 3:
                if (i7 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 4:
                if (intent == null || i7 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z3 = false;
                if (intArrayExtra != null) {
                    for (int i10 : intArrayExtra) {
                        if (i10 == 0) {
                            z3 = true;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            default:
                if (intent == null || i7 != -1) {
                    return null;
                }
                Uri data = intent.getData();
                Intrinsics.e(data);
                return data;
        }
    }
}

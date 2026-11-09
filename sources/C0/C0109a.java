package C0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.Navigator$Name;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: C0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Navigator$Name("activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"LC0/a;", "LC0/e0;", "LC0/b;", "a", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,531:1\n179#2,2:532\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n48#1:532,2\n*E\n"})
public class C0109a extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f1001d;

    /* JADX INFO: renamed from: C0.a$a, reason: collision with other inner class name */
    public static final class C0000a {
        public /* synthetic */ C0000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void applyPopAnimationsToPendingTransition(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
            int intExtra2 = intent.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        private C0000a() {
        }
    }

    static {
        new C0000a(null);
    }

    public C0109a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1000c = context;
        for (Object obj : Sf.m.b(context, C0111c.f1005b)) {
            if (((Context) obj) instanceof Activity) {
                this.f1001d = (Activity) obj;
            }
        }
        obj = null;
        this.f1001d = (Activity) obj;
    }

    @Override // C0.e0
    public final K a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new C0110b(this);
    }

    @Override // C0.e0
    public final K c(K k2, Bundle bundle, U u6) {
        Intent intent;
        int intExtra;
        C0110b destination = (C0110b) k2;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.t == null) {
            throw new IllegalStateException(G.n(destination.f961i, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
        }
        Intent intent2 = new Intent(destination.t);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = destination.f1003v;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f1001d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (u6 != null && u6.f983a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.f961i);
        Context context = this.f1000c;
        Resources resources = context.getResources();
        if (u6 != null) {
            int i7 = u6.f990h;
            int i10 = u6.f991i;
            if ((i7 <= 0 || !Intrinsics.c(resources.getResourceTypeName(i7), "animator")) && (i10 <= 0 || !Intrinsics.c(resources.getResourceTypeName(i10), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i7);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i10);
            } else {
                resources.getResourceName(i7);
                resources.getResourceName(i10);
                destination.toString();
            }
        }
        context.startActivity(intent2);
        if (u6 == null || activity == null) {
            return null;
        }
        int i11 = u6.f988f;
        int i12 = u6.f989g;
        if ((i11 > 0 && Intrinsics.c(resources.getResourceTypeName(i11), "animator")) || (i12 > 0 && Intrinsics.c(resources.getResourceTypeName(i12), "animator"))) {
            resources.getResourceName(i11);
            resources.getResourceName(i12);
            destination.toString();
            return null;
        }
        if (i11 < 0 && i12 < 0) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        activity.overridePendingTransition(i11, i12 >= 0 ? i12 : 0);
        return null;
    }

    @Override // C0.e0
    public final boolean j() {
        Activity activity = this.f1001d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}

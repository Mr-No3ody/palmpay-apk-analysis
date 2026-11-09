package Ja;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.view.View;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckWithFaceRecognitionFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckWithFaceRecognitionFragment f4635b;

    public /* synthetic */ L(CheckWithFaceRecognitionFragment checkWithFaceRecognitionFragment, int i7) {
        this.f4634a = i7;
        this.f4635b = checkWithFaceRecognitionFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ContentResolver contentResolver;
        Object objF;
        Object objF2;
        boolean zBooleanValue = false;
        CheckWithFaceRecognitionFragment checkWithFaceRecognitionFragment = this.f4635b;
        switch (this.f4634a) {
            case 0:
                CheckWithFaceRecognitionFragment.a aVar = CheckWithFaceRecognitionFragment.f28049B;
                PayVerificationActivity payVerificationActivityT = checkWithFaceRecognitionFragment.t();
                if (payVerificationActivityT != null) {
                    payVerificationActivityT.verifyPayMethod("", 24);
                }
                break;
            case 1:
                CheckWithFaceRecognitionFragment.a aVar2 = CheckWithFaceRecognitionFragment.f28049B;
                PayVerificationActivity payVerificationActivityT2 = checkWithFaceRecognitionFragment.t();
                if (payVerificationActivityT2 != null) {
                    payVerificationActivityT2.verifyPayMethod("", 24);
                }
                break;
            case 2:
                CheckWithFaceRecognitionFragment.a aVar3 = CheckWithFaceRecognitionFragment.f28049B;
                if ((checkWithFaceRecognitionFragment.getActivity() instanceof PayVerificationActivity) && !checkWithFaceRecognitionFragment.f28053p) {
                    androidx.fragment.app.E activity = checkWithFaceRecognitionFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.ui.activity.PayVerificationActivity");
                    ((PayVerificationActivity) activity).n();
                } else {
                    androidx.fragment.app.E activity2 = checkWithFaceRecognitionFragment.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                break;
            case 3:
                CheckWithFaceRecognitionFragment.a aVar4 = CheckWithFaceRecognitionFragment.f28049B;
                checkWithFaceRecognitionFragment.z();
                break;
            case 4:
                CheckWithFaceRecognitionFragment.a aVar5 = CheckWithFaceRecognitionFragment.f28049B;
                androidx.fragment.app.E activity3 = checkWithFaceRecognitionFragment.getActivity();
                if (activity3 != null) {
                    activity3.finish();
                }
                break;
            case 5:
                CheckWithFaceRecognitionFragment.a aVar6 = CheckWithFaceRecognitionFragment.f28049B;
                androidx.fragment.app.E activity4 = checkWithFaceRecognitionFragment.getActivity();
                if (activity4 != null && (contentResolver = activity4.getContentResolver()) != null) {
                    try {
                        p355xf.o oVar = p355xf.q.f43977a;
                        objF = Boolean.valueOf(Settings.Global.getInt(contentResolver, "always_finish_activities", 0) == 1);
                    } catch (Throwable th) {
                        p355xf.o oVar2 = p355xf.q.f43977a;
                        objF = androidx.camera.core.impl.utils.executor.g.f(th);
                    }
                    Object obj = Boolean.FALSE;
                    if (objF instanceof p355xf.p) {
                        objF = obj;
                    }
                    zBooleanValue = ((Boolean) objF).booleanValue();
                }
                if (!zBooleanValue) {
                    checkWithFaceRecognitionFragment.z();
                } else {
                    Context context = checkWithFaceRecognitionFragment.getContext();
                    if (context != null) {
                        io.fastkv.n.O(context, 0, null, checkWithFaceRecognitionFragment.getString(p025ba.k.core_reminder), null, null, null, checkWithFaceRecognitionFragment.getString(p025ba.k.core_turn_off_dont_keep_activities_tip), Integer.valueOf(p025ba.k.core_go_settings), null, new L(checkWithFaceRecognitionFragment, 6), Integer.valueOf(p025ba.k.core_not_now), null, new L(checkWithFaceRecognitionFragment, 7), null, false, 0, 8376955);
                    }
                }
                break;
            case 6:
                CheckWithFaceRecognitionFragment.a aVar7 = CheckWithFaceRecognitionFragment.f28049B;
                Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
                try {
                    p355xf.o oVar3 = p355xf.q.f43977a;
                    checkWithFaceRecognitionFragment.startActivity(intent);
                    objF2 = Unit.f38893a;
                } catch (Throwable th2) {
                    p355xf.o oVar4 = p355xf.q.f43977a;
                    objF2 = androidx.camera.core.impl.utils.executor.g.f(th2);
                }
                if (p355xf.q.a(objF2) != null) {
                    ToastUtils.showLong(checkWithFaceRecognitionFragment.getString(p025ba.k.core_open_developer_options_manually), new Object[0]);
                }
                break;
            default:
                CheckWithFaceRecognitionFragment.a aVar8 = CheckWithFaceRecognitionFragment.f28049B;
                checkWithFaceRecognitionFragment.z();
                break;
        }
    }
}

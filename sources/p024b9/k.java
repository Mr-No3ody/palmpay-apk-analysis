package p024b9;

import Bc.C0108e;
import Pa.r0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepBillUploadFragment;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p051d9.C1628z;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpgradeTier3StepBillUploadFragment f18815b;

    public /* synthetic */ k(UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment, int i7) {
        this.f18814a = i7;
        this.f18815b = upgradeTier3StepBillUploadFragment;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public final void invoke(Object obj, Object obj2) {
        String stringExtra;
        RoundImageView roundImageView;
        Uri data;
        boolean zG;
        d dVar;
        ContentResolver contentResolver;
        int i7 = this.f18814a;
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        switch (i7) {
            case 0:
                if (iIntValue == -1 && intent != null && (stringExtra = intent.getStringExtra("photoUrl")) != null) {
                    if (stringExtra.length() <= 0) {
                        stringExtra = null;
                    }
                    if (stringExtra != null) {
                        UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment = this.f18815b;
                        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU = upgradeTier3StepBillUploadFragment.u();
                        if (palmPayLevelUpTier3V2ActivityU != null) {
                            palmPayLevelUpTier3V2ActivityU.f25917b = stringExtra;
                        }
                        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityU2 = upgradeTier3StepBillUploadFragment.u();
                        if (palmPayLevelUpTier3V2ActivityU2 != null) {
                            palmPayLevelUpTier3V2ActivityU2.f25922g = stringExtra;
                        }
                        Uri data2 = intent.getData();
                        if (data2 != null) {
                            upgradeTier3StepBillUploadFragment.f26291j = data2;
                            upgradeTier3StepBillUploadFragment.v(data2);
                        } else {
                            C0108e c0108e = upgradeTier3StepBillUploadFragment.f26292o;
                            if (c0108e != null && (roundImageView = (RoundImageView) c0108e.f688e) != null) {
                                h.C(roundImageView);
                            }
                            C0108e c0108e2 = upgradeTier3StepBillUploadFragment.f26292o;
                            r0.l1(stringExtra, c0108e2 != null ? (RoundImageView) c0108e2.f688e : null);
                            upgradeTier3StepBillUploadFragment.y();
                            upgradeTier3StepBillUploadFragment.z();
                        }
                        C1628z c1628z = (C1628z) upgradeTier3StepBillUploadFragment.f27328i;
                        if (c1628z != null) {
                            c1628z.queryAddressFromBill(stringExtra);
                        }
                        break;
                    }
                }
                break;
            default:
                if (iIntValue == -1) {
                    String type = null;
                    String stringExtra2 = intent != null ? intent.getStringExtra("pdf_local_path") : null;
                    UpgradeTier3StepBillUploadFragment upgradeTier3StepBillUploadFragment2 = this.f18815b;
                    if (stringExtra2 != null && stringExtra2.length() != 0) {
                        upgradeTier3StepBillUploadFragment2.w(stringExtra2);
                        break;
                    } else if (intent != null && (data = intent.getData()) != null) {
                        Context context = upgradeTier3StepBillUploadFragment2.getContext();
                        if (context != null && (contentResolver = context.getContentResolver()) != null) {
                            type = contentResolver.getType(data);
                        }
                        if (Intrinsics.c(type, "application/pdf")) {
                            zG = true;
                        } else {
                            String path = data.getPath();
                            if (path != null) {
                                String lowerCase = path.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (lowerCase == null) {
                                    zG = false;
                                } else {
                                    zG = y.g(lowerCase, ".pdf", false);
                                }
                            } else {
                                zG = false;
                            }
                        }
                        if (!zG) {
                            upgradeTier3StepBillUploadFragment2.f26291j = data;
                            upgradeTier3StepBillUploadFragment2.v(data);
                            String path2 = data.getPath();
                            if (path2 != null && (dVar = upgradeTier3StepBillUploadFragment2.f26293p) != null) {
                                dVar.c(new File(path2), new j(upgradeTier3StepBillUploadFragment2, 2));
                                break;
                            }
                        } else {
                            String path3 = data.getPath();
                            if (!(path3 == null || path3.length() == 0)) {
                                upgradeTier3StepBillUploadFragment2.w(path3);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}

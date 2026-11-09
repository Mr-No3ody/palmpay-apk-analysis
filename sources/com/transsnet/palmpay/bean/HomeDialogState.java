package com.transsnet.palmpay.bean;

import F6.d;
import android.app.Dialog;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.widget.HomeFragmentContainer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class HomeDialogState {
    public static final int PRIORITY_AD_DIALOG = 95;
    public static final int PRIORITY_AD_ZONE_DIALOG = 94;
    public static final int PRIORITY_AUTO_LOGOUT_SETTINGS = 99;
    public static final int PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG = 92;
    public static final int PRIORITY_DARK_MODE_NOTIFICATION = 98;
    public static final int PRIORITY_ENABLE_NOTIFICATION = 99;
    public static final int PRIORITY_HIGHEST = 110;
    public static final int PRIORITY_HIGHEST_111 = 111;
    public static final int PRIORITY_INVEST_DIALOG = 102;
    public static final int PRIORITY_OK_CARD_DIALOG = 93;
    public static final int PRIORITY_OK_CARD_DIALOG_HIGHEST = 96;
    public static final int PRIORITY_REQUEST_MONEY = 101;
    public static final int PRIORITY_SECURITY_QUESTIONS_DIALOG = 94;
    public static final int PRIORITY_SELECT_COUNTRY = 100;
    public static final int PRIORITY_SYSTEM_COMMON_ERROR = 112;
    private static final String TAG = "HomeDialogState";
    private boolean bFreezeDialog;
    private WeakReference<Dialog> mDialog;
    private WeakReference<HomeActivity> mHomeActivity;
    private int mPriority;

    public HomeDialogState(HomeActivity homeActivity) {
        this.mHomeActivity = new WeakReference<>(homeActivity);
    }

    private boolean checkActivityState(AbstractActivityC0837o abstractActivityC0837o) {
        if (abstractActivityC0837o == null) {
            return false;
        }
        try {
            return ((C1212w) abstractActivityC0837o.getLifecycle()).f17478d.a(EnumC1204n.f17464e);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean dismissDialog() {
        Dialog dialog = getDialog();
        if (dialog == null) {
            return false;
        }
        try {
            dialog.dismiss();
            return true;
        } catch (Exception e10) {
            d.c(TAG, "dismissDialog: ", e10);
            return false;
        }
    }

    public void freezeDialog(boolean z3) {
        this.bFreezeDialog = z3;
        if (z3) {
            return;
        }
        showDialog(getDialog());
    }

    public Dialog getDialog() {
        WeakReference<Dialog> weakReference = this.mDialog;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public HomeActivity getHomeActivity() {
        WeakReference<HomeActivity> weakReference = this.mHomeActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean showDialog(Dialog dialog, int i7) {
        HomeFragmentContainer homeFragmentContainer;
        HomeFragment homeFragmentQ;
        HomeFragmentContainer homeFragmentContainer2;
        HomeActivity homeActivity = getHomeActivity();
        boolean zShowDialog = false;
        if (dialog != null && checkActivityState(homeActivity)) {
            if (i7 == 93 || i7 == 96) {
                if (!getHomeActivity().s() || this.mPriority == 96) {
                    return false;
                }
                if (getDialog() != null && getDialog().isShowing()) {
                    dismissDialog();
                }
            } else if (i7 == 95 || i7 == 110) {
                if (getHomeActivity().s()) {
                    return false;
                }
            } else if (i7 == 94) {
                if (getHomeActivity().s() || (homeFragmentQ = getHomeActivity().q()) == null || (homeFragmentContainer2 = homeFragmentQ.f35081B) == null || homeFragmentContainer2.getCurrentItem() != homeFragmentQ.E()) {
                    return false;
                }
                if (getDialog() != null && getDialog().isShowing()) {
                    dismissDialog();
                }
            } else if (i7 == 102) {
                HomeFragment homeFragmentQ2 = getHomeActivity().q();
                if (homeFragmentQ2 == null || (homeFragmentContainer = homeFragmentQ2.f35081B) == null || homeFragmentContainer.getCurrentItem() != homeFragmentQ2.D()) {
                    return false;
                }
                if (getDialog() != null && getDialog().isShowing()) {
                    dismissDialog();
                }
            }
            if (getDialog() == null) {
                zShowDialog = showDialog(dialog);
            } else {
                boolean zIsShowing = getDialog().isShowing();
                if (i7 > this.mPriority || !zIsShowing) {
                    if (zIsShowing) {
                        dismissDialog();
                    }
                    zShowDialog = showDialog(dialog);
                }
            }
            if (zShowDialog) {
                this.mDialog = new WeakReference<>(dialog);
                this.mPriority = i7;
            }
        }
        return zShowDialog;
    }

    private boolean showDialog(Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        if (dialog.isShowing() || this.bFreezeDialog) {
            return true;
        }
        try {
            dialog.show();
            return true;
        } catch (Exception e10) {
            d.c(TAG, "showDialog: ", e10);
            return false;
        }
    }
}

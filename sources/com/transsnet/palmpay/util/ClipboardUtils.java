package com.transsnet.palmpay.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import com.flexibank.sdk.g;

/* JADX INFO: loaded from: classes4.dex */
public final class ClipboardUtils {
    private static final long SENSITIVE_CLIP_CLEAR_DELAY_MS = 30000;
    private static final String SENSITIVE_CLIP_LABEL = "pp_sensitive_clip";
    private static final String TAG = "ClipboardUtils";
    private static Handler sClipClearHandler;

    private ClipboardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearClipboardIfMatch(ClipboardManager clipboardManager, CharSequence charSequence) {
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            CharSequence charSequenceCoerceToText = (primaryClip == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0).coerceToText(Utils.getApp());
            if (charSequenceCoerceToText == null || !charSequenceCoerceToText.toString().equals(charSequence)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                clipboardManager.clearPrimaryClip();
            } else {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
            }
        } catch (Exception e10) {
            Log.e(TAG, "clearClipboardIfMatch error: " + e10.getMessage());
        }
    }

    public static void copyIntent(Intent intent) {
        ((ClipboardManager) Utils.getApp().getSystemService("clipboard")).setPrimaryClip(ClipData.newIntent("intent", intent));
    }

    public static void copyText(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) Utils.getApp().getSystemService("clipboard");
            ClipData clipDataNewPlainText = ClipData.newPlainText(SENSITIVE_CLIP_LABEL, charSequence);
            if (Build.VERSION.SDK_INT >= 33) {
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
                clipDataNewPlainText.getDescription().setExtras(persistableBundle);
            }
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            if (sClipClearHandler == null) {
                sClipClearHandler = getClipClearHandler();
            }
            Handler handler = sClipClearHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                sClipClearHandler.postDelayed(new g(17, clipboardManager, charSequence), SENSITIVE_CLIP_CLEAR_DELAY_MS);
            }
        } catch (Exception e10) {
            Log.e(TAG, "copyText: ", e10);
        }
    }

    public static void copyUri(Uri uri) {
        ((ClipboardManager) Utils.getApp().getSystemService("clipboard")).setPrimaryClip(ClipData.newUri(Utils.getApp().getContentResolver(), "uri", uri));
    }

    private static Handler getClipClearHandler() {
        if (sClipClearHandler == null) {
            sClipClearHandler = new Handler(Looper.getMainLooper());
        }
        return sClipClearHandler;
    }

    public static Intent getIntent() {
        ClipData primaryClip = ((ClipboardManager) Utils.getApp().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        return primaryClip.getItemAt(0).getIntent();
    }

    public static CharSequence getText() {
        ClipData primaryClip = ((ClipboardManager) Utils.getApp().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        return primaryClip.getItemAt(0).coerceToText(Utils.getApp());
    }

    public static Uri getUri() {
        ClipData primaryClip = ((ClipboardManager) Utils.getApp().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        return primaryClip.getItemAt(0).getUri();
    }
}

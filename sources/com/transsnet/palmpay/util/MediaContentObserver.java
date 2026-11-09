package com.transsnet.palmpay.util;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public class MediaContentObserver extends ContentObserver {
    private static final String[] KEYWORDS = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};
    private static final String[] MEDIA_PROJECTIONS = {"_data", "datetaken"};
    public static final String TAG = "MediaContentObserver";
    private CallBack mCallBack;
    private Uri mContentUri;
    private final Context mContext;

    public interface CallBack {
        void screenShotStart();
    }

    public MediaContentObserver(Context context, Uri uri, Handler handler) {
        super(handler);
        this.mContentUri = uri;
        this.mContext = context;
    }

    private boolean checkScreenShot(String str, long j6) {
        String lowerCase = str.toLowerCase();
        for (String str2 : KEYWORDS) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private void handleMediaContentChange(Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.mContext.getContentResolver().query(uri, MEDIA_PROJECTIONS, null, null, "date_added desc limit 1");
                if (cursorQuery == null) {
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                } else if (cursorQuery.moveToFirst()) {
                    handleMediaRowData(cursorQuery.getString(cursorQuery.getColumnIndex("_data")), cursorQuery.getLong(cursorQuery.getColumnIndex("datetaken")));
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                } else if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (0 != 0 && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery == null || cursorQuery.isClosed()) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    private void handleMediaRowData(String str, long j6) {
        CallBack callBack;
        if (!checkScreenShot(str, j6) || (callBack = this.mCallBack) == null) {
            return;
        }
        callBack.screenShotStart();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        super.onChange(z3);
        handleMediaContentChange(this.mContentUri);
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }
}
